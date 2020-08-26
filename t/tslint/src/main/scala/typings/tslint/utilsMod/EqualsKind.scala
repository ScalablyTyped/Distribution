package typings.tslint.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EqualsKind extends js.Object {
  var isPositive: Boolean = js.native
  var isStrict: Boolean = js.native
}

object EqualsKind {
  @scala.inline
  def apply(isPositive: Boolean, isStrict: Boolean): EqualsKind = {
    val __obj = js.Dynamic.literal(isPositive = isPositive.asInstanceOf[js.Any], isStrict = isStrict.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqualsKind]
  }
  @scala.inline
  implicit class EqualsKindOps[Self <: EqualsKind] (val x: Self) extends AnyVal {
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
    def setIsPositive(value: Boolean): Self = this.set("isPositive", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStrict(value: Boolean): Self = this.set("isStrict", value.asInstanceOf[js.Any])
  }
  
}

