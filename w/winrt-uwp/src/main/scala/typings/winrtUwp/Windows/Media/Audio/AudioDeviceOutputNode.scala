package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an audio device output node. */
@js.native
trait AudioDeviceOutputNode extends StObject {
  
  /** Closes the audio device output node. */
  def close(): Unit = js.native
  
  /** Gets or sets a value indicating if the audio device output node consumes input. */
  var consumeInput: Boolean = js.native
  
  /** Gets information about the audio device. */
  var device: DeviceInformation = js.native
  
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  
  /** Gets the list of effect definitions for the audio device output node. */
  var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
  
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  
  /** Gets the encoding properties for the audio device output node. */
  var encodingProperties: AudioEncodingProperties = js.native
  
  /** Gets or sets the outgoing gain for the audio device output node. */
  var outgoingGain: Double = js.native
  
  /** Resets the audio device output node. */
  def reset(): Unit = js.native
  
  /** Starts the audio device output node. */
  def start(): Unit = js.native
  
  /** Stops the audio device output node. */
  def stop(): Unit = js.native
}
object AudioDeviceOutputNode {
  
  @scala.inline
  def apply(
    close: () => Unit,
    consumeInput: Boolean,
    device: DeviceInformation,
    disableEffectsByDefinition: IAudioEffectDefinition => Unit,
    effectDefinitions: IVector[IAudioEffectDefinition],
    enableEffectsByDefinition: IAudioEffectDefinition => Unit,
    encodingProperties: AudioEncodingProperties,
    outgoingGain: Double,
    reset: () => Unit,
    start: () => Unit,
    stop: () => Unit
  ): AudioDeviceOutputNode = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), consumeInput = consumeInput.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], disableEffectsByDefinition = js.Any.fromFunction1(disableEffectsByDefinition), effectDefinitions = effectDefinitions.asInstanceOf[js.Any], enableEffectsByDefinition = js.Any.fromFunction1(enableEffectsByDefinition), encodingProperties = encodingProperties.asInstanceOf[js.Any], outgoingGain = outgoingGain.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[AudioDeviceOutputNode]
  }
  
  @scala.inline
  implicit class AudioDeviceOutputNodeMutableBuilder[Self <: AudioDeviceOutputNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConsumeInput(value: Boolean): Self = StObject.set(x, "consumeInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: DeviceInformation): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableEffectsByDefinition(value: IAudioEffectDefinition => Unit): Self = StObject.set(x, "disableEffectsByDefinition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEffectDefinitions(value: IVector[IAudioEffectDefinition]): Self = StObject.set(x, "effectDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEffectsByDefinition(value: IAudioEffectDefinition => Unit): Self = StObject.set(x, "enableEffectsByDefinition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodingProperties(value: AudioEncodingProperties): Self = StObject.set(x, "encodingProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingGain(value: Double): Self = StObject.set(x, "outgoingGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
