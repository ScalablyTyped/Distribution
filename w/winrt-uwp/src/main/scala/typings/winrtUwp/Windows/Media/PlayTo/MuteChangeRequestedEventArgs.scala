package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the MuteChangeRequested event. */
trait MuteChangeRequestedEventArgs extends js.Object {
  /** Gets a value that indicates whether mute or unmute was requested. */
  var mute: Boolean
}

object MuteChangeRequestedEventArgs {
  @scala.inline
  def apply(mute: Boolean): MuteChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(mute = mute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuteChangeRequestedEventArgs]
  }
}

