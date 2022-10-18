package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEscapeMod {
  
  @JSImport("validator/lib/escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Replace `<`, `>`, `&`, `'`, `"` and `/` with HTML entities.
    */
  inline def default(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
