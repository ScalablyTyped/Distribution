package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides users with fast, in-context access to settings that affect the current Windows Store app.
  **/
@JSGlobal("WinJS.UI.SettingsFlyout")
@js.native
//#region Constructors
/**
  * Creates a new SettingsFlyout object.
  * @constructor
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new SettingsFlyout.
  **/
class SettingsFlyout () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Specifies whether the SettingsFlyout is disabled.
    **/
  var disabled: scala.Boolean = js.native
  /**
    * Gets the DOM element the SettingsFlyout is attached to.
    **/
  var element: stdLib.HTMLElement = js.native
  /**
    * Gets whether the SettingsFlyout is hidden.
    **/
  var hidden: scala.Boolean = js.native
  /**
    * Gets or sets the settings command Id for the SettingsFlyout control.
    **/
  var settingsCommandId: java.lang.String = js.native
  /**
    * This property may be unavailable or altered in future versions. Use the CSS width property of the element that has the win-settingsflyout class instead.
    **/
  var width: java.lang.String = js.native
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param type The event type to register. It must be beforeshow, beforehide, aftershow, or afterhide.
    * @param listener The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  /**
    * Releases resources held by this SettingsFlyout. Call this method when the SettingsFlyout is no longer needed. After calling this method, the SettingsFlyout becomes unusable.
    **/
  def dispose(): scala.Unit = js.native
  /**
    * Hides the SettingsFlyout, if visible, regardless of other states.
    **/
  def hide(): scala.Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Raised immediately after the SettingsFlyout is completely hidden.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterhide(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Raised immediately after a SettingsFlyout is fully shown.
    * @param eventInfo An object that contains information about the event.
    **/
  def onaftershow(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Raised just before hiding a SettingsFlyout.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforehide(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Raised just before showing a SettingsFlyout.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeshow(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param type The event type to unregister. It must be beforeshow, beforehide, aftershow, or afterhide.
    * @param listener The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Shows the SettingsPane UI, if hidden.
    **/
  def show(): scala.Unit = js.native
}

/**
  * Provides users with fast, in-context access to settings that affect the current Windows Store app.
  **/
@JSGlobal("WinJS.UI.SettingsFlyout")
@js.native
object SettingsFlyout extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
  /**
    * Loads a fragment of the SettingsFlyout. Your app calls this when the user invokes a settings command and the WinJS.Application.onsettings event occurs.
    * @param e An object that contains information about the event, received from the WinJS.Application.onsettings event. The detail property of this object contains the applicationcommands sub-property that you set to an array of settings commands. You then populate the SettingsFlyout with these commands by a call to populateSettings.
    **/
  def populateSettings(e: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Shows the SettingsPane UI, if hidden, regardless of other state.
    **/
  def show(): scala.Unit = js.native
  /**
    * Show the Settings flyout using the Settings element identifier (ID) and the path of the page that contains the Settings element.
    * @param id The ID of the Settings element.
    * @param path The path of the page that contains the Settings element.
    **/
  def showSettings(id: java.lang.String, path: js.Any): scala.Unit = js.native
}

