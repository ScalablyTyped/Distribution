package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitCoverOptions extends js.Object {
  var automute: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object UIkitCoverOptions {
  @scala.inline
  def apply(): UIkitCoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitCoverOptions]
  }
  @scala.inline
  implicit class UIkitCoverOptionsOps[Self <: UIkitCoverOptions] (val x: Self) extends AnyVal {
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
    def setAutomute(value: Boolean): Self = this.set("automute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomute: Self = this.set("automute", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

