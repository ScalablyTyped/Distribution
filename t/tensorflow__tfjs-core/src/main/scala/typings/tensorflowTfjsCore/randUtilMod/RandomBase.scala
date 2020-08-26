package typings.tensorflowTfjsCore.randUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomBase extends js.Object {
  def nextValue(): Double = js.native
}

object RandomBase {
  @scala.inline
  def apply(nextValue: () => Double): RandomBase = {
    val __obj = js.Dynamic.literal(nextValue = js.Any.fromFunction0(nextValue))
    __obj.asInstanceOf[RandomBase]
  }
  @scala.inline
  implicit class RandomBaseOps[Self <: RandomBase] (val x: Self) extends AnyVal {
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
    def setNextValue(value: () => Double): Self = this.set("nextValue", js.Any.fromFunction0(value))
  }
  
}

