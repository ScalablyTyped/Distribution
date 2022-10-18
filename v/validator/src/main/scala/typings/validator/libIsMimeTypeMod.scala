package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsMimeTypeMod {
  
  @JSImport("validator/lib/isMimeType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string matches to a valid [MIME type](https://en.wikipedia.org/wiki/Media_type) format.
    */
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
