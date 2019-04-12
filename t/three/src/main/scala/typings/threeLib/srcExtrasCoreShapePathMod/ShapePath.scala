package typings
package threeLib.srcExtrasCoreShapePathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/core/ShapePath", "ShapePath")
@js.native
class ShapePath () extends js.Object {
  var currentPath: js.Any = js.native
  var subPaths: js.Array[_] = js.native
  def bezierCurveTo(
    aCP1x: scala.Double,
    aCP1y: scala.Double,
    aCP2x: scala.Double,
    aCP2y: scala.Double,
    aX: scala.Double,
    aY: scala.Double
  ): scala.Unit = js.native
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def quadraticCurveTo(aCPx: scala.Double, aCPy: scala.Double, aX: scala.Double, aY: scala.Double): scala.Unit = js.native
  def splineThru(pts: js.Array[threeLib.srcMathVector2Mod.Vector2]): scala.Unit = js.native
  def toShapes(isCCW: scala.Boolean, noHoles: js.Any): js.Array[threeLib.srcExtrasCoreShapeMod.Shape] = js.native
}

