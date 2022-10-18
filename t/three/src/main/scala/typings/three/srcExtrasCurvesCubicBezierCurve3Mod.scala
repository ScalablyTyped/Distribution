package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesCubicBezierCurve3Mod {
  
  @JSImport("three/src/extras/curves/CubicBezierCurve3", "CubicBezierCurve3")
  @js.native
  open class CubicBezierCurve3 protected () extends Curve[Vector3] {
    def this(v0: Vector3, v1: Vector3, v2: Vector3, v3: Vector3) = this()
    
    /**
      * @default new THREE.Vector3()
      */
    var v0: Vector3 = js.native
    
    /**
      * @default new THREE.Vector3()
      */
    var v1: Vector3 = js.native
    
    /**
      * @default new THREE.Vector3()
      */
    var v2: Vector3 = js.native
    
    /**
      * @default new THREE.Vector3()
      */
    var v3: Vector3 = js.native
  }
}
