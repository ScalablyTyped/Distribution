package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.Effects.IVideoCompositorDefinition
import typings.winrtUwp.Windows.Media.Effects.IVideoEffectDefinition
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for editing, previewing, and saving edited media clips. */
@JSGlobal("Windows.Media.Editing")
@js.native
object Editing extends js.Object {
  /** Represents a single audio track for accompanying a video clip. */
  @js.native
  abstract class BackgroundAudioTrack ()
    extends typings.winrtUwp.Windows.Media.Editing.BackgroundAudioTrack {
    /** Gets the list of audio effect definitions for processing the background audio track. */
    /* CompleteClass */
    override var audioEffectDefinitions: IVector[IAudioEffectDefinition] = js.native
    /** Specifies how long to wait before starting background audio playback. */
    /* CompleteClass */
    override var delay: Double = js.native
    /** Original playback time of the background audio track, without the effects of the TrimTimeFromStart and TrimTimeFromEnd properties. */
    /* CompleteClass */
    override var originalDuration: Double = js.native
    /** The amount of time to trim from the end of the background audio track. */
    /* CompleteClass */
    override var trimTimeFromEnd: Double = js.native
    /** The amount of time to trim from the beginning of the background audio track. */
    /* CompleteClass */
    override var trimTimeFromStart: Double = js.native
    /** Duration of the background audio track with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
    /* CompleteClass */
    override var trimmedDuration: Double = js.native
    /** An associative collection for storing custom properties associated with the background audio track. */
    /* CompleteClass */
    override var userData: IMap[String, String] = js.native
    /** Gets or sets the volume of the background audio track. */
    /* CompleteClass */
    override var volume: Double = js.native
    /**
      * Gets the AudioEncodingProperties for the background audio track.
      * @return The AudioEncodingProperties for the background audio track.
      */
    /* CompleteClass */
    override def getAudioEncodingProperties(): AudioEncodingProperties = js.native
  }
  
  /** Represents an audio track embedded in the media clip. */
  @js.native
  abstract class EmbeddedAudioTrack ()
    extends typings.winrtUwp.Windows.Media.Editing.EmbeddedAudioTrack {
    /**
      * Gets the AudioEncodingProperties for the embedded audio track.
      * @return The AudioEncodingProperties for the embedded audio track.
      */
    /* CompleteClass */
    override def getAudioEncodingProperties(): AudioEncodingProperties = js.native
  }
  
  /** Represents a single media object. */
  @js.native
  abstract class MediaClip ()
    extends typings.winrtUwp.Windows.Media.Editing.MediaClip {
    /** Gets the list of audio effect definitions for processing the media clip. */
    /* CompleteClass */
    override var audioEffectDefinitions: IVector[IAudioEffectDefinition] = js.native
    /** The list of embedded audio tracks in this media clip. */
    /* CompleteClass */
    override var embeddedAudioTracks: IVectorView[typings.winrtUwp.Windows.Media.Editing.EmbeddedAudioTrack] = js.native
    /** The time when the media clip stops playing within a MediaComposition . */
    /* CompleteClass */
    override var endTimeInComposition: Double = js.native
    /** Original playback time of the media clip, without the effects of TrimTimeFromStart and TrimTimeFromEnd properties. */
    /* CompleteClass */
    override var originalDuration: Double = js.native
    /** The index of the audio track within the media clip that is used for playback. */
    /* CompleteClass */
    override var selectedEmbeddedAudioTrackIndex: Double = js.native
    /** The time when the media clip starts playing within a MediaComposition . */
    /* CompleteClass */
    override var startTimeInComposition: Double = js.native
    /** The amount of time to trim from the end of the media clip. */
    /* CompleteClass */
    override var trimTimeFromEnd: Double = js.native
    /** The amount of time to trim from the beginning of the media clip. */
    /* CompleteClass */
    override var trimTimeFromStart: Double = js.native
    /** Duration of the media clip with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
    /* CompleteClass */
    override var trimmedDuration: Double = js.native
    /** An associative collection for storing custom properties associated with the media clip. */
    /* CompleteClass */
    override var userData: IMap[String, String] = js.native
    /** Gets the list of video effect definitions for processing the media clip. */
    /* CompleteClass */
    override var videoEffectDefinitions: IVector[IVideoEffectDefinition] = js.native
    /** Gets or sets the volume of the media clip. */
    /* CompleteClass */
    override var volume: Double = js.native
    /**
      * Gets the VideoEncodingProperties for the media clip.
      * @return The VideoEncodingProperties for the media clip.
      */
    /* CompleteClass */
    override def getVideoEncodingProperties(): VideoEncodingProperties = js.native
  }
  
  /** Represents a collection of media clips and background audio tracks. */
  @js.native
  /** Initializes a new instance of the MediaComposition class. */
  class MediaComposition ()
    extends typings.winrtUwp.Windows.Media.Editing.MediaComposition
  
