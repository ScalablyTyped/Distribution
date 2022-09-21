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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for editing, previewing, and saving edited media clips. */
object Editing {
  
  /** Represents a single audio track for accompanying a video clip. */
  @JSGlobal("Windows.Media.Editing.BackgroundAudioTrack")
  @js.native
  abstract class BackgroundAudioTrack ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Editing.BackgroundAudioTrack {
    
    /** Gets the list of audio effect definitions for processing the background audio track. */
    /* CompleteClass */
    var audioEffectDefinitions: IVector[IAudioEffectDefinition] = js.native
    
    /** Specifies how long to wait before starting background audio playback. */
    /* CompleteClass */
    var delay: Double = js.native
    
    /**
      * Gets the AudioEncodingProperties for the background audio track.
      * @return The AudioEncodingProperties for the background audio track.
      */
    /* CompleteClass */
    override def getAudioEncodingProperties(): AudioEncodingProperties = js.native
    
    /** Original playback time of the background audio track, without the effects of the TrimTimeFromStart and TrimTimeFromEnd properties. */
    /* CompleteClass */
    var originalDuration: Double = js.native
    
    /** The amount of time to trim from the end of the background audio track. */
    /* CompleteClass */
    var trimTimeFromEnd: Double = js.native
    
    /** The amount of time to trim from the beginning of the background audio track. */
    /* CompleteClass */
    var trimTimeFromStart: Double = js.native
    
    /** Duration of the background audio track with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
    /* CompleteClass */
    var trimmedDuration: Double = js.native
    
    /** An associative collection for storing custom properties associated with the background audio track. */
    /* CompleteClass */
    var userData: IMap[String, String] = js.native
    
    /** Gets or sets the volume of the background audio track. */
    /* CompleteClass */
    var volume: Double = js.native
  }
  object BackgroundAudioTrack {
    
    @JSGlobal("Windows.Media.Editing.BackgroundAudioTrack")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a background audio track object with audio content copied from an embedded audio track object.
      * @param embeddedAudioTrack An embedded audio track to use as the source audio for the background audio track.
      * @return A new background audio track object containing audio content copied from the embedded audio track.
      */
    /* static member */
    inline def createFromEmbeddedAudioTrack(embeddedAudioTrack: typings.winrtUwp.Windows.Media.Editing.EmbeddedAudioTrack): typings.winrtUwp.Windows.Media.Editing.BackgroundAudioTrack = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromEmbeddedAudioTrack")(embeddedAudioTrack.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Media.Editing.BackgroundAudioTrack]
    
