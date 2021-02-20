package typings.w3cImageCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhotoSettings extends StObject {
  
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
  implicit class PhotoSettingsMutableBuilder[Self <: PhotoSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillLightMode(value: FillLightMode): Self = StObject.set(x, "fillLightMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillLightModeUndefined: Self = StObject.set(x, "fillLightMode", js.undefined)
    
    @scala.inline
    def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHeightUndefined: Self = StObject.set(x, "imageHeight", js.undefined)
    
    @scala.inline
    def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageWidthUndefined: Self = StObject.set(x, "imageWidth", js.undefined)
    
    @scala.inline
    def setRedEyeReduction(value: Boolean): Self = StObject.set(x, "redEyeReduction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedEyeReductionUndefined: Self = StObject.set(x, "redEyeReduction", js.undefined)
  }
}
