package typings.atTensorflowTfjsDashData.distTypesMod

import typings.atTensorflowTfjsDashData.atTensorflowTfjsDashDataNumbers.`44100`
import typings.atTensorflowTfjsDashData.atTensorflowTfjsDashDataNumbers.`48000`
import typings.std.MediaTrackConstraints
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
    columnTruncateLength: Int | Double = null,
    fftSize: Int | Double = null,
    includeSpectrogram: js.UndefOr[Boolean] = js.undefined,
    includeWaveform: js.UndefOr[Boolean] = js.undefined,
    numFramesPerSpectrogram: Int | Double = null,
    sampleRateHz: `44100` | `48000` = null,
    smoothingTimeConstant: Int | Double = null
  ): MicrophoneConfig = {
    val __obj = js.Dynamic.literal()
    if (audioTrackConstraints != null) __obj.updateDynamic("audioTrackConstraints")(audioTrackConstraints.asInstanceOf[js.Any])
    if (columnTruncateLength != null) __obj.updateDynamic("columnTruncateLength")(columnTruncateLength.asInstanceOf[js.Any])
    if (fftSize != null) __obj.updateDynamic("fftSize")(fftSize.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSpectrogram)) __obj.updateDynamic("includeSpectrogram")(includeSpectrogram.asInstanceOf[js.Any])
    if (!js.isUndefined(includeWaveform)) __obj.updateDynamic("includeWaveform")(includeWaveform.asInstanceOf[js.Any])
    if (numFramesPerSpectrogram != null) __obj.updateDynamic("numFramesPerSpectrogram")(numFramesPerSpectrogram.asInstanceOf[js.Any])
    if (sampleRateHz != null) __obj.updateDynamic("sampleRateHz")(sampleRateHz.asInstanceOf[js.Any])
    if (smoothingTimeConstant != null) __obj.updateDynamic("smoothingTimeConstant")(smoothingTimeConstant.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicrophoneConfig]
  }
}

