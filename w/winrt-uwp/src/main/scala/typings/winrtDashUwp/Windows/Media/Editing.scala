package typings.winrtDashUwp.Windows.Media

import typings.winrtDashUwp.Windows.Foundation.Collections.IIterable
import typings.winrtDashUwp.Windows.Foundation.Collections.IMap
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.Windows.Foundation.Rect
import typings.winrtDashUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typings.winrtDashUwp.Windows.Graphics.Imaging.ImageStream
import typings.winrtDashUwp.Windows.Media.Core.MediaStreamSource
import typings.winrtDashUwp.Windows.Media.Editing.BackgroundAudioTrack
import typings.winrtDashUwp.Windows.Media.Editing.EmbeddedAudioTrack
import typings.winrtDashUwp.Windows.Media.Editing.MediaClip
import typings.winrtDashUwp.Windows.Media.Editing.MediaComposition
import typings.winrtDashUwp.Windows.Media.Editing.MediaOverlay
import typings.winrtDashUwp.Windows.Media.Editing.MediaOverlayLayer
import typings.winrtDashUwp.Windows.Media.Editing.MediaTrimmingPreference
import typings.winrtDashUwp.Windows.Media.Editing.VideoFramePrecision
import typings.winrtDashUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtDashUwp.Windows.Media.Effects.IVideoCompositorDefinition
import typings.winrtDashUwp.Windows.Media.Effects.IVideoEffectDefinition
import typings.winrtDashUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import typings.winrtDashUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import typings.winrtDashUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import typings.winrtDashUwp.Windows.Media.Transcoding.TranscodeFailureReason
import typings.winrtDashUwp.Windows.Storage.IStorageFile
import typings.winrtDashUwp.Windows.Storage.StorageFile
import typings.winrtDashUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for editing, previewing, and saving edited media clips. */
@JSGlobal("Windows.Media.Editing")
@js.native
object Editing extends js.Object {
  /** Represents a single audio track for accompanying a video clip. */
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
  
  /** Represents an audio track embedded in the media clip. */
  @js.native
  abstract class EmbeddedAudioTrack () extends js.Object {
    /**
      * Gets the AudioEncodingProperties for the embedded audio track.
      * @return The AudioEncodingProperties for the embedded audio track.
      */
    def getAudioEncodingProperties(): AudioEncodingProperties = js.native
  }
  
  /** Represents a single media object. */
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
  
