package typings.wechatMiniprogram.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeListener extends js.Object {
  // "And Now His Watch Is Ended"
  def close(): js.Promise[Unit] = js.native
}

object RealtimeListener {
  @scala.inline
  def apply(close: () => js.Promise[Unit]): RealtimeListener = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[RealtimeListener]
  }
  @scala.inline
  implicit class RealtimeListenerOps[Self <: RealtimeListener] (val x: Self) extends AnyVal {
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
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
  }
  
}

