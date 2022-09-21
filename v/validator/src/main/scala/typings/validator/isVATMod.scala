package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isVATMod {
  
  @JSImport("validator/lib/isVAT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks that the string is a [valid VAT number
    */
  inline def default(str: String, countryCode: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
