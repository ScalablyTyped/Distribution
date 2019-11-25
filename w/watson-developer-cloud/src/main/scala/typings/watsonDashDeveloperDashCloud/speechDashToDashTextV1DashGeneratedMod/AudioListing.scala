package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AudioListing. */
trait AudioListing extends js.Object {
  /** **For an archive-type resource,** an array of `AudioResource` objects that provides information about the audio-type resources that are contained in the resource. Omitted for an audio-type resource. */
  var audio: js.UndefOr[js.Array[AudioResource]] = js.undefined
  /** **For an archive-type resource,** an object of type `AudioResource` that provides information about the resource. Omitted for an audio-type resource. */
  var container: js.UndefOr[AudioResource] = js.undefined
  /** **For an audio-type resource,** an `AudioDetails` object that provides detailed information about the resource. The object is empty until the service finishes processing the audio. Omitted for an archive-type resource. */
  var details: js.UndefOr[AudioDetails] = js.undefined
  /** **For an audio-type resource,**  the total seconds of audio in the resource. Omitted for an archive-type resource. */
  var duration: js.UndefOr[Double] = js.undefined
  /** **For an audio-type resource,** the user-specified name of the resource. Omitted for an archive-type resource. */
  var name: js.UndefOr[String] = js.undefined
  /** **For an audio-type resource,** the status of the resource: * `ok`: The service successfully analyzed the audio data. The data can be used to train the custom model. * `being_processed`: The service is still analyzing the audio data. The service cannot accept requests to add new audio resources or to train the custom model until its analysis is complete. * `invalid`: The audio data is not valid for training the custom model (possibly because it has the wrong format or sampling rate, or because it is corrupted). Omitted for an archive-type resource. */
  var status: js.UndefOr[String] = js.undefined
}

object AudioListing {
  @scala.inline
  def apply(
    audio: js.Array[AudioResource] = null,
    container: AudioResource = null,
    details: AudioDetails = null,
    duration: Int | Double = null,
    name: String = null,
    status: String = null
  ): AudioListing = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioListing]
  }
}

