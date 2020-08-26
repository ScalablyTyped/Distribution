package typings.webpackChain.mod._Config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chained[Parent] extends js.Object {
  def end(): Parent = js.native
}

object Chained {
  @scala.inline
  def apply[Parent](end: () => Parent): Chained[Parent] = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end))
    __obj.asInstanceOf[Chained[Parent]]
  }
  @scala.inline
  implicit class ChainedOps[Self <: Chained[_], Parent] (val x: Self with Chained[Parent]) extends AnyVal {
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
    def setEnd(value: () => Parent): Self = this.set("end", js.Any.fromFunction0(value))
  }
  
}

