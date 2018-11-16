package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio device output node. */
@JSGlobal("Windows.Media.Audio.AudioDeviceOutputNode")
@js.native
abstract class AudioDeviceOutputNode () extends js.Object {
  /** Gets or sets a value indicating if the audio device output node consumes input. */
  var consumeInput: scala.Boolean = js.native
  /** Gets information about the audio device. */
  var device: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation = js.native
  /** Gets the list of effect definitions for the audio device output node. */
  var effectDefinitions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio device output node. */
  var encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
  /** Gets or sets the outgoing gain for the audio device output node. */
  var outgoingGain: scala.Double = js.native
  /** Closes the audio device output node. */
  def close(): scala.Unit = js.native
  /**
                   * Disables all effects in the EffectDefinitions list with the specified effect definition.
                   * @param definition The effect definition of the effects to disable.
                   */
  def disableEffectsByDefinition(definition: winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition): scala.Unit = js.native
  /**
                   * Enables all effects in the EffectDefinitions list with the specified effect definition.
                   * @param definition The effect definition of the effects to enable.
                   */
  def enableEffectsByDefinition(definition: winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition): scala.Unit = js.native
  /** Resets the audio device output node. */
  def reset(): scala.Unit = js.native
  /** Starts the audio device output node. */
  def start(): scala.Unit = js.native
  /** Stops the audio device output node. */
  def stop(): scala.Unit = js.native
}

