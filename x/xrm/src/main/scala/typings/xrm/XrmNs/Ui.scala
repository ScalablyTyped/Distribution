package typings.xrm.XrmNs

import typings.xrm.XrmEnumNs.FormType
import typings.xrm.XrmNs.CollectionNs.ItemCollection
import typings.xrm.XrmNs.ControlsNs.Control
import typings.xrm.XrmNs.ControlsNs.FormSelector
import typings.xrm.XrmNs.ControlsNs.ProcessControl
import typings.xrm.XrmNs.ControlsNs.QuickFormControl
import typings.xrm.XrmNs.ControlsNs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the formContext.ui object.
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui External Link: formContext.ui (Client API reference)}
  */
trait Ui extends js.Object {
  /**
    * A reference to the collection of controls on the form.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var controls: ItemCollection[Control]
  /**
    * The form selector API.
    * @remarks This API does not exist with Microsoft Dynamics CRM for tablets.
    */
  var formSelector: FormSelector
  /**
    * The navigation API.
    * @remarks This API does not exist with Microsoft Dynamics CRM for tablets.
    */
  var navigation: typings.xrm.XrmNs.ControlsNs.Navigation
  /**
    * The business process flow API, used to interact with the business process flow control in a form.
    */
  var process: ProcessControl
  /**
    * A collection of all the quick view controls on a form using the new form rendering engine (also called "turbo forms").
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui-quickforms ExternalLink: formContext.ui.quickForms (Client API reference)}
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui External Link: formContext.ui (Client API reference)}
    */
  var quickForms: ItemCollection[QuickFormControl]
  /**
    * A reference to the collection of tabs on the form.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var tabs: ItemCollection[Tab]
  /**
    * Clears the form notification described by uniqueId.
    * @param uniqueId Unique identifier.
    * @returns True if it succeeds, otherwise false.
    */
  def clearFormNotification(uniqueId: String): Boolean
  /**
    * Closes the form.
    */
  def close(): Unit
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
  def getFormType(): FormType
  /**
    * Gets view port height.
    * @returns The view port height, in pixels.
    * @remarks This method does not work with Microsoft Dynamics CRM for tablets.
    */
  def getViewPortHeight(): Double
  /**
    * Gets view port width.
    * @returns The view port width, in pixels.
    * @remarks This method does not work with Microsoft Dynamics CRM for tablets.
    */
  def getViewPortWidth(): Double
  /**
    * Re-evaluates the ribbon's configured EnableRules.
    * @remarks This method does not work with Microsoft Dynamics CRM for tablets.
    */
  def refreshRibbon(): Unit
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
  def setFormNotification(message: String, level: FormNotificationLevel, uniqueId: String): Boolean
}

object Ui {
  @scala.inline
  def apply(
    clearFormNotification: String => Boolean,
    close: () => Unit,
    controls: ItemCollection[Control],
    formSelector: FormSelector,
    getFormType: () => FormType,
    getViewPortHeight: () => Double,
    getViewPortWidth: () => Double,
    navigation: typings.xrm.XrmNs.ControlsNs.Navigation,
    process: ProcessControl,
    quickForms: ItemCollection[QuickFormControl],
    refreshRibbon: () => Unit,
    setFormNotification: (String, FormNotificationLevel, String) => Boolean,
    tabs: ItemCollection[Tab]
  ): Ui = {
    val __obj = js.Dynamic.literal(clearFormNotification = js.Any.fromFunction1(clearFormNotification), close = js.Any.fromFunction0(close), controls = controls, formSelector = formSelector, getFormType = js.Any.fromFunction0(getFormType), getViewPortHeight = js.Any.fromFunction0(getViewPortHeight), getViewPortWidth = js.Any.fromFunction0(getViewPortWidth), navigation = navigation, process = process, quickForms = quickForms, refreshRibbon = js.Any.fromFunction0(refreshRibbon), setFormNotification = js.Any.fromFunction3(setFormNotification), tabs = tabs)
  
    __obj.asInstanceOf[Ui]
  }
}

