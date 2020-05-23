package typings.victory.anon

import typings.victory.mod.DomainTuple
import typings.victory.mod._DomainPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YDomainTuple extends _DomainPropType {
  var x: DomainTuple
  var y: js.UndefOr[DomainTuple] = js.undefined
}

object YDomainTuple {
  @scala.inline
  def apply(x: DomainTuple, y: DomainTuple = null): YDomainTuple = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[YDomainTuple]
  }
}