  /** Represents a collection of media clips and background audio tracks. */
  @js.native
  /** Initializes a new instance of the MediaComposition class. */
  class MediaComposition () extends js.Object {
    /** A collection of background audio tracks for playback in the media composition. */
    var backgroundAudioTracks: IVector[BackgroundAudioTrack] = js.native
    /** A collection of media clips for playback in the media composition. */
    var clips: IVector[MediaClip] = js.native
    /** The total playback time of the media composition. */
    var duration: Double = js.native
    /** Gets the list of overlay layers for the media composition. */
    var overlayLayers: IVector[MediaOverlayLayer] = js.native
    /** An associative collection for storing custom properties associated with the media composition. */
    var userData: IMap[String, String] = js.native
    /**
      * Create a new default media encoding profile which can be modified if necessary.
      * @return The newly created MediaEncodingProfile .
      */
    def createDefaultEncodingProfile(): MediaEncodingProfile = js.native
    /**
      * Creates a new MediaStreamSource .
      * @return The newly created MediaStreamSource .
      */
    def generateMediaStreamSource(): MediaStreamSource = js.native
    /**
      * Creates a new MediaStreamSource using the specified MediaEncodingProfile .
      * @param encodingProfile The MediaEncodingProfile used to specify the encoding properties of the new MediaStreamSource .
      * @return The newly created MediaStreamSource .
      */
    def generateMediaStreamSource(encodingProfile: MediaEncodingProfile): MediaStreamSource = js.native
    /**
      * Creates a new MediaStreamSource used to preview the edited media.
      * @param scaledWidth The width of the preview media.
      * @param scaledHeight The height of the preview media.
      * @return The new MediaStreamSource used to preview the edited media.
      */
    def generatePreviewMediaStreamSource(scaledWidth: Double, scaledHeight: Double): MediaStreamSource = js.native
    /**
      * Asynchronously gets an image stream that represents a thumbnail of the media composition.
      * @param timeFromStart Specifies the point in the timeline of the MediaComposition from which to render the thumbnail, offset from the start of the MediaComposition.
      * @param scaledWidth Specifies the target width at which to render. The default is 0. scaledWidth and/or scaledHeight can be optional; see Remarks.
      * @param scaledHeight Specifies the target height at which to render. The default is 0. scaledWidth and/or scaledHeight can be optional; see Remarks.
      * @param framePrecision Specifies the frame precision algorithm to use when retrieving the thumbnail.
      * @return An image stream representing resulting thumbnail.
      */
    def getThumbnailAsync(
      timeFromStart: Double,
      scaledWidth: Double,
      scaledHeight: Double,
      framePrecision: VideoFramePrecision
    ): IPromiseWithIAsyncOperation[ImageStream] = js.native
    /**
      * Asynchronously gets a vector view of thumbnails of the media composition.
      * @param timesFromStart Specifies the points in the timeline of the MediaComposition from which to render the thumbnails, offset from the start of the MediaComposition.
      * @param scaledWidth Specifies the target width at which to render. The default is 0. scaledWidth and/or scaledHeight can be optional; see Remarks.
      * @param scaledHeight Specifies the target height at which to render. The default is 0. scaledWidth and/or scaledHeight can be optional; see Remarks.
      * @param framePrecision Specifies the frame precision algorithm to use when retrieving the thumbnails.
      * @return A vector view on the resulting thumbnails.
      */
    def getThumbnailsAsync(
      timesFromStart: IIterable[Double],
      scaledWidth: Double,
      scaledHeight: Double,
      framePrecision: VideoFramePrecision
    ): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Asynchronously renders the MediaComposition to the specified file.
      * @param destination The file to which this MediaComposition is rendered.
      * @return An async operation which can be used to track the success or failure of the operation.
      */
    def renderToFileAsync(destination: IStorageFile): IPromiseWithIAsyncOperationWithProgress[TranscodeFailureReason, Double] = js.native
    /**
      * Asynchronously renders the MediaComposition to a specified file using the indicated media trimming preference.
      * @param destination The file to which this MediaComposition is rendered.
      * @param trimmingPreference Specifies whether to be fast or precise when trimming the media.
      * @return An async operation which can be used to track the success or failure of the operation.
      */
    def renderToFileAsync(destination: IStorageFile, trimmingPreference: MediaTrimmingPreference): IPromiseWithIAsyncOperationWithProgress[TranscodeFailureReason, Double] = js.native
    /**
      * Asynchronously renders the MediaComposition to a specified file using the indicated media trimming preference and encoding profile.
      * @param destination The file to which this MediaComposition is rendered.
      * @param trimmingPreference Specifies whether to be fast or precise when trimming the media.
      * @param encodingProfile Specifies the encoding profile to use for rendering the media.
      * @return An async operation which can be used to track the success or failure of the operation.
      */
    def renderToFileAsync(
      destination: IStorageFile,
      trimmingPreference: MediaTrimmingPreference,
      encodingProfile: MediaEncodingProfile
    ): IPromiseWithIAsyncOperationWithProgress[TranscodeFailureReason, Double] = js.native
    /**
      * Asynchronously serializes the MediaComposition to disk so that it can be loaded and modified in the future.
      * @param file The file to which the MediaComposition is saved.
      * @return An async action which can be used to track the success or failure of the operation.
      */
    def saveAsync(file: IStorageFile): IPromiseWithIAsyncAction = js.native
  }
  
