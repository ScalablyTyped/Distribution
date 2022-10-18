package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StringDictionary
import typings.xrm.Xrm.Attributes.Attribute
import typings.xrm.Xrm.Events.ContextSensitiveHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a standard control.
  * @see {@link Control}
  */
@js.native
trait StandardControl
  extends StObject
     with Control
     with UiStandardElement
     with UiFocusable
     with UiCanGetDisabledElement
     with UiCanSetDisabledElement {
  
  /**
    * Displays an error or recommendation notification for a control, and lets you specify actions to execute based on the notification.
    */
  def addNotification(notification: AddControlNotificationOptions): Unit = js.native
  
  /**
    * Adds an event handler to the OnOutputChange event.
    * @param handler The function to add to the OnOutputChange event.
    */
  def addOnOutputChange(handler: ContextSensitiveHandler): Unit = js.native
  
  /**
    * Clears the notification identified by uniqueId.
    * @param uniqueId (Optional) Unique identifier.
    * @returns true if it succeeds, false if it fails.
    * @remarks If the uniqueId parameter is not used, the current notification shown will be removed.
    */
  def clearNotification(): Boolean = js.native
  def clearNotification(uniqueId: String): Boolean = js.native
  
  /**
    * Gets the control's bound attribute.
    * @returns The attribute.
    */
  def getAttribute(): Attribute[Any] = js.native
  /**
    * Gets the control's bound attribute.
    * @template T An Attribute type.
    * @returns The attribute.
    */
  @JSName("getAttribute")
  def getAttribute_T_T[T /* <: Attribute[Any] */](): T = js.native
  
  /**
    * Returns a dictionary of the output properties of the control.
    * @returns: A dictionary for the output parameters from the control.
    *    For a PCF control this is of the pattern <controlname>.fieldControl.<outputname>, e.g. telephone1.fieldControl.isValid
    */
  def getOutputs(): StringDictionary[FieldControlOutput] = js.native
  
  /**
    * Removes an event handler from the OnOutputChange event.
    * @param handler The function to remove from the OnOutputChange event.
    */
  def removeOnOutputChange(handler: ContextSensitiveHandler): Unit = js.native
  
  /**
    * Sets a control-local notification message.
    * @param message The message.
    * @param uniqueId Unique identifier.
    * @returns true if it succeeds, false if it fails.
    * @remarks     When this method is used on Microsoft Dynamics CRM for tablets a red "X" icon
    *              appears next to the control. Tapping on the icon will display the message.
    */
  def setNotification(message: String, uniqueId: String): Boolean = js.native
}
