package typings.twilioChat.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateChannelOptions extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.native
  var friendlyName: js.UndefOr[String] = js.native
  var isPrivate: js.UndefOr[Boolean] = js.native
  var uniqueName: js.UndefOr[String] = js.native
}

object CreateChannelOptions {
  @scala.inline
  def apply(): CreateChannelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelOptions]
  }
  @scala.inline
  implicit class CreateChannelOptionsOps[Self <: CreateChannelOptions] (val x: Self) extends AnyVal {
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
    def setAttributes(value: js.Object): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    @scala.inline
    def setIsPrivate(value: Boolean): Self = this.set("isPrivate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrivate: Self = this.set("isPrivate", js.undefined)
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueName: Self = this.set("uniqueName", js.undefined)
  }
  
}

