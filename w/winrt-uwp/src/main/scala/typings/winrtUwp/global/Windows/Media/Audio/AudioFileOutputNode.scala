package typings.winrtUwp.global.Windows.Media.Audio

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
@JSGlobal("Windows.Media.Audio.AudioFileOutputNode")
@js.native
abstract class AudioFileOutputNode ()
  extends typings.winrtUwp.Windows.Media.Audio.AudioFileOutputNode {
  /** Gets or sets a value indicating if the audio file output node consumes input. */
  /* CompleteClass */
  override var consumeInput: Boolean = js.native
  /** Gets the list of effect definitions for the audio file output node. */
  /* CompleteClass */
  override var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio file output node. */
  /* CompleteClass */
  override var encodingProperties: AudioEncodingProperties = js.native
  /** Gets the file associated with the audio file output node. */
  /* CompleteClass */
  override var file: IStorageFile = js.native
  /** Gets the file encoding profile supported by the audio file output node. */
  /* CompleteClass */
  override var fileEncodingProfile: MediaEncodingProfile = js.native
  /** Gets or sets the outgoing gain for the audio file output node. */
  /* CompleteClass */
  override var outgoingGain: Double = js.native
  /** Closes the audio file output node. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  /* CompleteClass */
  override def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  /* CompleteClass */
  override def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /**
    * Finalizes the asynchronous operation of the audio file output node.
    * @return When this operation completes, a TranscodeFailureReason value is returned.
    */
  /* CompleteClass */
  override def finalizeAsync(): IPromiseWithIAsyncOperation[TranscodeFailureReason] = js.native
  /** Resets the audio file output node. */
  /* CompleteClass */
  override def reset(): Unit = js.native
  /** Starts the audio file output node. */
  /* CompleteClass */
  override def start(): Unit = js.native
  /** Stops the audio file output node. */
  /* CompleteClass */
  override def stop(): Unit = js.native
}

