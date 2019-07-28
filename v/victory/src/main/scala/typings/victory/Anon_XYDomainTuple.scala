package typings.victory

import typings.victory.victoryMod.DomainTuple
import typings.victory.victoryMod._DomainPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYDomainTuple extends _DomainPropType {
  var x: DomainTuple
  var y: js.UndefOr[DomainTuple] = js.undefined
}

object Anon_XYDomainTuple {
  @scala.inline
  def apply(x: DomainTuple, y: DomainTuple = null): Anon_XYDomainTuple = {
    val __obj = js.Dynamic.literal(x = x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_XYDomainTuple]
  }
}

