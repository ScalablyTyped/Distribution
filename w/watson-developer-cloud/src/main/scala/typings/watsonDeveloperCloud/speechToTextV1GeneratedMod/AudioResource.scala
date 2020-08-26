package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AudioResource. */
@js.native
trait AudioResource extends js.Object {
  /** An `AudioDetails` object that provides detailed information about the audio resource. The object is empty until the service finishes processing the audio. */
  var details: AudioDetails = js.native
  /** The total seconds of audio in the audio resource. */
  var duration: Double = js.native
  /** **For an archive-type resource,** the user-specified name of the resource. **For an audio-type resource,** the user-specified name of the resource or the name of the audio file that the user added for the resource. The value depends on the method that is called. */
  var name: String = js.native
  /** The status of the audio resource: * `ok`: The service successfully analyzed the audio data. The data can be used to train the custom model. * `being_processed`: The service is still analyzing the audio data. The service cannot accept requests to add new audio resources or to train the custom model until its analysis is complete. * `invalid`: The audio data is not valid for training the custom model (possibly because it has the wrong format or sampling rate, or because it is corrupted). For an archive file, the entire archive is invalid if any of its audio files are invalid. */
  var status: String = js.native
}

object AudioResource {
  @scala.inline
  def apply(details: AudioDetails, duration: Double, name: String, status: String): AudioResource = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioResource]
  }
  @scala.inline
  implicit class AudioResourceOps[Self <: AudioResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetails(value: AudioDetails): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

