package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICircleOptions extends StObject {
  
  var circleOverlay: js.UndefOr[
    String | (js.Function3[
      /* geometry */ IPixelCircleGeometry, 
      /* data */ js.Object, 
      /* options */ js.Object, 
      js.Promise[IOverlay]
    ])
  ] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var fill: js.UndefOr[Boolean] = js.undefined
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var fillImageHref: js.UndefOr[String] = js.undefined
  
  var fillMethod: js.UndefOr["stretch" | "tile"] = js.undefined
  
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var hasBalloon: js.UndefOr[Boolean] = js.undefined
  
  var hasHint: js.UndefOr[Boolean] = js.undefined
  
  var hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.undefined
  
  var interactiveZIndex: js.UndefOr[Boolean] = js.undefined
  
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var openBalloonOnClick: js.UndefOr[Boolean] = js.undefined
  
  var openEmptyBalloon: js.UndefOr[Boolean] = js.undefined
  
  var openEmptyHint: js.UndefOr[Boolean] = js.undefined
  
  var openHintOnHover: js.UndefOr[Boolean] = js.undefined
  
  var outline: js.UndefOr[Boolean] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var strokeColor: js.UndefOr[(js.Array[js.Array[String] | String]) | String] = js.undefined
  
  var strokeOpacity: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
  
  var strokeStyle: js.UndefOr[
    (js.Array[(js.Array[js.Array[String] | js.Object]) | js.Object | String]) | String | js.Object
  ] = js.undefined
  
  var strokeWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
  
  var syncOverlayInit: js.UndefOr[Boolean] = js.undefined
  
  var useMapMarginInDragging: js.UndefOr[Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
  
  var zIndexActive: js.UndefOr[Double] = js.undefined
  
  var zIndexDrag: js.UndefOr[Double] = js.undefined
  
  var zIndexHover: js.UndefOr[Double] = js.undefined
}
object ICircleOptions {
  
  inline def apply(): ICircleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICircleOptions]
  }
  
  extension [Self <: ICircleOptions](x: Self) {
    
    inline def setCircleOverlay(
      value: String | (js.Function3[
          /* geometry */ IPixelCircleGeometry, 
          /* data */ js.Object, 
          /* options */ js.Object, 
          js.Promise[IOverlay]
        ])
    ): Self = StObject.set(x, "circleOverlay", value.asInstanceOf[js.Any])
    
    inline def setCircleOverlayFunction3(
      value: (/* geometry */ IPixelCircleGeometry, /* data */ js.Object, /* options */ js.Object) => js.Promise[IOverlay]
    ): Self = StObject.set(x, "circleOverlay", js.Any.fromFunction3(value))
    
    inline def setCircleOverlayUndefined: Self = StObject.set(x, "circleOverlay", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillImageHref(value: String): Self = StObject.set(x, "fillImageHref", value.asInstanceOf[js.Any])
    
    inline def setFillImageHrefUndefined: Self = StObject.set(x, "fillImageHref", js.undefined)
    
    inline def setFillMethod(value: "stretch" | "tile"): Self = StObject.set(x, "fillMethod", value.asInstanceOf[js.Any])
    
    inline def setFillMethodUndefined: Self = StObject.set(x, "fillMethod", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setHasBalloon(value: Boolean): Self = StObject.set(x, "hasBalloon", value.asInstanceOf[js.Any])
    
    inline def setHasBalloonUndefined: Self = StObject.set(x, "hasBalloon", js.undefined)
    
    inline def setHasHint(value: Boolean): Self = StObject.set(x, "hasHint", value.asInstanceOf[js.Any])
    
    inline def setHasHintUndefined: Self = StObject.set(x, "hasHint", js.undefined)
    
    inline def setHideIconOnBalloonOpen(value: Boolean): Self = StObject.set(x, "hideIconOnBalloonOpen", value.asInstanceOf[js.Any])
    
    inline def setHideIconOnBalloonOpenUndefined: Self = StObject.set(x, "hideIconOnBalloonOpen", js.undefined)
    
    inline def setInteractiveZIndex(value: Boolean): Self = StObject.set(x, "interactiveZIndex", value.asInstanceOf[js.Any])
    
    inline def setInteractiveZIndexUndefined: Self = StObject.set(x, "interactiveZIndex", js.undefined)
    
    inline def setInteractivityModel(value: InteractivityModelKey): Self = StObject.set(x, "interactivityModel", value.asInstanceOf[js.Any])
    
    inline def setInteractivityModelUndefined: Self = StObject.set(x, "interactivityModel", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOpenBalloonOnClick(value: Boolean): Self = StObject.set(x, "openBalloonOnClick", value.asInstanceOf[js.Any])
    
    inline def setOpenBalloonOnClickUndefined: Self = StObject.set(x, "openBalloonOnClick", js.undefined)
    
    inline def setOpenEmptyBalloon(value: Boolean): Self = StObject.set(x, "openEmptyBalloon", value.asInstanceOf[js.Any])
    
    inline def setOpenEmptyBalloonUndefined: Self = StObject.set(x, "openEmptyBalloon", js.undefined)
    
    inline def setOpenEmptyHint(value: Boolean): Self = StObject.set(x, "openEmptyHint", value.asInstanceOf[js.Any])
    
    inline def setOpenEmptyHintUndefined: Self = StObject.set(x, "openEmptyHint", js.undefined)
    
    inline def setOpenHintOnHover(value: Boolean): Self = StObject.set(x, "openHintOnHover", value.asInstanceOf[js.Any])
    
    inline def setOpenHintOnHoverUndefined: Self = StObject.set(x, "openHintOnHover", js.undefined)
    
    inline def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setStrokeColor(value: (js.Array[js.Array[String] | String]) | String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeColorVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "strokeColor", js.Array(value*))
    
    inline def setStrokeOpacity(value: (js.Array[js.Array[Double] | Double]) | Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeOpacityVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "strokeOpacity", js.Array(value*))
    
    inline def setStrokeStyle(
      value: (js.Array[(js.Array[js.Array[String] | js.Object]) | js.Object | String]) | String | js.Object
    ): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    inline def setStrokeStyleVarargs(value: ((js.Array[js.Array[String] | js.Object]) | js.Object | String)*): Self = StObject.set(x, "strokeStyle", js.Array(value*))
    
    inline def setStrokeWidth(value: (js.Array[js.Array[Double] | Double]) | Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setStrokeWidthVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "strokeWidth", js.Array(value*))
    
    inline def setSyncOverlayInit(value: Boolean): Self = StObject.set(x, "syncOverlayInit", value.asInstanceOf[js.Any])
    
    inline def setSyncOverlayInitUndefined: Self = StObject.set(x, "syncOverlayInit", js.undefined)
    
    inline def setUseMapMarginInDragging(value: Boolean): Self = StObject.set(x, "useMapMarginInDragging", value.asInstanceOf[js.Any])
    
    inline def setUseMapMarginInDraggingUndefined: Self = StObject.set(x, "useMapMarginInDragging", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexActive(value: Double): Self = StObject.set(x, "zIndexActive", value.asInstanceOf[js.Any])
    
    inline def setZIndexActiveUndefined: Self = StObject.set(x, "zIndexActive", js.undefined)
    
    inline def setZIndexDrag(value: Double): Self = StObject.set(x, "zIndexDrag", value.asInstanceOf[js.Any])
    
    inline def setZIndexDragUndefined: Self = StObject.set(x, "zIndexDrag", js.undefined)
    
    inline def setZIndexHover(value: Double): Self = StObject.set(x, "zIndexHover", value.asInstanceOf[js.Any])
    
    inline def setZIndexHoverUndefined: Self = StObject.set(x, "zIndexHover", js.undefined)
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
