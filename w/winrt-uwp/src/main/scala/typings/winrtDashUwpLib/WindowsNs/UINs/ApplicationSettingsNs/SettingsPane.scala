package typings
package winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A static class that enables the app to control the Settings Charm pane. The app can add or remove commands, receive a notification when the user opens the pane, or open the pane programmatically. */
@JSGlobal("Windows.UI.ApplicationSettings.SettingsPane")
@js.native
abstract class SettingsPane () extends js.Object {
  /** Occurs when the user opens the settings pane. Listening for this event lets the app initialize the setting commands and pause its UI until the user closes the pane. */
  @JSName("oncommandsrequested")
  var oncommandsrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_commandsrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.commandsrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs]
  ): scala.Unit = js.native
  /** Occurs when the user opens the settings pane. Listening for this event lets the app initialize the setting commands and pause its UI until the user closes the pane. */
  def oncommandsrequested(ev: SettingsPaneCommandsRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SettingsPane]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_commandsrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.commandsrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs]
  ): scala.Unit = js.native
}

/** A static class that enables the app to control the Settings Charm pane. The app can add or remove commands, receive a notification when the user opens the pane, or open the pane programmatically. */
@JSGlobal("Windows.UI.ApplicationSettings.SettingsPane")
@js.native
object SettingsPane extends js.Object {
  /** Gets a value indicating whether the Settings charm appears on the left or right edge of the screen. */
  var edge: winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.SettingsEdgeLocation = js.native
  /**
    * Gets a SettingsPane object that is associated with the current app view (that is, with CoreWindow ).
    * @return The settings pane.
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.SettingsPane = js.native
  /** Displays the Settings Charm pane to the user. */
  def show(): scala.Unit = js.native
}

