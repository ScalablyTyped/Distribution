package typings
package winrtLib.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingsPaneCommandsRequestedEventArgs extends js.Object {
  var request: SettingsPaneCommandsRequest
}

object ISettingsPaneCommandsRequestedEventArgs {
  @scala.inline
  def apply(request: SettingsPaneCommandsRequest): ISettingsPaneCommandsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request)
  
    __obj.asInstanceOf[ISettingsPaneCommandsRequestedEventArgs]
  }
}

