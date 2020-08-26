package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClustererOptions extends js.Object {
  var gridSize: js.UndefOr[Double] = js.native
  var groupByCoordinates: js.UndefOr[Boolean] = js.native
  var hasBalloon: js.UndefOr[Boolean] = js.native
  var hasHint: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  var maxZoom: js.UndefOr[js.Array[Double] | Double] = js.native
  var minClusterSize: js.UndefOr[Double] = js.native
  var preset: js.UndefOr[PresetKey] = js.native
  var showInAlphabeticalOrder: js.UndefOr[Boolean] = js.native
  var useMapMargin: js.UndefOr[Boolean] = js.native
  var viewportMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  var zoomMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
}

object IClustererOptions {
  @scala.inline
  def apply(): IClustererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClustererOptions]
  }
  @scala.inline
  implicit class IClustererOptionsOps[Self <: IClustererOptions] (val x: Self) extends AnyVal {
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
    def setGridSize(value: Double): Self = this.set("gridSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridSize: Self = this.set("gridSize", js.undefined)
    @scala.inline
    def setGroupByCoordinates(value: Boolean): Self = this.set("groupByCoordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupByCoordinates: Self = this.set("groupByCoordinates", js.undefined)
    @scala.inline
    def setHasBalloon(value: Boolean): Self = this.set("hasBalloon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasBalloon: Self = this.set("hasBalloon", js.undefined)
    @scala.inline
    def setHasHint(value: Boolean): Self = this.set("hasHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasHint: Self = this.set("hasHint", js.undefined)
    @scala.inline
    def setMarginVarargs(value: (js.Array[Double] | Double)*): Self = this.set("margin", js.Array(value :_*))
    @scala.inline
    def setMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMaxZoomVarargs(value: Double*): Self = this.set("maxZoom", js.Array(value :_*))
    @scala.inline
    def setMaxZoom(value: js.Array[Double] | Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinClusterSize(value: Double): Self = this.set("minClusterSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinClusterSize: Self = this.set("minClusterSize", js.undefined)
    @scala.inline
    def setPreset(value: PresetKey): Self = this.set("preset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    @scala.inline
    def setShowInAlphabeticalOrder(value: Boolean): Self = this.set("showInAlphabeticalOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInAlphabeticalOrder: Self = this.set("showInAlphabeticalOrder", js.undefined)
    @scala.inline
    def setUseMapMargin(value: Boolean): Self = this.set("useMapMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMapMargin: Self = this.set("useMapMargin", js.undefined)
    @scala.inline
    def setViewportMarginVarargs(value: (js.Array[Double] | Double)*): Self = this.set("viewportMargin", js.Array(value :_*))
    @scala.inline
    def setViewportMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = this.set("viewportMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportMargin: Self = this.set("viewportMargin", js.undefined)
    @scala.inline
    def setZoomMarginVarargs(value: (js.Array[Double] | Double)*): Self = this.set("zoomMargin", js.Array(value :_*))
    @scala.inline
    def setZoomMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = this.set("zoomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomMargin: Self = this.set("zoomMargin", js.undefined)
  }
  
}

