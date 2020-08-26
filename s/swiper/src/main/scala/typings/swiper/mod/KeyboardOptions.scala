package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var onlyInViewport: js.UndefOr[Boolean] = js.native
}

object KeyboardOptions {
  @scala.inline
  def apply(): KeyboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardOptions]
  }
  @scala.inline
  implicit class KeyboardOptionsOps[Self <: KeyboardOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setOnlyInViewport(value: Boolean): Self = this.set("onlyInViewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyInViewport: Self = this.set("onlyInViewport", js.undefined)
  }
  
}

