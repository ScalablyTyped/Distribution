package typings.yandexMaps.mod

import typings.yandexMaps.yandexMapsStrings.always
import typings.yandexMaps.yandexMapsStrings.ifNull
import typings.yandexMaps.yandexMapsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapOptions extends js.Object {
  
  var autoFitToViewport: js.UndefOr[none | ifNull | always] = js.native
  
  var avoidFractionalZoom: js.UndefOr[Boolean] = js.native
  
  var copyrightLogoVisible: js.UndefOr[Boolean] = js.native
  
  var copyrightProvidersVisible: js.UndefOr[Boolean] = js.native
  
  var copyrightUaVisible: js.UndefOr[Boolean] = js.native
  
  var exitFullscreenByEsc: js.UndefOr[Boolean] = js.native
  
  var fullscreenZIndex: js.UndefOr[Double] = js.native
  
  var mapAutoFocus: js.UndefOr[Boolean] = js.native
  
  var maxAnimationZoomDifference: js.UndefOr[Double] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var nativeFullscreen: js.UndefOr[Boolean] = js.native
  
  var projection: js.UndefOr[IProjection] = js.native
  
  var restrictMapArea: js.UndefOr[Boolean] = js.native
  
  var suppressMapOpenBlock: js.UndefOr[Boolean] = js.native
  
  var suppressObsoleteBrowserNotifier: js.UndefOr[Boolean] = js.native
  
  var yandexMapAutoSwitch: js.UndefOr[Boolean] = js.native
  
  var yandexMapDisablePoiInteractivity: js.UndefOr[Boolean] = js.native
}
object IMapOptions {
  
  @scala.inline
  def apply(): IMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapOptions]
  }
  
  @scala.inline
  implicit class IMapOptionsOps[Self <: IMapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoFitToViewport(value: none | ifNull | always): Self = this.set("autoFitToViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFitToViewport: Self = this.set("autoFitToViewport", js.undefined)
    
    @scala.inline
    def setAvoidFractionalZoom(value: Boolean): Self = this.set("avoidFractionalZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidFractionalZoom: Self = this.set("avoidFractionalZoom", js.undefined)
    
    @scala.inline
    def setCopyrightLogoVisible(value: Boolean): Self = this.set("copyrightLogoVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyrightLogoVisible: Self = this.set("copyrightLogoVisible", js.undefined)
    
    @scala.inline
    def setCopyrightProvidersVisible(value: Boolean): Self = this.set("copyrightProvidersVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyrightProvidersVisible: Self = this.set("copyrightProvidersVisible", js.undefined)
    
    @scala.inline
    def setCopyrightUaVisible(value: Boolean): Self = this.set("copyrightUaVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyrightUaVisible: Self = this.set("copyrightUaVisible", js.undefined)
    
    @scala.inline
    def setExitFullscreenByEsc(value: Boolean): Self = this.set("exitFullscreenByEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitFullscreenByEsc: Self = this.set("exitFullscreenByEsc", js.undefined)
    
    @scala.inline
    def setFullscreenZIndex(value: Double): Self = this.set("fullscreenZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreenZIndex: Self = this.set("fullscreenZIndex", js.undefined)
    
    @scala.inline
    def setMapAutoFocus(value: Boolean): Self = this.set("mapAutoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapAutoFocus: Self = this.set("mapAutoFocus", js.undefined)
    
    @scala.inline
    def setMaxAnimationZoomDifference(value: Double): Self = this.set("maxAnimationZoomDifference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAnimationZoomDifference: Self = this.set("maxAnimationZoomDifference", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setNativeFullscreen(value: Boolean): Self = this.set("nativeFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeFullscreen: Self = this.set("nativeFullscreen", js.undefined)
    
    @scala.inline
    def setProjection(value: IProjection): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setRestrictMapArea(value: Boolean): Self = this.set("restrictMapArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictMapArea: Self = this.set("restrictMapArea", js.undefined)
    
    @scala.inline
    def setSuppressMapOpenBlock(value: Boolean): Self = this.set("suppressMapOpenBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressMapOpenBlock: Self = this.set("suppressMapOpenBlock", js.undefined)
    
    @scala.inline
    def setSuppressObsoleteBrowserNotifier(value: Boolean): Self = this.set("suppressObsoleteBrowserNotifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressObsoleteBrowserNotifier: Self = this.set("suppressObsoleteBrowserNotifier", js.undefined)
    
    @scala.inline
    def setYandexMapAutoSwitch(value: Boolean): Self = this.set("yandexMapAutoSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYandexMapAutoSwitch: Self = this.set("yandexMapAutoSwitch", js.undefined)
    
    @scala.inline
    def setYandexMapDisablePoiInteractivity(value: Boolean): Self = this.set("yandexMapDisablePoiInteractivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYandexMapDisablePoiInteractivity: Self = this.set("yandexMapDisablePoiInteractivity", js.undefined)
  }
}
