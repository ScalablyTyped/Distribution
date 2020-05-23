package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason
import typings.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio file output node. */
trait AudioFileOutputNode extends js.Object {
  /** Gets or sets a value indicating if the audio file output node consumes input. */
  var consumeInput: Boolean
  /** Gets the list of effect definitions for the audio file output node. */
  var effectDefinitions: IVector[IAudioEffectDefinition]
  /** Gets the encoding properties for the audio file output node. */
  var encodingProperties: AudioEncodingProperties
  /** Gets the file associated with the audio file output node. */
  var file: IStorageFile
  /** Gets the file encoding profile supported by the audio file output node. */
  var fileEncodingProfile: MediaEncodingProfile
  /** Gets or sets the outgoing gain for the audio file output node. */
  var outgoingGain: Double
  /** Closes the audio file output node. */
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
  /**
    * Finalizes the asynchronous operation of the audio file output node.
    * @return When this operation completes, a TranscodeFailureReason value is returned.
    */
  def finalizeAsync(): IPromiseWithIAsyncOperation[TranscodeFailureReason]
  /** Resets the audio file output node. */
  def reset(): Unit
  /** Starts the audio file output node. */
  def start(): Unit
  /** Stops the audio file output node. */
  def stop(): Unit
}

object AudioFileOutputNode {
  @scala.inline
  def apply(
    close: () => Unit,
    consumeInput: Boolean,
    disableEffectsByDefinition: IAudioEffectDefinition => Unit,
    effectDefinitions: IVector[IAudioEffectDefinition],
    enableEffectsByDefinition: IAudioEffectDefinition => Unit,
    encodingProperties: AudioEncodingProperties,
    file: IStorageFile,
    fileEncodingProfile: MediaEncodingProfile,
    finalizeAsync: () => IPromiseWithIAsyncOperation[TranscodeFailureReason],
    outgoingGain: Double,
    reset: () => Unit,
    start: () => Unit,
    stop: () => Unit
  ): AudioFileOutputNode = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), consumeInput = consumeInput.asInstanceOf[js.Any], disableEffectsByDefinition = js.Any.fromFunction1(disableEffectsByDefinition), effectDefinitions = effectDefinitions.asInstanceOf[js.Any], enableEffectsByDefinition = js.Any.fromFunction1(enableEffectsByDefinition), encodingProperties = encodingProperties.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileEncodingProfile = fileEncodingProfile.asInstanceOf[js.Any], finalizeAsync = js.Any.fromFunction0(finalizeAsync), outgoingGain = outgoingGain.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[AudioFileOutputNode]
  }
}

