package typings.toughCookie.mod.CookieJar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serialized extends js.Object {
  var cookies: js.Array[typings.toughCookie.mod.Cookie.Serialized]
  var rejectPublicSuffixes: Boolean
  var storeType: String
  var version: String
}

object Serialized {
  @scala.inline
  def apply(
    cookies: js.Array[typings.toughCookie.mod.Cookie.Serialized],
    rejectPublicSuffixes: Boolean,
    storeType: String,
    version: String
  ): Serialized = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], rejectPublicSuffixes = rejectPublicSuffixes.asInstanceOf[js.Any], storeType = storeType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Serialized]
  }
}

