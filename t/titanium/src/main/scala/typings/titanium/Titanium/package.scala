package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Titanium {
  
  /**
    * The top-level Android module.
    */
  type Android = typings.titanium.Titanium.Module
  
  /**
    * The top-level App module is mainly used for accessing information about the
    * application at runtime, and for sending or listening for system events.
    */
  type App = typings.titanium.Titanium.Module
  
  /**
    * The top-level Media module.
    */
  type Media = typings.titanium.Titanium.Module
  
  /**
    * The main <Titanium.UI> module.
    */
  type UI = typings.titanium.Titanium.Module
  
  /**
    * The top-level API module, containing methods to output messages to the system log.
    */
  type API = typings.titanium.Titanium.Module
  
  /**
    * The top-level Accelerometer module, used to determine the device's physical position.
    */
  type Accelerometer = typings.titanium.Titanium.Module
  
  /**
    * Used for transmitting developer-defined Analytics events to the Appcelerator Analytics product.
    */
  type Analytics = typings.titanium.Titanium.Module
  
  /**
    * Fired by the system when the application is about to be terminated.
    */
  type AppCloseEvent = typings.titanium.Titanium.AppBaseEvent
  
  /**
    * Fired when the app receives a warning from the operating system about low memory availability.
    */
  type AppMemorywarningEvent = typings.titanium.Titanium.AppBaseEvent
  
  /**
    * Fired when the application transitions from active to inactive state on a multitasked system.
    */
  type AppPauseEvent = typings.titanium.Titanium.AppBaseEvent
  
  /**
    * Fired when the application transitions to the background on a multitasked system.
    */
  type AppPausedEvent = typings.titanium.Titanium.AppBaseEvent
  
  /**
    * Fired when the application returns to the foreground on a multitasked system.
    */
  type AppResumeEvent = typings.titanium.Titanium.AppBaseEvent
  
  /**
    * Fired when the application returns to the foreground.
    */
  type AppResumedEvent = typings.titanium.Titanium.AppBaseEvent
  
  /**
    * Fired when there is a significant change in the time.
    */
  type AppSignificanttimechangeEvent = typings.titanium.Titanium.AppBaseEvent
  
  /**
    * Fired after the "app.js" or "alloy.js" gets executed during application startup.
    */
  type AppStartedEvent = typings.titanium.Titanium.AppBaseEvent
  
  /**
    * Called whenever an interaction with the window occurred. To be used together with the <Titanium.App.trackUserInteraction> property.
    */
  type AppUserinteractionEvent = typings.titanium.Titanium.AppBaseEvent
  
  /**
    * The Calendar module provides an API for accessing the native calendar functionality.
    */
  type Calendar = typings.titanium.Titanium.Module
  
  /**
    * Fired when the database backing the EventKit module is modified.
    */
  type CalendarChangeEvent = typings.titanium.Titanium.CalendarBaseEvent
  
  /**
    * A module for translating between primitive types and raw byte streams.
    */
  type Codec = typings.titanium.Titanium.Module
  
  /**
    * The top-level Contacts module, used for accessing and modifying the system contacts address book.
    */
  type Contacts = typings.titanium.Titanium.Module
  
  /**
    * Fired when the database backing the contacts module is modified externally.
    */
  type ContactsReloadEvent = typings.titanium.Titanium.ContactsBaseEvent
  
  /**
    * The top-level `Database` module, used for creating and accessing the
    * in-application SQLite database.
    */
  type Database = typings.titanium.Titanium.Module
  
  /**
    * The top level filesystem module, used to access files and directories on the device.
    */
  type Filesystem = typings.titanium.Titanium.Module
  
  /**
    * The top level Geolocation module. The Geolocation module is used for accessing device location based information.
    */
  type Geolocation = typings.titanium.Titanium.Module
  
  /**
    * Fired when the device detects interface and requires calibration.
    */
  type GeolocationCalibrationEvent = typings.titanium.Titanium.GeolocationBaseEvent
  
  /**
    * Fired when location updates are paused by the OS.
    */
  type GeolocationLocationupdatepausedEvent = typings.titanium.Titanium.GeolocationBaseEvent
  
  /**
    * Fired when location manager is resumed by the OS.
    */
  type GeolocationLocationupdateresumedEvent = typings.titanium.Titanium.GeolocationBaseEvent
  
  /**
    * The Gesture module is responsible for high-level device gestures such as orientation changes
    * and shake gestures.
    */
  type Gesture = typings.titanium.Titanium.Module
  
  /**
    * The top level Locale module.
    */
  type Locale = typings.titanium.Titanium.Module
  
  /**
    * Fired when the device locale changes.
    */
  type LocaleChangeEvent = typings.titanium.Titanium.LocaleBaseEvent
  
  /**
    * Fires when the camera overlay is ready to take pictures.
    */
  type MediaCamerareadyEvent = typings.titanium.Titanium.MediaBaseEvent
  
  /**
    * Base type for all Titanium modules.
    */
  type Module = typings.titanium.Titanium.Proxy
  
  /**
    * The top level network module.
    */
  type Network = typings.titanium.Titanium.Module
  
  /**
    * The top-level Platform module.  The Platform module is used to access the device's platform-related
    * functionality.
    */
  type Platform = typings.titanium.Titanium.Module
  
  /**
    * Stream module containing stream utility methods.
    */
  type Stream = typings.titanium.Titanium.Module
  
  /**
    * The top-level Utils module, containing a set of JavaScript methods that are often useful when
    * building applications.
    */
  type Utils = typings.titanium.Titanium.Module
  
  /**
    * Used to enable data and file transfers between a watchOS and iOS application.
    */
  type WatchSession = typings.titanium.Titanium.Module
  
  /**
    * The top level XML module.  The XML module is used for parsing and processing XML-based content.
    */
  type XML = typings.titanium.Titanium.Module
}
