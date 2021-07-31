package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isBase64Mod {
  
  @JSImport("validator/lib/isBase64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if a string is base64 encoded.
    */
  @scala.inline
  def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
