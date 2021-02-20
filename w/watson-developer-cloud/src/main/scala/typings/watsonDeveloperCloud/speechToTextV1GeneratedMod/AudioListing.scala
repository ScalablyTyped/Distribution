package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** AudioListing. */
@js.native
trait AudioListing extends StObject {
  
  /** **For an archive-type resource,** an array of `AudioResource` objects that provides information about the audio-type resources that are contained in the resource. Omitted for an audio-type resource. */
  var audio: js.UndefOr[js.Array[AudioResource]] = js.native
  
  /** **For an archive-type resource,** an object of type `AudioResource` that provides information about the resource. Omitted for an audio-type resource. */
  var container: js.UndefOr[AudioResource] = js.native
  
  /** **For an audio-type resource,** an `AudioDetails` object that provides detailed information about the resource. The object is empty until the service finishes processing the audio. Omitted for an archive-type resource. */
  var details: js.UndefOr[AudioDetails] = js.native
  
  /** **For an audio-type resource,**  the total seconds of audio in the resource. Omitted for an archive-type resource. */
  var duration: js.UndefOr[Double] = js.native
  
  /** **For an audio-type resource,** the user-specified name of the resource. Omitted for an archive-type resource. */
  var name: js.UndefOr[String] = js.native
  
  /** **For an audio-type resource,** the status of the resource: * `ok`: The service successfully analyzed the audio data. The data can be used to train the custom model. * `being_processed`: The service is still analyzing the audio data. The service cannot accept requests to add new audio resources or to train the custom model until its analysis is complete. * `invalid`: The audio data is not valid for training the custom model (possibly because it has the wrong format or sampling rate, or because it is corrupted). Omitted for an archive-type resource. */
  var status: js.UndefOr[String] = js.native
}
object AudioListing {
  
  @scala.inline
  def apply(): AudioListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioListing]
  }
  
  @scala.inline
  implicit class AudioListingMutableBuilder[Self <: AudioListing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: js.Array[AudioResource]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setAudioVarargs(value: AudioResource*): Self = StObject.set(x, "audio", js.Array(value :_*))
    
    @scala.inline
    def setContainer(value: AudioResource): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDetails(value: AudioDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
