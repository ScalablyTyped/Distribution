package typings.winrtDashUwp.WindowsNs.MediaNs.EditingNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition
import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties
import typings.winrtDashUwp.WindowsNs.StorageNs.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single audio track for accompanying a video clip. */
@JSGlobal("Windows.Media.Editing.BackgroundAudioTrack")
@js.native
abstract class BackgroundAudioTrack () extends js.Object {
  /** Gets the list of audio effect definitions for processing the background audio track. */
  var audioEffectDefinitions: IVector[IAudioEffectDefinition] = js.native
  /** Specifies how long to wait before starting background audio playback. */
  var delay: Double = js.native
  /** Original playback time of the background audio track, without the effects of the TrimTimeFromStart and TrimTimeFromEnd properties. */
  var originalDuration: Double = js.native
  /** The amount of time to trim from the end of the background audio track. */
  var trimTimeFromEnd: Double = js.native
  /** The amount of time to trim from the beginning of the background audio track. */
  var trimTimeFromStart: Double = js.native
  /** Duration of the background audio track with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
  var trimmedDuration: Double = js.native
  /** An associative collection for storing custom properties associated with the background audio track. */
  var userData: IMap[String, String] = js.native
  /** Gets or sets the volume of the background audio track. */
  var volume: Double = js.native
  /**
    * Gets the AudioEncodingProperties for the background audio track.
    * @return The AudioEncodingProperties for the background audio track.
    */
  def getAudioEncodingProperties(): AudioEncodingProperties = js.native
}

/* static members */
@JSGlobal("Windows.Media.Editing.BackgroundAudioTrack")
@js.native
object BackgroundAudioTrack extends js.Object {
  /**
    * Creates a background audio track object with audio content copied from an embedded audio track object.
    * @param embeddedAudioTrack An embedded audio track to use as the source audio for the background audio track.
    * @return A new background audio track object containing audio content copied from the embedded audio track.
    */
  def createFromEmbeddedAudioTrack(embeddedAudioTrack: EmbeddedAudioTrack): BackgroundAudioTrack = js.native
  /**
    * Creates a background audio track from an audio file.
    * @param file A StorageFile object representing the source audio file.
    * @return A new background audio track object containing the contents of the audio file.
    */
  def createFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[BackgroundAudioTrack] = js.native
}

