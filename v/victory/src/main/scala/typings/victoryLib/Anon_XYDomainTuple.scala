package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYDomainTuple
  extends victoryLib.victoryMod._DomainPropType {
  var x: victoryLib.victoryMod.DomainTuple
  var y: js.UndefOr[victoryLib.victoryMod.DomainTuple] = js.undefined
}

object Anon_XYDomainTuple {
  @scala.inline
  def apply(x: victoryLib.victoryMod.DomainTuple, y: victoryLib.victoryMod.DomainTuple = null): Anon_XYDomainTuple = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_XYDomainTuple]
  }
}

