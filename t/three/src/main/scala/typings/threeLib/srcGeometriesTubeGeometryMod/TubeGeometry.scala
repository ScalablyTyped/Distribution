package typings
package threeLib.srcGeometriesTubeGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/TubeGeometry", "TubeGeometry")
@js.native
class TubeGeometry protected ()
  extends threeLib.srcCoreGeometryMod.Geometry {
  def this(path: threeLib.srcExtrasCoreCurveMod.Curve[threeLib.srcMathVector3Mod.Vector3]) = this()
  def this(path: threeLib.srcExtrasCoreCurveMod.Curve[threeLib.srcMathVector3Mod.Vector3], tubularSegments: scala.Double) = this()
  def this(path: threeLib.srcExtrasCoreCurveMod.Curve[threeLib.srcMathVector3Mod.Vector3], tubularSegments: scala.Double, radius: scala.Double) = this()
  def this(path: threeLib.srcExtrasCoreCurveMod.Curve[threeLib.srcMathVector3Mod.Vector3], tubularSegments: scala.Double, radius: scala.Double, radiusSegments: scala.Double) = this()
  def this(path: threeLib.srcExtrasCoreCurveMod.Curve[threeLib.srcMathVector3Mod.Vector3], tubularSegments: scala.Double, radius: scala.Double, radiusSegments: scala.Double, closed: scala.Boolean) = this()
  var binormals: js.Array[threeLib.srcMathVector3Mod.Vector3] = js.native
  var normals: js.Array[threeLib.srcMathVector3Mod.Vector3] = js.native
  var parameters: threeLib.Anon_Closed = js.native
  var tangents: js.Array[threeLib.srcMathVector3Mod.Vector3] = js.native
}

