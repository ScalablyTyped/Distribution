package typings.tensorflowTfjsData

import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import typings.tensorflowTfjsData.anon.Spectrogram
import typings.tensorflowTfjsData.lazyIteratorMod.LazyIterator
import typings.tensorflowTfjsData.typesMod.MicrophoneConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object microphoneIteratorMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/iterators/microphone_iterator", "MicrophoneIterator")
  @js.native
  class MicrophoneIterator protected () extends LazyIterator[TensorContainer] {
    
    var analyser: js.Any = js.native
    
    var audioContext: js.Any = js.native
    
    val audioTrackConstraints: js.Any = js.native
    
    def capture(): js.Promise[Spectrogram] = js.native
    
    val columnTruncateLength: js.Any = js.native
    
    val fftSize: js.Any = js.native
    
    var flattenQueue: js.Any = js.native
    
    var freqData: js.Any = js.native
    
    var getAudioData: js.Any = js.native
    
    def getSampleRate(): Double = js.native
    
    var getTensorFromAudioDataArray: js.Any = js.native
    
    val includeSpectrogram: js.Any = js.native
    
    val includeWaveform: js.Any = js.native
    
    var isClosed: js.Any = js.native
    
    val microphoneConfig: MicrophoneConfig = js.native
    
    val numFrames: js.Any = js.native
    
    var sampleRateHz: js.Any = js.native
    
    val smoothingTimeConstant: js.Any = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): Unit = js.native
    
    var stream: js.Any = js.native
    
    var timeData: js.Any = js.native
  }
  /* static members */
  object MicrophoneIterator {
    
    @JSImport("@tensorflow/tfjs-data/dist/iterators/microphone_iterator", "MicrophoneIterator")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): js.Promise[MicrophoneIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[MicrophoneIterator]]
    @scala.inline
    def create(microphoneConfig: MicrophoneConfig): js.Promise[MicrophoneIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(microphoneConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MicrophoneIterator]]
  }
}
