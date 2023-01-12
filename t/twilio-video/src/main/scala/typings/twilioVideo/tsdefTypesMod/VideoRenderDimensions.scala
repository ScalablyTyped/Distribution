package typings.twilioVideo.tsdefTypesMod

import typings.twilioVideo.tsdefVideoTrackMod.VideoTrack.Dimensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoRenderDimensions extends StObject {
  
  var high: js.UndefOr[Dimensions] = js.undefined
  
  var low: js.UndefOr[Dimensions] = js.undefined
  
  var standard: js.UndefOr[Dimensions] = js.undefined
}
object VideoRenderDimensions {
  
  inline def apply(): VideoRenderDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoRenderDimensions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoRenderDimensions] (val x: Self) extends AnyVal {
    
    inline def setHigh(value: Dimensions): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Dimensions): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setStandard(value: Dimensions): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
