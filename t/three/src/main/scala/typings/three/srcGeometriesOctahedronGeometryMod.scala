package typings.three

import typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronBufferGeometry
import typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/OctahedronGeometry", JSImport.Namespace)
@js.native
object srcGeometriesOctahedronGeometryMod extends js.Object {
  @js.native
  class OctahedronBufferGeometry () extends PolyhedronBufferGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
  }
  
  @js.native
  class OctahedronGeometry () extends PolyhedronGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
  }
  
}

