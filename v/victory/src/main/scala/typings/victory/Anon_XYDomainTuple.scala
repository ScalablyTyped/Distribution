package typings.victory

import typings.victory.victoryMod.DomainTuple
import typings.victory.victoryMod._DomainPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYDomainTuple extends _DomainPropType {
  var x: js.UndefOr[DomainTuple] = js.undefined
  var y: DomainTuple
}

object Anon_XYDomainTuple {
  @scala.inline
  def apply(y: DomainTuple, x: DomainTuple = null): Anon_XYDomainTuple = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_XYDomainTuple]
  }
}

