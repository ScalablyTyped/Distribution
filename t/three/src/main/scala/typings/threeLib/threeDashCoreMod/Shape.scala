package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Shape")
@js.native
class Shape () extends Path {
  def this(points: js.Array[Vector2]) = this()
  var holes: js.Array[Path] = js.native
  /**
    * @deprecated Use {@link Shape#extractPoints .extractPoints()} instead.
    */
  def extractAllPoints(divisions: scala.Double): threeLib.Anon_Holes = js.native
  def extractPoints(divisions: scala.Double): js.Array[Vector2] = js.native
  /**
    * @deprecated Use {@link ExtrudeGeometry ExtrudeGeometry()} instead.
    */
  def extrude(): ExtrudeGeometry = js.native
  def extrude(options: js.Any): ExtrudeGeometry = js.native
  def getPointsHoles(divisions: scala.Double): js.Array[js.Array[Vector2]] = js.native
  /**
    * @deprecated Use {@link ShapeGeometry ShapeGeometry()} instead.
    */
  def makeGeometry(): ShapeGeometry = js.native
  def makeGeometry(options: js.Any): ShapeGeometry = js.native
}

