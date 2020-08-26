package typings.subtitle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait subTitleType extends js.Object {
  var end: Double | String = js.native
  var setting: js.UndefOr[String] = js.native
  var start: Double | String = js.native
  var text: String = js.native
}

object subTitleType {
  @scala.inline
  def apply(end: Double | String, start: Double | String, text: String): subTitleType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[subTitleType]
  }
  @scala.inline
  implicit class subTitleTypeOps[Self <: subTitleType] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double | String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double | String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetting(value: String): Self = this.set("setting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetting: Self = this.set("setting", js.undefined)
  }
  
}

