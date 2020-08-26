package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CubeEffectOptions extends js.Object {
  var shadow: js.UndefOr[Boolean] = js.native
  var shadowOffset: js.UndefOr[Double] = js.native
  var shadowScale: js.UndefOr[Double] = js.native
  var slideShadows: js.UndefOr[Boolean] = js.native
}

object CubeEffectOptions {
  @scala.inline
  def apply(): CubeEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CubeEffectOptions]
  }
  @scala.inline
  implicit class CubeEffectOptionsOps[Self <: CubeEffectOptions] (val x: Self) extends AnyVal {
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
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setShadowOffset(value: Double): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffset: Self = this.set("shadowOffset", js.undefined)
    @scala.inline
    def setShadowScale(value: Double): Self = this.set("shadowScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowScale: Self = this.set("shadowScale", js.undefined)
    @scala.inline
    def setSlideShadows(value: Boolean): Self = this.set("slideShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideShadows: Self = this.set("slideShadows", js.undefined)
  }
  
}

