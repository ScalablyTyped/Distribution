package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ParametricGeometry")
@js.native
class ParametricGeometry protected ()
  extends threeLib.threeDashCoreMod.ParametricGeometry {
  def this(func: js.Function3[
      /* u */ scala.Double, 
      /* v */ scala.Double, 
      /* dest */ threeLib.threeDashCoreMod.Vector3, 
      scala.Unit
    ], slices: scala.Double, stacks: scala.Double) = this()
}

