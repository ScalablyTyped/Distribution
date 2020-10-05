package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapBoundsOptions extends IMapPositionOptions {
  var preciseZoom: js.UndefOr[Boolean] = js.native
  var zoomMargin: js.UndefOr[js.Array[js.Array[Double] | Double]] = js.native
}

object IMapBoundsOptions {
  @scala.inline
  def apply(): IMapBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapBoundsOptions]
  }
  @scala.inline
  implicit class IMapBoundsOptionsOps[Self <: IMapBoundsOptions] (val x: Self) extends AnyVal {
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
    def setPreciseZoom(value: Boolean): Self = this.set("preciseZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreciseZoom: Self = this.set("preciseZoom", js.undefined)
    @scala.inline
    def setZoomMarginVarargs(value: (js.Array[Double] | Double)*): Self = this.set("zoomMargin", js.Array(value :_*))
    @scala.inline
    def setZoomMargin(value: js.Array[js.Array[Double] | Double]): Self = this.set("zoomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomMargin: Self = this.set("zoomMargin", js.undefined)
  }
  
}

