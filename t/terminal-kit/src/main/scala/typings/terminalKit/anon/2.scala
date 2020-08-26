package typings.terminalKit.anon

import typings.terminalKit.terminalMod.GridMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `2` extends js.Object {
  var promise: js.Promise[GridMenuResponse] = js.native
}

object `2` {
  @scala.inline
  def apply(promise: js.Promise[GridMenuResponse]): `2` = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
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
    def setPromise(value: js.Promise[GridMenuResponse]): Self = this.set("promise", value.asInstanceOf[js.Any])
  }
  
}

