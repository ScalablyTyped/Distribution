package typings.vanillaColorful

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMathMod {
  
  @JSImport("vanilla-colorful/lib/utils/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clamp(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def clamp(number: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(number.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def clamp(number: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(number.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def clamp(number: Double, min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(number.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def round(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def round(number: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(number.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def round(number: Double, digits: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(number.asInstanceOf[js.Any], digits.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def round(number: Double, digits: Unit, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(number.asInstanceOf[js.Any], digits.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
}
