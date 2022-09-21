package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBalloonOptionsWithBalloonPrefix extends StObject {
  
  var balloonAutoPan: js.UndefOr[Boolean] = js.undefined
  
  var balloonAutoPanCheckZoomRange: js.UndefOr[Boolean] = js.undefined
  
  var balloonAutoPanDuration: js.UndefOr[Double] = js.undefined
  
  var balloonAutoPanMargin: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var balloonAutoPanUseMapMargin: js.UndefOr[Boolean] = js.undefined
  
  var balloonCloseButton: js.UndefOr[Boolean] = js.undefined
  
  var balloonCloseTimeout: js.UndefOr[Double] = js.undefined
  
  var balloonContent: js.UndefOr[String] = js.undefined
  
  var balloonContentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var balloonInteractivityModel: js.UndefOr[InteractivityModelKey] = js.undefined
  
  var balloonLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var balloonMaxHeight: js.UndefOr[Double] = js.undefined
  
  var balloonMaxWidth: js.UndefOr[Double] = js.undefined
  
  var balloonMinHeight: js.UndefOr[Double] = js.undefined
  
  var balloonMinWidth: js.UndefOr[Double] = js.undefined
  
  var balloonOffset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var balloonOpenTimeout: js.UndefOr[Double] = js.undefined
  
  var balloonPane: js.UndefOr[String] = js.undefined
  
  var balloonPanelContentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var balloonPanelMaxHeightRatio: js.UndefOr[Double] = js.undefined
  
  var balloonPanelMaxMapArea: js.UndefOr[Double] = js.undefined
  
  var balloonShadow: js.UndefOr[Boolean] = js.undefined
  
  var balloonShadowLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var balloonShadowOffset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var balloonZIndex: js.UndefOr[String] = js.undefined
}
object IBalloonOptionsWithBalloonPrefix {
  
