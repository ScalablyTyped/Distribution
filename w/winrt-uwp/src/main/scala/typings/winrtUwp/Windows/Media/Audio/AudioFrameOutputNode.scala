package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Media.AudioFrame
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an audio frame output node. */
trait AudioFrameOutputNode extends StObject {
  
  /** Closes the audio frame output node. */
  def close(): Unit
  
  /** Gets or sets a value indicating if the audio frame output node consumes input. */
  var consumeInput: Boolean
  
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit
  
  /** Gets the list of effect definitions for the audio frame output node. */
  var effectDefinitions: IVector[IAudioEffectDefinition]
  
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit
  
  /** Gets the encoding properties for the audio frame output node. */
  var encodingProperties: AudioEncodingProperties
  
  /**
    * Gets an audio frame containing all of the data accumulated by this node since the previous call to GetFrame. If GetFrame has not yet been called, the audio frame will contain all of the data accumulated since the node was created.
    * @return An AudioFrame object representing the frame.
    */
  def getFrame(): AudioFrame
  
  /** Gets or sets the outgoing gain for the audio frame output node. */
  var outgoingGain: Double
  
  /** Resets the audio frame output node. */
  def reset(): Unit
  
  /** Starts the audio frame output node. */
  def start(): Unit
  
  /** Stops the audio frame output node. */
  def stop(): Unit
}
object AudioFrameOutputNode {
  
  inline def apply(
    close: () => Unit,
    consumeInput: Boolean,
    disableEffectsByDefinition: IAudioEffectDefinition => Unit,
    effectDefinitions: IVector[IAudioEffectDefinition],
    enableEffectsByDefinition: IAudioEffectDefinition => Unit,
    encodingProperties: AudioEncodingProperties,
    getFrame: () => AudioFrame,
    outgoingGain: Double,
    reset: () => Unit,
    start: () => Unit,
    stop: () => Unit
  ): AudioFrameOutputNode = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), consumeInput = consumeInput.asInstanceOf[js.Any], disableEffectsByDefinition = js.Any.fromFunction1(disableEffectsByDefinition), effectDefinitions = effectDefinitions.asInstanceOf[js.Any], enableEffectsByDefinition = js.Any.fromFunction1(enableEffectsByDefinition), encodingProperties = encodingProperties.asInstanceOf[js.Any], getFrame = js.Any.fromFunction0(getFrame), outgoingGain = outgoingGain.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[AudioFrameOutputNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioFrameOutputNode] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setConsumeInput(value: Boolean): Self = StObject.set(x, "consumeInput", value.asInstanceOf[js.Any])
    
    inline def setDisableEffectsByDefinition(value: IAudioEffectDefinition => Unit): Self = StObject.set(x, "disableEffectsByDefinition", js.Any.fromFunction1(value))
    
    inline def setEffectDefinitions(value: IVector[IAudioEffectDefinition]): Self = StObject.set(x, "effectDefinitions", value.asInstanceOf[js.Any])
    
    inline def setEnableEffectsByDefinition(value: IAudioEffectDefinition => Unit): Self = StObject.set(x, "enableEffectsByDefinition", js.Any.fromFunction1(value))
    
    inline def setEncodingProperties(value: AudioEncodingProperties): Self = StObject.set(x, "encodingProperties", value.asInstanceOf[js.Any])
    
    inline def setGetFrame(value: () => AudioFrame): Self = StObject.set(x, "getFrame", js.Any.fromFunction0(value))
    
    inline def setOutgoingGain(value: Double): Self = StObject.set(x, "outgoingGain", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
