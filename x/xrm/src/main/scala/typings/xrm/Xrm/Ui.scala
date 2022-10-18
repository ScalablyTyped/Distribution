package typings.xrm.Xrm

import typings.xrm.Xrm.Collection.ItemCollection
import typings.xrm.Xrm.Controls.Control
import typings.xrm.Xrm.Controls.FooterSection
import typings.xrm.Xrm.Controls.FormSelector
import typings.xrm.Xrm.Controls.HeaderSection
import typings.xrm.Xrm.Controls.ProcessControl
import typings.xrm.Xrm.Controls.QuickFormControl
import typings.xrm.Xrm.Controls.Tab
import typings.xrm.Xrm.Events.LoadEventHandler
import typings.xrm.Xrm.Events.LoadEventHandlerAsync
import typings.xrm.XrmEnum.FormType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the formContext.ui object.
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui External Link: formContext.ui (Client API reference)}
  */
@js.native
trait Ui extends StObject {
  
  /**
    * Adds a function to be called on the form OnLoad event.
    * The function will be added to the bottom of the event handler pipeline.
    * @see {@link https://learn.microsoft.com/power-apps/developer/model-driven-apps/clientapi/reference/formcontext-ui/addonload ui.addOnLoad (Client API reference)}
    */
  def addOnLoad(handler: LoadEventHandler | LoadEventHandlerAsync): Unit = js.native
  
  /**
    * Clears the form notification described by uniqueId.
    * @param uniqueId Unique identifier.
    * @returns True if it succeeds, otherwise false.
    */
  def clearFormNotification(uniqueId: String): Boolean = js.native
  
  /**
    * Closes the form.
    */
  def close(): Unit = js.native
  
  /**
    * A reference to the collection of controls on the form.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var controls: ItemCollection[Control] = js.native
  
  /**
    * Provides information on how to set the visibility of footer section.
    */
  var footerSection: FooterSection = js.native
  
  /**
    * The form selector API.
    * @remarks This API does not exist with Microsoft Dynamics CRM for tablets.
    */
  var formSelector: FormSelector = js.native
  
  /**
    * Gets form type.
    * @returns The form type.
    * @remarks **Values returned are**:
    * * 0  Undefined
    * * 1  Create
    * * 2  Update
    * * 3  Read Only
    * * 4  Disabled
    * * 6  Bulk Edit
    * * Deprecated values are 5 (Quick Create), and 11 (Read Optimized)
    */
  def getFormType(): FormType = js.native
  
  /**
    * Gets view port height.
    * @returns The view port height, in pixels.
    * @remarks This method does not work with Microsoft Dynamics CRM for tablets.
    */
  def getViewPortHeight(): Double = js.native
  
  /**
    * Gets view port width.
    * @returns The view port width, in pixels.
    * @remarks This method does not work with Microsoft Dynamics CRM for tablets.
    */
  def getViewPortWidth(): Double = js.native
  
  /**
    * Provides information on how to set the visibility of header section.
    */
  var headerSection: HeaderSection = js.native
  
  /**
    * The navigation API.
    * @remarks This API does not exist with Microsoft Dynamics CRM for tablets.
    */
  var navigation: typings.xrm.Xrm.Controls.Navigation = js.native
  
  /**
    * The business process flow API, used to interact with the business process flow control in a form.
    */
  var process: ProcessControl = js.native
  
  /**
    * A collection of all the quick view controls on a form using the new form rendering engine (also called "turbo forms").
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui-quickforms ExternalLink: formContext.ui.quickForms (Client API reference)}
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui External Link: formContext.ui (Client API reference)}
    */
  var quickForms: ItemCollection[QuickFormControl] = js.native
  
  /**
    * Re-evaluates the ribbon's configured EnableRules.
    * @param refreshAll Indicates whether all the ribbon command bars on the current page are refreshed. If you specify false only the page-level ribbon command bar is refreshed.
    * If you do not specifiy this parameter, by default false is passed.
    * @remarks This method does not work with Microsoft Dynamics CRM for tablets.
    */
  def refreshRibbon(): Unit = js.native
  def refreshRibbon(refreshAll: Boolean): Unit = js.native
  
  /**
    * Removes a function from the form OnLoad event.
    * @see {@link https://learn.microsoft.com/power-apps/developer/model-driven-apps/clientapi/reference/formcontext-ui/removeonload ui.removeOnLoad (Client API reference)}
    */
  def removeOnLoad(handler: LoadEventHandler | LoadEventHandlerAsync): Unit = js.native
  
  /**
    * Sets the name of the table to be displayed on the form.
    * @param name Name of the table to be displayed on the form.
    * @see {@link https://docs.microsoft.com/en-us/powerapps/developer/model-driven-apps/clientapi/reference/formcontext-ui/setformentityname External Link: setFormEntityName (Client API reference)}
    */
  def setFormEntityName(name: String): Unit = js.native
  
  /**
    * Displays a form level notification. Any number of notifications can be displayed and will remain until removed using clearFormNotification.
    * The height of the notification area is limited so each new message will be added to the top.
    * @param message The text of the notification message.
    * @param level The level of the notification which defines how the message will be displayed, such as the icon.
    * ERROR: Notification will use the system error icon.
    * WARNING: Notification will use the system warning icon.
    * INFO: Notification will use the system info icon.
    * @param uniqueId Unique identifier for the notification which is used with clearFormNotification to remove the notification.
    * @returns true if it succeeds, otherwise false.
    */
  def setFormNotification(message: String, level: FormNotificationLevel, uniqueId: String): Boolean = js.native
  
  /**
    * A reference to the collection of tabs on the form.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var tabs: ItemCollection[Tab] = js.native
}
