package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsHashMod {
  
  @JSImport("validator/lib/isHash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string is a hash of type algorithm.
    *
    * @param algorithm - HashAlgorithm
    */
  inline def default(str: String, algorithm: typings.validator.mod.validator.HashAlgorithm): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type HashAlgorithm = typings.validator.mod.validator.HashAlgorithm
}
