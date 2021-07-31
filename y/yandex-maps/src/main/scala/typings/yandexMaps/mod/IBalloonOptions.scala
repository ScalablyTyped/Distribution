package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBalloonOptions extends StObject {
  
  var autoPan: js.UndefOr[Boolean] = js.undefined
  
  var autoPanCheckZoomRange: js.UndefOr[Boolean] = js.undefined
  
  var autoPanDuration: js.UndefOr[Double] = js.undefined
  
  var autoPanMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
  
  var autoPanUseMapMargin: js.UndefOr[Boolean] = js.undefined
  
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  var contentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var layout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var panelContentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var panelMaxHeightRatio: js.UndefOr[Double] = js.undefined
  
  var panelMaxMapArea: js.UndefOr[Double] = js.undefined
  
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  var shadowLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var shadowOffset: js.UndefOr[js.Array[Double]] = js.undefined
}
object IBalloonOptions {
  
  @scala.inline
  def apply(): IBalloonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBalloonOptions]
  }
  
  @scala.inline
  implicit class IBalloonOptionsMutableBuilder[Self <: IBalloonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoPan(value: Boolean): Self = StObject.set(x, "autoPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanCheckZoomRange(value: Boolean): Self = StObject.set(x, "autoPanCheckZoomRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanCheckZoomRangeUndefined: Self = StObject.set(x, "autoPanCheckZoomRange", js.undefined)
    
    @scala.inline
    def setAutoPanDuration(value: Double): Self = StObject.set(x, "autoPanDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanDurationUndefined: Self = StObject.set(x, "autoPanDuration", js.undefined)
    
    @scala.inline
    def setAutoPanMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = StObject.set(x, "autoPanMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanMarginUndefined: Self = StObject.set(x, "autoPanMargin", js.undefined)
    
    @scala.inline
    def setAutoPanMarginVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "autoPanMargin", js.Array(value :_*))
    
    @scala.inline
    def setAutoPanUndefined: Self = StObject.set(x, "autoPan", js.undefined)
    
    @scala.inline
    def setAutoPanUseMapMargin(value: Boolean): Self = StObject.set(x, "autoPanUseMapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanUseMapMarginUndefined: Self = StObject.set(x, "autoPanUseMapMargin", js.undefined)
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    @scala.inline
    def setContentLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "contentLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLayoutUndefined: Self = StObject.set(x, "contentLayout", js.undefined)
    
    @scala.inline
    def setLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
    
    @scala.inline
    def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setPanelContentLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "panelContentLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelContentLayoutUndefined: Self = StObject.set(x, "panelContentLayout", js.undefined)
    
    @scala.inline
    def setPanelMaxHeightRatio(value: Double): Self = StObject.set(x, "panelMaxHeightRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelMaxHeightRatioUndefined: Self = StObject.set(x, "panelMaxHeightRatio", js.undefined)
    
    @scala.inline
    def setPanelMaxMapArea(value: Double): Self = StObject.set(x, "panelMaxMapArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelMaxMapAreaUndefined: Self = StObject.set(x, "panelMaxMapArea", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "shadowLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowLayoutUndefined: Self = StObject.set(x, "shadowLayout", js.undefined)
    
    @scala.inline
    def setShadowOffset(value: js.Array[Double]): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    @scala.inline
    def setShadowOffsetVarargs(value: Double*): Self = StObject.set(x, "shadowOffset", js.Array(value :_*))
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
  }
}
