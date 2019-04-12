package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dest extends js.Object {
  var slices: scala.Double
  var stacks: scala.Double
  def func(u: scala.Double, v: scala.Double, dest: threeLib.srcMathVector3Mod.Vector3): scala.Unit
}

object Anon_Dest {
  @scala.inline
  def apply(
    func: (scala.Double, scala.Double, threeLib.srcMathVector3Mod.Vector3) => scala.Unit,
    slices: scala.Double,
    stacks: scala.Double
  ): Anon_Dest = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction3(func), slices = slices, stacks = stacks)
  
    __obj.asInstanceOf[Anon_Dest]
  }
}

