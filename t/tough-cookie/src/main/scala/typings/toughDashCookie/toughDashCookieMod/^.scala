package typings.toughDashCookie.toughDashCookieMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def canonicalDomain(str: String): String = js.native
  def cookieCompare(a: Cookie, b: Cookie): Double = js.native
  def defaultPath(path: String): String = js.native
  def domainMatch(str: String, domStr: String): Boolean = js.native
  def domainMatch(str: String, domStr: String, canonicalize: Boolean): Boolean = js.native
  def formatDate(date: Date): String = js.native
  def fromJSON(string: String): Cookie = js.native
  def getPublicSuffix(hostname: String): String | Null = js.native
  def parseDate(string: String): Date = js.native
  def pathMatch(reqPath: String, cookiePath: String): Boolean = js.native
  def permuteDomain(domain: String): js.Array[String] = js.native
  def permutePath(path: String): js.Array[String] = js.native
}

