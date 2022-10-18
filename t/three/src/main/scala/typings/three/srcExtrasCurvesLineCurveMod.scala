package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesLineCurveMod {
  
  @JSImport("three/src/extras/curves/LineCurve", "LineCurve")
  @js.native
  open class LineCurve protected () extends Curve[Vector2] {
    def this(v1: Vector2, v2: Vector2) = this()
    
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
