package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AudioResource. */
trait AudioResource extends js.Object {
  /** An `AudioDetails` object that provides detailed information about the audio resource. The object is empty until the service finishes processing the audio. */
  var details: AudioDetails
  /** The total seconds of audio in the audio resource. */
  var duration: Double
  /** **For an archive-type resource,** the user-specified name of the resource. **For an audio-type resource,** the user-specified name of the resource or the name of the audio file that the user added for the resource. The value depends on the method that is called. */
  var name: String
  /** The status of the audio resource: * `ok`: The service successfully analyzed the audio data. The data can be used to train the custom model. * `being_processed`: The service is still analyzing the audio data. The service cannot accept requests to add new audio resources or to train the custom model until its analysis is complete. * `invalid`: The audio data is not valid for training the custom model (possibly because it has the wrong format or sampling rate, or because it is corrupted). For an archive file, the entire archive is invalid if any of its audio files are invalid. */
  var status: String
}

object AudioResource {
  @scala.inline
  def apply(details: AudioDetails, duration: Double, name: String, status: String): AudioResource = {
    val __obj = js.Dynamic.literal(details = details, duration = duration, name = name, status = status)
  
    __obj.asInstanceOf[AudioResource]
  }
}

