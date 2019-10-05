package typings.winrt.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatusChangedEventArgs extends js.Object {
  var status: PositionStatus
}

object IStatusChangedEventArgs {
  @scala.inline
  def apply(status: PositionStatus): IStatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(status = status)
  
    __obj.asInstanceOf[IStatusChangedEventArgs]
  }
}

