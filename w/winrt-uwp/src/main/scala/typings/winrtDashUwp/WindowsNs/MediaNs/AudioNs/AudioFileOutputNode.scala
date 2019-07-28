package typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition
import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties
import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile
import typings.winrtDashUwp.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason
import typings.winrtDashUwp.WindowsNs.StorageNs.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio file output node. */
@JSGlobal("Windows.Media.Audio.AudioFileOutputNode")
@js.native
abstract class AudioFileOutputNode () extends js.Object {
  /** Gets or sets a value indicating if the audio file output node consumes input. */
  var consumeInput: Boolean = js.native
  /** Gets the list of effect definitions for the audio file output node. */
  var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio file output node. */
  var encodingProperties: AudioEncodingProperties = js.native
  /** Gets the file associated with the audio file output node. */
  var file: IStorageFile = js.native
  /** Gets the file encoding profile supported by the audio file output node. */
  var fileEncodingProfile: MediaEncodingProfile = js.native
  /** Gets or sets the outgoing gain for the audio file output node. */
  var outgoingGain: Double = js.native
  /** Closes the audio file output node. */
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
    * Finalizes the asynchronous operation of the audio file output node.
    * @return When this operation completes, a TranscodeFailureReason value is returned.
    */
  def finalizeAsync(): IPromiseWithIAsyncOperation[TranscodeFailureReason] = js.native
  /** Resets the audio file output node. */
  def reset(): Unit = js.native
  /** Starts the audio file output node. */
  def start(): Unit = js.native
  /** Stops the audio file output node. */
  def stop(): Unit = js.native
}

