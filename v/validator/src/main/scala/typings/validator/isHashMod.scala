package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isHashMod {
  
  /**
    * Check if the string is a hash of type algorithm.
    *
    * @param algorithm - HashAlgorithm
    */
  @JSImport("validator/lib/isHash", JSImport.Default)
  @js.native
  def default(str: String, algorithm: typings.validator.mod.validator.HashAlgorithm): Boolean = js.native
  
  type HashAlgorithm = typings.validator.mod.validator.HashAlgorithm
}
