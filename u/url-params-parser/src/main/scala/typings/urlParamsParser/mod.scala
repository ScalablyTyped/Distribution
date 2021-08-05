package typings.urlParamsParser

import typings.urlParamsParser.urlParserMod.UrlParserResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-params-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def UrlParser(urlString: String): UrlParserResult = ^.asInstanceOf[js.Dynamic].applyDynamic("UrlParser")(urlString.asInstanceOf[js.Any]).asInstanceOf[UrlParserResult]
  inline def UrlParser(urlString: String, namedUrl: String): UrlParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("UrlParser")(urlString.asInstanceOf[js.Any], namedUrl.asInstanceOf[js.Any])).asInstanceOf[UrlParserResult]
}
