package typings.uifabricReactHooks.useSetIntervalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSetIntervalReturnType extends js.Object {
  def clearInterval(id: Double): Unit = js.native
  def setInterval(callback: js.Function0[Unit], duration: Double): Double = js.native
}

object UseSetIntervalReturnType {
  @scala.inline
  def apply(clearInterval: Double => Unit, setInterval: (js.Function0[Unit], Double) => Double): UseSetIntervalReturnType = {
    val __obj = js.Dynamic.literal(clearInterval = js.Any.fromFunction1(clearInterval), setInterval = js.Any.fromFunction2(setInterval))
    __obj.asInstanceOf[UseSetIntervalReturnType]
  }
  @scala.inline
  implicit class UseSetIntervalReturnTypeOps[Self <: UseSetIntervalReturnType] (val x: Self) extends AnyVal {
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
    def setClearInterval(value: Double => Unit): Self = this.set("clearInterval", js.Any.fromFunction1(value))
    @scala.inline
    def setSetInterval(value: (js.Function0[Unit], Double) => Double): Self = this.set("setInterval", js.Any.fromFunction2(value))
  }
  
}

