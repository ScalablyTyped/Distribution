package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Titanium {
  type Android = typings.titanium.Titanium.Android_
  type App = typings.titanium.Titanium.App_
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
  	 * Fired when the database backing the EventKit module is modified.
  	 */
  type CalendarChangeEvent = typings.titanium.Titanium.CalendarBaseEvent
  /**
  	 * Fired when the database backing the contacts module is modified externally.
  	 */
  type ContactsReloadEvent = typings.titanium.Titanium.ContactsBaseEvent
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
  	 * Fired when the device locale changes.
  	 */
  type LocaleChangeEvent = typings.titanium.Titanium.LocaleBaseEvent
  type Media = typings.titanium.Titanium.Media_
  /**
  	 * Fires when the camera overlay is ready to take pictures.
  	 */
  type MediaCamerareadyEvent = typings.titanium.Titanium.MediaBaseEvent
  type Network = typings.titanium.Titanium.Network_
  type UI = typings.titanium.Titanium.UI_
}
