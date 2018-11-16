package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "CurvePath")
@js.native
class CurvePath[T /* <: Vector */] () extends Curve[T] {
  var autoClose: scala.Boolean = js.native
  var curves: js.Array[Curve[T]] = js.native
  def add(curve: Curve[T]): scala.Unit = js.native
  def checkConnection(): scala.Boolean = js.native
  def closePath(): scala.Unit = js.native
  /**
       * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
       */
  def createGeometry(points: js.Array[T]): Geometry = js.native
  /**
       * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
       */
  def createPointsGeometry(divisions: scala.Double): Geometry = js.native
  /**
       * @deprecated Use {@link Geometry#setFromPoints new THREE.Geometry().setFromPoints( points )} instead.
       */
  def createSpacedPointsGeometry(divisions: scala.Double): Geometry = js.native
  def getCurveLengths(): js.Array[scala.Double] = js.native
}

