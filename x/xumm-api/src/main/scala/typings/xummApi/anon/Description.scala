package typings.xummApi.anon

import typings.xummApi.xummApiNumbers.`0`
import typings.xummApi.xummApiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Description extends js.Object {
  var description: String = js.native
  var disabled: `0` | `1` = js.native
  var icon_url: String = js.native
  var issued_user_token: String | Null = js.native
  var name: String = js.native
  var uuidv4: String = js.native
}

object Description {
  @scala.inline
  def apply(description: String, disabled: `0` | `1`, icon_url: String, name: String, uuidv4: String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], icon_url = icon_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uuidv4 = uuidv4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  @scala.inline
  implicit class DescriptionOps[Self <: Description] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: `0` | `1`): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon_url(value: String): Self = this.set("icon_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuidv4(value: String): Self = this.set("uuidv4", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssued_user_token(value: String): Self = this.set("issued_user_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssued_user_tokenNull: Self = this.set("issued_user_token", null)
  }
  
}

