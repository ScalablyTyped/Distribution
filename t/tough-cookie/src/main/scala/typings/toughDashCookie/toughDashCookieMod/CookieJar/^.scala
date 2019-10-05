package typings.toughDashCookie.toughDashCookieMod.CookieJar

import typings.std.Error
import typings.toughDashCookie.toughDashCookieMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie", "CookieJar")
@js.native
object ^ extends js.Object {
  def deserialize(serialized: String, cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]): Unit = js.native
  def deserialize(
    serialized: String,
    store: Store,
    cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]
  ): Unit = js.native
  def deserialize(serialized: Serialized, cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]): Unit = js.native
  def deserialize(
    serialized: Serialized,
    store: Store,
    cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]
  ): Unit = js.native
  def deserializeSync(serialized: String): typings.toughDashCookie.toughDashCookieMod.CookieJar = js.native
  def deserializeSync(serialized: String, store: Store): typings.toughDashCookie.toughDashCookieMod.CookieJar = js.native
  def deserializeSync(serialized: Serialized): typings.toughDashCookie.toughDashCookieMod.CookieJar = js.native
  def deserializeSync(serialized: Serialized, store: Store): typings.toughDashCookie.toughDashCookieMod.CookieJar = js.native
  def fromJSON(string: String): typings.toughDashCookie.toughDashCookieMod.CookieJar = js.native
}

