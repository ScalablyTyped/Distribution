package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreGeometryMod.Geometry
import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/TubeGeometry", JSImport.Namespace)
@js.native
object srcGeometriesTubeGeometryMod extends js.Object {
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
    var parameters: Anon_Closed = js.native
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
    var parameters: Anon_Closed = js.native
    var tangents: js.Array[Vector3] = js.native
  }
  
}

