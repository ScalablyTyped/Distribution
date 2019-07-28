package typings.three.srcGeometriesGeometriesMod

import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "ParametricGeometry")
@js.native
class ParametricGeometry protected ()
  extends typings.three.srcGeometriesParametricGeometryMod.ParametricGeometry {
  def this(
    func: js.Function3[/* u */ Double, /* v */ Double, /* dest */ Vector3, Unit],
    slices: Double,
    stacks: Double
  ) = this()
}

