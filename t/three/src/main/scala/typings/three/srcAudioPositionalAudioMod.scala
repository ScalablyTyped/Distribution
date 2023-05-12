package typings.three

import typings.std.PannerNode
import typings.three.srcAudioAudioListenerMod.AudioListener
import typings.three.srcAudioAudioMod.Audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAudioPositionalAudioMod {
  
  @JSImport("three/src/audio/PositionalAudio", "PositionalAudio")
  @js.native
  open class PositionalAudio protected () extends Audio[PannerNode] {
    /**
      * Create a new instance of {@link PositionalAudio}
      * @param listener (required) {@link AudioListener | AudioListener} instance.
      */
    def this(listener: AudioListener) = this()
    
    /**
      * Returns the value of {@link https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/distanceModel | panner.distanceModel}.
      */
    def getDistanceModel(): String = js.native
    
    /**
      * Returns the value of {@link https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/maxDistance | panner.maxDistance}.
      */
    def getMaxDistance(): Double = js.native
    
    /**
      * Returns the value of {@link https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/refDistance | panner.refDistance}.
      */
    def getRefDistance(): Double = js.native
    
    /**
      * Returns the value of {@link https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/rolloffFactor | panner.rolloffFactor}.
      */
    def getRolloffFactor(): Double = js.native
    
    /**
      * The PositionalAudio's {@link https://developer.mozilla.org/en-US/docs/Web/API/PannerNode | PannerNode}.
      */
    var panner: PannerNode = js.native
    
    /**
      * This method can be used in order to transform an omnidirectional sound into a {@link https://developer.mozilla.org/en-US/docs/Web/API/PannerNode | directional sound}.
      * @param coneInnerAngle Expects a `Float`
      * @param coneOuterAngle Expects a `Float`
      * @param coneOuterGain Expects a `Float`
      */
    def setDirectionalCone(coneInnerAngle: Double, coneOuterAngle: Double, coneOuterGain: Double): this.type = js.native
    
    /**
      * Sets the value of {@link https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/distanceModel | panner.distanceModel}.
      * @param value
      */
    def setDistanceModel(value: String): this.type = js.native
    
    /**
      * Sets the value of {@link https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/maxDistance | panner.maxDistance}.
      * @param value Expects a `Float`
      */
    def setMaxDistance(value: Double): this.type = js.native
    
    /**
      * Sets the value of {@link https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/refDistance | panner.refDistance}.
      * @param value Expects a `Float`
      */
    def setRefDistance(value: Double): this.type = js.native
    
    /**
      * Sets the value of {@link https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/rolloffFactor | panner.rolloffFactor}.
      * @param value Expects a `Float`
      */
    def setRolloffFactor(value: Double): this.type = js.native
  }
}
