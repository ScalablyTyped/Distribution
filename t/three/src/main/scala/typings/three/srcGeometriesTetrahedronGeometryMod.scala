package typings.three

import typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronBufferGeometry
import typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/TetrahedronGeometry", JSImport.Namespace)
@js.native
object srcGeometriesTetrahedronGeometryMod extends js.Object {
  @js.native
  class TetrahedronBufferGeometry () extends PolyhedronBufferGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
  }
  
  @js.native
  class TetrahedronGeometry () extends PolyhedronGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
  }
  
}

