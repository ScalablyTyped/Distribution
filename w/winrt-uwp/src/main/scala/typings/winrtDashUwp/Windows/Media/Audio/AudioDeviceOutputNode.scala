package typings.winrtDashUwp.Windows.Media.Audio

import typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtDashUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio device output node. */
@JSGlobal("Windows.Media.Audio.AudioDeviceOutputNode")
@js.native
abstract class AudioDeviceOutputNode () extends js.Object {
  /** Gets or sets a value indicating if the audio device output node consumes input. */
  var consumeInput: Boolean = js.native
  /** Gets information about the audio device. */
  var device: DeviceInformation = js.native
  /** Gets the list of effect definitions for the audio device output node. */
  var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio device output node. */
  var encodingProperties: AudioEncodingProperties = js.native
  /** Gets or sets the outgoing gain for the audio device output node. */
  var outgoingGain: Double = js.native
  /** Closes the audio device output node. */
  def close(): Unit = js.native
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /** Resets the audio device output node. */
  def reset(): Unit = js.native
  /** Starts the audio device output node. */
  def start(): Unit = js.native
  /** Stops the audio device output node. */
  def stop(): Unit = js.native
}

