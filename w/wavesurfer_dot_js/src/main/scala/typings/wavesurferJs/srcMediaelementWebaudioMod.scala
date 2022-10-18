package typings.wavesurferJs

import typings.std.HTMLMediaElement
import typings.wavesurferJs.typesParamsMod.WaveSurferParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMediaelementWebaudioMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.wavesurferJs.typesBackendMod.WaveSurferBackend because Already inherited */ @JSImport("wavesurfer.js/src/mediaelement-webaudio", JSImport.Default)
  @js.native
  open class default protected () extends MediaElementWebAudio {
    def this(params: WaveSurferParams) = this()
  }
  
  @js.native
  trait MediaElementWebAudio
    extends typings.wavesurferJs.srcMediaelementMod.default {
    
    def createMediaElementSource(mediaElement: HTMLMediaElement): Unit = js.native
  }
}
