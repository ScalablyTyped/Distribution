package typings.wavesurferJs

import typings.std.AnalyserNode
import typings.std.AudioBuffer
import typings.std.AudioContext
import typings.std.GainNode
import typings.wavesurferJs.anon.End
import typings.wavesurferJs.typesBackendMod.WaveSurferBackend
import typings.wavesurferJs.typesBackendMod.WebAudioBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebaudioMod {
  
  @JSImport("wavesurfer.js/src/webaudio", JSImport.Default)
  @js.native
  open class default ()
    extends WebAudio
       with WaveSurferBackend
  
  @js.native
  trait WebAudio extends WebAudioBackend {
    
    val ac: AudioContext = js.native
    
    val analyser: AnalyserNode | Null = js.native
    
    val destroyed: Boolean = js.native
    
    val gainNode: GainNode | Null = js.native
    
    /** Returns the current time in seconds relative to the audio-clip's duration. */
    def getCurrentTime(): Double = js.native
    
    def load(buffer: AudioBuffer): Unit = js.native
    
    val scriptNode: Null = js.native
    
    def seekTo(start: Double, end: Double): End = js.native
  }
}
