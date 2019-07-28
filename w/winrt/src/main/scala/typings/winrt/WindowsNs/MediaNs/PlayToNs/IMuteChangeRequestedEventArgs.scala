package typings.winrt.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMuteChangeRequestedEventArgs extends js.Object {
  var mute: Boolean
}

object IMuteChangeRequestedEventArgs {
  @scala.inline
  def apply(mute: Boolean): IMuteChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(mute = mute)
  
    __obj.asInstanceOf[IMuteChangeRequestedEventArgs]
  }
}

