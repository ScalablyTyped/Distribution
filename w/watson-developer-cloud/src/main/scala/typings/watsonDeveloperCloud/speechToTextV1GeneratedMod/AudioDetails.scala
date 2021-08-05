package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** AudioDetails. */
trait AudioDetails extends StObject {
  
  /** **For an audio-type resource,** the codec in which the audio is encoded. Omitted for an archive-type resource. */
  var codec: js.UndefOr[String] = js.undefined
  
  /** **For an archive-type resource,** the format of the compressed archive: * `zip` for a **.zip** file * `gzip` for a **.tar.gz** file Omitted for an audio-type resource. */
  var compression: js.UndefOr[String] = js.undefined
  
  /** **For an audio-type resource,** the sampling rate of the audio in Hertz (samples per second). Omitted for an archive-type resource. */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /** The type of the audio resource: * `audio` for an individual audio file * `archive` for an archive (**.zip** or **.tar.gz**) file that contains audio files * `undetermined` for a resource that the service cannot validate (for example, if the user mistakenly passes a file that does not contain audio, such as a JPEG file). */
  var `type`: js.UndefOr[String] = js.undefined
}
object AudioDetails {
  
  inline def apply(): AudioDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioDetails]
  }
  
  extension [Self <: AudioDetails](x: Self) {
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
