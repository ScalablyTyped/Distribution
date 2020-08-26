package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuteChangeRequestedEventArgs extends IMuteChangeRequestedEventArgs

object MuteChangeRequestedEventArgs {
  @scala.inline
  def apply(mute: Boolean): MuteChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(mute = mute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuteChangeRequestedEventArgs]
  }
}

