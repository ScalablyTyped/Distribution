package typings.toughDashCookie.toughDashCookieMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.toughDashCookie.toughDashCookieMod.Cookie.Properties
import typings.toughDashCookie.toughDashCookieStrings.Infinity
import typings.toughDashCookie.toughDashCookieStrings.`-Infinity`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie", "Cookie")
@js.native
class Cookie_ () extends js.Object {
  def this(properties: Properties) = this()
  var creation: Date | Null = js.native
  var creationIndex: Double = js.native
  var domain: String | Null = js.native
  var expires: Date | Infinity = js.native
  var extensions: js.Array[String] | Null = js.native
  var hostOnly: Boolean | Null = js.native
  var httpOnly: Boolean = js.native
  var key: String = js.native
  var lastAccessed: Date | Null = js.native
  var maxAge: Double | Infinity | `-Infinity` = js.native
  var path: String | Null = js.native
  var pathIsDefault: Boolean | Null = js.native
  var secure: Boolean = js.native
  var value: String = js.native
  def TTL(): Double = js.native
  def TTL(now: Date): Double = js.native
  def canonicalizedDomain(): String = js.native
  def cdomain(): String = js.native
  def cookieString(): String = js.native
  def expiryDate(): Date = js.native
  def expiryDate(now: Double): Date = js.native
  def expiryTime(): Double = js.native
  def expiryTime(now: Double): Double = js.native
  def setExpires(String: String): Unit = js.native
  def setMaxAge(number: Double): Unit = js.native
  def toJSON(): StringDictionary[js.Any] = js.native
  def validate(): Boolean | String = js.native
}

