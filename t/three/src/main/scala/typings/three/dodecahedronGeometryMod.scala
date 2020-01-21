package typings.three

import typings.three.geometryMod.Geometry
import typings.three.polyhedronGeometryMod.PolyhedronBufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/DodecahedronGeometry", JSImport.Namespace)
@js.native
object dodecahedronGeometryMod extends js.Object {
  @js.native
  class DodecahedronBufferGeometry () extends PolyhedronBufferGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
  }
  
  @js.native
  class DodecahedronGeometry () extends Geometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    var parameters: AnonDetail = js.native
  }
  
}

