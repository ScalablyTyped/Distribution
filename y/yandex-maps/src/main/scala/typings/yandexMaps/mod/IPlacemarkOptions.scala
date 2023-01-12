package typings.yandexMaps.mod

import typings.yandexMaps.mod.layout.IImageWithContentOptionsWithIconPrefix
import typings.yandexMaps.mod.layout.IPieChartOptionsWithIconPrefix
import typings.yandexMaps.mod.vow.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlacemarkOptions
  extends StObject
     with IBalloonOptionsWithBalloonPrefix
     with IImageWithContentOptionsWithIconPrefix
     with IPieChartOptionsWithIconPrefix {
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var hasBalloon: js.UndefOr[Boolean] = js.undefined
  
  var hasHint: js.UndefOr[Boolean] = js.undefined
  
  var hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.undefined
  
  var iconColor: js.UndefOr[String] = js.undefined
  
  var iconLayout: js.UndefOr[IClassConstructor[ILayout] | IconLayoutKey] = js.undefined
  
  var iconOffset: js.UndefOr[js.Array[Double]] = js.undefined
  
  @JSName("iconShape")
  var iconShape_IPlacemarkOptions: js.UndefOr[IGeometryJson | Null] = js.undefined
  
  var interactiveZIndex: js.UndefOr[Boolean] = js.undefined
  
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.undefined
  
  var openBalloonOnClick: js.UndefOr[Boolean] = js.undefined
  
  var openEmptyBalloon: js.UndefOr[Boolean] = js.undefined
  
  var openEmptyHint: js.UndefOr[Boolean] = js.undefined
  
  var openHintOnHover: js.UndefOr[Boolean] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var pointOverlay: js.UndefOr[
    String | (js.Function3[
      /* geometry */ IPixelPointGeometry, 
      /* data */ js.UndefOr[IDataManager], 
      /* options */ js.UndefOr[js.Object], 
      Promise
    ])
  ] = js.undefined
  
  var preset: js.UndefOr[PresetKey] = js.undefined
  
  var syncOverlayInit: js.UndefOr[Boolean] = js.undefined
  
  var useMapMarginInDragging: js.UndefOr[Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
  
  var zIndexActive: js.UndefOr[Double] = js.undefined
  
  var zIndexDrag: js.UndefOr[Double] = js.undefined
  
  var zIndexHover: js.UndefOr[Double] = js.undefined
}
object IPlacemarkOptions {
  
  inline def apply(): IPlacemarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlacemarkOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPlacemarkOptions] (val x: Self) extends AnyVal {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHasBalloon(value: Boolean): Self = StObject.set(x, "hasBalloon", value.asInstanceOf[js.Any])
    
    inline def setHasBalloonUndefined: Self = StObject.set(x, "hasBalloon", js.undefined)
    
    inline def setHasHint(value: Boolean): Self = StObject.set(x, "hasHint", value.asInstanceOf[js.Any])
    
    inline def setHasHintUndefined: Self = StObject.set(x, "hasHint", js.undefined)
    
    inline def setHideIconOnBalloonOpen(value: Boolean): Self = StObject.set(x, "hideIconOnBalloonOpen", value.asInstanceOf[js.Any])
    
    inline def setHideIconOnBalloonOpenUndefined: Self = StObject.set(x, "hideIconOnBalloonOpen", js.undefined)
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setIconLayout(value: IClassConstructor[ILayout] | IconLayoutKey): Self = StObject.set(x, "iconLayout", value.asInstanceOf[js.Any])
    
    inline def setIconLayoutUndefined: Self = StObject.set(x, "iconLayout", js.undefined)
    
    inline def setIconOffset(value: js.Array[Double]): Self = StObject.set(x, "iconOffset", value.asInstanceOf[js.Any])
    
    inline def setIconOffsetUndefined: Self = StObject.set(x, "iconOffset", js.undefined)
    
    inline def setIconOffsetVarargs(value: Double*): Self = StObject.set(x, "iconOffset", js.Array(value*))
    
    inline def setIconShape(value: IGeometryJson): Self = StObject.set(x, "iconShape", value.asInstanceOf[js.Any])
    
    inline def setIconShapeNull: Self = StObject.set(x, "iconShape", null)
    
    inline def setIconShapeUndefined: Self = StObject.set(x, "iconShape", js.undefined)
    
    inline def setInteractiveZIndex(value: Boolean): Self = StObject.set(x, "interactiveZIndex", value.asInstanceOf[js.Any])
    
    inline def setInteractiveZIndexUndefined: Self = StObject.set(x, "interactiveZIndex", js.undefined)
    
    inline def setInteractivityModel(value: InteractivityModelKey): Self = StObject.set(x, "interactivityModel", value.asInstanceOf[js.Any])
    
    inline def setInteractivityModelUndefined: Self = StObject.set(x, "interactivityModel", js.undefined)
    
    inline def setOpenBalloonOnClick(value: Boolean): Self = StObject.set(x, "openBalloonOnClick", value.asInstanceOf[js.Any])
    
    inline def setOpenBalloonOnClickUndefined: Self = StObject.set(x, "openBalloonOnClick", js.undefined)
    
    inline def setOpenEmptyBalloon(value: Boolean): Self = StObject.set(x, "openEmptyBalloon", value.asInstanceOf[js.Any])
    
    inline def setOpenEmptyBalloonUndefined: Self = StObject.set(x, "openEmptyBalloon", js.undefined)
    
    inline def setOpenEmptyHint(value: Boolean): Self = StObject.set(x, "openEmptyHint", value.asInstanceOf[js.Any])
    
    inline def setOpenEmptyHintUndefined: Self = StObject.set(x, "openEmptyHint", js.undefined)
    
    inline def setOpenHintOnHover(value: Boolean): Self = StObject.set(x, "openHintOnHover", value.asInstanceOf[js.Any])
    
    inline def setOpenHintOnHoverUndefined: Self = StObject.set(x, "openHintOnHover", js.undefined)
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setPointOverlay(
      value: String | (js.Function3[
          /* geometry */ IPixelPointGeometry, 
          /* data */ js.UndefOr[IDataManager], 
          /* options */ js.UndefOr[js.Object], 
          Promise
        ])
    ): Self = StObject.set(x, "pointOverlay", value.asInstanceOf[js.Any])
    
    inline def setPointOverlayFunction3(
      value: (/* geometry */ IPixelPointGeometry, /* data */ js.UndefOr[IDataManager], /* options */ js.UndefOr[js.Object]) => Promise
    ): Self = StObject.set(x, "pointOverlay", js.Any.fromFunction3(value))
    
    inline def setPointOverlayUndefined: Self = StObject.set(x, "pointOverlay", js.undefined)
    
    inline def setPreset(value: PresetKey): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
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
