package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebMercatorViewportOptions extends js.Object {
  
  var altitude: js.UndefOr[Double] = js.native
  
  var bearing: js.UndefOr[Double] = js.native
  
  var farZMultiplier: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var latitude: js.UndefOr[Double] = js.native
  
  var longitude: js.UndefOr[Double] = js.native
  
  var nearZMultiplier: js.UndefOr[Double] = js.native
  
  var pitch: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
}
object WebMercatorViewportOptions {
  
  @scala.inline
  def apply(): WebMercatorViewportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebMercatorViewportOptions]
  }
  
  @scala.inline
  implicit class WebMercatorViewportOptionsOps[Self <: WebMercatorViewportOptions] (val x: Self) extends AnyVal {
    
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
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    
    @scala.inline
    def setBearing(value: Double): Self = this.set("bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBearing: Self = this.set("bearing", js.undefined)
    
    @scala.inline
    def setFarZMultiplier(value: Double): Self = this.set("farZMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFarZMultiplier: Self = this.set("farZMultiplier", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    
    @scala.inline
    def setNearZMultiplier(value: Double): Self = this.set("nearZMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNearZMultiplier: Self = this.set("nearZMultiplier", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
