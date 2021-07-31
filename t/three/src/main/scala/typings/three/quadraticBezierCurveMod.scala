package typings.three

import typings.three.curveMod.Curve
import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quadraticBezierCurveMod {
  
  @JSImport("three/src/extras/curves/QuadraticBezierCurve", "QuadraticBezierCurve")
  @js.native
  class QuadraticBezierCurve protected () extends Curve[Vector2] {
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
