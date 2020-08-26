package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the VolumeChangeRequested event. */
@js.native
trait VolumeChangeRequestedEventArgs extends js.Object {
  /** Gets the new volume level. */
  var volume: Double = js.native
}

object VolumeChangeRequestedEventArgs {
  @scala.inline
  def apply(volume: Double): VolumeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeChangeRequestedEventArgs]
  }
  @scala.inline
  implicit class VolumeChangeRequestedEventArgsOps[Self <: VolumeChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
  
}

