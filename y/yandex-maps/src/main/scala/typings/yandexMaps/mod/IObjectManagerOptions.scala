package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectManagerOptions extends js.Object {
  
  var clusterHasBalloon: js.UndefOr[Boolean] = js.native
  
  var clusterize: js.UndefOr[Boolean] = js.native
  
  var geoObjectOpenBalloonOnClick: js.UndefOr[Boolean] = js.native
  
  var syncOverlayInit: js.UndefOr[Boolean] = js.native
  
  var viewportMargin: js.UndefOr[Double | js.Array[Double]] = js.native
}
object IObjectManagerOptions {
  
  @scala.inline
  def apply(): IObjectManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IObjectManagerOptions]
  }
  
  @scala.inline
  implicit class IObjectManagerOptionsOps[Self <: IObjectManagerOptions] (val x: Self) extends AnyVal {
    
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
    def setClusterHasBalloon(value: Boolean): Self = this.set("clusterHasBalloon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterHasBalloon: Self = this.set("clusterHasBalloon", js.undefined)
    
    @scala.inline
    def setClusterize(value: Boolean): Self = this.set("clusterize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterize: Self = this.set("clusterize", js.undefined)
    
    @scala.inline
    def setGeoObjectOpenBalloonOnClick(value: Boolean): Self = this.set("geoObjectOpenBalloonOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoObjectOpenBalloonOnClick: Self = this.set("geoObjectOpenBalloonOnClick", js.undefined)
    
    @scala.inline
    def setSyncOverlayInit(value: Boolean): Self = this.set("syncOverlayInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncOverlayInit: Self = this.set("syncOverlayInit", js.undefined)
    
    @scala.inline
    def setViewportMarginVarargs(value: Double*): Self = this.set("viewportMargin", js.Array(value :_*))
    
    @scala.inline
    def setViewportMargin(value: Double | js.Array[Double]): Self = this.set("viewportMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewportMargin: Self = this.set("viewportMargin", js.undefined)
  }
}
