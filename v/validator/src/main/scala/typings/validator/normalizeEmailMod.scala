package typings.validator

import typings.validator.validatorBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeEmailMod {
  
  /**
    * Canonicalizes an email address. (This doesn't validate that the input is an email, if you want to validate the email use `isEmail` beforehand)
    *
    * @param [options] - Options
    */
  @JSImport("validator/lib/normalizeEmail", JSImport.Default)
  @js.native
  def default(email: String): String | `false` = js.native
  @JSImport("validator/lib/normalizeEmail", JSImport.Default)
  @js.native
  def default(email: String, options: typings.validator.mod.validator.NormalizeEmailOptions): String | `false` = js.native
  
  type NormalizeEmailOptions = typings.validator.mod.validator.NormalizeEmailOptions
}
