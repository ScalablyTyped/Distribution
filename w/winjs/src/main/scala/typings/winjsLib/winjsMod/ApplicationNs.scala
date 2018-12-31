package typings
package winjsLib.winjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides application-level functionality, for example activation, storage, and application events.
**/
@JSImport("winjs", "Application")
@js.native
object ApplicationNs extends js.Object {
  //#region Objects
  /**
    * The local storage of the application.
    **/
  var local: winjsLib.IOHelper = js.native
  /**
    * The roaming storage of the application.
    **/
  var roaming: winjsLib.IOHelper = js.native
  /**
    * An object used for storing app information that can be used to restore the app's state after it has been suspended and then resumed. Data that can usefully be contained in this object includes the current navigation page or any information the user has added to the input controls on the page. You should not add information about customization (for example colors) or user-defined lists of content.
    **/
  var sessionState: js.Any = js.native
  /**
    * The temp storage of the application.
    **/
  var temp: winjsLib.IOHelper = js.native
  //#endregion Objects
  //#region Functions
  /**
    * Adds an event listener for application-level events: activated, checkpoint, error, loaded, ready, settings, and unload.
    * @param type The type (name) of the event. You can use any of the following:"activated", "checkpoint", "error", "loaded", "ready", "settings", and" unload".
    * @param listener The listener to invoke when the event is raised.
    * @param capture true to initiate capture, otherwise false.
    **/
  def addEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function, capture: scala.Boolean): scala.Unit = js.native
  /**
    * Queues a checkpoint event.
    **/
  def checkpoint(): scala.Unit = js.native
  /**
    * Occurs when WinRT activation has occurred. The name of this event is "activated" (and also "mainwindowactivated"). This event occurs after the loaded event and before the ready event.
    * @param eventInfo An object that contains information about the event. For more information about event arguments, see the WinRT event argument classes: WebUICachedFileUpdaterActivatedEventArgs, WebUICameraSettingsActivatedEventArgs, WebUIContactPickerActivatedEventArgs, WebUIDeviceActivatedEventArgs, WebUIFileActivatedEventArgs, WebUIFileOpenPickerActivatedEventArgs, WebUIFileSavePickerActivatedEventArgs, WebUILaunchActivatedEventArgs, WebUIPrintTaskSettingsActivatedEventArgs, WebUIProtocolActivatedEventArgs, WebUISearchActivatedEventArgs, WebUIShareTargetActivatedEventArgs.
    **/
  def onactivated(eventInfo: winjsLib.WinJSNs.ApplicationNs.IPromiseEvent): scala.Unit = js.native
  /**
    * Occurs whenever a user clicks the hardware backbutton.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following sub-properties: type
    **/
  def onbackclick(eventInfo: winjsLib.WinJSNs.ApplicationNs.IPromiseEvent): scala.Unit = js.native
  /**
    * Occurs when receiving PLM notification or when the checkpoint function is called.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following subproperties: type, setPromise.
    **/
  def oncheckpoint(eventInfo: winjsLib.WinJSNs.ApplicationNs.IPromiseEvent): scala.Unit = js.native
  /**
    * Occurs when an unhandled error has been raised.
    * @param eventInfo An object that contains information about the event.
    **/
  def onerror(eventInfo: winjsLib.WinJSNs.ApplicationNs.IPromiseEvent): scala.Unit = js.native
  /**
    * Occurs after the DOMContentLoaded event, which fires after the page has been parsed but before all the resources are loaded. This event occurs before the activated event and the ready event.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following subproperties: type, setPromise.
    **/
  def onloaded(eventInfo: winjsLib.WinJSNs.ApplicationNs.IPromiseEvent): scala.Unit = js.native
  /**
    * Occurs when the application is ready. This event occurs after the loaded event and the activated event.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following sub-properties: type, setPromise.
    **/
  def onready(eventInfo: winjsLib.WinJSNs.ApplicationNs.IPromiseEvent): scala.Unit = js.native
  /**
    * Occurs when the settings charm is invoked.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: type, applicationcommands.
    **/
  def onsettings(eventInfo: winjsLib.WinJSNs.ApplicationNs.IPromiseEvent): scala.Unit = js.native
  /**
    * Occurs when the application is about to be unloaded.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following sub-properties: type, setPromise.
    **/
  def onunload(eventInfo: winjsLib.WinJSNs.ApplicationNs.IPromiseEvent): scala.Unit = js.native
  /**
    * Queues an event to be processed by the WinJS.Application event queue.
    * @param eventRecord The event object is expected to have a type property that is used as the event name when dispatching on the WinJS.Application event queue. The entire object is provided to event listeners in the detail property of the event.
    **/
  def queueEvent(eventRecord: js.Any): scala.Unit = js.native
  /**
    * Removes an event listener from the control.
    * @param type The type (name) of the event.
    * @param listener The listener to remove.
    * @param useCapture Specifies whether or not to initiate capture.
    **/
  def removeEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function, useCapture: js.Any): scala.Unit = js.native
  /**
    * Starts dispatching application events (the activated, checkpoint, error, loaded, ready, settings, and unload events).
    **/
  def start(): scala.Unit = js.native
  /**
    * Stops application event processing and resets WinJS.Application to its initial state. All WinJS.Application event listeners (for the activated, checkpoint, error, loaded, ready, settings, and unload events) are removed.
    **/
  def stop(): scala.Unit = js.native
}

