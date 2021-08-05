package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalsMod {
  
  @JSImport("validator/lib/equals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string matches the comparison.
    *
    * @param comparison - String to compare
    */
  inline def default(str: String, comparison: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], comparison.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
