package typings.three.srcExtrasCorePathMod

import typings.three.srcExtrasCoreCurvePathMod.CurvePath
import typings.three.srcMathVector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/core/Path", "Path")
@js.native
class Path () extends CurvePath[Vector2] {
  def this(points: js.Array[Vector2]) = this()
  var currentPoint: Vector2 = js.native
  def absarc(
    aX: Double,
    aY: Double,
    aRadius: Double,
    aStartAngle: Double,
    aEndAngle: Double,
    aClockwise: Boolean
  ): Unit = js.native
  def absellipse(
    aX: Double,
    aY: Double,
    xRadius: Double,
    yRadius: Double,
    aStartAngle: Double,
    aEndAngle: Double,
    aClockwise: Boolean,
    aRotation: Double
  ): Unit = js.native
  def arc(
    aX: Double,
    aY: Double,
    aRadius: Double,
    aStartAngle: Double,
    aEndAngle: Double,
    aClockwise: Boolean
  ): Unit = js.native
  def bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): Unit = js.native
  def ellipse(
    aX: Double,
    aY: Double,
    xRadius: Double,
    yRadius: Double,
    aStartAngle: Double,
    aEndAngle: Double,
    aClockwise: Boolean,
    aRotation: Double
  ): Unit = js.native
  /**
  	 * @deprecated Use {@link Path#setFromPoints .setFromPoints()} instead.
  	 */
  def fromPoints(vectors: js.Array[Vector2]): Unit = js.native
  def lineTo(x: Double, y: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): Unit = js.native
  def setFromPoints(vectors: js.Array[Vector2]): Unit = js.native
  def splineThru(pts: js.Array[Vector2]): Unit = js.native
}

