package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverflowEffectOptions extends js.Object {
  var depth: js.UndefOr[Double] = js.native
  var modifier: js.UndefOr[Double] = js.native
  var rotate: js.UndefOr[Double] = js.native
  var slideShadows: js.UndefOr[Boolean] = js.native
  var stretch: js.UndefOr[Double] = js.native
}

object CoverflowEffectOptions {
  @scala.inline
  def apply(): CoverflowEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverflowEffectOptions]
  }
  @scala.inline
  implicit class CoverflowEffectOptionsOps[Self <: CoverflowEffectOptions] (val x: Self) extends AnyVal {
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setModifier(value: Double): Self = this.set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setSlideShadows(value: Boolean): Self = this.set("slideShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideShadows: Self = this.set("slideShadows", js.undefined)
    @scala.inline
    def setStretch(value: Double): Self = this.set("stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStretch: Self = this.set("stretch", js.undefined)
  }
  
}

