package typings.three

import typings.three.anon.Closed
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.curveMod.Curve
import typings.three.geometryMod.Geometry
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/TubeGeometry", JSImport.Namespace)
@js.native
object tubeGeometryMod extends js.Object {
  @js.native
  class TubeBufferGeometry protected () extends BufferGeometry {
    def this(path: Curve[Vector3]) = this()
    def this(path: Curve[Vector3], tubularSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Double, radiusSegments: Double) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Double,
      radius: Double,
      radiusSegments: Double,
      closed: Boolean
    ) = this()
    var binormals: js.Array[Vector3] = js.native
    var normals: js.Array[Vector3] = js.native
    var parameters: Closed = js.native
    var tangents: js.Array[Vector3] = js.native
  }
  
  @js.native
  class TubeGeometry protected () extends Geometry {
    def this(path: Curve[Vector3]) = this()
    def this(path: Curve[Vector3], tubularSegments: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Double) = this()
    def this(path: Curve[Vector3], tubularSegments: Double, radius: Double, radiusSegments: Double) = this()
    def this(
      path: Curve[Vector3],
      tubularSegments: Double,
      radius: Double,
      radiusSegments: Double,
      closed: Boolean
    ) = this()
    var binormals: js.Array[Vector3] = js.native
    var normals: js.Array[Vector3] = js.native
    var parameters: Closed = js.native
    var tangents: js.Array[Vector3] = js.native
  }
  
}

