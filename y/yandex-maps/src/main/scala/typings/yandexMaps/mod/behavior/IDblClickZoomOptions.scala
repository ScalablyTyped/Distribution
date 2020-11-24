package typings.yandexMaps.mod.behavior

import typings.yandexMaps.mod.IMapMarginOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDblClickZoomOptions extends IMapMarginOptions {
  
  var centering: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
}
object IDblClickZoomOptions {
  
  @scala.inline
  def apply(): IDblClickZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDblClickZoomOptions]
  }
  
  @scala.inline
  implicit class IDblClickZoomOptionsOps[Self <: IDblClickZoomOptions] (val x: Self) extends AnyVal {
    
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
    def setCentering(value: Boolean): Self = this.set("centering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCentering: Self = this.set("centering", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
}
