package typings.three

import typings.three.srcExtrasCoreCurveMod.Curve
import typings.three.srcMathVector2Mod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasCoreCurvePathMod {
  
  @JSImport("three/src/extras/core/CurvePath", "CurvePath")
  @js.native
  open class CurvePath[T /* <: Vector */] () extends Curve[T] {
    
    def add(curve: Curve[T]): Unit = js.native
    
    /**
      * @default false
      */
    var autoClose: Boolean = js.native
    
    def closePath(): Unit = js.native
    
    /**
      * @default []
      */
    var curves: js.Array[Curve[T]] = js.native
    
    def getCurveLengths(): js.Array[Double] = js.native
  }
}
