package typings.wordpressUrl

import typings.std.Record
import typings.wordpressUrl.buildTypesGetQueryArgMod.QueryArgParsed
import typings.wordpressUrl.buildTypesGetQueryArgsMod.QueryArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addQueryArgs(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addQueryArgs")().asInstanceOf[String]
  inline def addQueryArgs(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addQueryArgs")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def addQueryArgs(url: String, args: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addQueryArgs")(url.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def addQueryArgs(url: Unit, args: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addQueryArgs")(url.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildQueryString(data: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildQueryString")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cleanForSlug(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanForSlug")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def filterURLForDisplay(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filterURLForDisplay")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def filterURLForDisplay(url: String, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("filterURLForDisplay")(url.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAuthority(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthority")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  inline def getFilename(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilename")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  inline def getFragment(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragment")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  inline def getPath(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  inline def getPathAndQueryString(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathAndQueryString")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getProtocol(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getProtocol")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  inline def getQueryArg(url: String, arg: String): QueryArgParsed | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueryArg")(url.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[QueryArgParsed | Unit]
  
  inline def getQueryArgs(url: String): QueryArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryArgs")(url.asInstanceOf[js.Any]).asInstanceOf[QueryArgs]
  
  inline def getQueryString(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryString")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  inline def hasQueryArg(url: String, arg: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasQueryArg")(url.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEmail(email: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isURL(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isURL")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidAuthority(authority: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAuthority")(authority.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidFragment(fragment: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFragment")(fragment.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPath(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidProtocol(protocol: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidProtocol")(protocol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidQueryString(queryString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidQueryString")(queryString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def prependHTTP(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prependHTTP")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def prependHTTPS(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prependHTTPS")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def removeQueryArgs(url: String, args: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeQueryArgs")(scala.List(url.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def safeDecodeURI(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeDecodeURI")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def safeDecodeURIComponent(uriComponent: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeDecodeURIComponent")(uriComponent.asInstanceOf[js.Any]).asInstanceOf[String]
}
