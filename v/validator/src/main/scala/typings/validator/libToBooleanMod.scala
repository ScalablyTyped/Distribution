package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToBooleanMod {
  
  @JSImport("validator/lib/toBoolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the input string to a boolean.
    * Everything except for `'0'`, `'false'` and `''` returns `true`.
    *
    * @param [strict=false] - in `strict` mode, only `'1'` and `'true'` return `true`.
    */
  inline def default(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(input: String, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
