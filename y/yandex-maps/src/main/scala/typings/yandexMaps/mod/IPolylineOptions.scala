package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolylineOptions extends StObject {
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var hasBalloon: js.UndefOr[Boolean] = js.undefined
  
  var hasHint: js.UndefOr[Boolean] = js.undefined
  
  var interactiveZIndex: js.UndefOr[Boolean] = js.undefined
  
  var interactivityModel: js.UndefOr[String] = js.undefined
  
  var lineStringOverlay: js.UndefOr[js.Function0[js.Object | String]] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var openBalloonOnClick: js.UndefOr[Boolean] = js.undefined
  
  var openEmptyBalloon: js.UndefOr[Boolean] = js.undefined
  
  var openEmptyHint: js.UndefOr[Boolean] = js.undefined
  
  var openHintOnHover: js.UndefOr[Boolean] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var strokeColor: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var strokeStyle: js.UndefOr[String | (js.Array[js.Object | String]) | js.Object] = js.undefined
  
  var strokeWidth: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var syncOverlayInit: js.UndefOr[Boolean] = js.undefined
  
  var useMapMarginInDragging: js.UndefOr[Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
  
  var zIndexActive: js.UndefOr[Double] = js.undefined
  
  var zIndexDrag: js.UndefOr[Double] = js.undefined
  
  var zIndexHover: js.UndefOr[Double] = js.undefined
}
object IPolylineOptions {
  
  @scala.inline
  def apply(): IPolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolylineOptions]
  }
  
  @scala.inline
  implicit class IPolylineOptionsMutableBuilder[Self <: IPolylineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setHasBalloon(value: Boolean): Self = StObject.set(x, "hasBalloon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBalloonUndefined: Self = StObject.set(x, "hasBalloon", js.undefined)
    
    @scala.inline
    def setHasHint(value: Boolean): Self = StObject.set(x, "hasHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasHintUndefined: Self = StObject.set(x, "hasHint", js.undefined)
    
    @scala.inline
    def setInteractiveZIndex(value: Boolean): Self = StObject.set(x, "interactiveZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveZIndexUndefined: Self = StObject.set(x, "interactiveZIndex", js.undefined)
    
    @scala.inline
    def setInteractivityModel(value: String): Self = StObject.set(x, "interactivityModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractivityModelUndefined: Self = StObject.set(x, "interactivityModel", js.undefined)
    
    @scala.inline
    def setLineStringOverlay(value: () => js.Object | String): Self = StObject.set(x, "lineStringOverlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLineStringOverlayUndefined: Self = StObject.set(x, "lineStringOverlay", js.undefined)
    
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
    def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String | js.Array[String]): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeColorVarargs(value: String*): Self = StObject.set(x, "strokeColor", js.Array(value :_*))
    
    @scala.inline
    def setStrokeOpacity(value: Double | js.Array[Double]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeOpacityVarargs(value: Double*): Self = StObject.set(x, "strokeOpacity", js.Array(value :_*))
    
    @scala.inline
    def setStrokeStyle(value: String | (js.Array[js.Object | String]) | js.Object): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    @scala.inline
    def setStrokeStyleVarargs(value: (js.Object | String)*): Self = StObject.set(x, "strokeStyle", js.Array(value :_*))
    
    @scala.inline
    def setStrokeWidth(value: Double | js.Array[Double]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setStrokeWidthVarargs(value: Double*): Self = StObject.set(x, "strokeWidth", js.Array(value :_*))
    
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
