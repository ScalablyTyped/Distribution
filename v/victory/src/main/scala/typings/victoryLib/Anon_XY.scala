package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XY
  extends victoryLib.victoryMod._DomainPropType {
  var x: js.UndefOr[victoryLib.victoryMod.DomainTuple] = js.undefined
  var y: victoryLib.victoryMod.DomainTuple
}

object Anon_XY {
  @scala.inline
  def apply(y: victoryLib.victoryMod.DomainTuple, x: victoryLib.victoryMod.DomainTuple = null): Anon_XY = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_XY]
  }
}

