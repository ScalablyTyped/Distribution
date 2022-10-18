package typings.wavesurferJs

import typings.std.AudioContext
import typings.std.AudioNode
import typings.std.OfflineAudioContext
import typings.wavesurferJs.srcUtilObserverMod.default
import typings.wavesurferJs.typesParamsMod.WaveSurferParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBackendMod {
  
  /* note: abstract class */ @JSImport("wavesurfer.js/types/backend", "WebAudioBackend")
  @js.native
  open class WebAudioBackend protected () extends default {
    def this(params: WaveSurferParams) = this()
    
    /** Create analyser node to perform audio analysis. */
    def createAnalyserNode(): Unit = js.native
    
    /** Create ScriptProcessorNode to process audio. */
    def createScriptNode(): Unit = js.native
    
    /** Create the gain node needed to control the playback volume. */
    def createVolumeNode(): Unit = js.native
    
    /** This is called when wavesurfer is destroyed */
    def destroy(): Unit = js.native
    
    /** Destroy all references with WebAudio, disconnecting audio nodes and closing Audio Context. */
    def destroyWebAudio(): Unit = js.native
    
    /** Get the audio context used by this backend or create one. */
    def getAudioContext(): AudioContext = js.native
    
    /** Used by wavesurfer.getDuration(). */
    def getDuration(): Double = js.native
    
    /** Get the offline audio context used by this backend or create one. */
    def getOfflineAudioContext(sampleRate: Double): OfflineAudioContext = js.native
    
    /** Compute the max and min value of the waveform when broken into <length> subranges. */
    def getPeaks(length: Double, first: Double, last: Double): Peaks = js.native
    
    /** Returns the current playback rate. */
    def getPlaybackRate(): Double = js.native
    
    /** Get the position from 0 to 1. */
    def getPlayedPercents(): Double = js.native
    
    /** Get the playback position in seconds. */
    def getPlayedTime(): Double = js.native
    
    /** Get the current volume. */
    def getVolume(): Double = js.native
    
    /** Initialise the backend, called in wavesurfer.createBackend(). */
    def init(): Unit = js.native
    
    /** Used by wavesurfer.isPlaying() and wavesurfer.playPause(). */
    def isPaused(): Boolean = js.native
    
    /** Pauses the loaded audio. */
    def pause(): Unit = js.native
    
    /** Plays the loaded audio region. */
    def play(): Unit = js.native
    def play(start: Double): Unit = js.native
    def play(start: Double, end: Double): Unit = js.native
    def play(start: Unit, end: Double): Unit = js.native
    
    /** Unpacked setFilters(). */
    def setFilter(filters: AudioNode*): Unit = js.native
    
    /** Insert custom Web Audio nodes into the graph. */
    def setFilters(filters: js.Array[AudioNode]): Unit = js.native
    
    /** Set the rendered length (different from the length of the audio). */
    def setLength(length: Double): Unit = js.native
    
    /** Set pre-decoded peaks. */
    def setPeaks(peaks: Peaks): Unit = js.native
    def setPeaks(peaks: Peaks, duration: Double): Unit = js.native
    
    /** Set a point in seconds for playback to stop at. */
    def setPlayEnd(end: Double): Unit = js.native
    
    /** Set the audio source playback rate. */
    def setPlaybackRate(value: Double): Unit = js.native
    
    /** Set the sink id for the media player. */
    def setSinkId(deviceId: String): js.Promise[Unit] = js.native
    
    /** Set the audio volume. */
    def setVolume(value: Double): Unit = js.native
    
    /** Does the browser support this backend? */
    def supportsWebAudio(): Boolean = js.native
  }
  /* static members */
  object WebAudioBackend {
    
    @JSImport("wavesurfer.js/types/backend", "WebAudioBackend")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wavesurfer.js/types/backend", "WebAudioBackend.scriptBufferSize")
    @js.native
    def scriptBufferSize: Double = js.native
    inline def scriptBufferSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scriptBufferSize")(x.asInstanceOf[js.Any])
  }
  
  type Peaks = js.Array[js.Array[Double] | Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wavesurferJs.srcWebaudioMod.default
    - typings.wavesurferJs.srcMediaelementMod.default
    - typings.wavesurferJs.srcMediaelementWebaudioMod.default
  */
  trait WaveSurferBackend extends StObject
}
