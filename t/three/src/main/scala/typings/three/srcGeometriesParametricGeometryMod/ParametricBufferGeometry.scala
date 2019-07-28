package typings.three.srcGeometriesParametricGeometryMod

import typings.three.Anon_Dest
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/ParametricGeometry", "ParametricBufferGeometry")
@js.native
class ParametricBufferGeometry protected () extends BufferGeometry {
  def this(
    func: js.Function3[/* u */ Double, /* v */ Double, /* dest */ Vector3, Unit],
    slices: Double,
    stacks: Double
  ) = this()
  var parameters: Anon_Dest = js.native
}

