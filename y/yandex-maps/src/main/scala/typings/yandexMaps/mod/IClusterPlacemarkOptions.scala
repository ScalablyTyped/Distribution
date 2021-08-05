package typings.yandexMaps.mod

import typings.yandexMaps.anon.Href
import typings.yandexMaps.yandexMapsStrings.clusterNumbersignballoonAccordion
import typings.yandexMaps.yandexMapsStrings.clusterNumbersignballoonCarousel
import typings.yandexMaps.yandexMapsStrings.clusterNumbersignballoonTwoColumns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClusterPlacemarkOptions extends StObject {
  
  var balloonContentLayout: js.UndefOr[
    clusterNumbersignballoonTwoColumns | clusterNumbersignballoonCarousel | clusterNumbersignballoonAccordion | String | IClassConstructor[ILayout]
  ] = js.undefined
  
  var balloonContentLayoutHeight: js.UndefOr[Double] = js.undefined
  
  var balloonContentLayoutWidth: js.UndefOr[Double] = js.undefined
  
  var balloonItemContentLayout: js.UndefOr[ILayout | String] = js.undefined
  
  var balloonPanelContentLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var disableClickZoom: js.UndefOr[Boolean] = js.undefined
  
  var hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.undefined
  
  var iconColor: js.UndefOr[String] = js.undefined
  
  var iconContentLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  
  var iconLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  
  var iconShape: js.UndefOr[IGeometryJson] = js.undefined
  
  var icons: js.UndefOr[js.Array[Href]] = js.undefined
  
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.undefined
  
  var numbers: js.UndefOr[js.Array[Double]] = js.undefined
  
  var openBalloonOnClick: js.UndefOr[Boolean] = js.undefined
  
  var openEmptyHint: js.UndefOr[Boolean] = js.undefined
  
  var openHintOnHover: js.UndefOr[Boolean] = js.undefined
  
  var zIndexHover: js.UndefOr[Double] = js.undefined
}
object IClusterPlacemarkOptions {
  
  inline def apply(): IClusterPlacemarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClusterPlacemarkOptions]
  }
  
  extension [Self <: IClusterPlacemarkOptions](x: Self) {
    
    inline def setBalloonContentLayout(
      value: clusterNumbersignballoonTwoColumns | clusterNumbersignballoonCarousel | clusterNumbersignballoonAccordion | String | IClassConstructor[ILayout]
    ): Self = StObject.set(x, "balloonContentLayout", value.asInstanceOf[js.Any])
    
    inline def setBalloonContentLayoutHeight(value: Double): Self = StObject.set(x, "balloonContentLayoutHeight", value.asInstanceOf[js.Any])
    
    inline def setBalloonContentLayoutHeightUndefined: Self = StObject.set(x, "balloonContentLayoutHeight", js.undefined)
    
    inline def setBalloonContentLayoutUndefined: Self = StObject.set(x, "balloonContentLayout", js.undefined)
    
    inline def setBalloonContentLayoutWidth(value: Double): Self = StObject.set(x, "balloonContentLayoutWidth", value.asInstanceOf[js.Any])
    
    inline def setBalloonContentLayoutWidthUndefined: Self = StObject.set(x, "balloonContentLayoutWidth", js.undefined)
    
    inline def setBalloonItemContentLayout(value: ILayout | String): Self = StObject.set(x, "balloonItemContentLayout", value.asInstanceOf[js.Any])
    
    inline def setBalloonItemContentLayoutUndefined: Self = StObject.set(x, "balloonItemContentLayout", js.undefined)
    
    inline def setBalloonPanelContentLayout(value: String | IClassConstructor[ILayout]): Self = StObject.set(x, "balloonPanelContentLayout", value.asInstanceOf[js.Any])
    
    inline def setBalloonPanelContentLayoutUndefined: Self = StObject.set(x, "balloonPanelContentLayout", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDisableClickZoom(value: Boolean): Self = StObject.set(x, "disableClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDisableClickZoomUndefined: Self = StObject.set(x, "disableClickZoom", js.undefined)
    
    inline def setHideIconOnBalloonOpen(value: Boolean): Self = StObject.set(x, "hideIconOnBalloonOpen", value.asInstanceOf[js.Any])
    
    inline def setHideIconOnBalloonOpenUndefined: Self = StObject.set(x, "hideIconOnBalloonOpen", js.undefined)
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setIconContentLayout(value: String | IClassConstructor[ILayout]): Self = StObject.set(x, "iconContentLayout", value.asInstanceOf[js.Any])
    
    inline def setIconContentLayoutUndefined: Self = StObject.set(x, "iconContentLayout", js.undefined)
    
    inline def setIconLayout(value: String | IClassConstructor[ILayout]): Self = StObject.set(x, "iconLayout", value.asInstanceOf[js.Any])
    
    inline def setIconLayoutUndefined: Self = StObject.set(x, "iconLayout", js.undefined)
    
    inline def setIconShape(value: IGeometryJson): Self = StObject.set(x, "iconShape", value.asInstanceOf[js.Any])
    
    inline def setIconShapeUndefined: Self = StObject.set(x, "iconShape", js.undefined)
    
    inline def setIcons(value: js.Array[Href]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIconsVarargs(value: Href*): Self = StObject.set(x, "icons", js.Array(value :_*))
    
    inline def setInteractivityModel(value: InteractivityModelKey): Self = StObject.set(x, "interactivityModel", value.asInstanceOf[js.Any])
    
    inline def setInteractivityModelUndefined: Self = StObject.set(x, "interactivityModel", js.undefined)
    
    inline def setNumbers(value: js.Array[Double]): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
    
    inline def setNumbersUndefined: Self = StObject.set(x, "numbers", js.undefined)
    
    inline def setNumbersVarargs(value: Double*): Self = StObject.set(x, "numbers", js.Array(value :_*))
    
    inline def setOpenBalloonOnClick(value: Boolean): Self = StObject.set(x, "openBalloonOnClick", value.asInstanceOf[js.Any])
    
    inline def setOpenBalloonOnClickUndefined: Self = StObject.set(x, "openBalloonOnClick", js.undefined)
    
    inline def setOpenEmptyHint(value: Boolean): Self = StObject.set(x, "openEmptyHint", value.asInstanceOf[js.Any])
    
    inline def setOpenEmptyHintUndefined: Self = StObject.set(x, "openEmptyHint", js.undefined)
    
    inline def setOpenHintOnHover(value: Boolean): Self = StObject.set(x, "openHintOnHover", value.asInstanceOf[js.Any])
    
    inline def setOpenHintOnHoverUndefined: Self = StObject.set(x, "openHintOnHover", js.undefined)
    
    inline def setZIndexHover(value: Double): Self = StObject.set(x, "zIndexHover", value.asInstanceOf[js.Any])
    
    inline def setZIndexHoverUndefined: Self = StObject.set(x, "zIndexHover", js.undefined)
  }
}
