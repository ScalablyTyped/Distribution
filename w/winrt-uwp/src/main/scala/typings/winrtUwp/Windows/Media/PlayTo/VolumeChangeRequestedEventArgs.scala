package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the VolumeChangeRequested event. */
trait VolumeChangeRequestedEventArgs extends js.Object {
  /** Gets the new volume level. */
  var volume: Double
}

object VolumeChangeRequestedEventArgs {
  @scala.inline
  def apply(volume: Double): VolumeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeChangeRequestedEventArgs]
  }
}

