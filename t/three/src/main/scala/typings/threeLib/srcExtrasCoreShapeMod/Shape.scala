package typings
package threeLib.srcExtrasCoreShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/core/Shape", "Shape")
@js.native
class Shape ()
  extends threeLib.srcExtrasCorePathMod.Path {
  def this(points: js.Array[threeLib.srcMathVector2Mod.Vector2]) = this()
  var holes: js.Array[threeLib.srcExtrasCorePathMod.Path] = js.native
  /**
    * @deprecated Use {@link Shape#extractPoints .extractPoints()} instead.
    */
  def extractAllPoints(divisions: scala.Double): threeLib.Anon_Holes = js.native
  def extractPoints(divisions: scala.Double): js.Array[threeLib.srcMathVector2Mod.Vector2] = js.native
  /**
    * @deprecated Use {@link ExtrudeGeometry ExtrudeGeometry()} instead.
    */
  def extrude(): threeLib.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry = js.native
  def extrude(options: js.Any): threeLib.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry = js.native
  def getPointsHoles(divisions: scala.Double): js.Array[js.Array[threeLib.srcMathVector2Mod.Vector2]] = js.native
  /**
    * @deprecated Use {@link ShapeGeometry ShapeGeometry()} instead.
    */
  def makeGeometry(): threeLib.srcGeometriesShapeGeometryMod.ShapeGeometry = js.native
  def makeGeometry(options: js.Any): threeLib.srcGeometriesShapeGeometryMod.ShapeGeometry = js.native
}

