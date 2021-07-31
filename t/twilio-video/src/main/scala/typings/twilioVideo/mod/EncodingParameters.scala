package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingParameters extends StObject {
  
  var maxAudioBitrate: js.UndefOr[Double | Null] = js.undefined
  
  var maxVideoBitrate: js.UndefOr[Double | Null] = js.undefined
}
object EncodingParameters {
  
  @scala.inline
  def apply(): EncodingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingParameters]
  }
  
  @scala.inline
  implicit class EncodingParametersMutableBuilder[Self <: EncodingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxAudioBitrate(value: Double): Self = StObject.set(x, "maxAudioBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAudioBitrateNull: Self = StObject.set(x, "maxAudioBitrate", null)
    
    @scala.inline
    def setMaxAudioBitrateUndefined: Self = StObject.set(x, "maxAudioBitrate", js.undefined)
    
    @scala.inline
    def setMaxVideoBitrate(value: Double): Self = StObject.set(x, "maxVideoBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVideoBitrateNull: Self = StObject.set(x, "maxVideoBitrate", null)
    
    @scala.inline
    def setMaxVideoBitrateUndefined: Self = StObject.set(x, "maxVideoBitrate", js.undefined)
  }
}
