package typings.atTensorflowTfjsDashData

import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
import typings.atTensorflowTfjsDashData.distIteratorsLazyUnderscoreIteratorMod.LazyIterator
import typings.atTensorflowTfjsDashData.distTypesMod.MicrophoneConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/microphone_iterator", JSImport.Namespace)
@js.native
object distIteratorsMicrophoneUnderscoreIteratorMod extends js.Object {
  @js.native
  class MicrophoneIterator protected () extends LazyIterator[TensorContainer] {
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
    val microphoneConfig: MicrophoneConfig = js.native
    val numFrames: js.Any = js.native
    var sampleRateHz: js.Any = js.native
    val smoothingTimeConstant: js.Any = js.native
    var stream: js.Any = js.native
    var timeData: js.Any = js.native
    def capture(): js.Promise[Anon_Spectrogram] = js.native
    def getSampleRate(): Double = js.native
    def start(): js.Promise[Unit] = js.native
    def stop(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MicrophoneIterator extends js.Object {
    def create(): js.Promise[MicrophoneIterator] = js.native
    def create(microphoneConfig: MicrophoneConfig): js.Promise[MicrophoneIterator] = js.native
  }
  
}

