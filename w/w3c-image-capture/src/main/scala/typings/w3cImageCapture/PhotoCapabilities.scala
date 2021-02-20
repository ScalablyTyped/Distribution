package typings.w3cImageCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhotoCapabilities extends StObject {
  
  val fillLightMode: js.Array[FillLightMode] = js.native
  
  val imageHeight: MediaSettingsRange = js.native
  
  val imageWidth: MediaSettingsRange = js.native
  
  val redEyeReduction: RedEyeReduction = js.native
}
object PhotoCapabilities {
  
  @scala.inline
  def apply(
    fillLightMode: js.Array[FillLightMode],
    imageHeight: MediaSettingsRange,
    imageWidth: MediaSettingsRange,
    redEyeReduction: RedEyeReduction
  ): PhotoCapabilities = {
    val __obj = js.Dynamic.literal(fillLightMode = fillLightMode.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], redEyeReduction = redEyeReduction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoCapabilities]
  }
  
  @scala.inline
  implicit class PhotoCapabilitiesMutableBuilder[Self <: PhotoCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillLightMode(value: js.Array[FillLightMode]): Self = StObject.set(x, "fillLightMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillLightModeVarargs(value: FillLightMode*): Self = StObject.set(x, "fillLightMode", js.Array(value :_*))
    
    @scala.inline
    def setImageHeight(value: MediaSettingsRange): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageWidth(value: MediaSettingsRange): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedEyeReduction(value: RedEyeReduction): Self = StObject.set(x, "redEyeReduction", value.asInstanceOf[js.Any])
  }
}
