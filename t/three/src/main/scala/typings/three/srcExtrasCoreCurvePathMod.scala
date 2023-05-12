package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector2Mod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCoreCurvePathMod {
  
  @JSImport("three/src/extras/core/CurvePath", "CurvePath")
  @js.native
  /**
    * The constructor take no parameters.
    */
  open class CurvePath[T /* <: Vector */] () extends Curve[T] {
    
    /**
      * Add a curve to the {@link .curves} array.
      * @param curve
      */
    def add(curve: Curve[T]): Unit = js.native
    
    /**
      * Whether or not to automatically close the path.
      * @defaultValue false
      */
    var autoClose: Boolean = js.native
    
    /**
      * Adds a {@link LineCurve | lineCurve} to close the path.
      */
    def closePath(): Unit = js.native
    
    /**
      * The array of {@link Curve | Curves}.
      * @defaultValue `[]`
      */
    var curves: js.Array[Curve[T]] = js.native
    
    /**
      * Get list of cumulative curve lengths of the curves in the {@link .curves} array.
      */
    def getCurveLengths(): js.Array[Double] = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `CurvePath`
      */
    @JSName("type")
    val type_CurvePath: String | typings.three.threeStrings.CurvePath = js.native
  }
}