    /**
      * Creates a background audio track from an audio file.
      * @param file A StorageFile object representing the source audio file.
      * @return A new background audio track object containing the contents of the audio file.
      */
    /* static member */
    inline def createFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.BackgroundAudioTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromFileAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.BackgroundAudioTrack]]
  }
  
  /** Represents an audio track embedded in the media clip. */
  @JSGlobal("Windows.Media.Editing.EmbeddedAudioTrack")
  @js.native
  abstract class EmbeddedAudioTrack ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Editing.EmbeddedAudioTrack {
    
    /**
      * Gets the AudioEncodingProperties for the embedded audio track.
      * @return The AudioEncodingProperties for the embedded audio track.
      */
    /* CompleteClass */
    override def getAudioEncodingProperties(): AudioEncodingProperties = js.native
  }
  
  /** Represents a single media object. */
  @JSGlobal("Windows.Media.Editing.MediaClip")
  @js.native
  abstract class MediaClip ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Editing.MediaClip {
    
    /** Gets the list of audio effect definitions for processing the media clip. */
    /* CompleteClass */
    var audioEffectDefinitions: IVector[IAudioEffectDefinition] = js.native
    
    /** The list of embedded audio tracks in this media clip. */
    /* CompleteClass */
    var embeddedAudioTracks: IVectorView[typings.winrtUwp.Windows.Media.Editing.EmbeddedAudioTrack] = js.native
    
    /** The time when the media clip stops playing within a MediaComposition . */
    /* CompleteClass */
    var endTimeInComposition: Double = js.native
    
    /**
      * Gets the VideoEncodingProperties for the media clip.
      * @return The VideoEncodingProperties for the media clip.
      */
    /* CompleteClass */
    override def getVideoEncodingProperties(): VideoEncodingProperties = js.native
    
    /** Original playback time of the media clip, without the effects of TrimTimeFromStart and TrimTimeFromEnd properties. */
    /* CompleteClass */
    var originalDuration: Double = js.native
    
    /** The index of the audio track within the media clip that is used for playback. */
    /* CompleteClass */
    var selectedEmbeddedAudioTrackIndex: Double = js.native
    
    /** The time when the media clip starts playing within a MediaComposition . */
    /* CompleteClass */
    var startTimeInComposition: Double = js.native
    
    /** The amount of time to trim from the end of the media clip. */
    /* CompleteClass */
    var trimTimeFromEnd: Double = js.native
    
    /** The amount of time to trim from the beginning of the media clip. */
    /* CompleteClass */
    var trimTimeFromStart: Double = js.native
    
    /** Duration of the media clip with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
    /* CompleteClass */
    var trimmedDuration: Double = js.native
    
    /** An associative collection for storing custom properties associated with the media clip. */
    /* CompleteClass */
    var userData: IMap[String, String] = js.native
    
    /** Gets the list of video effect definitions for processing the media clip. */
    /* CompleteClass */
    var videoEffectDefinitions: IVector[IVideoEffectDefinition] = js.native
    
    /** Gets or sets the volume of the media clip. */
    /* CompleteClass */
    var volume: Double = js.native
  }
  object MediaClip {
    
    @JSGlobal("Windows.Media.Editing.MediaClip")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a solid color video clip that displays a single color for a specified length of time. Solid color video clips are typically used to create an explicit gap between video segments.
      * @param color The color to display in the video clip.
      * @param originalDuration How long to display the color in the video clip.
      * @return A new media clip object containing the color-based video clip.
      */
    /* static member */
    inline def createFromColor(color: Color, originalDuration: Double): typings.winrtUwp.Windows.Media.Editing.MediaClip = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromColor")(color.asInstanceOf[js.Any], originalDuration.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.Editing.MediaClip]
    
    /**
      * Creates a video clip from a video file.
      * @param file A StorageFile object representing the source video file.
      * @return A new media clip object containing a video clip of the video file.
      */
    /* static member */
    inline def createFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.MediaClip] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromFileAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.MediaClip]]
    
    /**
      * Creates a video clip that displays a single image for a specified length of time.
      * @param file A StorageFile object representing the source image file.
      * @param originalDuration How long to display the image in the video clip.
      * @return A new media clip object containing the image-based video clip.
      */
    /* static member */
    inline def createFromImageFileAsync(file: IStorageFile, originalDuration: Double): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.MediaClip] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromImageFileAsync")(file.asInstanceOf[js.Any], originalDuration.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.MediaClip]]
    
    /**
      * Creates a video clip from a Direct3D surface.
      * @param surface The Direct3D surface.
      * @param originalDuration The initial duration of the created video clip.
      * @return A new media clip object containing the video clip.
      */
    /* static member */
    inline def createFromSurface(surface: IDirect3DSurface, originalDuration: Double): typings.winrtUwp.Windows.Media.Editing.MediaClip = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromSurface")(surface.asInstanceOf[js.Any], originalDuration.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.Editing.MediaClip]
  }
  
  /** Represents a collection of media clips and background audio tracks. */
  @JSGlobal("Windows.Media.Editing.MediaComposition")
  @js.native
  /** Initializes a new instance of the MediaComposition class. */
  open class MediaComposition ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Editing.MediaComposition
  object MediaComposition {
    
    @JSGlobal("Windows.Media.Editing.MediaComposition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Asynchronously loads a MediaComposition from a StorageFile .
      * @param file The file from which to load the MediaComposition .
      * @return An async operation which can be used to track the success or failure of the operation.
      */
    /* static member */
    inline def loadAsync(file: StorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.MediaComposition] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.MediaComposition]]
  }
  
  /** Represents an overlay that can be used in a media composition. */
  @JSGlobal("Windows.Media.Editing.MediaOverlay")
  @js.native
  open class MediaOverlay protected ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Editing.MediaOverlay {
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
    var audioEnabled: Boolean = js.native
    
    /** Gets the media clip to be used for the overlay. */
    /* CompleteClass */
    var clip: typings.winrtUwp.Windows.Media.Editing.MediaClip = js.native
    
    /** Gets or sets the time span from the start of the clip after which the media overlay should be rendered. */
    /* CompleteClass */
    var delay: Double = js.native
    
    /** Gets the opacity of the overlay. */
    /* CompleteClass */
    var opacity: Double = js.native
    
    /** Gets the position of the overlay. */
    /* CompleteClass */
    var position: Rect = js.native
  }
  
  /** Represents a layer of a media overlay. */
  @JSGlobal("Windows.Media.Editing.MediaOverlayLayer")
  @js.native
  /** Initializes a new instance of the MediaOverlayLayer class. */
  open class MediaOverlayLayer ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Editing.MediaOverlayLayer {
    /**
      * Initializes a new instance of the MediaOverlayLayer class.
      * @param compositorDefinition The definition of the custom compositor associated with the media overlay layer.
      */
    def this(compositorDefinition: IVideoCompositorDefinition) = this()
    
    /** Gets the definition of the custom compositor associated with the media overlay layer, if there is one. */
    /* CompleteClass */
    var customCompositorDefinition: IVideoCompositorDefinition = js.native
    
    /** Gets the list of overlays for this media overlay layer. */
    /* CompleteClass */
    var overlays: IVector[typings.winrtUwp.Windows.Media.Editing.MediaOverlay] = js.native
  }
  
  /** Used to specify if media trimming should use a faster or a more precise algorithm during transcoding. */
  @JSGlobal("Windows.Media.Editing.MediaTrimmingPreference")
  @js.native
  object MediaTrimmingPreference extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Editing.MediaTrimmingPreference & Double] = js.native
    
    /* 0 */ val fast: typings.winrtUwp.Windows.Media.Editing.MediaTrimmingPreference.fast & Double = js.native
    
    /* 1 */ val precise: typings.winrtUwp.Windows.Media.Editing.MediaTrimmingPreference.precise & Double = js.native
  }
  
  /** Used to specify the frame precision algorithm when retrieving a thumbnail. */
  @JSGlobal("Windows.Media.Editing.VideoFramePrecision")
  @js.native
  object VideoFramePrecision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Editing.VideoFramePrecision & Double] = js.native
    
    /* 0 */ val nearestFrame: typings.winrtUwp.Windows.Media.Editing.VideoFramePrecision.nearestFrame & Double = js.native
    
    /* 1 */ val nearestKeyFrame: typings.winrtUwp.Windows.Media.Editing.VideoFramePrecision.nearestKeyFrame & Double = js.native
  }
}
