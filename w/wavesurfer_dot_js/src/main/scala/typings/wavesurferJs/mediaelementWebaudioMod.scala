package typings.wavesurferJs

import typings.std.HTMLMediaElement
import typings.wavesurferJs.paramsMod.WaveSurferParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaelementWebaudioMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.wavesurferJs.backendMod.WaveSurferBackend because Already inherited */ @JSImport("wavesurfer.js/src/mediaelement-webaudio", JSImport.Default)
  @js.native
  open class default protected () extends MediaElementWebAudio {
    def this(params: WaveSurferParams) = this()
  }
  
  @js.native
  trait MediaElementWebAudio
    extends typings.wavesurferJs.mediaelementMod.default {
    
    def createMediaElementSource(mediaElement: HTMLMediaElement): Unit = js.native
  }
}
