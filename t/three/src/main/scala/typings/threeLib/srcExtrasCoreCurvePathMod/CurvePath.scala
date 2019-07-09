package typings
package threeLib.srcExtrasCoreCurvePathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/core/CurvePath", "CurvePath")
@js.native
class CurvePath[T /* <: threeLib.srcMathVector2Mod.Vector */] ()
  extends threeLib.srcExtrasCoreCurveMod.Curve[T] {
  var autoClose: scala.Boolean = js.native
  var curves: js.Array[threeLib.srcExtrasCoreCurveMod.Curve[T]] = js.native
  def add(curve: threeLib.srcExtrasCoreCurveMod.Curve[T]): scala.Unit = js.native
  def checkConnection(): scala.Boolean = js.native
  def closePath(): scala.Unit = js.native
  /**
  	 * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
  	 */
  def createGeometry(points: js.Array[T]): threeLib.srcCoreGeometryMod.Geometry = js.native
  /**
  	 * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
  	 */
  def createPointsGeometry(divisions: scala.Double): threeLib.srcCoreGeometryMod.Geometry = js.native
  /**
  	 * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
  	 */
  def createSpacedPointsGeometry(divisions: scala.Double): threeLib.srcCoreGeometryMod.Geometry = js.native
  def getCurveLengths(): js.Array[scala.Double] = js.native
}

