package typings.winjs.global.WinJS

import typings.winjs.IOHelper
import typings.winjs.WinJS.Application.IPromiseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides application-level functionality, for example activation, storage, and application events.
**/
object Application {
  
  @JSGlobal("WinJS.Application")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion Objects
  //#region Functions
  /**
    * Adds an event listener for application-level events: activated, checkpoint, error, loaded, ready, settings, and unload.
    * @param type The type (name) of the event. You can use any of the following:"activated", "checkpoint", "error", "loaded", "ready", "settings", and" unload".
    * @param listener The listener to invoke when the event is raised.
    * @param capture true to initiate capture, otherwise false.
    **/
  @JSGlobal("WinJS.Application.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: js.Function): Unit = js.native
  @JSGlobal("WinJS.Application.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: js.Function, capture: Boolean): Unit = js.native
  
  /**
    * Queues a checkpoint event.
    **/
  @JSGlobal("WinJS.Application.checkpoint")
  @js.native
  def checkpoint(): Unit = js.native
  
  //#region Objects
  /**
    * The local storage of the application.
    **/
  @JSGlobal("WinJS.Application.local")
  @js.native
  def local: IOHelper = js.native
  @scala.inline
  def local_=(x: IOHelper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("local")(x.asInstanceOf[js.Any])
  
  /**
    * Occurs when WinRT activation has occurred. The name of this event is "activated" (and also "mainwindowactivated"). This event occurs after the loaded event and before the ready event.
    * @param eventInfo An object that contains information about the event. For more information about event arguments, see the WinRT event argument classes: WebUICachedFileUpdaterActivatedEventArgs, WebUICameraSettingsActivatedEventArgs, WebUIContactPickerActivatedEventArgs, WebUIDeviceActivatedEventArgs, WebUIFileActivatedEventArgs, WebUIFileOpenPickerActivatedEventArgs, WebUIFileSavePickerActivatedEventArgs, WebUILaunchActivatedEventArgs, WebUIPrintTaskSettingsActivatedEventArgs, WebUIProtocolActivatedEventArgs, WebUISearchActivatedEventArgs, WebUIShareTargetActivatedEventArgs.
    **/
  @JSGlobal("WinJS.Application.onactivated")
  @js.native
  def onactivated(eventInfo: IPromiseEvent): Unit = js.native
  
  /**
    * Occurs whenever a user clicks the hardware backbutton.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following sub-properties: type
    **/
  @JSGlobal("WinJS.Application.onbackclick")
  @js.native
  def onbackclick(eventInfo: IPromiseEvent): Unit = js.native
  
  /**
    * Occurs when receiving PLM notification or when the checkpoint function is called.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following subproperties: type, setPromise.
    **/
  @JSGlobal("WinJS.Application.oncheckpoint")
  @js.native
  def oncheckpoint(eventInfo: IPromiseEvent): Unit = js.native
  
  /**
    * Occurs when an unhandled error has been raised.
    * @param eventInfo An object that contains information about the event.
    **/
  @JSGlobal("WinJS.Application.onerror")
  @js.native
  def onerror(eventInfo: IPromiseEvent): Unit = js.native
  
  /**
    * Occurs after the DOMContentLoaded event, which fires after the page has been parsed but before all the resources are loaded. This event occurs before the activated event and the ready event.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following subproperties: type, setPromise.
    **/
  @JSGlobal("WinJS.Application.onloaded")
  @js.native
  def onloaded(eventInfo: IPromiseEvent): Unit = js.native
  
  /**
    * Occurs when the application is ready. This event occurs after the loaded event and the activated event.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following sub-properties: type, setPromise.
    **/
  @JSGlobal("WinJS.Application.onready")
  @js.native
  def onready(eventInfo: IPromiseEvent): Unit = js.native
  
  /**
    * Occurs when the settings charm is invoked.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: type, applicationcommands.
    **/
  @JSGlobal("WinJS.Application.onsettings")
  @js.native
  def onsettings(eventInfo: IPromiseEvent): Unit = js.native
  
  /**
    * Occurs when the application is about to be unloaded.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following sub-properties: type, setPromise.
    **/
  @JSGlobal("WinJS.Application.onunload")
  @js.native
  def onunload(eventInfo: IPromiseEvent): Unit = js.native
  
  /**
    * Queues an event to be processed by the WinJS.Application event queue.
    * @param eventRecord The event object is expected to have a type property that is used as the event name when dispatching on the WinJS.Application event queue. The entire object is provided to event listeners in the detail property of the event.
    **/
  @JSGlobal("WinJS.Application.queueEvent")
  @js.native
  def queueEvent(eventRecord: js.Any): Unit = js.native
  
  /**
    * Removes an event listener from the control.
    * @param type The type (name) of the event.
    * @param listener The listener to remove.
    * @param useCapture Specifies whether or not to initiate capture.
    **/
  @JSGlobal("WinJS.Application.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  @JSGlobal("WinJS.Application.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: js.Any): Unit = js.native
  
  /**
    * The roaming storage of the application.
    **/
  @JSGlobal("WinJS.Application.roaming")
  @js.native
  def roaming: IOHelper = js.native
  @scala.inline
  def roaming_=(x: IOHelper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roaming")(x.asInstanceOf[js.Any])
  
  /**
    * An object used for storing app information that can be used to restore the app's state after it has been suspended and then resumed. Data that can usefully be contained in this object includes the current navigation page or any information the user has added to the input controls on the page. You should not add information about customization (for example colors) or user-defined lists of content.
    **/
  @JSGlobal("WinJS.Application.sessionState")
  @js.native
  def sessionState: js.Any = js.native
  @scala.inline
  def sessionState_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sessionState")(x.asInstanceOf[js.Any])
  
  /**
    * Starts dispatching application events (the activated, checkpoint, error, loaded, ready, settings, and unload events).
    **/
  @JSGlobal("WinJS.Application.start")
  @js.native
  def start(): Unit = js.native
  
  /**
    * Stops application event processing and resets WinJS.Application to its initial state. All WinJS.Application event listeners (for the activated, checkpoint, error, loaded, ready, settings, and unload events) are removed.
    **/
  @JSGlobal("WinJS.Application.stop")
  @js.native
  def stop(): Unit = js.native
  
  /**
    * The temp storage of the application.
    **/
  @JSGlobal("WinJS.Application.temp")
  @js.native
  def temp: IOHelper = js.native
  @scala.inline
  def temp_=(x: IOHelper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("temp")(x.asInstanceOf[js.Any])
}