  /** Represents an overlay that can be used in a media composition. */
  @js.native
  class MediaOverlay protected ()
    extends typings.winrtUwp.Windows.Media.Editing.MediaOverlay {
    /**
      * Initializes a new instance of the MediaOverlay class.
      * @param clip The media clip to be used for the overlay.
      */
    def this(clip: typings.winrtUwp.Windows.Media.Editing.MediaClip) = this()
    /**
      * Initializes a new instance of the MediaOverlay class.
      * @param clip The media clip to be used for the overlay.
      * @param position The position of the overlay.
      * @param opacity The opacity of the overlay, in the range of 0.0 to 1.0, where 0.0 is completely transparent and 1.0 is completely opaque.
      */
    def this(clip: typings.winrtUwp.Windows.Media.Editing.MediaClip, position: Rect, opacity: Double) = this()
    /** Gets or sets a value indicating whether audio is enabled for the MediaOverlay . */
    /* CompleteClass */
    override var audioEnabled: Boolean = js.native
    /** Gets the media clip to be used for the overlay. */
    /* CompleteClass */
    override var clip: typings.winrtUwp.Windows.Media.Editing.MediaClip = js.native
    /** Gets or sets the time span from the start of the clip after which the media overlay should be rendered. */
    /* CompleteClass */
    override var delay: Double = js.native
    /** Gets the opacity of the overlay. */
    /* CompleteClass */
    override var opacity: Double = js.native
    /** Gets the position of the overlay. */
    /* CompleteClass */
    override var position: Rect = js.native
  }
  
  /** Represents a layer of a media overlay. */
  @js.native
  /** Initializes a new instance of the MediaOverlayLayer class. */
  class MediaOverlayLayer ()
    extends typings.winrtUwp.Windows.Media.Editing.MediaOverlayLayer {
    /**
      * Initializes a new instance of the MediaOverlayLayer class.
      * @param compositorDefinition The definition of the custom compositor associated with the media overlay layer.
      */
    def this(compositorDefinition: IVideoCompositorDefinition) = this()
    /** Gets the definition of the custom compositor associated with the media overlay layer, if there is one. */
    /* CompleteClass */
    override var customCompositorDefinition: IVideoCompositorDefinition = js.native
    /** Gets the list of overlays for this media overlay layer. */
    /* CompleteClass */
    override var overlays: IVector[typings.winrtUwp.Windows.Media.Editing.MediaOverlay] = js.native
  }
  
  /* static members */
  @js.native
  object BackgroundAudioTrack extends js.Object {
    /**
      * Creates a background audio track object with audio content copied from an embedded audio track object.
      * @param embeddedAudioTrack An embedded audio track to use as the source audio for the background audio track.
      * @return A new background audio track object containing audio content copied from the embedded audio track.
      */
    def createFromEmbeddedAudioTrack(embeddedAudioTrack: typings.winrtUwp.Windows.Media.Editing.EmbeddedAudioTrack): typings.winrtUwp.Windows.Media.Editing.BackgroundAudioTrack = js.native
    /**
      * Creates a background audio track from an audio file.
      * @param file A StorageFile object representing the source audio file.
      * @return A new background audio track object containing the contents of the audio file.
      */
    def createFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.BackgroundAudioTrack] = js.native
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
    def createFromColor(color: Color, originalDuration: Double): typings.winrtUwp.Windows.Media.Editing.MediaClip = js.native
    /**
      * Creates a video clip from a video file.
      * @param file A StorageFile object representing the source video file.
      * @return A new media clip object containing a video clip of the video file.
      */
    def createFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.MediaClip] = js.native
    /**
      * Creates a video clip that displays a single image for a specified length of time.
      * @param file A StorageFile object representing the source image file.
      * @param originalDuration How long to display the image in the video clip.
      * @return A new media clip object containing the image-based video clip.
      */
    def createFromImageFileAsync(file: IStorageFile, originalDuration: Double): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.MediaClip] = js.native
    /**
      * Creates a video clip from a Direct3D surface.
      * @param surface The Direct3D surface.
      * @param originalDuration The initial duration of the created video clip.
      * @return A new media clip object containing the video clip.
      */
    def createFromSurface(surface: IDirect3DSurface, originalDuration: Double): typings.winrtUwp.Windows.Media.Editing.MediaClip = js.native
  }
  
  /* static members */
  @js.native
  object MediaComposition extends js.Object {
    /**
      * Asynchronously loads a MediaComposition from a StorageFile .
      * @param file The file from which to load the MediaComposition .
      * @return An async operation which can be used to track the success or failure of the operation.
      */
    def loadAsync(file: StorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.MediaComposition] = js.native
  }
  
  /** Used to specify if media trimming should use a faster or a more precise algorithm during transcoding. */
  @js.native
  object MediaTrimmingPreference extends js.Object {
    /* 0 */ val fast: typings.winrtUwp.Windows.Media.Editing.MediaTrimmingPreference.fast with Double = js.native
    /* 1 */ val precise: typings.winrtUwp.Windows.Media.Editing.MediaTrimmingPreference.precise with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Editing.MediaTrimmingPreference with Double] = js.native
  }
  
  /** Used to specify the frame precision algorithm when retrieving a thumbnail. */
  @js.native
  object VideoFramePrecision extends js.Object {
    /* 0 */ val nearestFrame: typings.winrtUwp.Windows.Media.Editing.VideoFramePrecision.nearestFrame with Double = js.native
    /* 1 */ val nearestKeyFrame: typings.winrtUwp.Windows.Media.Editing.VideoFramePrecision.nearestKeyFrame with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Editing.VideoFramePrecision with Double] = js.native
  }
  
}

