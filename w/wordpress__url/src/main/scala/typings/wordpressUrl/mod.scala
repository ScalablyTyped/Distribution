package typings.wordpressUrl

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/url", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def addQueryArgs(): String = js.native
  def addQueryArgs(url: String): String = js.native
  def addQueryArgs(url: String, args: js.Object): String = js.native
  def cleanForSlug(string: String): String = js.native
  def filterURLForDisplay(url: String): String = js.native
  def getAuthority(url: String): String | Unit = js.native
  def getFragment(url: String): String | Unit = js.native
  def getPath(url: String): String | Unit = js.native
  def getProtocol(url: String): String | Unit = js.native
  def getQueryArg(url: String, arg: String): js.UndefOr[
    String | js.Array[String] | (StringDictionary[String | js.Array[String] | js.Any])
  ] = js.native
  def getQueryString(url: String): String | Unit = js.native
  def hasQueryArg(url: String, arg: String): Boolean = js.native
  def isEmail(email: String): Boolean = js.native
  def isURL(url: String): Boolean = js.native
  def isValidAuthority(authority: String): Boolean = js.native
  def isValidFragment(fragment: String): Boolean = js.native
  def isValidPath(path: String): Boolean = js.native
  def isValidProtocol(protocol: String): Boolean = js.native
  def isValidQueryString(queryString: String): Boolean = js.native
  def prependHTTP(url: String): String = js.native
  def removeQueryArgs(url: String, args: String*): String = js.native
  def safeDecodeURI(uri: String): String = js.native
  def safeDecodeURIComponent(uriComponent: String): String = js.native
}

