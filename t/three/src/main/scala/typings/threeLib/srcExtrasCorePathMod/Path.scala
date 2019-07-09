package typings
package threeLib.srcExtrasCorePathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/core/Path", "Path")
@js.native
class Path ()
  extends threeLib.srcExtrasCoreCurvePathMod.CurvePath[threeLib.srcMathVector2Mod.Vector2] {
  def this(points: js.Array[threeLib.srcMathVector2Mod.Vector2]) = this()
  var currentPoint: threeLib.srcMathVector2Mod.Vector2 = js.native
  def absarc(
    aX: scala.Double,
    aY: scala.Double,
    aRadius: scala.Double,
    aStartAngle: scala.Double,
    aEndAngle: scala.Double,
    aClockwise: scala.Boolean
  ): scala.Unit = js.native
  def absellipse(
    aX: scala.Double,
    aY: scala.Double,
    xRadius: scala.Double,
    yRadius: scala.Double,
    aStartAngle: scala.Double,
    aEndAngle: scala.Double,
    aClockwise: scala.Boolean,
    aRotation: scala.Double
  ): scala.Unit = js.native
  def arc(
    aX: scala.Double,
    aY: scala.Double,
    aRadius: scala.Double,
    aStartAngle: scala.Double,
    aEndAngle: scala.Double,
    aClockwise: scala.Boolean
  ): scala.Unit = js.native
  def bezierCurveTo(
    aCP1x: scala.Double,
    aCP1y: scala.Double,
    aCP2x: scala.Double,
    aCP2y: scala.Double,
    aX: scala.Double,
    aY: scala.Double
  ): scala.Unit = js.native
  def ellipse(
    aX: scala.Double,
    aY: scala.Double,
    xRadius: scala.Double,
    yRadius: scala.Double,
    aStartAngle: scala.Double,
    aEndAngle: scala.Double,
    aClockwise: scala.Boolean,
    aRotation: scala.Double
  ): scala.Unit = js.native
  /**
  	 * @deprecated Use {@link Path#setFromPoints .setFromPoints()} instead.
  	 */
  def fromPoints(vectors: js.Array[threeLib.srcMathVector2Mod.Vector2]): scala.Unit = js.native
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def quadraticCurveTo(aCPx: scala.Double, aCPy: scala.Double, aX: scala.Double, aY: scala.Double): scala.Unit = js.native
  def setFromPoints(vectors: js.Array[threeLib.srcMathVector2Mod.Vector2]): scala.Unit = js.native
  def splineThru(pts: js.Array[threeLib.srcMathVector2Mod.Vector2]): scala.Unit = js.native
}

