package typings.winrtDashUwp.Windows.UI.ApplicationSettings

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties that are only available during the CommandsRequested event. */
@JSGlobal("Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest")
@js.native
abstract class SettingsPaneCommandsRequest () extends js.Object {
  /** A vector that is available during the CommandsRequested event. Append SettingsCommand objects to it to make them available to the SettingsPane UI. */
  var applicationCommands: IVector[SettingsCommand] = js.native
}

