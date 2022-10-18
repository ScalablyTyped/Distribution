package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesLineCurve3Mod {
  
  @JSImport("three/src/extras/curves/LineCurve3", "LineCurve3")
  @js.native
  open class LineCurve3 protected () extends Curve[Vector3] {
    def this(v1: Vector3, v2: Vector3) = this()
    
    /**
      * @default new THREE.Vector3()
      */
    var v1: Vector3 = js.native
    
    /**
      * @default new THREE.Vector3()
      */
    var v2: Vector3 = js.native
  }
}
