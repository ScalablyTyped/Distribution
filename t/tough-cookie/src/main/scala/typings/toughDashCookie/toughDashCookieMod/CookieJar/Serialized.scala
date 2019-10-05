package typings.toughDashCookie.toughDashCookieMod.CookieJar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serialized extends js.Object {
  var cookies: js.Array[typings.toughDashCookie.toughDashCookieMod.Cookie.Serialized]
  var rejectPublicSuffixes: Boolean
  var storeType: String
  var version: String
}

object Serialized {
  @scala.inline
  def apply(
    cookies: js.Array[typings.toughDashCookie.toughDashCookieMod.Cookie.Serialized],
    rejectPublicSuffixes: Boolean,
    storeType: String,
    version: String
  ): Serialized = {
    val __obj = js.Dynamic.literal(cookies = cookies, rejectPublicSuffixes = rejectPublicSuffixes, storeType = storeType, version = version)
  
    __obj.asInstanceOf[Serialized]
  }
}

