package typings.xummApi.mod

import typings.xummApi.anon.Expire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummPayloadBodyBase extends js.Object {
  var custom_meta: js.UndefOr[XummCustomMeta] = js.native
  var options: js.UndefOr[Expire] = js.native
  var user_token: js.UndefOr[String] = js.native
}

object XummPayloadBodyBase {
  @scala.inline
  def apply(): XummPayloadBodyBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XummPayloadBodyBase]
  }
  @scala.inline
  implicit class XummPayloadBodyBaseOps[Self <: XummPayloadBodyBase] (val x: Self) extends AnyVal {
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
    def setCustom_meta(value: XummCustomMeta): Self = this.set("custom_meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_meta: Self = this.set("custom_meta", js.undefined)
    @scala.inline
    def setOptions(value: Expire): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setUser_token(value: String): Self = this.set("user_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_token: Self = this.set("user_token", js.undefined)
  }
  
}

