package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesSplineCurveMod {
  
  @JSImport("three/src/extras/curves/SplineCurve", "SplineCurve")
  @js.native
  open class SplineCurve () extends Curve[Vector2] {
    def this(points: js.Array[Vector2]) = this()
    
    /**
      * @default []
      */
    var points: js.Array[Vector2] = js.native
  }
}
