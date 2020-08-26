package typings.uifabricStyling.ispacingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpacing extends js.Object {
  var l1: String = js.native
  var l2: String = js.native
  var m: String = js.native
  var s1: String = js.native
  var s2: String = js.native
}

object ISpacing {
  @scala.inline
  def apply(l1: String, l2: String, m: String, s1: String, s2: String): ISpacing = {
    val __obj = js.Dynamic.literal(l1 = l1.asInstanceOf[js.Any], l2 = l2.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], s1 = s1.asInstanceOf[js.Any], s2 = s2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpacing]
  }
  @scala.inline
  implicit class ISpacingOps[Self <: ISpacing] (val x: Self) extends AnyVal {
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
    def setL1(value: String): Self = this.set("l1", value.asInstanceOf[js.Any])
    @scala.inline
    def setL2(value: String): Self = this.set("l2", value.asInstanceOf[js.Any])
    @scala.inline
    def setM(value: String): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def setS1(value: String): Self = this.set("s1", value.asInstanceOf[js.Any])
    @scala.inline
    def setS2(value: String): Self = this.set("s2", value.asInstanceOf[js.Any])
  }
  
}

