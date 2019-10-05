package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreGeometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/PlaneGeometry", JSImport.Namespace)
@js.native
object srcGeometriesPlaneGeometryMod extends js.Object {
  @js.native
  class PlaneBufferGeometry () extends BufferGeometry {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double, heightSegments: Double) = this()
    var parameters: Anon_HeightHeightSegments = js.native
  }
  
  @js.native
  class PlaneGeometry () extends Geometry {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double) = this()
    def this(width: Double, height: Double, widthSegments: Double, heightSegments: Double) = this()
    var parameters: Anon_HeightHeightSegments = js.native
  }
  
}

