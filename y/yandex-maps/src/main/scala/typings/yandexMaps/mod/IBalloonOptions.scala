package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBalloonOptions extends StObject {
  
  var autoPan: js.UndefOr[Boolean] = js.undefined
  
  var autoPanCheckZoomRange: js.UndefOr[Boolean] = js.undefined
  
  var autoPanDuration: js.UndefOr[Double] = js.undefined
  
  var autoPanMargin: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var autoPanUseMapMargin: js.UndefOr[Boolean] = js.undefined
  
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  var closeTimeout: js.UndefOr[Double] = js.undefined
  
  var contentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.undefined
  
  var layout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var openTimeout: js.UndefOr[Double] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var panelContentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var panelMaxHeightRatio: js.UndefOr[Double] = js.undefined
  
  var panelMaxMapArea: js.UndefOr[Double] = js.undefined
  
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  var shadowLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var shadowOffset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var zIndex: js.UndefOr[String] = js.undefined
}
object IBalloonOptions {
  
  inline def apply(): IBalloonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBalloonOptions]
  }
  
  extension [Self <: IBalloonOptions](x: Self) {
    
    inline def setAutoPan(value: Boolean): Self = StObject.set(x, "autoPan", value.asInstanceOf[js.Any])
    
    inline def setAutoPanCheckZoomRange(value: Boolean): Self = StObject.set(x, "autoPanCheckZoomRange", value.asInstanceOf[js.Any])
    
    inline def setAutoPanCheckZoomRangeUndefined: Self = StObject.set(x, "autoPanCheckZoomRange", js.undefined)
    
    inline def setAutoPanDuration(value: Double): Self = StObject.set(x, "autoPanDuration", value.asInstanceOf[js.Any])
    
    inline def setAutoPanDurationUndefined: Self = StObject.set(x, "autoPanDuration", js.undefined)
    
    inline def setAutoPanMargin(value: Double | js.Array[Double]): Self = StObject.set(x, "autoPanMargin", value.asInstanceOf[js.Any])
    
    inline def setAutoPanMarginUndefined: Self = StObject.set(x, "autoPanMargin", js.undefined)
    
    inline def setAutoPanMarginVarargs(value: Double*): Self = StObject.set(x, "autoPanMargin", js.Array(value*))
    
    inline def setAutoPanUndefined: Self = StObject.set(x, "autoPan", js.undefined)
    
    inline def setAutoPanUseMapMargin(value: Boolean): Self = StObject.set(x, "autoPanUseMapMargin", value.asInstanceOf[js.Any])
    
    inline def setAutoPanUseMapMarginUndefined: Self = StObject.set(x, "autoPanUseMapMargin", js.undefined)
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseTimeout(value: Double): Self = StObject.set(x, "closeTimeout", value.asInstanceOf[js.Any])
    
    inline def setCloseTimeoutUndefined: Self = StObject.set(x, "closeTimeout", js.undefined)
    
    inline def setContentLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "contentLayout", value.asInstanceOf[js.Any])
    
    inline def setContentLayoutUndefined: Self = StObject.set(x, "contentLayout", js.undefined)
    
    inline def setInteractivityModel(value: InteractivityModelKey): Self = StObject.set(x, "interactivityModel", value.asInstanceOf[js.Any])
    
    inline def setInteractivityModelUndefined: Self = StObject.set(x, "interactivityModel", js.undefined)
    
    inline def setLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setOpenTimeout(value: Double): Self = StObject.set(x, "openTimeout", value.asInstanceOf[js.Any])
    
    inline def setOpenTimeoutUndefined: Self = StObject.set(x, "openTimeout", js.undefined)
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setPanelContentLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "panelContentLayout", value.asInstanceOf[js.Any])
    
    inline def setPanelContentLayoutUndefined: Self = StObject.set(x, "panelContentLayout", js.undefined)
    
    inline def setPanelMaxHeightRatio(value: Double): Self = StObject.set(x, "panelMaxHeightRatio", value.asInstanceOf[js.Any])
    
    inline def setPanelMaxHeightRatioUndefined: Self = StObject.set(x, "panelMaxHeightRatio", js.undefined)
    
    inline def setPanelMaxMapArea(value: Double): Self = StObject.set(x, "panelMaxMapArea", value.asInstanceOf[js.Any])
    
    inline def setPanelMaxMapAreaUndefined: Self = StObject.set(x, "panelMaxMapArea", js.undefined)
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "shadowLayout", value.asInstanceOf[js.Any])
    
    inline def setShadowLayoutUndefined: Self = StObject.set(x, "shadowLayout", js.undefined)
    
    inline def setShadowOffset(value: js.Array[Double]): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    inline def setShadowOffsetVarargs(value: Double*): Self = StObject.set(x, "shadowOffset", js.Array(value*))
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
