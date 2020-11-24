package typings.w3cImageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhotoSettings extends js.Object {
  
  var fillLightMode: js.UndefOr[FillLightMode] = js.native
  
  var imageHeight: js.UndefOr[Double] = js.native
  
  var imageWidth: js.UndefOr[Double] = js.native
  
  var redEyeReduction: js.UndefOr[Boolean] = js.native
}
object PhotoSettings {
  
  @scala.inline
  def apply(): PhotoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoSettings]
  }
  
  @scala.inline
  implicit class PhotoSettingsOps[Self <: PhotoSettings] (val x: Self) extends AnyVal {
    
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
    def setFillLightMode(value: FillLightMode): Self = this.set("fillLightMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillLightMode: Self = this.set("fillLightMode", js.undefined)
    
    @scala.inline
    def setImageHeight(value: Double): Self = this.set("imageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageHeight: Self = this.set("imageHeight", js.undefined)
    
    @scala.inline
    def setImageWidth(value: Double): Self = this.set("imageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageWidth: Self = this.set("imageWidth", js.undefined)
    
    @scala.inline
    def setRedEyeReduction(value: Boolean): Self = this.set("redEyeReduction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedEyeReduction: Self = this.set("redEyeReduction", js.undefined)
  }
}
