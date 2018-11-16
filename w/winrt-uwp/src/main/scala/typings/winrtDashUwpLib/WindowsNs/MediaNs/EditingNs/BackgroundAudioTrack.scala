package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EditingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single audio track for accompanying a video clip. */
@JSGlobal("Windows.Media.Editing.BackgroundAudioTrack")
@js.native
abstract class BackgroundAudioTrack () extends js.Object {
  /** Gets the list of audio effect definitions for processing the background audio track. */
  var audioEffectDefinitions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition] = js.native
  /** Specifies how long to wait before starting background audio playback. */
  var delay: scala.Double = js.native
  /** Original playback time of the background audio track, without the effects of the TrimTimeFromStart and TrimTimeFromEnd properties. */
  var originalDuration: scala.Double = js.native
  /** The amount of time to trim from the end of the background audio track. */
  var trimTimeFromEnd: scala.Double = js.native
  /** The amount of time to trim from the beginning of the background audio track. */
  var trimTimeFromStart: scala.Double = js.native
  /** Duration of the background audio track with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
  var trimmedDuration: scala.Double = js.native
  /** An associative collection for storing custom properties associated with the background audio track. */
  var userData: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, java.lang.String] = js.native
  /** Gets or sets the volume of the background audio track. */
  var volume: scala.Double = js.native
  /**
                   * Gets the AudioEncodingProperties for the background audio track.
                   * @return The AudioEncodingProperties for the background audio track.
                   */
  def getAudioEncodingProperties(): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
}

/** Represents a single audio track for accompanying a video clip. */
@JSGlobal("Windows.Media.Editing.BackgroundAudioTrack")
@js.native
object BackgroundAudioTrack extends js.Object {
  /**
                   * Creates a background audio track object with audio content copied from an embedded audio track object.
                   * @param embeddedAudioTrack An embedded audio track to use as the source audio for the background audio track.
                   * @return A new background audio track object containing audio content copied from the embedded audio track.
                   */
  def createFromEmbeddedAudioTrack(embeddedAudioTrack: winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.EmbeddedAudioTrack): winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.BackgroundAudioTrack = js.native
  /**
                   * Creates a background audio track from an audio file.
                   * @param file A StorageFile object representing the source audio file.
                   * @return A new background audio track object containing the contents of the audio file.
                   */
  def createFromFileAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.BackgroundAudioTrack] = js.native
}

