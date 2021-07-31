package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toFloatMod {
  
  @JSImport("validator/lib/toFloat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the input string to a float, or `NaN` if the input is not a float.
    */
  @scala.inline
  def default(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
}
