package typings.xhr2Cookies.xmlHttpRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequestOptions extends js.Object {
  var anon: js.UndefOr[Boolean] = js.native
}

object XMLHttpRequestOptions {
  @scala.inline
  def apply(): XMLHttpRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLHttpRequestOptions]
  }
  @scala.inline
  implicit class XMLHttpRequestOptionsOps[Self <: XMLHttpRequestOptions] (val x: Self) extends AnyVal {
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
    def setAnon(value: Boolean): Self = this.set("anon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnon: Self = this.set("anon", js.undefined)
  }
  
}

