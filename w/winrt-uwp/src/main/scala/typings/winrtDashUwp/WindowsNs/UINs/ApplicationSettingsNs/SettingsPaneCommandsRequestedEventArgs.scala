package typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains arguments that are available from the event object during the CommandsRequested event. */
@JSGlobal("Windows.UI.ApplicationSettings.SettingsPaneCommandsRequestedEventArgs")
@js.native
abstract class SettingsPaneCommandsRequestedEventArgs () extends js.Object {
  /** An instance of SettingsPaneCommandsRequest that is made available during the CommandsRequested event. */
  var request: SettingsPaneCommandsRequest = js.native
}

