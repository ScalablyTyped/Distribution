package typings.webcola.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait T1 extends js.Object {
  var t1: Double = js.native
  var t2: Double = js.native
}

object T1 {
  @scala.inline
  def apply(t1: Double, t2: Double): T1 = {
    val __obj = js.Dynamic.literal(t1 = t1.asInstanceOf[js.Any], t2 = t2.asInstanceOf[js.Any])
    __obj.asInstanceOf[T1]
  }
  @scala.inline
  implicit class T1Ops[Self <: T1] (val x: Self) extends AnyVal {
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
    def setT1(value: Double): Self = this.set("t1", value.asInstanceOf[js.Any])
    @scala.inline
    def setT2(value: Double): Self = this.set("t2", value.asInstanceOf[js.Any])
  }
  
}

