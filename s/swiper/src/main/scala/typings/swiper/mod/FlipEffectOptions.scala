package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlipEffectOptions extends js.Object {
  var limitRotation: js.UndefOr[Boolean] = js.native
  var slideShadows: js.UndefOr[Boolean] = js.native
}

object FlipEffectOptions {
  @scala.inline
  def apply(): FlipEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlipEffectOptions]
  }
  @scala.inline
  implicit class FlipEffectOptionsOps[Self <: FlipEffectOptions] (val x: Self) extends AnyVal {
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
    def setLimitRotation(value: Boolean): Self = this.set("limitRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitRotation: Self = this.set("limitRotation", js.undefined)
    @scala.inline
    def setSlideShadows(value: Boolean): Self = this.set("slideShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideShadows: Self = this.set("slideShadows", js.undefined)
  }
  
}

