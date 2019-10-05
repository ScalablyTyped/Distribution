package typings.three

import typings.three.srcExtrasCoreShapeMod.Shape
import typings.three.srcMathVector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/core/ShapePath", JSImport.Namespace)
@js.native
object srcExtrasCoreShapePathMod extends js.Object {
  @js.native
  class ShapePath () extends js.Object {
    var currentPath: js.Any = js.native
    var subPaths: js.Array[_] = js.native
    def bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): Unit = js.native
    def lineTo(x: Double, y: Double): Unit = js.native
    def moveTo(x: Double, y: Double): Unit = js.native
    def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): Unit = js.native
    def splineThru(pts: js.Array[Vector2]): Unit = js.native
    def toShapes(isCCW: Boolean, noHoles: js.Any): js.Array[Shape] = js.native
  }
  
}

