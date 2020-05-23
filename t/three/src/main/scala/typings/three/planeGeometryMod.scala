package typings.three

import typings.three.anon.Width
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/PlaneGeometry", JSImport.Namespace)
@js.native
object planeGeometryMod extends js.Object {
  @js.native
  class PlaneBufferGeometry () extends BufferGeometry {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double, heightSegments: Double) = this()
    var parameters: Width = js.native
  }
  
  @js.native
  class PlaneGeometry () extends Geometry {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double, heightSegments: Double) = this()
    var parameters: Width = js.native
  }
  
}

