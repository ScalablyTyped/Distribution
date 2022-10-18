package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsDivisibleByMod {
  
  @JSImport("validator/lib/isDivisibleBy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string is a number that's divisible by another.
    *
    * @param number - Divider number
    */
  inline def default(str: String, number: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
