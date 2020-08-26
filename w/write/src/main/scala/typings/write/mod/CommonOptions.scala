package typings.write.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonOptions extends js.Object {
  var increment: js.UndefOr[Boolean] = js.native
  var newline: js.UndefOr[Boolean] = js.native
  var overwrite: js.UndefOr[Boolean] = js.native
}

object CommonOptions {
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
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
    def setIncrement(value: Boolean): Self = this.set("increment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
    @scala.inline
    def setNewline(value: Boolean): Self = this.set("newline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewline: Self = this.set("newline", js.undefined)
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
  }
  
}

