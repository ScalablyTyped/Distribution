package typings.whatwgUrl.anon

import typings.whatwgUrl.mod.StateOverride
import typings.whatwgUrl.mod.URLRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingOverride extends js.Object {
  var baseURL: js.UndefOr[String] = js.native
  var encodingOverride: js.UndefOr[String] = js.native
  var stateOverride: js.UndefOr[StateOverride] = js.native
  var url: js.UndefOr[URLRecord] = js.native
}

object EncodingOverride {
  @scala.inline
  def apply(): EncodingOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingOverride]
  }
  @scala.inline
  implicit class EncodingOverrideOps[Self <: EncodingOverride] (val x: Self) extends AnyVal {
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
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseURL: Self = this.set("baseURL", js.undefined)
    @scala.inline
    def setEncodingOverride(value: String): Self = this.set("encodingOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodingOverride: Self = this.set("encodingOverride", js.undefined)
    @scala.inline
    def setStateOverride(value: StateOverride): Self = this.set("stateOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateOverride: Self = this.set("stateOverride", js.undefined)
    @scala.inline
    def setUrl(value: URLRecord): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

