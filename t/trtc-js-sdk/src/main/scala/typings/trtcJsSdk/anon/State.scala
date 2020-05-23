package typings.trtcJsSdk.anon

import typings.trtcJsSdk.trtcJsSdkStrings.PAUSED
import typings.trtcJsSdk.trtcJsSdkStrings.PLAYING
import typings.trtcJsSdk.trtcJsSdkStrings.STOPPED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var state: PLAYING | PAUSED | STOPPED
  var `type`: String
}

object State {
  @scala.inline
  def apply(state: PLAYING | PAUSED | STOPPED, `type`: String): State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

