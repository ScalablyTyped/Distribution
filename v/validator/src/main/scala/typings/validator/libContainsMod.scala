package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContainsMod {
  
  @JSImport("validator/lib/contains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /******************
    *** Validators ***
    ******************/
  /**
    * Check if the string contains the seed.
    *
    * @param seed - Seed
    */
  inline def default(str: String, seed: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
