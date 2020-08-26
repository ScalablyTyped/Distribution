package typings.twilioSync.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenListOptions extends OpenOptions {
  var context: js.UndefOr[json] = js.native
  var includeItems: js.UndefOr[Boolean] = js.native
  var purpose: js.UndefOr[String] = js.native
}

object OpenListOptions {
  @scala.inline
  def apply(): OpenListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenListOptions]
  }
  @scala.inline
  implicit class OpenListOptionsOps[Self <: OpenListOptions] (val x: Self) extends AnyVal {
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
    def setContext(value: json): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setIncludeItems(value: Boolean): Self = this.set("includeItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeItems: Self = this.set("includeItems", js.undefined)
    @scala.inline
    def setPurpose(value: String): Self = this.set("purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
  }
  
}

