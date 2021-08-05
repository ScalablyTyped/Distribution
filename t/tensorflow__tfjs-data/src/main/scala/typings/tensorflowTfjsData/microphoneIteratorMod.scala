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
  /* private */ class MicrophoneIterator () extends LazyIterator[TensorContainer] {
    
    /* private */ var analyser: js.Any = js.native
    
    /* private */ var audioContext: js.Any = js.native
    
    /* private */ val audioTrackConstraints: js.Any = js.native
    
    def capture(): js.Promise[Spectrogram] = js.native
    
    /* private */ val columnTruncateLength: js.Any = js.native
    
    /* private */ val fftSize: js.Any = js.native
    
    /* private */ var flattenQueue: js.Any = js.native
    
    /* private */ var freqData: js.Any = js.native
    
    /* private */ var getAudioData: js.Any = js.native
    
    def getSampleRate(): Double = js.native
    
    /* private */ var getTensorFromAudioDataArray: js.Any = js.native
    
    /* private */ val includeSpectrogram: js.Any = js.native
    
    /* private */ val includeWaveform: js.Any = js.native
    
    /* private */ var isClosed: js.Any = js.native
    
    /* protected */ val microphoneConfig: MicrophoneConfig = js.native
    
    /* private */ val numFrames: js.Any = js.native
    
    /* private */ var sampleRateHz: js.Any = js.native
    
    /* private */ val smoothingTimeConstant: js.Any = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): Unit = js.native
    
    /* private */ var stream: js.Any = js.native
    
    /* private */ var timeData: js.Any = js.native
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
