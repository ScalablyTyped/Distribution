package typings
package toughDashCookieLib.toughDashCookieMod.CookieJarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serialized extends js.Object {
  var cookies: js.Array[toughDashCookieLib.toughDashCookieMod.CookieNs.Serialized]
  var rejectPublicSuffixes: scala.Boolean
  var storeType: java.lang.String
  var version: java.lang.String
}

object Serialized {
  @scala.inline
  def apply(
    cookies: js.Array[toughDashCookieLib.toughDashCookieMod.CookieNs.Serialized],
    rejectPublicSuffixes: scala.Boolean,
    storeType: java.lang.String,
    version: java.lang.String
  ): Serialized = {
    val __obj = js.Dynamic.literal(cookies = cookies, rejectPublicSuffixes = rejectPublicSuffixes, storeType = storeType, version = version)
  
    __obj.asInstanceOf[Serialized]
  }
}

