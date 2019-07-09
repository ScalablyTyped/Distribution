package typings
package atTensorflowTfjsDashDataLib.distIteratorsMicrophoneUnderscoreIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/microphone_iterator", "MicrophoneIterator")
@js.native
class MicrophoneIterator protected ()
  extends atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod.LazyIterator[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer] {
  var analyser: js.Any = js.native
  var audioContext: js.Any = js.native
  val audioTrackConstraints: js.Any = js.native
  val columnTruncateLength: js.Any = js.native
  val fftSize: js.Any = js.native
  var flattenQueue: js.Any = js.native
  var freqData: js.Any = js.native
  var getAudioData: js.Any = js.native
  var getTensorFromAudioDataArray: js.Any = js.native
  val includeSpectrogram: js.Any = js.native
  val includeWaveform: js.Any = js.native
  var isClosed: js.Any = js.native
  val microphoneConfig: atTensorflowTfjsDashDataLib.distTypesMod.MicrophoneConfig = js.native
  val numFrames: js.Any = js.native
  var sampleRateHz: js.Any = js.native
  val smoothingTimeConstant: js.Any = js.native
  var stream: js.Any = js.native
  var timeData: js.Any = js.native
  def capture(): js.Promise[atTensorflowTfjsDashDataLib.Anon_Spectrogram] = js.native
  def getSampleRate(): scala.Double = js.native
  def start(): js.Promise[scala.Unit] = js.native
  def stop(): scala.Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-data/dist/iterators/microphone_iterator", "MicrophoneIterator")
@js.native
object MicrophoneIterator extends js.Object {
  def create(): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsMicrophoneUnderscoreIteratorMod.MicrophoneIterator
  ] = js.native
  def create(microphoneConfig: atTensorflowTfjsDashDataLib.distTypesMod.MicrophoneConfig): js.Promise[
    atTensorflowTfjsDashDataLib.distIteratorsMicrophoneUnderscoreIteratorMod.MicrophoneIterator
  ] = js.native
}

