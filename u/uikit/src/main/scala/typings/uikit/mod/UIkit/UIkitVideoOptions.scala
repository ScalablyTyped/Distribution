package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitVideoOptions extends js.Object {
  var automute: js.UndefOr[Boolean] = js.native
  var autoplay: js.UndefOr[Boolean | String] = js.native
}

object UIkitVideoOptions {
  @scala.inline
  def apply(): UIkitVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitVideoOptions]
  }
  @scala.inline
  implicit class UIkitVideoOptionsOps[Self <: UIkitVideoOptions] (val x: Self) extends AnyVal {
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
    def setAutoplay(value: Boolean | String): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
  }
  
}

