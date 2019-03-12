package typings
package xrmLib.XrmNs

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
  var controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.Control]
  /**
    * The form selector API.
    * @remarks This API does not exist with Microsoft Dynamics CRM for tablets.
    */
  var formSelector: xrmLib.XrmNs.ControlsNs.FormSelector
  /**
    * The navigation API.
    * @remarks This API does not exist with Microsoft Dynamics CRM for tablets.
    */
  var navigation: xrmLib.XrmNs.ControlsNs.Navigation
  /**
    * The business process flow API, used to interact with the business process flow control in a form.
    */
  var process: xrmLib.XrmNs.ControlsNs.ProcessControl
  /**
    * A collection of all the quick view controls on a form using the new form rendering engine (also called "turbo forms").
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui-quickforms ExternalLink: formContext.ui.quickForms (Client API reference)}
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui External Link: formContext.ui (Client API reference)}
    */
  var quickForms: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.QuickFormControl]
  /**
    * A reference to the collection of tabs on the form.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var tabs: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.Tab]
  /**
    * Clears the form notification described by uniqueId.
    * @param uniqueId Unique identifier.
    * @returns True if it succeeds, otherwise false.
    */
  def clearFormNotification(uniqueId: java.lang.String): scala.Boolean
  /**
    * Closes the form.
    */
  def close(): scala.Unit
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
  def getFormType(): xrmLib.XrmEnumNs.FormType
  /**
    * Gets view port height.
    * @returns The view port height, in pixels.
    * @remarks This method does not work with Microsoft Dynamics CRM for tablets.
    */
  def getViewPortHeight(): scala.Double
  /**
    * Gets view port width.
    * @returns The view port width, in pixels.
    * @remarks This method does not work with Microsoft Dynamics CRM for tablets.
    */
  def getViewPortWidth(): scala.Double
  /**
    * Re-evaluates the ribbon's configured EnableRules.
    * @remarks This method does not work with Microsoft Dynamics CRM for tablets.
    */
  def refreshRibbon(): scala.Unit
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
  def setFormNotification(message: java.lang.String, level: FormNotificationLevel, uniqueId: java.lang.String): scala.Boolean
}

object Ui {
  @scala.inline
  def apply(
    clearFormNotification: java.lang.String => scala.Boolean,
    close: () => scala.Unit,
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.Control],
    formSelector: xrmLib.XrmNs.ControlsNs.FormSelector,
    getFormType: () => xrmLib.XrmEnumNs.FormType,
    getViewPortHeight: () => scala.Double,
    getViewPortWidth: () => scala.Double,
    navigation: xrmLib.XrmNs.ControlsNs.Navigation,
    process: xrmLib.XrmNs.ControlsNs.ProcessControl,
    quickForms: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.QuickFormControl],
    refreshRibbon: () => scala.Unit,
    setFormNotification: (java.lang.String, FormNotificationLevel, java.lang.String) => scala.Boolean,
    tabs: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.Tab]
  ): Ui = {
    val __obj = js.Dynamic.literal(clearFormNotification = js.Any.fromFunction1(clearFormNotification), close = js.Any.fromFunction0(close), controls = controls, formSelector = formSelector, getFormType = js.Any.fromFunction0(getFormType), getViewPortHeight = js.Any.fromFunction0(getViewPortHeight), getViewPortWidth = js.Any.fromFunction0(getViewPortWidth), navigation = navigation, process = process, quickForms = quickForms, refreshRibbon = js.Any.fromFunction0(refreshRibbon), setFormNotification = js.Any.fromFunction3(setFormNotification), tabs = tabs)
  
    __obj.asInstanceOf[Ui]
  }
}

