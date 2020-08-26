package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitLeaderOptions extends js.Object {
  var fill: js.UndefOr[String] = js.native
  var media: js.UndefOr[Double | String] = js.native
}

object UIkitLeaderOptions {
  @scala.inline
  def apply(): UIkitLeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitLeaderOptions]
  }
  @scala.inline
  implicit class UIkitLeaderOptionsOps[Self <: UIkitLeaderOptions] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setMedia(value: Double | String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
  }
  
}

