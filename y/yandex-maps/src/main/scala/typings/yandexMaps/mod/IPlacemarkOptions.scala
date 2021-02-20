package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlacemarkOptions extends StObject {
  
  var cursor: js.UndefOr[String] = js.native
  
  var draggable: js.UndefOr[Boolean] = js.native
  
  var hasBalloon: js.UndefOr[Boolean] = js.native
  
  var hasHint: js.UndefOr[Boolean] = js.native
  
  var hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.native
  
  var iconOffset: js.UndefOr[js.Array[Double]] = js.native
  
  var iconShape: js.UndefOr[IGeometryJson | Null] = js.native
  
  var interactiveZIndex: js.UndefOr[Boolean] = js.native
  
  var interactivityModel: js.UndefOr[String] = js.native
  
  var openBalloonOnClick: js.UndefOr[Boolean] = js.native
  
  var openEmptyBalloon: js.UndefOr[Boolean] = js.native
  
  var openEmptyHint: js.UndefOr[Boolean] = js.native
  
  var openHintOnHover: js.UndefOr[Boolean] = js.native
  
  var pane: js.UndefOr[String] = js.native
  
  var pointOverlay: js.UndefOr[String] = js.native
  
  var syncOverlayInit: js.UndefOr[Boolean] = js.native
  
  var useMapMarginInDragging: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
  
  var zIndexActive: js.UndefOr[Double] = js.native
  
  var zIndexDrag: js.UndefOr[Double] = js.native
  
  var zIndexHover: js.UndefOr[Double] = js.native
}
object IPlacemarkOptions {
  
  @scala.inline
  def apply(): IPlacemarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlacemarkOptions]
  }
  
  @scala.inline
  implicit class IPlacemarkOptionsMutableBuilder[Self <: IPlacemarkOptions] (val x: Self) extends AnyVal {
    
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
    def setHideIconOnBalloonOpen(value: Boolean): Self = StObject.set(x, "hideIconOnBalloonOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideIconOnBalloonOpenUndefined: Self = StObject.set(x, "hideIconOnBalloonOpen", js.undefined)
    
    @scala.inline
    def setIconOffset(value: js.Array[Double]): Self = StObject.set(x, "iconOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconOffsetUndefined: Self = StObject.set(x, "iconOffset", js.undefined)
    
    @scala.inline
    def setIconOffsetVarargs(value: Double*): Self = StObject.set(x, "iconOffset", js.Array(value :_*))
    
    @scala.inline
    def setIconShape(value: IGeometryJson): Self = StObject.set(x, "iconShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconShapeNull: Self = StObject.set(x, "iconShape", null)
    
    @scala.inline
    def setIconShapeUndefined: Self = StObject.set(x, "iconShape", js.undefined)
    
    @scala.inline
    def setInteractiveZIndex(value: Boolean): Self = StObject.set(x, "interactiveZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveZIndexUndefined: Self = StObject.set(x, "interactiveZIndex", js.undefined)
    
    @scala.inline
    def setInteractivityModel(value: String): Self = StObject.set(x, "interactivityModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractivityModelUndefined: Self = StObject.set(x, "interactivityModel", js.undefined)
    
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
    def setPointOverlay(value: String): Self = StObject.set(x, "pointOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointOverlayUndefined: Self = StObject.set(x, "pointOverlay", js.undefined)
    
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
