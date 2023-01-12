package typings.twilioVideo.tsdefTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingParameters extends StObject {
  
  var maxAudioBitrate: js.UndefOr[Double | Null] = js.undefined
  
  var maxVideoBitrate: js.UndefOr[Double | Null] = js.undefined
}
object EncodingParameters {
  
  inline def apply(): EncodingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodingParameters] (val x: Self) extends AnyVal {
    
    inline def setMaxAudioBitrate(value: Double): Self = StObject.set(x, "maxAudioBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxAudioBitrateNull: Self = StObject.set(x, "maxAudioBitrate", null)
    
    inline def setMaxAudioBitrateUndefined: Self = StObject.set(x, "maxAudioBitrate", js.undefined)
    
    inline def setMaxVideoBitrate(value: Double): Self = StObject.set(x, "maxVideoBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxVideoBitrateNull: Self = StObject.set(x, "maxVideoBitrate", null)
    
    inline def setMaxVideoBitrateUndefined: Self = StObject.set(x, "maxVideoBitrate", js.undefined)
  }
}
