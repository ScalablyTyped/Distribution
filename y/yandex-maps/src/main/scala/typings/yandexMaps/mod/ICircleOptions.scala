package typings.yandexMaps.mod

import typings.yandexMaps.yandexMapsStrings.stretch
import typings.yandexMaps.yandexMapsStrings.tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICircleOptions extends StObject {
  
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
  implicit class ICircleOptionsMutableBuilder[Self <: ICircleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircleOverlay(
      value: String | (js.Function3[
          /* geometry */ IPixelCircleGeometry, 
          /* data */ js.Object, 
          /* options */ js.Object, 
          js.Promise[IOverlay]
        ])
    ): Self = StObject.set(x, "circleOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleOverlayFunction3(
      value: (/* geometry */ IPixelCircleGeometry, /* data */ js.Object, /* options */ js.Object) => js.Promise[IOverlay]
    ): Self = StObject.set(x, "circleOverlay", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCircleOverlayUndefined: Self = StObject.set(x, "circleOverlay", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillImageHref(value: String): Self = StObject.set(x, "fillImageHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillImageHrefUndefined: Self = StObject.set(x, "fillImageHref", js.undefined)
    
    @scala.inline
    def setFillMethod(value: stretch | tile): Self = StObject.set(x, "fillMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillMethodUndefined: Self = StObject.set(x, "fillMethod", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHasBalloon(value: Boolean): Self = StObject.set(x, "hasBalloon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBalloonUndefined: Self = StObject.set(x, "hasBalloon", js.undefined)
    
    @scala.inline
    def setHasHint(value: Boolean): Self = StObject.set(x, "hasHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasHintUndefined: Self = StObject.set(x, "hasHint", js.undefined)
    
    @scala.inline
    def setHideIconOnBalloonOpen(value: Boolean): Self = StObject.set(x, "hideIconOnBalloonOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideIconOnBalloonOpenUndefined: Self = StObject.set(x, "hideIconOnBalloonOpen", js.undefined)
    
    @scala.inline
    def setInteractiveZIndex(value: Boolean): Self = StObject.set(x, "interactiveZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveZIndexUndefined: Self = StObject.set(x, "interactiveZIndex", js.undefined)
    
    @scala.inline
    def setInteractivityModel(value: InteractivityModelKey): Self = StObject.set(x, "interactivityModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractivityModelUndefined: Self = StObject.set(x, "interactivityModel", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOpenBalloonOnClick(value: Boolean): Self = StObject.set(x, "openBalloonOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenBalloonOnClickUndefined: Self = StObject.set(x, "openBalloonOnClick", js.undefined)
    
    @scala.inline
    def setOpenEmptyBalloon(value: Boolean): Self = StObject.set(x, "openEmptyBalloon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenEmptyBalloonUndefined: Self = StObject.set(x, "openEmptyBalloon", js.undefined)
    
    @scala.inline
    def setOpenEmptyHint(value: Boolean): Self = StObject.set(x, "openEmptyHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenEmptyHintUndefined: Self = StObject.set(x, "openEmptyHint", js.undefined)
    
    @scala.inline
    def setOpenHintOnHover(value: Boolean): Self = StObject.set(x, "openHintOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenHintOnHoverUndefined: Self = StObject.set(x, "openHintOnHover", js.undefined)
    
    @scala.inline
    def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: (js.Array[js.Array[String] | String]) | String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeColorVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "strokeColor", js.Array(value :_*))
    
    @scala.inline
    def setStrokeOpacity(value: (js.Array[js.Array[Double] | Double]) | Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeOpacityVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "strokeOpacity", js.Array(value :_*))
    
    @scala.inline
    def setStrokeStyle(
      value: (js.Array[(js.Array[js.Array[String] | js.Object]) | js.Object | String]) | String | js.Object
    ): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    @scala.inline
    def setStrokeStyleVarargs(value: ((js.Array[js.Array[String] | js.Object]) | js.Object | String)*): Self = StObject.set(x, "strokeStyle", js.Array(value :_*))
    
    @scala.inline
    def setStrokeWidth(value: (js.Array[js.Array[Double] | Double]) | Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setStrokeWidthVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "strokeWidth", js.Array(value :_*))
    
    @scala.inline
    def setSyncOverlayInit(value: Boolean): Self = StObject.set(x, "syncOverlayInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncOverlayInitUndefined: Self = StObject.set(x, "syncOverlayInit", js.undefined)
    
    @scala.inline
    def setUseMapMarginInDragging(value: Boolean): Self = StObject.set(x, "useMapMarginInDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMapMarginInDraggingUndefined: Self = StObject.set(x, "useMapMarginInDragging", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexActive(value: Double): Self = StObject.set(x, "zIndexActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexActiveUndefined: Self = StObject.set(x, "zIndexActive", js.undefined)
    
    @scala.inline
    def setZIndexDrag(value: Double): Self = StObject.set(x, "zIndexDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexDragUndefined: Self = StObject.set(x, "zIndexDrag", js.undefined)
    
    @scala.inline
    def setZIndexHover(value: Double): Self = StObject.set(x, "zIndexHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexHoverUndefined: Self = StObject.set(x, "zIndexHover", js.undefined)
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
