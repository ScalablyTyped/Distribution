package typings.trtcJsSdk.anon

import typings.trtcJsSdk.mod.ConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurState extends js.Object {
  var curState: ConnectionState
  var prevState: ConnectionState
}

object CurState {
  @scala.inline
  def apply(curState: ConnectionState, prevState: ConnectionState): CurState = {
    val __obj = js.Dynamic.literal(curState = curState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurState]
  }
}

