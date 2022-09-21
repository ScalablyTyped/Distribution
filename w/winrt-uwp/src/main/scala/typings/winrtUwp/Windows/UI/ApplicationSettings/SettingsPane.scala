package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.commandsrequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A static class that enables the app to control the Settings Charm pane. The app can add or remove commands, receive a notification when the user opens the pane, or open the pane programmatically. */
@js.native
trait SettingsPane extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_commandsrequested(
    `type`: commandsrequested,
    listener: TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs]
  ): Unit = js.native
  
  /** Occurs when the user opens the settings pane. Listening for this event lets the app initialize the setting commands and pause its UI until the user closes the pane. */
  def oncommandsrequested(ev: SettingsPaneCommandsRequestedEventArgs & WinRTEvent[SettingsPane]): Unit = js.native
  /** Occurs when the user opens the settings pane. Listening for this event lets the app initialize the setting commands and pause its UI until the user closes the pane. */
  @JSName("oncommandsrequested")
  var oncommandsrequested_Original: TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_commandsrequested(
    `type`: commandsrequested,
    listener: TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs]
  ): Unit = js.native
}
