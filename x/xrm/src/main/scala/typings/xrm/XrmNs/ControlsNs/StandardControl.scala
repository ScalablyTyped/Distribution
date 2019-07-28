package typings.xrm.XrmNs.ControlsNs

import typings.xrm.XrmNs.AttributesNs.Attribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a standard control.
  * @see {@link Control}
  */
@js.native
trait StandardControl
  extends Control
     with UiStandardElement
     with UiFocusable {
  /**
    * Displays an error or recommendation notification for a control, and lets you specify actions to execute based on the notification.
    */
  def addNotification(notification: AddControlNotificationOptions): Unit = js.native
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
  def getAttribute(): Attribute = js.native
  /**
    * Gets the control's bound attribute.
    * @template T An Attribute type.
    * @returns The attribute.
    */
  @JSName("getAttribute")
  def getAttribute_T_Attribute_T[T /* <: Attribute */](): T = js.native
  /**
    * Gets a boolean value, indicating whether the control is disabled.
    * @returns true if it is disabled, otherwise false.
    */
  def getDisabled(): Boolean = js.native
  /**
    * Sets the state of the control to either enabled, or disabled.
    * @param disabled true to disable, false to enable.
    */
  def setDisabled(disabled: Boolean): Unit = js.native
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

