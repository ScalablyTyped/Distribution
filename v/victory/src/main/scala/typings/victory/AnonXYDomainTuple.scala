package typings.victory

import typings.victory.mod.DomainTuple
import typings.victory.mod._DomainPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXYDomainTuple extends _DomainPropType {
  var x: js.UndefOr[DomainTuple] = js.undefined
  var y: DomainTuple
}

object AnonXYDomainTuple {
  @scala.inline
  def apply(y: DomainTuple, x: DomainTuple = null): AnonXYDomainTuple = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXYDomainTuple]
  }
}

