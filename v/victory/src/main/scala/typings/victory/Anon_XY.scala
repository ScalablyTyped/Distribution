package typings.victory

import typings.victory.victoryMod.DomainTuple
import typings.victory.victoryMod._DomainPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XY extends _DomainPropType {
  var x: js.UndefOr[DomainTuple] = js.undefined
  var y: DomainTuple
}

object Anon_XY {
  @scala.inline
  def apply(y: DomainTuple, x: DomainTuple = null): Anon_XY = {
    val __obj = js.Dynamic.literal(y = y)
    if (x != null) __obj.updateDynamic("x")(x)
    __obj.asInstanceOf[Anon_XY]
  }
}

