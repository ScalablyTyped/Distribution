package typings.w3cImageCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhotoCapabilities extends StObject {
  
  val fillLightMode: js.Array[FillLightMode]
  
  val imageHeight: MediaSettingsRange
  
  val imageWidth: MediaSettingsRange
  
  val redEyeReduction: RedEyeReduction
}
object PhotoCapabilities {
  
  inline def apply(
    fillLightMode: js.Array[FillLightMode],
    imageHeight: MediaSettingsRange,
    imageWidth: MediaSettingsRange,
    redEyeReduction: RedEyeReduction
  ): PhotoCapabilities = {
    val __obj = js.Dynamic.literal(fillLightMode = fillLightMode.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], redEyeReduction = redEyeReduction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoCapabilities]
  }
  
  extension [Self <: PhotoCapabilities](x: Self) {
    
    inline def setFillLightMode(value: js.Array[FillLightMode]): Self = StObject.set(x, "fillLightMode", value.asInstanceOf[js.Any])
    
    inline def setFillLightModeVarargs(value: FillLightMode*): Self = StObject.set(x, "fillLightMode", js.Array(value*))
    
    inline def setImageHeight(value: MediaSettingsRange): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
    
    inline def setImageWidth(value: MediaSettingsRange): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
    
    inline def setRedEyeReduction(value: RedEyeReduction): Self = StObject.set(x, "redEyeReduction", value.asInstanceOf[js.Any])
  }
}
