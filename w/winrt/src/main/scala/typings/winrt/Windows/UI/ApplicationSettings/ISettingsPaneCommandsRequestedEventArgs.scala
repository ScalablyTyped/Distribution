package typings.winrt.Windows.UI.ApplicationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingsPaneCommandsRequestedEventArgs extends js.Object {
  var request: SettingsPaneCommandsRequest
}

object ISettingsPaneCommandsRequestedEventArgs {
  @scala.inline
  def apply(request: SettingsPaneCommandsRequest): ISettingsPaneCommandsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISettingsPaneCommandsRequestedEventArgs]
  }
}

