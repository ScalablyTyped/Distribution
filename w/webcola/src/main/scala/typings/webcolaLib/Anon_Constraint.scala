package typings
package webcolaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Constraint extends js.Object {
  var constraint: webcolaLib.distSrcVpscMod.Constraint
  var lb: webcolaLib.distSrcVpscMod.Block
  var rb: webcolaLib.distSrcVpscMod.Block
}

object Anon_Constraint {
  @scala.inline
  def apply(
    constraint: webcolaLib.distSrcVpscMod.Constraint,
    lb: webcolaLib.distSrcVpscMod.Block,
    rb: webcolaLib.distSrcVpscMod.Block
  ): Anon_Constraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constraint")(constraint)
    __obj.updateDynamic("lb")(lb)
    __obj.updateDynamic("rb")(rb)
    __obj.asInstanceOf[Anon_Constraint]
  }
}

