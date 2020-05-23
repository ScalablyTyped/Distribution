package typings.tensorflowTfjsData.typesMod

import typings.std.MediaTrackConstraints
import typings.tensorflowTfjsData.tensorflowTfjsDataNumbers.`44100`
import typings.tensorflowTfjsData.tensorflowTfjsDataNumbers.`48000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicrophoneConfig extends js.Object {
  var audioTrackConstraints: js.UndefOr[MediaTrackConstraints] = js.undefined
  var columnTruncateLength: js.UndefOr[Double] = js.undefined
  var fftSize: js.UndefOr[Double] = js.undefined
  var includeSpectrogram: js.UndefOr[Boolean] = js.undefined
  var includeWaveform: js.UndefOr[Boolean] = js.undefined
  var numFramesPerSpectrogram: js.UndefOr[Double] = js.undefined
  var sampleRateHz: js.UndefOr[`44100` | `48000`] = js.undefined
  var smoothingTimeConstant: js.UndefOr[Double] = js.undefined
}

object MicrophoneConfig {
  @scala.inline
  def apply(
    audioTrackConstraints: MediaTrackConstraints = null,
    columnTruncateLength: js.UndefOr[Double] = js.undefined,
    fftSize: js.UndefOr[Double] = js.undefined,
    includeSpectrogram: js.UndefOr[Boolean] = js.undefined,
    includeWaveform: js.UndefOr[Boolean] = js.undefined,
    numFramesPerSpectrogram: js.UndefOr[Double] = js.undefined,
    sampleRateHz: `44100` | `48000` = null,
    smoothingTimeConstant: js.UndefOr[Double] = js.undefined
  ): MicrophoneConfig = {
    val __obj = js.Dynamic.literal()
    if (audioTrackConstraints != null) __obj.updateDynamic("audioTrackConstraints")(audioTrackConstraints.asInstanceOf[js.Any])
    if (!js.isUndefined(columnTruncateLength)) __obj.updateDynamic("columnTruncateLength")(columnTruncateLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fftSize)) __obj.updateDynamic("fftSize")(fftSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSpectrogram)) __obj.updateDynamic("includeSpectrogram")(includeSpectrogram.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeWaveform)) __obj.updateDynamic("includeWaveform")(includeWaveform.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numFramesPerSpectrogram)) __obj.updateDynamic("numFramesPerSpectrogram")(numFramesPerSpectrogram.get.asInstanceOf[js.Any])
    if (sampleRateHz != null) __obj.updateDynamic("sampleRateHz")(sampleRateHz.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothingTimeConstant)) __obj.updateDynamic("smoothingTimeConstant")(smoothingTimeConstant.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicrophoneConfig]
  }
}

