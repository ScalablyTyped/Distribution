package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dest extends js.Object {
  var slices: scala.Double
  var stacks: scala.Double
  def func(u: scala.Double, v: scala.Double, dest: threeLib.threeDashCoreMod.Vector3): scala.Unit
}

object Anon_Dest {
  @scala.inline
  def apply(
    func: js.Function3[scala.Double, scala.Double, threeLib.threeDashCoreMod.Vector3, scala.Unit],
    slices: scala.Double,
    stacks: scala.Double
  ): Anon_Dest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("func")(func)
    __obj.updateDynamic("slices")(slices)
    __obj.updateDynamic("stacks")(stacks)
    __obj.asInstanceOf[Anon_Dest]
  }
}

