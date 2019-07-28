package typings.winrtDashUwp.WindowsNs.MediaNs.EditingNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.IDirect3DSurface
import typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition
import typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs.IVideoEffectDefinition
import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingProperties
import typings.winrtDashUwp.WindowsNs.StorageNs.IStorageFile
import typings.winrtDashUwp.WindowsNs.UINs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single media object. */
@JSGlobal("Windows.Media.Editing.MediaClip")
@js.native
abstract class MediaClip () extends js.Object {
  /** Gets the list of audio effect definitions for processing the media clip. */
  var audioEffectDefinitions: IVector[IAudioEffectDefinition] = js.native
  /** The list of embedded audio tracks in this media clip. */
  var embeddedAudioTracks: IVectorView[EmbeddedAudioTrack] = js.native
  /** The time when the media clip stops playing within a MediaComposition . */
  var endTimeInComposition: Double = js.native
  /** Original playback time of the media clip, without the effects of TrimTimeFromStart and TrimTimeFromEnd properties. */
  var originalDuration: Double = js.native
  /** The index of the audio track within the media clip that is used for playback. */
  var selectedEmbeddedAudioTrackIndex: Double = js.native
  /** The time when the media clip starts playing within a MediaComposition . */
  var startTimeInComposition: Double = js.native
  /** The amount of time to trim from the end of the media clip. */
  var trimTimeFromEnd: Double = js.native
  /** The amount of time to trim from the beginning of the media clip. */
  var trimTimeFromStart: Double = js.native
  /** Duration of the media clip with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
  var trimmedDuration: Double = js.native
  /** An associative collection for storing custom properties associated with the media clip. */
  var userData: IMap[String, String] = js.native
  /** Gets the list of video effect definitions for processing the media clip. */
  var videoEffectDefinitions: IVector[IVideoEffectDefinition] = js.native
  /** Gets or sets the volume of the media clip. */
  var volume: Double = js.native
  /**
    * Gets the VideoEncodingProperties for the media clip.
    * @return The VideoEncodingProperties for the media clip.
    */
  def getVideoEncodingProperties(): VideoEncodingProperties = js.native
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
  def createFromColor(color: Color, originalDuration: Double): MediaClip = js.native
  /**
    * Creates a video clip from a video file.
    * @param file A StorageFile object representing the source video file.
    * @return A new media clip object containing a video clip of the video file.
    */
  def createFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[MediaClip] = js.native
  /**
    * Creates a video clip that displays a single image for a specified length of time.
    * @param file A StorageFile object representing the source image file.
    * @param originalDuration How long to display the image in the video clip.
    * @return A new media clip object containing the image-based video clip.
    */
  def createFromImageFileAsync(file: IStorageFile, originalDuration: Double): IPromiseWithIAsyncOperation[MediaClip] = js.native
  /**
    * Creates a video clip from a Direct3D surface.
    * @param surface The Direct3D surface.
    * @param originalDuration The initial duration of the created video clip.
    * @return A new media clip object containing the video clip.
    */
  def createFromSurface(surface: IDirect3DSurface, originalDuration: Double): MediaClip = js.native
}

