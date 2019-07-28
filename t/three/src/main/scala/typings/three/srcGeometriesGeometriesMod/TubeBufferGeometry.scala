package typings.three.srcGeometriesGeometriesMod

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "TubeBufferGeometry")
@js.native
class TubeBufferGeometry protected ()
  extends typings.three.srcGeometriesTubeGeometryMod.TubeBufferGeometry {
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
}

