package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AudioDetails. */
@js.native
trait AudioDetails extends js.Object {
  /** **For an audio-type resource,** the codec in which the audio is encoded. Omitted for an archive-type resource. */
  var codec: js.UndefOr[String] = js.native
  /** **For an archive-type resource,** the format of the compressed archive: * `zip` for a **.zip** file * `gzip` for a **.tar.gz** file Omitted for an audio-type resource. */
  var compression: js.UndefOr[String] = js.native
  /** **For an audio-type resource,** the sampling rate of the audio in Hertz (samples per second). Omitted for an archive-type resource. */
  var frequency: js.UndefOr[Double] = js.native
  /** The type of the audio resource: * `audio` for an individual audio file * `archive` for an archive (**.zip** or **.tar.gz**) file that contains audio files * `undetermined` for a resource that the service cannot validate (for example, if the user mistakenly passes a file that does not contain audio, such as a JPEG file). */
  var `type`: js.UndefOr[String] = js.native
}

object AudioDetails {
  @scala.inline
  def apply(): AudioDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioDetails]
  }
  @scala.inline
  implicit class AudioDetailsOps[Self <: AudioDetails] (val x: Self) extends AnyVal {
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
    def setCodec(value: String): Self = this.set("codec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodec: Self = this.set("codec", js.undefined)
    @scala.inline
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

