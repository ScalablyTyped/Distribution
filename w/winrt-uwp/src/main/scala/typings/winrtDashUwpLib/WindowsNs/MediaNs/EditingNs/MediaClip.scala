package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EditingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single media object. */
@JSGlobal("Windows.Media.Editing.MediaClip")
@js.native
abstract class MediaClip () extends js.Object {
  /** Gets the list of audio effect definitions for processing the media clip. */
  var audioEffectDefinitions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition] = js.native
  /** The list of embedded audio tracks in this media clip. */
  var embeddedAudioTracks: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[EmbeddedAudioTrack] = js.native
  /** The time when the media clip stops playing within a MediaComposition . */
  var endTimeInComposition: scala.Double = js.native
  /** Original playback time of the media clip, without the effects of TrimTimeFromStart and TrimTimeFromEnd properties. */
  var originalDuration: scala.Double = js.native
  /** The index of the audio track within the media clip that is used for playback. */
  var selectedEmbeddedAudioTrackIndex: scala.Double = js.native
  /** The time when the media clip starts playing within a MediaComposition . */
  var startTimeInComposition: scala.Double = js.native
  /** The amount of time to trim from the end of the media clip. */
  var trimTimeFromEnd: scala.Double = js.native
  /** The amount of time to trim from the beginning of the media clip. */
  var trimTimeFromStart: scala.Double = js.native
  /** Duration of the media clip with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
  var trimmedDuration: scala.Double = js.native
  /** An associative collection for storing custom properties associated with the media clip. */
  var userData: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, java.lang.String] = js.native
  /** Gets the list of video effect definitions for processing the media clip. */
  var videoEffectDefinitions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IVideoEffectDefinition] = js.native
  /** Gets or sets the volume of the media clip. */
  var volume: scala.Double = js.native
  /**
    * Gets the VideoEncodingProperties for the media clip.
    * @return The VideoEncodingProperties for the media clip.
    */
  def getVideoEncodingProperties(): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingProperties = js.native
}

/* static members */
@JSGlobal("Windows.Media.Editing.MediaClip")
@js.native
object MediaClip extends js.Object {
  /**
    * Creates a solid color video clip that displays a single color for a specified length of time. Solid color video clips are typically used to create an explicit gap between video segments.
    * @param color The color to display in the video clip.
    * @param originalDuration How long to display the color in the video clip.
    * @return A new media clip object containing the color-based video clip.
    */
  def createFromColor(color: winrtDashUwpLib.WindowsNs.UINs.Color, originalDuration: scala.Double): winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.MediaClip = js.native
  /**
    * Creates a video clip from a video file.
    * @param file A StorageFile object representing the source video file.
    * @return A new media clip object containing a video clip of the video file.
    */
  def createFromFileAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.MediaClip] = js.native
  /**
    * Creates a video clip that displays a single image for a specified length of time.
    * @param file A StorageFile object representing the source image file.
    * @param originalDuration How long to display the image in the video clip.
    * @return A new media clip object containing the image-based video clip.
    */
  def createFromImageFileAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile, originalDuration: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.MediaClip] = js.native
  /**
    * Creates a video clip from a Direct3D surface.
    * @param surface The Direct3D surface.
    * @param originalDuration The initial duration of the created video clip.
    * @return A new media clip object containing the video clip.
    */
  def createFromSurface(
    surface: winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.IDirect3DSurface,
    originalDuration: scala.Double
  ): winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.MediaClip = js.native
}

