package typings.victory.anon

import typings.victory.mod.DomainTuple
import typings.victory.mod._DomainPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YDomainTuple extends _DomainPropType {
  var x: js.UndefOr[DomainTuple] = js.native
  var y: DomainTuple = js.native
}

object YDomainTuple {
  @scala.inline
  def apply(y: DomainTuple): YDomainTuple = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[YDomainTuple]
  }
  @scala.inline
  implicit class YDomainTupleOps[Self <: YDomainTuple] (val x: Self) extends AnyVal {
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
    def setY(value: DomainTuple): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: DomainTuple): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
  }
  
}

