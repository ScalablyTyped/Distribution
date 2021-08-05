package typings.wordpressUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isValidQueryStringMod {
  
  @JSImport("@wordpress/url/build-types/is-valid-query-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidQueryString(queryString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidQueryString")(queryString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
