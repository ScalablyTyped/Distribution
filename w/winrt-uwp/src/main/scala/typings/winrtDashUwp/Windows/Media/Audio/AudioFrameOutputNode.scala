package typings.winrtDashUwp.Windows.Media.Audio

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Media.AudioFrame
import typings.winrtDashUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtDashUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio frame output node. */
@JSGlobal("Windows.Media.Audio.AudioFrameOutputNode")
@js.native
abstract class AudioFrameOutputNode () extends js.Object {
  /** Gets or sets a value indicating if the audio frame output node consumes input. */
  var consumeInput: Boolean = js.native
  /** Gets the list of effect definitions for the audio frame output node. */
  var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio frame output node. */
  var encodingProperties: AudioEncodingProperties = js.native
  /** Gets or sets the outgoing gain for the audio frame output node. */
  var outgoingGain: Double = js.native
  /** Closes the audio frame output node. */
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
  /**
    * Gets an audio frame containing all of the data accumulated by this node since the previous call to GetFrame. If GetFrame has not yet been called, the audio frame will contain all of the data accumulated since the node was created.
    * @return An AudioFrame object representing the frame.
    */
  def getFrame(): AudioFrame = js.native
  /** Resets the audio frame output node. */
  def reset(): Unit = js.native
  /** Starts the audio frame output node. */
  def start(): Unit = js.native
  /** Stops the audio frame output node. */
  def stop(): Unit = js.native
}

