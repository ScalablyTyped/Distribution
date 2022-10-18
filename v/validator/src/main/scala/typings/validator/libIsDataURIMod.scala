package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsDataURIMod {
  
  @JSImport("validator/lib/isDataURI", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string is a [data uri format](https://developer.mozilla.org/en-US/docs/Web/HTTP/data_URIs).
    */
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
