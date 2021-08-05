package typings.w3cImageCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhotoSettings extends StObject {
  
  var fillLightMode: js.UndefOr[FillLightMode] = js.undefined
  
  var imageHeight: js.UndefOr[Double] = js.undefined
  
  var imageWidth: js.UndefOr[Double] = js.undefined
  
  var redEyeReduction: js.UndefOr[Boolean] = js.undefined
}
object PhotoSettings {
  
  inline def apply(): PhotoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoSettings]
  }
  
  extension [Self <: PhotoSettings](x: Self) {
    
    inline def setFillLightMode(value: FillLightMode): Self = StObject.set(x, "fillLightMode", value.asInstanceOf[js.Any])
    
    inline def setFillLightModeUndefined: Self = StObject.set(x, "fillLightMode", js.undefined)
    
    inline def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
    
    inline def setImageHeightUndefined: Self = StObject.set(x, "imageHeight", js.undefined)
    
    inline def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
    
    inline def setImageWidthUndefined: Self = StObject.set(x, "imageWidth", js.undefined)
    
    inline def setRedEyeReduction(value: Boolean): Self = StObject.set(x, "redEyeReduction", value.asInstanceOf[js.Any])
    
    inline def setRedEyeReductionUndefined: Self = StObject.set(x, "redEyeReduction", js.undefined)
  }
}
