package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsUrlUtilsMod {
  
  @JSImport("wix-style-react/dist/types/utils/UrlUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUrl(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrl")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def prependHTTP(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prependHTTP")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
