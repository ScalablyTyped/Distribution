package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AudioDetails. */
trait AudioDetails extends js.Object {
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
  @scala.inline
  def apply(
    codec: String = null,
    compression: String = null,
    frequency: Int | Double = null,
    `type`: String = null
  ): AudioDetails = {
    val __obj = js.Dynamic.literal()
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDetails]
  }
}

