package typings.atWordpressUrl.atWordpressUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addQueryArgs(): String = js.native
  def addQueryArgs(url: String): String = js.native
  def addQueryArgs(url: String, args: InputArgs): String = js.native
  def filterURLForDisplay(url: String): String = js.native
  def getAuthority(url: String): js.UndefOr[String] = js.native
  def getFragment(url: String): js.UndefOr[String] = js.native
  def getPath(url: String): js.UndefOr[String] = js.native
  def getProtocol(url: String): js.UndefOr[String] = js.native
  def getQueryArg(url: String, arg: String): js.UndefOr[OutputArg] = js.native
  def getQueryString(url: String): js.UndefOr[String] = js.native
  def hasQueryArg(url: String, arg: String): Boolean = js.native
  def isURL(url: String): Boolean = js.native
  def isValidAuthority(url: String): Boolean = js.native
  def isValidFragment(frag: String): Boolean = js.native
  def isValidPath(path: String): Boolean = js.native
  def isValidProtocol(proto: String): Boolean = js.native
  def isValidQueryString(query: String): Boolean = js.native
  def prependHTTP(url: String): String = js.native
  def removeQueryArgs(url: String, args: String*): String = js.native
  def safeDecodeURI(uri: String): String = js.native
}

