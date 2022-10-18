package typings.tensorflowTfjsData

import typings.tensorflowTfjsCore.distTensorTypesMod.TensorContainer
import typings.tensorflowTfjsData.anon.Spectrogram
import typings.tensorflowTfjsData.distIteratorsLazyIteratorMod.LazyIterator
import typings.tensorflowTfjsData.distTypesMod.MicrophoneConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIteratorsMicrophoneIteratorMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/iterators/microphone_iterator", "MicrophoneIterator")
  @js.native
  /* private */ open class MicrophoneIterator () extends LazyIterator[TensorContainer] {
    
    /* private */ var analyser: Any = js.native
    
    /* private */ var audioContext: Any = js.native
    
    /* private */ val audioTrackConstraints: Any = js.native
    
    def capture(): js.Promise[Spectrogram] = js.native
    
    /* private */ val columnTruncateLength: Any = js.native
    
    /* private */ val fftSize: Any = js.native
    
    /* private */ var flattenQueue: Any = js.native
    
    /* private */ var freqData: Any = js.native
    
    /* private */ var getAudioData: Any = js.native
    
    def getSampleRate(): Double = js.native
    
    /* private */ var getTensorFromAudioDataArray: Any = js.native
    
    /* private */ val includeSpectrogram: Any = js.native
    
    /* private */ val includeWaveform: Any = js.native
    
    /* private */ var isClosed: Any = js.native
    
    /* protected */ val microphoneConfig: MicrophoneConfig = js.native
    
    /* private */ val numFrames: Any = js.native
    
    /* private */ var sampleRateHz: Any = js.native
    
    /* private */ val smoothingTimeConstant: Any = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): Unit = js.native
    
    /* private */ var stream: Any = js.native
    
    /* private */ var timeData: Any = js.native
  }
  /* static members */
  object MicrophoneIterator {
    
    @JSImport("@tensorflow/tfjs-data/dist/iterators/microphone_iterator", "MicrophoneIterator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): js.Promise[MicrophoneIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[MicrophoneIterator]]
    inline def create(microphoneConfig: MicrophoneConfig): js.Promise[MicrophoneIterator] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(microphoneConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MicrophoneIterator]]
  }
}
