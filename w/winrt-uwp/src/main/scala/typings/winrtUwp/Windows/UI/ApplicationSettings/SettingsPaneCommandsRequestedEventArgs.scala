package typings.winrtUwp.Windows.UI.ApplicationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains arguments that are available from the event object during the CommandsRequested event. */
trait SettingsPaneCommandsRequestedEventArgs extends js.Object {
  /** An instance of SettingsPaneCommandsRequest that is made available during the CommandsRequested event. */
  var request: SettingsPaneCommandsRequest
}

object SettingsPaneCommandsRequestedEventArgs {
  @scala.inline
  def apply(request: SettingsPaneCommandsRequest): SettingsPaneCommandsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsPaneCommandsRequestedEventArgs]
  }
}