  inline def apply(): IBalloonOptionsWithBalloonPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBalloonOptionsWithBalloonPrefix]
  }
  
  extension [Self <: IBalloonOptionsWithBalloonPrefix](x: Self) {
    
    inline def setBalloonAutoPan(value: Boolean): Self = StObject.set(x, "balloonAutoPan", value.asInstanceOf[js.Any])
    
    inline def setBalloonAutoPanCheckZoomRange(value: Boolean): Self = StObject.set(x, "balloonAutoPanCheckZoomRange", value.asInstanceOf[js.Any])
    
    inline def setBalloonAutoPanCheckZoomRangeUndefined: Self = StObject.set(x, "balloonAutoPanCheckZoomRange", js.undefined)
    
    inline def setBalloonAutoPanDuration(value: Double): Self = StObject.set(x, "balloonAutoPanDuration", value.asInstanceOf[js.Any])
    
    inline def setBalloonAutoPanDurationUndefined: Self = StObject.set(x, "balloonAutoPanDuration", js.undefined)
    
    inline def setBalloonAutoPanMargin(value: Double | js.Array[Double]): Self = StObject.set(x, "balloonAutoPanMargin", value.asInstanceOf[js.Any])
    
    inline def setBalloonAutoPanMarginUndefined: Self = StObject.set(x, "balloonAutoPanMargin", js.undefined)
    
    inline def setBalloonAutoPanMarginVarargs(value: Double*): Self = StObject.set(x, "balloonAutoPanMargin", js.Array(value*))
    
    inline def setBalloonAutoPanUndefined: Self = StObject.set(x, "balloonAutoPan", js.undefined)
    
    inline def setBalloonAutoPanUseMapMargin(value: Boolean): Self = StObject.set(x, "balloonAutoPanUseMapMargin", value.asInstanceOf[js.Any])
    
    inline def setBalloonAutoPanUseMapMarginUndefined: Self = StObject.set(x, "balloonAutoPanUseMapMargin", js.undefined)
    
    inline def setBalloonCloseButton(value: Boolean): Self = StObject.set(x, "balloonCloseButton", value.asInstanceOf[js.Any])
    
    inline def setBalloonCloseButtonUndefined: Self = StObject.set(x, "balloonCloseButton", js.undefined)
    
    inline def setBalloonCloseTimeout(value: Double): Self = StObject.set(x, "balloonCloseTimeout", value.asInstanceOf[js.Any])
    
    inline def setBalloonCloseTimeoutUndefined: Self = StObject.set(x, "balloonCloseTimeout", js.undefined)
    
    inline def setBalloonContent(value: String): Self = StObject.set(x, "balloonContent", value.asInstanceOf[js.Any])
    
    inline def setBalloonContentLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "balloonContentLayout", value.asInstanceOf[js.Any])
    
    inline def setBalloonContentLayoutUndefined: Self = StObject.set(x, "balloonContentLayout", js.undefined)
    
    inline def setBalloonContentUndefined: Self = StObject.set(x, "balloonContent", js.undefined)
    
    inline def setBalloonInteractivityModel(value: InteractivityModelKey): Self = StObject.set(x, "balloonInteractivityModel", value.asInstanceOf[js.Any])
    
    inline def setBalloonInteractivityModelUndefined: Self = StObject.set(x, "balloonInteractivityModel", js.undefined)
    
    inline def setBalloonLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "balloonLayout", value.asInstanceOf[js.Any])
    
    inline def setBalloonLayoutUndefined: Self = StObject.set(x, "balloonLayout", js.undefined)
    
    inline def setBalloonMaxHeight(value: Double): Self = StObject.set(x, "balloonMaxHeight", value.asInstanceOf[js.Any])
    
    inline def setBalloonMaxHeightUndefined: Self = StObject.set(x, "balloonMaxHeight", js.undefined)
    
    inline def setBalloonMaxWidth(value: Double): Self = StObject.set(x, "balloonMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setBalloonMaxWidthUndefined: Self = StObject.set(x, "balloonMaxWidth", js.undefined)
    
    inline def setBalloonMinHeight(value: Double): Self = StObject.set(x, "balloonMinHeight", value.asInstanceOf[js.Any])
    
    inline def setBalloonMinHeightUndefined: Self = StObject.set(x, "balloonMinHeight", js.undefined)
    
    inline def setBalloonMinWidth(value: Double): Self = StObject.set(x, "balloonMinWidth", value.asInstanceOf[js.Any])
    
    inline def setBalloonMinWidthUndefined: Self = StObject.set(x, "balloonMinWidth", js.undefined)
    
    inline def setBalloonOffset(value: js.Array[Double]): Self = StObject.set(x, "balloonOffset", value.asInstanceOf[js.Any])
    
    inline def setBalloonOffsetUndefined: Self = StObject.set(x, "balloonOffset", js.undefined)
    
    inline def setBalloonOffsetVarargs(value: Double*): Self = StObject.set(x, "balloonOffset", js.Array(value*))
    
    inline def setBalloonOpenTimeout(value: Double): Self = StObject.set(x, "balloonOpenTimeout", value.asInstanceOf[js.Any])
    
    inline def setBalloonOpenTimeoutUndefined: Self = StObject.set(x, "balloonOpenTimeout", js.undefined)
    
    inline def setBalloonPane(value: String): Self = StObject.set(x, "balloonPane", value.asInstanceOf[js.Any])
    
    inline def setBalloonPaneUndefined: Self = StObject.set(x, "balloonPane", js.undefined)
    
    inline def setBalloonPanelContentLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "balloonPanelContentLayout", value.asInstanceOf[js.Any])
    
    inline def setBalloonPanelContentLayoutUndefined: Self = StObject.set(x, "balloonPanelContentLayout", js.undefined)
    
    inline def setBalloonPanelMaxHeightRatio(value: Double): Self = StObject.set(x, "balloonPanelMaxHeightRatio", value.asInstanceOf[js.Any])
    
    inline def setBalloonPanelMaxHeightRatioUndefined: Self = StObject.set(x, "balloonPanelMaxHeightRatio", js.undefined)
    
    inline def setBalloonPanelMaxMapArea(value: Double): Self = StObject.set(x, "balloonPanelMaxMapArea", value.asInstanceOf[js.Any])
    
    inline def setBalloonPanelMaxMapAreaUndefined: Self = StObject.set(x, "balloonPanelMaxMapArea", js.undefined)
    
    inline def setBalloonShadow(value: Boolean): Self = StObject.set(x, "balloonShadow", value.asInstanceOf[js.Any])
    
    inline def setBalloonShadowLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "balloonShadowLayout", value.asInstanceOf[js.Any])
    
    inline def setBalloonShadowLayoutUndefined: Self = StObject.set(x, "balloonShadowLayout", js.undefined)
    
    inline def setBalloonShadowOffset(value: js.Array[Double]): Self = StObject.set(x, "balloonShadowOffset", value.asInstanceOf[js.Any])
    
    inline def setBalloonShadowOffsetUndefined: Self = StObject.set(x, "balloonShadowOffset", js.undefined)
    
    inline def setBalloonShadowOffsetVarargs(value: Double*): Self = StObject.set(x, "balloonShadowOffset", js.Array(value*))
    
    inline def setBalloonShadowUndefined: Self = StObject.set(x, "balloonShadow", js.undefined)
    
    inline def setBalloonZIndex(value: String): Self = StObject.set(x, "balloonZIndex", value.asInstanceOf[js.Any])
    
    inline def setBalloonZIndexUndefined: Self = StObject.set(x, "balloonZIndex", js.undefined)
  }
}
