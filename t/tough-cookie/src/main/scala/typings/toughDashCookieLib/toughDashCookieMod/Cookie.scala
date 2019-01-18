package typings
package toughDashCookieLib.toughDashCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie", "Cookie")
@js.native
class Cookie () extends js.Object {
  def this(properties: toughDashCookieLib.toughDashCookieMod.CookieNs.Properties) = this()
  var creation: stdLib.Date | scala.Null = js.native
  var creationIndex: scala.Double = js.native
  var domain: java.lang.String | scala.Null = js.native
  var expires: stdLib.Date | toughDashCookieLib.toughDashCookieLibStrings.Infinity = js.native
  var extensions: js.Array[java.lang.String] | scala.Null = js.native
  var hostOnly: scala.Boolean | scala.Null = js.native
  var httpOnly: scala.Boolean = js.native
  var key: java.lang.String = js.native
  var lastAccessed: stdLib.Date | scala.Null = js.native
  var maxAge: scala.Double | toughDashCookieLib.toughDashCookieLibStrings.Infinity | toughDashCookieLib.toughDashCookieLibStrings.`-Infinity` = js.native
  var path: java.lang.String | scala.Null = js.native
  var pathIsDefault: scala.Boolean | scala.Null = js.native
  var secure: scala.Boolean = js.native
  var value: java.lang.String = js.native
  def TTL(): scala.Double = js.native
  def TTL(now: stdLib.Date): scala.Double = js.native
  def canonicalizedDomain(): java.lang.String = js.native
  def cdomain(): java.lang.String = js.native
  def cookieString(): java.lang.String = js.native
  def expiryDate(): stdLib.Date = js.native
  def expiryDate(now: scala.Double): stdLib.Date = js.native
  def expiryTime(): scala.Double = js.native
  def expiryTime(now: scala.Double): scala.Double = js.native
  def setExpires(String: java.lang.String): scala.Unit = js.native
  def setMaxAge(number: scala.Double): scala.Unit = js.native
  def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def validate(): scala.Boolean | java.lang.String = js.native
}

@JSImport("tough-cookie", "Cookie")
@js.native
object Cookie extends js.Object {
  def fromJSON(strOrObj: java.lang.String): toughDashCookieLib.toughDashCookieMod.Cookie | scala.Null = js.native
  def fromJSON(strOrObj: js.Object): toughDashCookieLib.toughDashCookieMod.Cookie | scala.Null = js.native
  def parse(cookieString: java.lang.String): js.UndefOr[toughDashCookieLib.toughDashCookieMod.Cookie] = js.native
  def parse(
    cookieString: java.lang.String,
    options: toughDashCookieLib.toughDashCookieMod.CookieNs.ParseOptions
  ): js.UndefOr[toughDashCookieLib.toughDashCookieMod.Cookie] = js.native
}

