package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toIntMod {
  
  @JSImport("validator/lib/toInt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the input string to an integer, or `NaN` if the input is not an integer.
    *
    * @param [radix=10] - radix or base (defaults to 10)
    */
  @scala.inline
  def default(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def default(input: String, radix: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Double]
}
