package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ParametricGeometry")
@js.native
class ParametricGeometry protected ()
  extends threeLib.srcGeometriesGeometriesMod.ParametricGeometry {
  def this(func: js.Function3[
      /* u */ scala.Double, 
      /* v */ scala.Double, 
      /* dest */ threeLib.srcMathVector3Mod.Vector3, 
      scala.Unit
    ], slices: scala.Double, stacks: scala.Double) = this()
}