  /** Represents an overlay that can be used in a media composition. */
  @js.native
  class MediaOverlay protected () extends js.Object {
    /**
      * Initializes a new instance of the MediaOverlay class.
      * @param clip The media clip to be used for the overlay.
      */
    def this(clip: MediaClip) = this()
    /**
      * Initializes a new instance of the MediaOverlay class.
      * @param clip The media clip to be used for the overlay.
      * @param position The position of the overlay.
      * @param opacity The opacity of the overlay, in the range of 0.0 to 1.0, where 0.0 is completely transparent and 1.0 is completely opaque.
      */
    def this(clip: MediaClip, position: Rect, opacity: Double) = this()
    /** Gets or sets a value indicating whether audio is enabled for the MediaOverlay . */
    var audioEnabled: Boolean = js.native
    /** Gets the media clip to be used for the overlay. */
    var clip: MediaClip = js.native
    /** Gets or sets the time span from the start of the clip after which the media overlay should be rendered. */
    var delay: Double = js.native
    /** Gets the opacity of the overlay. */
    var opacity: Double = js.native
    /** Gets the position of the overlay. */
    var position: Rect = js.native
  }
  
  /** Represents a layer of a media overlay. */
  @js.native
  /** Initializes a new instance of the MediaOverlayLayer class. */
  class MediaOverlayLayer () extends js.Object {
    /**
      * Initializes a new instance of the MediaOverlayLayer class.
      * @param compositorDefinition The definition of the custom compositor associated with the media overlay layer.
      */
    def this(compositorDefinition: IVideoCompositorDefinition) = this()
    /** Gets the definition of the custom compositor associated with the media overlay layer, if there is one. */
    var customCompositorDefinition: IVideoCompositorDefinition = js.native
    /** Gets the list of overlays for this media overlay layer. */
    var overlays: IVector[MediaOverlay] = js.native
  }
  
  @js.native
  sealed trait MediaTrimmingPreference extends js.Object
  
  @js.native
  sealed trait VideoFramePrecision extends js.Object
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
  @js.native
  object MediaComposition extends js.Object {
    /**
      * Asynchronously loads a MediaComposition from a StorageFile .
      * @param file The file from which to load the MediaComposition .
      * @return An async operation which can be used to track the success or failure of the operation.
      */
    def loadAsync(file: StorageFile): IPromiseWithIAsyncOperation[MediaComposition] = js.native
  }
  
  /** Used to specify if media trimming should use a faster or a more precise algorithm during transcoding. */
  @js.native
  object MediaTrimmingPreference extends js.Object {
    /** Use the faster trimming algorithm during transcoding. */
    @js.native
    sealed trait fast extends MediaTrimmingPreference
    
    /** Use the more precise trimming algorithm during transcoding. */
    @js.native
    sealed trait precise extends MediaTrimmingPreference
    
    /* 0 */ val fast: typings.winrtDashUwp.Windows.Media.Editing.MediaTrimmingPreference.fast with Double = js.native
    /* 1 */ val precise: typings.winrtDashUwp.Windows.Media.Editing.MediaTrimmingPreference.precise with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MediaTrimmingPreference with Double] = js.native
  }
  
  /** Used to specify the frame precision algorithm when retrieving a thumbnail. */
  @js.native
  object VideoFramePrecision extends js.Object {
    /** Use a more precise algorithm to get a thumbnail to the nearest frame. */
    @js.native
    sealed trait nearestFrame extends VideoFramePrecision
    
    /** Use a faster but less precise algorithm to get the thumbnail. */
    @js.native
    sealed trait nearestKeyFrame extends VideoFramePrecision
    
    /* 0 */ val nearestFrame: typings.winrtDashUwp.Windows.Media.Editing.VideoFramePrecision.nearestFrame with Double = js.native
    /* 1 */ val nearestKeyFrame: typings.winrtDashUwp.Windows.Media.Editing.VideoFramePrecision.nearestKeyFrame with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VideoFramePrecision with Double] = js.native
  }
  
}

