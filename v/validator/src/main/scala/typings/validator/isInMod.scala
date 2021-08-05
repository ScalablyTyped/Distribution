package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isInMod {
  
  @JSImport("validator/lib/isIn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string is in a array of allowed values.
    *
    * @param values - Allowed values.
    */
  inline def default(str: String, values: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
