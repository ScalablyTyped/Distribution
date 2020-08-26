package typings.tensorflowTfjsData.typesMod

import typings.std.MediaTrackConstraints
import typings.tensorflowTfjsData.tensorflowTfjsDataNumbers.`44100`
import typings.tensorflowTfjsData.tensorflowTfjsDataNumbers.`48000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MicrophoneConfig extends js.Object {
  var audioTrackConstraints: js.UndefOr[MediaTrackConstraints] = js.native
  var columnTruncateLength: js.UndefOr[Double] = js.native
  var fftSize: js.UndefOr[Double] = js.native
  var includeSpectrogram: js.UndefOr[Boolean] = js.native
  var includeWaveform: js.UndefOr[Boolean] = js.native
  var numFramesPerSpectrogram: js.UndefOr[Double] = js.native
  var sampleRateHz: js.UndefOr[`44100` | `48000`] = js.native
  var smoothingTimeConstant: js.UndefOr[Double] = js.native
}

object MicrophoneConfig {
  @scala.inline
  def apply(): MicrophoneConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrophoneConfig]
  }
  @scala.inline
  implicit class MicrophoneConfigOps[Self <: MicrophoneConfig] (val x: Self) extends AnyVal {
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
    def setAudioTrackConstraints(value: MediaTrackConstraints): Self = this.set("audioTrackConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioTrackConstraints: Self = this.set("audioTrackConstraints", js.undefined)
    @scala.inline
    def setColumnTruncateLength(value: Double): Self = this.set("columnTruncateLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnTruncateLength: Self = this.set("columnTruncateLength", js.undefined)
    @scala.inline
    def setFftSize(value: Double): Self = this.set("fftSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFftSize: Self = this.set("fftSize", js.undefined)
    @scala.inline
    def setIncludeSpectrogram(value: Boolean): Self = this.set("includeSpectrogram", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSpectrogram: Self = this.set("includeSpectrogram", js.undefined)
    @scala.inline
    def setIncludeWaveform(value: Boolean): Self = this.set("includeWaveform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeWaveform: Self = this.set("includeWaveform", js.undefined)
    @scala.inline
    def setNumFramesPerSpectrogram(value: Double): Self = this.set("numFramesPerSpectrogram", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumFramesPerSpectrogram: Self = this.set("numFramesPerSpectrogram", js.undefined)
    @scala.inline
    def setSampleRateHz(value: `44100` | `48000`): Self = this.set("sampleRateHz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRateHz: Self = this.set("sampleRateHz", js.undefined)
    @scala.inline
    def setSmoothingTimeConstant(value: Double): Self = this.set("smoothingTimeConstant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothingTimeConstant: Self = this.set("smoothingTimeConstant", js.undefined)
  }
  
}

