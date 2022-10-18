package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesQuadraticBezierCurveMod {
  
  @JSImport("three/src/extras/curves/QuadraticBezierCurve", "QuadraticBezierCurve")
  @js.native
  open class QuadraticBezierCurve protected () extends Curve[Vector2] {
    def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()
    
    /**
      * @default new THREE.Vector2()
      */
    var v0: Vector2 = js.native
    
    /**
      * @default new THREE.Vector2()
      */
    var v1: Vector2 = js.native
    
    /**
      * @default new THREE.Vector2()
      */
    var v2: Vector2 = js.native
  }
}
