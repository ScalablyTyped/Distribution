package typings.three

import typings.three.srcExtrasCoreShapeMod.Shape
import typings.three.srcMathColorMod.Color
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCoreShapePathMod {
  
  @JSImport("three/src/extras/core/ShapePath", "ShapePath")
  @js.native
  open class ShapePath () extends StObject {
    
    def bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): this.type = js.native
    
    /**
      * @default new THREE.Color()
      */
    var color: Color = js.native
    
    /**
      * @default null
      */
    var currentPath: Any = js.native
    
    def lineTo(x: Double, y: Double): this.type = js.native
    
    def moveTo(x: Double, y: Double): this.type = js.native
    
    def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): this.type = js.native
    
    def splineThru(pts: js.Array[Vector2]): this.type = js.native
    
    /**
      * @default []
      */
    var subPaths: js.Array[Any] = js.native
    
    def toShapes(isCCW: Boolean): js.Array[Shape] = js.native
    
    /**
      * @default 'ShapePath'
      */
    var `type`: String = js.native
  }
}
