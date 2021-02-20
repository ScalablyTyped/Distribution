package typings.twilioVideo.mod

import typings.twilioVideo.mod.VideoTrack.Dimensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoRenderDimensions extends StObject {
  
  var high: js.UndefOr[Dimensions] = js.native
  
  var low: js.UndefOr[Dimensions] = js.native
  
  var standard: js.UndefOr[Dimensions] = js.native
}
object VideoRenderDimensions {
  
  @scala.inline
  def apply(): VideoRenderDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoRenderDimensions]
  }
  
  @scala.inline
  implicit class VideoRenderDimensionsMutableBuilder[Self <: VideoRenderDimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHigh(value: Dimensions): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    @scala.inline
    def setLow(value: Dimensions): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    @scala.inline
    def setStandard(value: Dimensions): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
