package typings.yandexMaps.mod

import typings.yandexMaps.yandexMapsStrings.stretch
import typings.yandexMaps.yandexMapsStrings.tile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICircleOptions extends js.Object {
  var circleOverlay: js.UndefOr[
    String | (js.Function3[
      /* geometry */ IPixelCircleGeometry, 
      /* data */ js.Object, 
      /* options */ js.Object, 
      js.Promise[IOverlay]
    ])
  ] = js.native
  var cursor: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[Boolean] = js.native
  var fillColor: js.UndefOr[String] = js.native
  var fillImageHref: js.UndefOr[String] = js.native
  var fillMethod: js.UndefOr[stretch | tile] = js.native
  var fillOpacity: js.UndefOr[Double] = js.native
  var hasBalloon: js.UndefOr[Boolean] = js.native
  var hasHint: js.UndefOr[Boolean] = js.native
  var hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.native
  var interactiveZIndex: js.UndefOr[Boolean] = js.native
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var openBalloonOnClick: js.UndefOr[Boolean] = js.native
  var openEmptyBalloon: js.UndefOr[Boolean] = js.native
  var openEmptyHint: js.UndefOr[Boolean] = js.native
  var openHintOnHover: js.UndefOr[Boolean] = js.native
  var outline: js.UndefOr[Boolean] = js.native
  var pane: js.UndefOr[String] = js.native
  var strokeColor: js.UndefOr[(js.Array[js.Array[String] | String]) | String] = js.native
  var strokeOpacity: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  var strokeStyle: js.UndefOr[
    (js.Array[(js.Array[js.Array[String] | js.Object]) | js.Object | String]) | String | js.Object
  ] = js.native
  var strokeWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  var syncOverlayInit: js.UndefOr[Boolean] = js.native
  var useMapMarginInDragging: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
  var zIndexActive: js.UndefOr[Double] = js.native
  var zIndexDrag: js.UndefOr[Double] = js.native
  var zIndexHover: js.UndefOr[Double] = js.native
}

object ICircleOptions {
  @scala.inline
  def apply(): ICircleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICircleOptions]
  }
  @scala.inline
  implicit class ICircleOptionsOps[Self <: ICircleOptions] (val x: Self) extends AnyVal {
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
    def setCircleOverlayFunction3(
      value: (/* geometry */ IPixelCircleGeometry, /* data */ js.Object, /* options */ js.Object) => js.Promise[IOverlay]
    ): Self = this.set("circleOverlay", js.Any.fromFunction3(value))
    @scala.inline
    def setCircleOverlay(
      value: String | (js.Function3[
          /* geometry */ IPixelCircleGeometry, 
          /* data */ js.Object, 
          /* options */ js.Object, 
          js.Promise[IOverlay]
        ])
    ): Self = this.set("circleOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleOverlay: Self = this.set("circleOverlay", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFillImageHref(value: String): Self = this.set("fillImageHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillImageHref: Self = this.set("fillImageHref", js.undefined)
    @scala.inline
    def setFillMethod(value: stretch | tile): Self = this.set("fillMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillMethod: Self = this.set("fillMethod", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setHasBalloon(value: Boolean): Self = this.set("hasBalloon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasBalloon: Self = this.set("hasBalloon", js.undefined)
    @scala.inline
    def setHasHint(value: Boolean): Self = this.set("hasHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasHint: Self = this.set("hasHint", js.undefined)
    @scala.inline
    def setHideIconOnBalloonOpen(value: Boolean): Self = this.set("hideIconOnBalloonOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideIconOnBalloonOpen: Self = this.set("hideIconOnBalloonOpen", js.undefined)
    @scala.inline
    def setInteractiveZIndex(value: Boolean): Self = this.set("interactiveZIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractiveZIndex: Self = this.set("interactiveZIndex", js.undefined)
    @scala.inline
    def setInteractivityModel(value: InteractivityModelKey): Self = this.set("interactivityModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractivityModel: Self = this.set("interactivityModel", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOpenBalloonOnClick(value: Boolean): Self = this.set("openBalloonOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenBalloonOnClick: Self = this.set("openBalloonOnClick", js.undefined)
    @scala.inline
    def setOpenEmptyBalloon(value: Boolean): Self = this.set("openEmptyBalloon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenEmptyBalloon: Self = this.set("openEmptyBalloon", js.undefined)
    @scala.inline
    def setOpenEmptyHint(value: Boolean): Self = this.set("openEmptyHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenEmptyHint: Self = this.set("openEmptyHint", js.undefined)
    @scala.inline
    def setOpenHintOnHover(value: Boolean): Self = this.set("openHintOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenHintOnHover: Self = this.set("openHintOnHover", js.undefined)
    @scala.inline
    def setOutline(value: Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setPane(value: String): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    @scala.inline
    def setStrokeColorVarargs(value: (js.Array[String] | String)*): Self = this.set("strokeColor", js.Array(value :_*))
    @scala.inline
    def setStrokeColor(value: (js.Array[js.Array[String] | String]) | String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeOpacityVarargs(value: (js.Array[Double] | Double)*): Self = this.set("strokeOpacity", js.Array(value :_*))
    @scala.inline
    def setStrokeOpacity(value: (js.Array[js.Array[Double] | Double]) | Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeStyleVarargs(value: ((js.Array[js.Array[String] | js.Object]) | js.Object | String)*): Self = this.set("strokeStyle", js.Array(value :_*))
    @scala.inline
    def setStrokeStyle(
      value: (js.Array[(js.Array[js.Array[String] | js.Object]) | js.Object | String]) | String | js.Object
    ): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
    @scala.inline
    def setStrokeWidthVarargs(value: (js.Array[Double] | Double)*): Self = this.set("strokeWidth", js.Array(value :_*))
    @scala.inline
    def setStrokeWidth(value: (js.Array[js.Array[Double] | Double]) | Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setSyncOverlayInit(value: Boolean): Self = this.set("syncOverlayInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncOverlayInit: Self = this.set("syncOverlayInit", js.undefined)
    @scala.inline
    def setUseMapMarginInDragging(value: Boolean): Self = this.set("useMapMarginInDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMapMarginInDragging: Self = this.set("useMapMarginInDragging", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    @scala.inline
    def setZIndexActive(value: Double): Self = this.set("zIndexActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndexActive: Self = this.set("zIndexActive", js.undefined)
    @scala.inline
    def setZIndexDrag(value: Double): Self = this.set("zIndexDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndexDrag: Self = this.set("zIndexDrag", js.undefined)
    @scala.inline
    def setZIndexHover(value: Double): Self = this.set("zIndexHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndexHover: Self = this.set("zIndexHover", js.undefined)
  }
  
}

