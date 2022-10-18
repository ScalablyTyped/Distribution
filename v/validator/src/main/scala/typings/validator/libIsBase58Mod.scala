package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsBase58Mod {
  
  @JSImport("validator/lib/isBase58", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * check if a string is base58 encoded
    */
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
