package typings
package toughDashCookieLib.toughDashCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def canonicalDomain(str: java.lang.String): java.lang.String = js.native
  def cookieCompare(a: Cookie, b: Cookie): scala.Double = js.native
  def defaultPath(path: java.lang.String): java.lang.String = js.native
  def domainMatch(str: java.lang.String, domStr: java.lang.String): scala.Boolean = js.native
  def domainMatch(str: java.lang.String, domStr: java.lang.String, canonicalize: scala.Boolean): scala.Boolean = js.native
  def formatDate(date: stdLib.Date): java.lang.String = js.native
  def fromJSON(string: java.lang.String): Cookie = js.native
  def getPublicSuffix(hostname: java.lang.String): java.lang.String | scala.Null = js.native
  def parseDate(string: java.lang.String): stdLib.Date = js.native
  def pathMatch(reqPath: java.lang.String, cookiePath: java.lang.String): scala.Boolean = js.native
  def permuteDomain(domain: java.lang.String): js.Array[java.lang.String] = js.native
  def permutePath(path: java.lang.String): js.Array[java.lang.String] = js.native
}

