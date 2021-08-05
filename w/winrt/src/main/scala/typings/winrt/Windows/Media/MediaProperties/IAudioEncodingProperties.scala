package typings.winrt.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAudioEncodingProperties
  extends StObject
     with IMediaEncodingProperties {
  
  var bitrate: Double
  
  var bitsPerSample: Double
  
  var channelCount: Double
  
  var sampleRate: Double
}
object IAudioEncodingProperties {
  
  inline def apply(
    bitrate: Double,
    bitsPerSample: Double,
    channelCount: Double,
    properties: MediaPropertySet,
    sampleRate: Double,
    subtype: String,
    `type`: String
  ): IAudioEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], bitsPerSample = bitsPerSample.asInstanceOf[js.Any], channelCount = channelCount.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAudioEncodingProperties]
  }
  
  extension [Self <: IAudioEncodingProperties](x: Self) {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitsPerSample(value: Double): Self = StObject.set(x, "bitsPerSample", value.asInstanceOf[js.Any])
    
    inline def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
  }
}
