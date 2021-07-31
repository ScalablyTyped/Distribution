package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** AudioResources. */
trait AudioResources extends StObject {
  
  /** An array of `AudioResource` objects that provides information about the audio resources of the custom acoustic model. The array is empty if the custom model has no audio resources. */
  var audio: js.Array[AudioResource]
  
  /** The total minutes of accumulated audio summed over all of the valid audio resources for the custom acoustic model. You can use this value to determine whether the custom model has too little or too much audio to begin training. */
  var total_minutes_of_audio: Double
}
object AudioResources {
  
  @scala.inline
  def apply(audio: js.Array[AudioResource], total_minutes_of_audio: Double): AudioResources = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], total_minutes_of_audio = total_minutes_of_audio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioResources]
  }
  
  @scala.inline
  implicit class AudioResourcesMutableBuilder[Self <: AudioResources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: js.Array[AudioResource]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioVarargs(value: AudioResource*): Self = StObject.set(x, "audio", js.Array(value :_*))
    
    @scala.inline
    def setTotal_minutes_of_audio(value: Double): Self = StObject.set(x, "total_minutes_of_audio", value.asInstanceOf[js.Any])
  }
}
