package typings
package atWordpressUrlLib.atWordpressUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addQueryArgs(): java.lang.String = js.native
  def addQueryArgs(url: java.lang.String): java.lang.String = js.native
  def addQueryArgs(url: java.lang.String, args: InputArgs): java.lang.String = js.native
  def filterURLForDisplay(url: java.lang.String): java.lang.String = js.native
  def getAuthority(url: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getFragment(url: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getPath(url: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getProtocol(url: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getQueryArg(url: java.lang.String, arg: java.lang.String): js.UndefOr[OutputArg] = js.native
  def getQueryString(url: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def hasQueryArg(url: java.lang.String, arg: java.lang.String): scala.Boolean = js.native
  def isURL(url: java.lang.String): scala.Boolean = js.native
  def isValidAuthority(url: java.lang.String): scala.Boolean = js.native
  def isValidFragment(frag: java.lang.String): scala.Boolean = js.native
  def isValidPath(path: java.lang.String): scala.Boolean = js.native
  def isValidProtocol(proto: java.lang.String): scala.Boolean = js.native
  def isValidQueryString(query: java.lang.String): scala.Boolean = js.native
  def prependHTTP(url: java.lang.String): java.lang.String = js.native
  def removeQueryArgs(url: java.lang.String, args: java.lang.String*): java.lang.String = js.native
  def safeDecodeURI(uri: java.lang.String): java.lang.String = js.native
}

