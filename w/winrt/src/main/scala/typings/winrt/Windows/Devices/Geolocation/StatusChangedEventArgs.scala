package typings.winrt.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusChangedEventArgs extends IStatusChangedEventArgs

object StatusChangedEventArgs {
  @scala.inline
  def apply(status: PositionStatus): StatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusChangedEventArgs]
  }
}

