package typings.vis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait From extends js.Object {
  var from: js.UndefOr[Boolean | Enabled] = js.native
  var middle: js.UndefOr[Boolean | Enabled] = js.native
  var to: js.UndefOr[Boolean | Enabled] = js.native
}

object From {
  @scala.inline
  def apply(): From = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From]
  }
  @scala.inline
  implicit class FromOps[Self <: From] (val x: Self) extends AnyVal {
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
    def setFrom(value: Boolean | Enabled): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setMiddle(value: Boolean | Enabled): Self = this.set("middle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddle: Self = this.set("middle", js.undefined)
    @scala.inline
    def setTo(value: Boolean | Enabled): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

