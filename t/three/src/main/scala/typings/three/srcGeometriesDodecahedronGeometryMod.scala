package typings.three

import typings.three.srcCoreGeometryMod.Geometry
import typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronBufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/DodecahedronGeometry", JSImport.Namespace)
@js.native
object srcGeometriesDodecahedronGeometryMod extends js.Object {
  @js.native
  class DodecahedronBufferGeometry () extends PolyhedronBufferGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
  }
  
  @js.native
  class DodecahedronGeometry () extends Geometry {
    def this(radius: Double) = this()
    def this(radius: Double, detail: Double) = this()
    var parameters: Anon_Detail = js.native
  }
  
}

