package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVolumeChangeRequestedEventArgs extends js.Object {
  var volume: Double
}

object IVolumeChangeRequestedEventArgs {
  @scala.inline
  def apply(volume: Double): IVolumeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVolumeChangeRequestedEventArgs]
  }
}

