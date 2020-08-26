package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapZoomOptions
  extends IMapMarginOptions
     with IMapCheckZoomRangeOptions {
  var duration: js.UndefOr[Double] = js.native
}

object IMapZoomOptions {
  @scala.inline
  def apply(): IMapZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapZoomOptions]
  }
  @scala.inline
  implicit class IMapZoomOptionsOps[Self <: IMapZoomOptions] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
  
}

