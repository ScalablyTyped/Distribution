package typings.yandexMaps.mod

import typings.yandexMaps.yandexMapsStrings.always
import typings.yandexMaps.yandexMapsStrings.ifNull
import typings.yandexMaps.yandexMapsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapOptions extends StObject {
  
  var autoFitToViewport: js.UndefOr[none | ifNull | always] = js.undefined
  
  var avoidFractionalZoom: js.UndefOr[Boolean] = js.undefined
  
  var copyrightLogoVisible: js.UndefOr[Boolean] = js.undefined
  
  var copyrightProvidersVisible: js.UndefOr[Boolean] = js.undefined
  
  var copyrightUaVisible: js.UndefOr[Boolean] = js.undefined
  
  var exitFullscreenByEsc: js.UndefOr[Boolean] = js.undefined
  
  var fullscreenZIndex: js.UndefOr[Double] = js.undefined
  
  var mapAutoFocus: js.UndefOr[Boolean] = js.undefined
  
  var maxAnimationZoomDifference: js.UndefOr[Double] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var nativeFullscreen: js.UndefOr[Boolean] = js.undefined
  
  var projection: js.UndefOr[IProjection] = js.undefined
  
  var restrictMapArea: js.UndefOr[Boolean] = js.undefined
  
  var suppressMapOpenBlock: js.UndefOr[Boolean] = js.undefined
  
  var suppressObsoleteBrowserNotifier: js.UndefOr[Boolean] = js.undefined
  
  var yandexMapAutoSwitch: js.UndefOr[Boolean] = js.undefined
  
  var yandexMapDisablePoiInteractivity: js.UndefOr[Boolean] = js.undefined
}
object IMapOptions {
  
  @scala.inline
  def apply(): IMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapOptions]
  }
  
  @scala.inline
  implicit class IMapOptionsMutableBuilder[Self <: IMapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFitToViewport(value: none | ifNull | always): Self = StObject.set(x, "autoFitToViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFitToViewportUndefined: Self = StObject.set(x, "autoFitToViewport", js.undefined)
    
    @scala.inline
    def setAvoidFractionalZoom(value: Boolean): Self = StObject.set(x, "avoidFractionalZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidFractionalZoomUndefined: Self = StObject.set(x, "avoidFractionalZoom", js.undefined)
    
    @scala.inline
    def setCopyrightLogoVisible(value: Boolean): Self = StObject.set(x, "copyrightLogoVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightLogoVisibleUndefined: Self = StObject.set(x, "copyrightLogoVisible", js.undefined)
    
    @scala.inline
    def setCopyrightProvidersVisible(value: Boolean): Self = StObject.set(x, "copyrightProvidersVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightProvidersVisibleUndefined: Self = StObject.set(x, "copyrightProvidersVisible", js.undefined)
    
    @scala.inline
    def setCopyrightUaVisible(value: Boolean): Self = StObject.set(x, "copyrightUaVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUaVisibleUndefined: Self = StObject.set(x, "copyrightUaVisible", js.undefined)
    
    @scala.inline
    def setExitFullscreenByEsc(value: Boolean): Self = StObject.set(x, "exitFullscreenByEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitFullscreenByEscUndefined: Self = StObject.set(x, "exitFullscreenByEsc", js.undefined)
    
    @scala.inline
    def setFullscreenZIndex(value: Double): Self = StObject.set(x, "fullscreenZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenZIndexUndefined: Self = StObject.set(x, "fullscreenZIndex", js.undefined)
    
    @scala.inline
    def setMapAutoFocus(value: Boolean): Self = StObject.set(x, "mapAutoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapAutoFocusUndefined: Self = StObject.set(x, "mapAutoFocus", js.undefined)
    
    @scala.inline
    def setMaxAnimationZoomDifference(value: Double): Self = StObject.set(x, "maxAnimationZoomDifference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAnimationZoomDifferenceUndefined: Self = StObject.set(x, "maxAnimationZoomDifference", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setNativeFullscreen(value: Boolean): Self = StObject.set(x, "nativeFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeFullscreenUndefined: Self = StObject.set(x, "nativeFullscreen", js.undefined)
    
    @scala.inline
    def setProjection(value: IProjection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setRestrictMapArea(value: Boolean): Self = StObject.set(x, "restrictMapArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictMapAreaUndefined: Self = StObject.set(x, "restrictMapArea", js.undefined)
    
    @scala.inline
    def setSuppressMapOpenBlock(value: Boolean): Self = StObject.set(x, "suppressMapOpenBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressMapOpenBlockUndefined: Self = StObject.set(x, "suppressMapOpenBlock", js.undefined)
    
    @scala.inline
    def setSuppressObsoleteBrowserNotifier(value: Boolean): Self = StObject.set(x, "suppressObsoleteBrowserNotifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressObsoleteBrowserNotifierUndefined: Self = StObject.set(x, "suppressObsoleteBrowserNotifier", js.undefined)
    
    @scala.inline
    def setYandexMapAutoSwitch(value: Boolean): Self = StObject.set(x, "yandexMapAutoSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYandexMapAutoSwitchUndefined: Self = StObject.set(x, "yandexMapAutoSwitch", js.undefined)
    
    @scala.inline
    def setYandexMapDisablePoiInteractivity(value: Boolean): Self = StObject.set(x, "yandexMapDisablePoiInteractivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYandexMapDisablePoiInteractivityUndefined: Self = StObject.set(x, "yandexMapDisablePoiInteractivity", js.undefined)
  }
}
