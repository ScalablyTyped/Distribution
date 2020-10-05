package typings.three

import typings.three.anon.Indices
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.sphereMod.Sphere
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/PolyhedronGeometry", JSImport.Namespace)
@js.native
object polyhedronGeometryMod extends js.Object {
  @js.native
  class PolyhedronBufferGeometry protected () extends BufferGeometry {
    def this(vertices: js.Array[Double], indices: js.Array[Double]) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double) = this()
    def this(
      vertices: js.Array[Double],
      indices: js.Array[Double],
      radius: js.UndefOr[scala.Nothing],
      detail: Double
    ) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double, detail: Double) = this()
    var parameters: Indices = js.native
  }
  
  @js.native
  class PolyhedronGeometry protected () extends Geometry {
    def this(vertices: js.Array[Double], indices: js.Array[Double]) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double) = this()
    def this(
      vertices: js.Array[Double],
      indices: js.Array[Double],
      radius: js.UndefOr[scala.Nothing],
      detail: Double
    ) = this()
    def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double, detail: Double) = this()
    @JSName("boundingSphere")
    var boundingSphere_PolyhedronGeometry: Sphere = js.native
    var parameters: Indices = js.native
  }
  
}

