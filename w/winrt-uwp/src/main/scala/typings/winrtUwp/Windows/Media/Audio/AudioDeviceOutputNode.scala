package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio device output node. */
trait AudioDeviceOutputNode extends js.Object {
  /** Gets or sets a value indicating if the audio device output node consumes input. */
  var consumeInput: Boolean
  /** Gets information about the audio device. */
  var device: DeviceInformation
  /** Gets the list of effect definitions for the audio device output node. */
  var effectDefinitions: IVector[IAudioEffectDefinition]
  /** Gets the encoding properties for the audio device output node. */
  var encodingProperties: AudioEncodingProperties
  /** Gets or sets the outgoing gain for the audio device output node. */
  var outgoingGain: Double
  /** Closes the audio device output node. */
  def close(): Unit
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit
  /** Resets the audio device output node. */
  def reset(): Unit
  /** Starts the audio device output node. */
  def start(): Unit
  /** Stops the audio device output node. */
  def stop(): Unit
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
}

