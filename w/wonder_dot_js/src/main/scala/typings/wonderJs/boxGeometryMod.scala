package typings.wonderJs

import typings.wonderJs.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/BoxGeometry", JSImport.Namespace)
@js.native
object boxGeometryMod extends js.Object {
  @js.native
  class BoxGeometry () extends Geometry {
    var depth: Double = js.native
    var depthSegments: Double = js.native
    var height: Double = js.native
    var heightSegments: Double = js.native
    var width: Double = js.native
    var widthSegments: Double = js.native
  }
  
  /* static members */
  @js.native
  object BoxGeometry extends js.Object {
    def create(): BoxGeometry = js.native
  }
  
}

