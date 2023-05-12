package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCurvesSplineCurveMod {
  
  @JSImport("three/src/extras/curves/SplineCurve", "SplineCurve")
  @js.native
  /**
    * This constructor creates a new {@link SplineCurve}.
    * @param points An array of {@link THREE.Vector2 | Vector2} points that define the curve. Default `[]`
    */
  open class SplineCurve () extends Curve[Vector2] {
    def this(points: js.Array[Vector2]) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link SplineCurve}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isSplineCurve: /* true */ Boolean = js.native
    
    /**
      * The array of {@link THREE.Vector2 | Vector2} points that define the curve.
      * @defaultValue `[]`
      */
    var points: js.Array[Vector2] = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `SplineCurve`
      */
    @JSName("type")
    val type_SplineCurve: String | typings.three.threeStrings.SplineCurve = js.native
  }
}
