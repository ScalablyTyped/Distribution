package typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.commandsrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A static class that enables the app to control the Settings Charm pane. The app can add or remove commands, receive a notification when the user opens the pane, or open the pane programmatically. */
@JSGlobal("Windows.UI.ApplicationSettings.SettingsPane")
@js.native
abstract class SettingsPane () extends js.Object {
  /** Occurs when the user opens the settings pane. Listening for this event lets the app initialize the setting commands and pause its UI until the user closes the pane. */
  @JSName("oncommandsrequested")
  var oncommandsrequested_Original: TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_commandsrequested(
    `type`: commandsrequested,
    listener: TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs]
  ): Unit = js.native
  /** Occurs when the user opens the settings pane. Listening for this event lets the app initialize the setting commands and pause its UI until the user closes the pane. */
  def oncommandsrequested(ev: SettingsPaneCommandsRequestedEventArgs with WinRTEvent[SettingsPane]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_commandsrequested(
    `type`: commandsrequested,
    listener: TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.UI.ApplicationSettings.SettingsPane")
@js.native
object SettingsPane extends js.Object {
  /** Gets a value indicating whether the Settings charm appears on the left or right edge of the screen. */
  var edge: SettingsEdgeLocation = js.native
  /**
    * Gets a SettingsPane object that is associated with the current app view (that is, with CoreWindow ).
    * @return The settings pane.
    */
  def getForCurrentView(): SettingsPane = js.native
  /** Displays the Settings Charm pane to the user. */
  def show(): Unit = js.native
}

