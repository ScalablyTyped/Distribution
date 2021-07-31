package typings.wordpressUrl

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addQueryArgs(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addQueryArgs")().asInstanceOf[String]
  @scala.inline
  def addQueryArgs(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addQueryArgs")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def addQueryArgs(url: String, args: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addQueryArgs")(url.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def addQueryArgs(url: Unit, args: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addQueryArgs")(url.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def cleanForSlug(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanForSlug")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def filterURLForDisplay(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filterURLForDisplay")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getAuthority(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthority")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  @scala.inline
  def getFragment(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragment")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  @scala.inline
  def getPath(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  @scala.inline
  def getPathAndQueryString(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathAndQueryString")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getProtocol(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getProtocol")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  @scala.inline
  def getQueryArg(url: String, arg: String): js.UndefOr[
    String | js.Array[String] | (StringDictionary[String | js.Array[String] | js.Any])
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueryArg")(url.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    String | js.Array[String] | (StringDictionary[String | js.Array[String] | js.Any])
  ]]
  
  @scala.inline
  def getQueryString(url: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryString")(url.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  @scala.inline
  def hasQueryArg(url: String, arg: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasQueryArg")(url.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isEmail(email: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isURL(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isURL")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidAuthority(authority: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAuthority")(authority.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidFragment(fragment: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFragment")(fragment.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidPath(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidProtocol(protocol: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidProtocol")(protocol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidQueryString(queryString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidQueryString")(queryString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def prependHTTP(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prependHTTP")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def removeQueryArgs(url: String, args: String*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeQueryArgs")(url.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def safeDecodeURI(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeDecodeURI")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def safeDecodeURIComponent(uriComponent: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeDecodeURIComponent")(uriComponent.asInstanceOf[js.Any]).asInstanceOf[String]
}
