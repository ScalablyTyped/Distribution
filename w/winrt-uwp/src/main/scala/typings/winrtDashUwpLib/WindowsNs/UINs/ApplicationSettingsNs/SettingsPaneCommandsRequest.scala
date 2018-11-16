package typings
package winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties that are only available during the CommandsRequested event. */
@JSGlobal("Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest")
@js.native
abstract class SettingsPaneCommandsRequest () extends js.Object {
  /** A vector that is available during the CommandsRequested event. Append SettingsCommand objects to it to make them available to the SettingsPane UI. */
  var applicationCommands: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SettingsCommand] = js.native
}

