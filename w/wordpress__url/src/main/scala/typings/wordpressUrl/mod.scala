package typings.wordpressUrl

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/url", "addQueryArgs")
  @js.native
  def addQueryArgs(): String = js.native
  @JSImport("@wordpress/url", "addQueryArgs")
  @js.native
  def addQueryArgs(url: js.UndefOr[scala.Nothing], args: js.Object): String = js.native
  @JSImport("@wordpress/url", "addQueryArgs")
  @js.native
  def addQueryArgs(url: String): String = js.native
  @JSImport("@wordpress/url", "addQueryArgs")
  @js.native
  def addQueryArgs(url: String, args: js.Object): String = js.native
  
  @JSImport("@wordpress/url", "cleanForSlug")
  @js.native
  def cleanForSlug(string: String): String = js.native
  
  @JSImport("@wordpress/url", "filterURLForDisplay")
  @js.native
  def filterURLForDisplay(url: String): String = js.native
  
  @JSImport("@wordpress/url", "getAuthority")
  @js.native
  def getAuthority(url: String): String | Unit = js.native
  
  @JSImport("@wordpress/url", "getFragment")
  @js.native
  def getFragment(url: String): String | Unit = js.native
  
  @JSImport("@wordpress/url", "getPath")
  @js.native
  def getPath(url: String): String | Unit = js.native
  
  @JSImport("@wordpress/url", "getPathAndQueryString")
  @js.native
  def getPathAndQueryString(url: String): String = js.native
  
  @JSImport("@wordpress/url", "getProtocol")
  @js.native
  def getProtocol(url: String): String | Unit = js.native
  
  @JSImport("@wordpress/url", "getQueryArg")
  @js.native
  def getQueryArg(url: String, arg: String): js.UndefOr[
    String | js.Array[String] | (StringDictionary[String | js.Array[String] | js.Any])
  ] = js.native
  
  @JSImport("@wordpress/url", "getQueryString")
  @js.native
  def getQueryString(url: String): String | Unit = js.native
  
  @JSImport("@wordpress/url", "hasQueryArg")
  @js.native
  def hasQueryArg(url: String, arg: String): Boolean = js.native
  
  @JSImport("@wordpress/url", "isEmail")
  @js.native
  def isEmail(email: String): Boolean = js.native
  
  @JSImport("@wordpress/url", "isURL")
  @js.native
  def isURL(url: String): Boolean = js.native
  
  @JSImport("@wordpress/url", "isValidAuthority")
  @js.native
  def isValidAuthority(authority: String): Boolean = js.native
  
  @JSImport("@wordpress/url", "isValidFragment")
  @js.native
  def isValidFragment(fragment: String): Boolean = js.native
  
  @JSImport("@wordpress/url", "isValidPath")
  @js.native
  def isValidPath(path: String): Boolean = js.native
  
  @JSImport("@wordpress/url", "isValidProtocol")
  @js.native
  def isValidProtocol(protocol: String): Boolean = js.native
  
  @JSImport("@wordpress/url", "isValidQueryString")
  @js.native
  def isValidQueryString(queryString: String): Boolean = js.native
  
  @JSImport("@wordpress/url", "prependHTTP")
  @js.native
  def prependHTTP(url: String): String = js.native
  
  @JSImport("@wordpress/url", "removeQueryArgs")
  @js.native
  def removeQueryArgs(url: String, args: String*): String = js.native
  
  @JSImport("@wordpress/url", "safeDecodeURI")
  @js.native
  def safeDecodeURI(uri: String): String = js.native
  
  @JSImport("@wordpress/url", "safeDecodeURIComponent")
  @js.native
  def safeDecodeURIComponent(uriComponent: String): String = js.native
}
