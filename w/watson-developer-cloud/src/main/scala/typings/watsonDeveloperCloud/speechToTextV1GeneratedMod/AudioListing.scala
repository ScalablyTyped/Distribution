package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AudioListing. */
@js.native
trait AudioListing extends js.Object {
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
  implicit class AudioListingOps[Self <: AudioListing] (val x: Self) extends AnyVal {
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
    def setAudioVarargs(value: AudioResource*): Self = this.set("audio", js.Array(value :_*))
    @scala.inline
    def setAudio(value: js.Array[AudioResource]): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    @scala.inline
    def setContainer(value: AudioResource): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDetails(value: AudioDetails): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

