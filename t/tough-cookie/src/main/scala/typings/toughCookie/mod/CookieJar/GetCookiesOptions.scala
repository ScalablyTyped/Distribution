package typings.toughCookie.mod.CookieJar

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCookiesOptions extends js.Object {
  var allPaths: js.UndefOr[Boolean] = js.native
  var expire: js.UndefOr[Boolean] = js.native
  var http: js.UndefOr[Boolean] = js.native
  var now: js.UndefOr[Date] = js.native
  var secure: js.UndefOr[Boolean] = js.native
}

object GetCookiesOptions {
  @scala.inline
  def apply(): GetCookiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCookiesOptions]
  }
  @scala.inline
  implicit class GetCookiesOptionsOps[Self <: GetCookiesOptions] (val x: Self) extends AnyVal {
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
    def setAllPaths(value: Boolean): Self = this.set("allPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllPaths: Self = this.set("allPaths", js.undefined)
    @scala.inline
    def setExpire(value: Boolean): Self = this.set("expire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpire: Self = this.set("expire", js.undefined)
    @scala.inline
    def setHttp(value: Boolean): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    @scala.inline
    def setNow(value: Date): Self = this.set("now", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
  }
  
}

