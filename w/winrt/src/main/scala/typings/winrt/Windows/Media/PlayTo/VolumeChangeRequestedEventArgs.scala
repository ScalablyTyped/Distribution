package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeChangeRequestedEventArgs extends IVolumeChangeRequestedEventArgs

object VolumeChangeRequestedEventArgs {
  @scala.inline
  def apply(volume: Double): VolumeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeChangeRequestedEventArgs]
  }
}

