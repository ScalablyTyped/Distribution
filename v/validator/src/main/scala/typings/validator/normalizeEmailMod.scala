package typings.validator

import typings.validator.validatorBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeEmailMod {
  
  @JSImport("validator/lib/normalizeEmail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Canonicalizes an email address. (This doesn't validate that the input is an email, if you want to validate the email use `isEmail` beforehand)
    *
    * @param [options] - Options
    */
  inline def default(email: String): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(email.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  inline def default(email: String, options: typings.validator.mod.validator.NormalizeEmailOptions): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  
  type NormalizeEmailOptions = typings.validator.mod.validator.NormalizeEmailOptions
}
