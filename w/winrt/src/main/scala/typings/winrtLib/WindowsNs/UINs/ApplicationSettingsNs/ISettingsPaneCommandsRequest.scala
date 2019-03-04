package typings
package winrtLib.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingsPaneCommandsRequest extends js.Object {
  var applicationCommands: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SettingsCommand]
}

object ISettingsPaneCommandsRequest {
  @scala.inline
  def apply(applicationCommands: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SettingsCommand]): ISettingsPaneCommandsRequest = {
    val __obj = js.Dynamic.literal(applicationCommands = applicationCommands)
  
    __obj.asInstanceOf[ISettingsPaneCommandsRequest]
  }
}

