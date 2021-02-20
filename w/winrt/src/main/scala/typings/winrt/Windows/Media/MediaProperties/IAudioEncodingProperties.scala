package typings.winrt.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAudioEncodingProperties extends IMediaEncodingProperties {
  
  var bitrate: Double = js.native
  
  var bitsPerSample: Double = js.native
  
  var channelCount: Double = js.native
  
  var sampleRate: Double = js.native
}
object IAudioEncodingProperties {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IAudioEncodingPropertiesMutableBuilder[Self <: IAudioEncodingProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitsPerSample(value: Double): Self = StObject.set(x, "bitsPerSample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
  }
}
