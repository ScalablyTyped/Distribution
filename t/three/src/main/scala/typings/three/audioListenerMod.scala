package typings.three

import typings.std.AudioContext
import typings.std.GainNode
import typings.three.object3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioListenerMod {
  
  @JSImport("three/src/audio/AudioListener", "AudioListener")
  @js.native
  class AudioListener () extends Object3D {
    
    var context: AudioContext = js.native
    
    /**
    	 * @default null
    	 */
    var filter: Null | js.Any = js.native
    
    var gain: GainNode = js.native
    
    def getFilter(): js.Any = js.native
    
    def getInput(): GainNode = js.native
    
    def getMasterVolume(): Double = js.native
    
    def removeFilter(): this.type = js.native
    
    def setFilter(value: js.Any): this.type = js.native
    
    def setMasterVolume(value: Double): this.type = js.native
    
    /**
    	 * @default 0
    	 */
    var timeDelta: Double = js.native
    
    @JSName("type")
    var type_AudioListener: typings.three.threeStrings.AudioListener = js.native
  }
}
