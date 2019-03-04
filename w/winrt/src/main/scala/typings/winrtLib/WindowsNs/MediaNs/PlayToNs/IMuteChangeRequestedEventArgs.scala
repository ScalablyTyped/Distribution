package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMuteChangeRequestedEventArgs extends js.Object {
  var mute: scala.Boolean
}

object IMuteChangeRequestedEventArgs {
  @scala.inline
  def apply(mute: scala.Boolean): IMuteChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(mute = mute)
  
    __obj.asInstanceOf[IMuteChangeRequestedEventArgs]
  }
}

