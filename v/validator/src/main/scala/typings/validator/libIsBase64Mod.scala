package typings.validator

import typings.validator.mod.validator.IsBase64Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsBase64Mod {
  
  @JSImport("validator/lib/isBase64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if a string is base64 encoded.
    *
    * @param [options] - Options
    */
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(str: String, options: IsBase64Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
