package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio file output node. */
@JSGlobal("Windows.Media.Audio.AudioFileOutputNode")
@js.native
abstract class AudioFileOutputNode () extends js.Object {
  /** Gets or sets a value indicating if the audio file output node consumes input. */
  var consumeInput: scala.Boolean = js.native
  /** Gets the list of effect definitions for the audio file output node. */
  var effectDefinitions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio file output node. */
  var encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
  /** Gets the file associated with the audio file output node. */
  var file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile = js.native
  /** Gets the file encoding profile supported by the audio file output node. */
  var fileEncodingProfile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
  /** Gets or sets the outgoing gain for the audio file output node. */
  var outgoingGain: scala.Double = js.native
  /** Closes the audio file output node. */
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
    * Finalizes the asynchronous operation of the audio file output node.
    * @return When this operation completes, a TranscodeFailureReason value is returned.
    */
  def finalizeAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason] = js.native
  /** Resets the audio file output node. */
  def reset(): scala.Unit = js.native
  /** Starts the audio file output node. */
  def start(): scala.Unit = js.native
  /** Stops the audio file output node. */
  def stop(): scala.Unit = js.native
}

