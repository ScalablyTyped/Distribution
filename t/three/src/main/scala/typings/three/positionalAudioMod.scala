package typings.three

import typings.std.PannerNode
import typings.three.audioListenerMod.AudioListener
import typings.three.audioMod.Audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionalAudioMod {
  
  @JSImport("three/src/audio/PositionalAudio", "PositionalAudio")
  @js.native
  class PositionalAudio protected () extends Audio[PannerNode] {
    def this(listener: AudioListener) = this()
    
    def getDistanceModel(): String = js.native
    
    def getMaxDistance(): Double = js.native
    
    def getRefDistance(): Double = js.native
    
    def getRolloffFactor(): Double = js.native
    
    var panner: PannerNode = js.native
    
    def setDirectionalCone(coneInnerAngle: Double, coneOuterAngle: Double, coneOuterGain: Double): this.type = js.native
    
    def setDistanceModel(value: String): this.type = js.native
    
    def setMaxDistance(value: Double): this.type = js.native
    
    def setRefDistance(value: Double): this.type = js.native
    
    def setRolloffFactor(value: Double): this.type = js.native
  }
}
