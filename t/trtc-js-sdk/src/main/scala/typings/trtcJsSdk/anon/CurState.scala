package typings.trtcJsSdk.anon

import typings.trtcJsSdk.mod.ConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurState extends js.Object {
  var curState: ConnectionState = js.native
  var prevState: ConnectionState = js.native
}

object CurState {
  @scala.inline
  def apply(curState: ConnectionState, prevState: ConnectionState): CurState = {
    val __obj = js.Dynamic.literal(curState = curState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurState]
  }
  @scala.inline
  implicit class CurStateOps[Self <: CurState] (val x: Self) extends AnyVal {
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
    def setCurState(value: ConnectionState): Self = this.set("curState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevState(value: ConnectionState): Self = this.set("prevState", value.asInstanceOf[js.Any])
  }
  
}

