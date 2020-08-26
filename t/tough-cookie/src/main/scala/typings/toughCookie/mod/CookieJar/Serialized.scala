package typings.toughCookie.mod.CookieJar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serialized extends js.Object {
  var cookies: js.Array[typings.toughCookie.mod.Cookie.Serialized] = js.native
  var rejectPublicSuffixes: Boolean = js.native
  var storeType: String = js.native
  var version: String = js.native
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
  @scala.inline
  implicit class SerializedOps[Self <: Serialized] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCookiesVarargs(value: typings.toughCookie.mod.Cookie.Serialized*): Self = this.set("cookies", js.Array(value :_*))
    @scala.inline
    def setCookies(value: js.Array[typings.toughCookie.mod.Cookie.Serialized]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def setRejectPublicSuffixes(value: Boolean): Self = this.set("rejectPublicSuffixes", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoreType(value: String): Self = this.set("storeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

