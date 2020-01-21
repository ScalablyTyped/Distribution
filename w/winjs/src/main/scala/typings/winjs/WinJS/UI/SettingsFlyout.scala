package typings.winjs.WinJS.UI

import typings.std.CustomEvent
import typings.std.Event_
import typings.std.HTMLElement
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
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Specifies whether the SettingsFlyout is disabled.
    **/
  var disabled: Boolean = js.native
  /**
    * Gets the DOM element the SettingsFlyout is attached to.
    **/
  var element: HTMLElement = js.native
  /**
    * Gets whether the SettingsFlyout is hidden.
    **/
  var hidden: Boolean = js.native
  /**
    * Gets or sets the settings command Id for the SettingsFlyout control.
    **/
  var settingsCommandId: String = js.native
  /**
    * This property may be unavailable or altered in future versions. Use the CSS width property of the element that has the win-settingsflyout class instead.
    **/
  var width: String = js.native
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param type The event type to register. It must be beforeshow, beforehide, aftershow, or afterhide.
    * @param listener The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(`type`: String, listener: js.Function): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  /**
    * Releases resources held by this SettingsFlyout. Call this method when the SettingsFlyout is no longer needed. After calling this method, the SettingsFlyout becomes unusable.
    **/
  def dispose(): Unit = js.native
  /**
    * Hides the SettingsFlyout, if visible, regardless of other states.
    **/
  def hide(): Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Raised immediately after the SettingsFlyout is completely hidden.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterhide(eventInfo: Event_): Unit = js.native
  /**
    * Raised immediately after a SettingsFlyout is fully shown.
    * @param eventInfo An object that contains information about the event.
    **/
  def onaftershow(eventInfo: Event_): Unit = js.native
  /**
    * Raised just before hiding a SettingsFlyout.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforehide(eventInfo: Event_): Unit = js.native
  /**
    * Raised just before showing a SettingsFlyout.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeshow(eventInfo: Event_): Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param type The event type to unregister. It must be beforeshow, beforehide, aftershow, or afterhide.
    * @param listener The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  /**
    * Shows the SettingsPane UI, if hidden.
    **/
  def show(): Unit = js.native
}

/* static members */
@JSGlobal("WinJS.UI.SettingsFlyout")
@js.native
object SettingsFlyout extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
  /**
    * Loads a fragment of the SettingsFlyout. Your app calls this when the user invokes a settings command and the WinJS.Application.onsettings event occurs.
    * @param e An object that contains information about the event, received from the WinJS.Application.onsettings event. The detail property of this object contains the applicationcommands sub-property that you set to an array of settings commands. You then populate the SettingsFlyout with these commands by a call to populateSettings.
    **/
  def populateSettings(e: CustomEvent[_]): Unit = js.native
  /**
    * Shows the SettingsPane UI, if hidden, regardless of other state.
    **/
  def show(): Unit = js.native
  /**
    * Show the Settings flyout using the Settings element identifier (ID) and the path of the page that contains the Settings element.
    * @param id The ID of the Settings element.
    * @param path The path of the page that contains the Settings element.
    **/
  def showSettings(id: String, path: js.Any): Unit = js.native
}

