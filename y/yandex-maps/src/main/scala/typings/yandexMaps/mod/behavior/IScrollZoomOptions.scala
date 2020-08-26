package typings.yandexMaps.mod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollZoomOptions extends js.Object {
  var maximumDelta: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
}

object IScrollZoomOptions {
  @scala.inline
  def apply(): IScrollZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScrollZoomOptions]
  }
  @scala.inline
  implicit class IScrollZoomOptionsOps[Self <: IScrollZoomOptions] (val x: Self) extends AnyVal {
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
    def setMaximumDelta(value: Double): Self = this.set("maximumDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumDelta: Self = this.set("maximumDelta", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
  }
  
}

