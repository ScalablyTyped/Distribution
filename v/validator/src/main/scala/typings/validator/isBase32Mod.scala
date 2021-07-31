package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isBase32Mod {
  
  @JSImport("validator/lib/isBase32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if a string is base32 encoded.
    */
  @scala.inline
  def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
