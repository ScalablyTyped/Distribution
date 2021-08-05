package typings.winrtUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the format of an audio stream. */
trait AudioEncodingProperties extends StObject {
  
  /** Gets or sets the audio bit rate. */
  var bitrate: Double
  
  /** Gets or sets the number of bits per audio sample. */
  var bitsPerSample: Double
  
  /** Gets or sets the number of audio channels. */
  var channelCount: Double
  
  /**
    * Gets the media format user data.
    * @return Receives the media format data.
    */
  def getFormatUserData(): js.Array[Double]
  
  /** Gets additional format properties for the audio stream. */
  var properties: MediaPropertySet
  
  /** Gets or sets audio sampling rate. */
  var sampleRate: Double
  
  /**
    * Sets the media format user data.
    * @param value The media data to set.
    */
  def setFormatUserData(value: js.Array[Double]): Unit
  
  /** Gets or sets the subtype of the format. */
  var subtype: String
  
  /** Gets the format type. */
  var `type`: String
}
object AudioEncodingProperties {
  
  inline def apply(
    bitrate: Double,
    bitsPerSample: Double,
    channelCount: Double,
    getFormatUserData: () => js.Array[Double],
    properties: MediaPropertySet,
    sampleRate: Double,
    setFormatUserData: js.Array[Double] => Unit,
    subtype: String,
    `type`: String
  ): AudioEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], bitsPerSample = bitsPerSample.asInstanceOf[js.Any], channelCount = channelCount.asInstanceOf[js.Any], getFormatUserData = js.Any.fromFunction0(getFormatUserData), properties = properties.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], setFormatUserData = js.Any.fromFunction1(setFormatUserData), subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEncodingProperties]
  }
  
  extension [Self <: AudioEncodingProperties](x: Self) {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitsPerSample(value: Double): Self = StObject.set(x, "bitsPerSample", value.asInstanceOf[js.Any])
    
    inline def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    inline def setGetFormatUserData(value: () => js.Array[Double]): Self = StObject.set(x, "getFormatUserData", js.Any.fromFunction0(value))
    
    inline def setProperties(value: MediaPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSetFormatUserData(value: js.Array[Double] => Unit): Self = StObject.set(x, "setFormatUserData", js.Any.fromFunction1(value))
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
