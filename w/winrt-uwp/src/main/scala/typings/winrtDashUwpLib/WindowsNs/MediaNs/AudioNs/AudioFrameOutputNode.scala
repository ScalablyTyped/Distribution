package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio frame output node. */
@JSGlobal("Windows.Media.Audio.AudioFrameOutputNode")
@js.native
abstract class AudioFrameOutputNode () extends js.Object {
  /** Gets or sets a value indicating if the audio frame output node consumes input. */
  var consumeInput: scala.Boolean = js.native
  /** Gets the list of effect definitions for the audio frame output node. */
  var effectDefinitions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio frame output node. */
  var encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
  /** Gets or sets the outgoing gain for the audio frame output node. */
  var outgoingGain: scala.Double = js.native
  /** Closes the audio frame output node. */
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
  /**
    * Gets an audio frame containing all of the data accumulated by this node since the previous call to GetFrame. If GetFrame has not yet been called, the audio frame will contain all of the data accumulated since the node was created.
    * @return An AudioFrame object representing the frame.
    */
  def getFrame(): winrtDashUwpLib.WindowsNs.MediaNs.AudioFrame = js.native
  /** Resets the audio frame output node. */
  def reset(): scala.Unit = js.native
  /** Starts the audio frame output node. */
  def start(): scala.Unit = js.native
  /** Stops the audio frame output node. */
  def stop(): scala.Unit = js.native
}

