package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreventDefault extends js.Object {
  def preventDefault(): Unit = js.native
}

object PreventDefault {
  @scala.inline
  def apply(preventDefault: () => Unit): PreventDefault = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[PreventDefault]
  }
  @scala.inline
  implicit class PreventDefaultOps[Self <: PreventDefault] (val x: Self) extends AnyVal {
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
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
  }
  
}

