package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use this interface to accept requests from peers to join a session. */
@js.native
trait IAllJoynAcceptSessionJoiner extends js.Object {
  /** Accept an incoming request to join the session. */
  def accept(): Unit = js.native
}

object IAllJoynAcceptSessionJoiner {
  @scala.inline
  def apply(accept: () => Unit): IAllJoynAcceptSessionJoiner = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept))
    __obj.asInstanceOf[IAllJoynAcceptSessionJoiner]
  }
  @scala.inline
  implicit class IAllJoynAcceptSessionJoinerOps[Self <: IAllJoynAcceptSessionJoiner] (val x: Self) extends AnyVal {
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
    def setAccept(value: () => Unit): Self = this.set("accept", js.Any.fromFunction0(value))
  }
  
}

