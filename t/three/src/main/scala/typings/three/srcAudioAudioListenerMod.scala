package typings.three

import typings.std.AudioContext
import typings.std.AudioNode
import typings.std.GainNode
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAudioAudioListenerMod {
  
  @JSImport("three/src/audio/AudioListener", "AudioListener")
  @js.native
  /**
    * Create a new AudioListener.
    */
  open class AudioListener () extends Object3D[Event] {
    
    /**
      * The {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioContext | AudioContext} of the {@link {@link AudioListener} | listener} given in the constructor.
      */
    var context: AudioContext = js.native
    
    /**
      * @defaultValue `null`
      */
    var filter: AudioNode = js.native
    
    /**
      * A {@link https://developer.mozilla.org/en-US/docs/Web/API/GainNode | GainNode} created using
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioContext/createGain | AudioContext.createGain()}.
      */
    var gain: GainNode = js.native
    
    /**
      * Returns the value of the {@link AudioListener.filter | filter} property.
      */
    def getFilter(): AudioNode = js.native
    
    /**
      * Return the {@link AudioListener.gain | gainNode}.
      */
    def getInput(): GainNode = js.native
    
    /**
      * Return the volume.
      */
    def getMasterVolume(): Double = js.native
    
    /**
      * Set the {@link AudioListener.filter | filter} property to `null`.
      */
    def removeFilter(): this.type = js.native
    
    /**
      * Set the {@link AudioListener.filter | filter} property to `value`.
      * @param value
      */
    def setFilter(value: AudioNode): this.type = js.native
    
    /**
      * Set the volume.
      * @param value
      */
    def setMasterVolume(value: Double): this.type = js.native
    
    /**
      * Time delta value for audio entities. Use in context of {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/linearRampToValueAtTime | AudioParam.linearRampToValueAtTimeDefault()}.
      * @defaultValue `0`
      */
    var timeDelta: Double = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `AudioListener`
      */
    @JSName("type")
    val type_AudioListener: String | typings.three.threeStrings.AudioListener = js.native
  }
}
