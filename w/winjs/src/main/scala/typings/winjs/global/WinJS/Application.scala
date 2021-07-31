package typings.winjs.global.WinJS

import typings.winjs.IOHelper
import typings.winjs.WinJS.Application.IPromiseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def addEventListener(`type`: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addEventListener(`type`: String, listener: js.Function, capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Queues a checkpoint event.
    **/
  @scala.inline
  def checkpoint(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkpoint")().asInstanceOf[Unit]
  
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
  @scala.inline
  def onactivated(eventInfo: IPromiseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onactivated")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Occurs whenever a user clicks the hardware backbutton.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following sub-properties: type
    **/
  @scala.inline
  def onbackclick(eventInfo: IPromiseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onbackclick")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Occurs when receiving PLM notification or when the checkpoint function is called.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following subproperties: type, setPromise.
    **/
  @scala.inline
  def oncheckpoint(eventInfo: IPromiseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("oncheckpoint")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Occurs when an unhandled error has been raised.
    * @param eventInfo An object that contains information about the event.
    **/
  @scala.inline
  def onerror(eventInfo: IPromiseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onerror")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Occurs after the DOMContentLoaded event, which fires after the page has been parsed but before all the resources are loaded. This event occurs before the activated event and the ready event.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following subproperties: type, setPromise.
    **/
  @scala.inline
  def onloaded(eventInfo: IPromiseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onloaded")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Occurs when the application is ready. This event occurs after the loaded event and the activated event.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following sub-properties: type, setPromise.
    **/
  @scala.inline
  def onready(eventInfo: IPromiseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onready")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Occurs when the settings charm is invoked.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: type, applicationcommands.
    **/
  @scala.inline
  def onsettings(eventInfo: IPromiseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onsettings")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Occurs when the application is about to be unloaded.
    * @param eventInfo An object that contains information about the event. The detail property of this object includes the following sub-properties: type, setPromise.
    **/
  @scala.inline
  def onunload(eventInfo: IPromiseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onunload")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Queues an event to be processed by the WinJS.Application event queue.
    * @param eventRecord The event object is expected to have a type property that is used as the event name when dispatching on the WinJS.Application event queue. The entire object is provided to event listeners in the detail property of the event.
    **/
  @scala.inline
  def queueEvent(eventRecord: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("queueEvent")(eventRecord.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Removes an event listener from the control.
    * @param type The type (name) of the event.
    * @param listener The listener to remove.
    * @param useCapture Specifies whether or not to initiate capture.
    **/
  @scala.inline
  def removeEventListener(`type`: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeEventListener(`type`: String, listener: js.Function, useCapture: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  @scala.inline
  def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
  
  /**
    * Stops application event processing and resets WinJS.Application to its initial state. All WinJS.Application event listeners (for the activated, checkpoint, error, loaded, ready, settings, and unload events) are removed.
    **/
  @scala.inline
  def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  
  /**
    * The temp storage of the application.
    **/
  @JSGlobal("WinJS.Application.temp")
  @js.native
  def temp: IOHelper = js.native
  @scala.inline
  def temp_=(x: IOHelper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("temp")(x.asInstanceOf[js.Any])
}
