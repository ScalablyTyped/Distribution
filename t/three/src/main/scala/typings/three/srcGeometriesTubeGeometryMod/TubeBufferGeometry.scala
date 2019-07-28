package typings.three.srcGeometriesTubeGeometryMod

import typings.three.Anon_Closed
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/TubeGeometry", "TubeBufferGeometry")
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

