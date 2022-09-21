package typings.wavesurferJs

import typings.std.HTMLElement
import typings.std.HTMLMediaElement
import typings.wavesurferJs.backendMod.Peaks
import typings.wavesurferJs.backendMod.WaveSurferBackend
import typings.wavesurferJs.backendMod.WebAudioBackend
import typings.wavesurferJs.paramsMod.WaveSurferParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaelementMod {
  
  @JSImport("wavesurfer.js/src/mediaelement", JSImport.Default)
  @js.native
  open class default protected ()
    extends MediaElement
       with WaveSurferBackend {
    def this(params: WaveSurferParams) = this()
  }
  
  @js.native
  trait MediaElement extends WebAudioBackend {
    
    /** Create a timer to provide a more precise audioprocess event. */
    def createTimer(): Unit = js.native
    
    val destroyed: Boolean = js.native
    
    /** Returns the current time in seconds relative to the audio-clip's duration. */
    def getCurrentTime(): js.UndefOr[Double] = js.native
    
    /** Create media element with url as its source, and append to container element. */
    def load(url: String, container: HTMLElement, peaks: Peaks, preload: String): Unit = js.native
    
    /** Load existing media element. */
    def loadElt(elt: HTMLMediaElement, peaks: Peaks): Unit = js.native
    
    /** Used by wavesurfer.seekTo(). */
    def seekTo(start: Double): Unit = js.native
    
    /** Enable or disable muted audio. */
    def setMute(muted: Boolean): Unit = js.native
  }
}
