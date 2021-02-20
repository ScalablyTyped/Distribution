package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typings.winrtUwp.Windows.Media.Effects.IVideoCompositorDefinition
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for editing, previewing, and saving edited media clips. */
object Editing {
  
  /** Represents a single audio track for accompanying a video clip. */
  @JSGlobal("Windows.Media.Editing.BackgroundAudioTrack")
  @js.native
  abstract class BackgroundAudioTrack ()
    extends typings.winrtUwp.Windows.Media.Editing.BackgroundAudioTrack
  object BackgroundAudioTrack {
    
    /**
      * Creates a background audio track object with audio content copied from an embedded audio track object.
      * @param embeddedAudioTrack An embedded audio track to use as the source audio for the background audio track.
      * @return A new background audio track object containing audio content copied from the embedded audio track.
      */
    /* static member */
    @JSGlobal("Windows.Media.Editing.BackgroundAudioTrack.createFromEmbeddedAudioTrack")
    @js.native
    def createFromEmbeddedAudioTrack(embeddedAudioTrack: typings.winrtUwp.Windows.Media.Editing.EmbeddedAudioTrack): typings.winrtUwp.Windows.Media.Editing.BackgroundAudioTrack = js.native
    
    /**
      * Creates a background audio track from an audio file.
      * @param file A StorageFile object representing the source audio file.
      * @return A new background audio track object containing the contents of the audio file.
      */
    /* static member */
    @JSGlobal("Windows.Media.Editing.BackgroundAudioTrack.createFromFileAsync")
    @js.native
    def createFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.BackgroundAudioTrack] = js.native
  }
  
  /** Represents an audio track embedded in the media clip. */
  @JSGlobal("Windows.Media.Editing.EmbeddedAudioTrack")
  @js.native
  abstract class EmbeddedAudioTrack ()
    extends typings.winrtUwp.Windows.Media.Editing.EmbeddedAudioTrack
  
  /** Represents a single media object. */
  @JSGlobal("Windows.Media.Editing.MediaClip")
  @js.native
  abstract class MediaClip ()
    extends typings.winrtUwp.Windows.Media.Editing.MediaClip
  object MediaClip {
    
    /**
      * Creates a solid color video clip that displays a single color for a specified length of time. Solid color video clips are typically used to create an explicit gap between video segments.
      * @param color The color to display in the video clip.
      * @param originalDuration How long to display the color in the video clip.
      * @return A new media clip object containing the color-based video clip.
      */
    /* static member */
    @JSGlobal("Windows.Media.Editing.MediaClip.createFromColor")
    @js.native
    def createFromColor(color: Color, originalDuration: Double): typings.winrtUwp.Windows.Media.Editing.MediaClip = js.native
    
    /**
      * Creates a video clip from a video file.
      * @param file A StorageFile object representing the source video file.
      * @return A new media clip object containing a video clip of the video file.
      */
    /* static member */
    @JSGlobal("Windows.Media.Editing.MediaClip.createFromFileAsync")
    @js.native
    def createFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.MediaClip] = js.native
    
    /**
      * Creates a video clip that displays a single image for a specified length of time.
      * @param file A StorageFile object representing the source image file.
      * @param originalDuration How long to display the image in the video clip.
      * @return A new media clip object containing the image-based video clip.
      */
    /* static member */
    @JSGlobal("Windows.Media.Editing.MediaClip.createFromImageFileAsync")
    @js.native
    def createFromImageFileAsync(file: IStorageFile, originalDuration: Double): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.MediaClip] = js.native
    
    /**
      * Creates a video clip from a Direct3D surface.
      * @param surface The Direct3D surface.
      * @param originalDuration The initial duration of the created video clip.
      * @return A new media clip object containing the video clip.
      */
    /* static member */
    @JSGlobal("Windows.Media.Editing.MediaClip.createFromSurface")
    @js.native
    def createFromSurface(surface: IDirect3DSurface, originalDuration: Double): typings.winrtUwp.Windows.Media.Editing.MediaClip = js.native
  }
  
  /** Represents a collection of media clips and background audio tracks. */
  @JSGlobal("Windows.Media.Editing.MediaComposition")
  @js.native
  /** Initializes a new instance of the MediaComposition class. */
  class MediaComposition ()
    extends typings.winrtUwp.Windows.Media.Editing.MediaComposition
  object MediaComposition {
    
    /**
      * Asynchronously loads a MediaComposition from a StorageFile .
      * @param file The file from which to load the MediaComposition .
      * @return An async operation which can be used to track the success or failure of the operation.
      */
    /* static member */
    @JSGlobal("Windows.Media.Editing.MediaComposition.loadAsync")
    @js.native
    def loadAsync(file: StorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Editing.MediaComposition] = js.native
  }
  
  /** Represents an overlay that can be used in a media composition. */
  @JSGlobal("Windows.Media.Editing.MediaOverlay")
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
  }
  
  /** Represents a layer of a media overlay. */
  @JSGlobal("Windows.Media.Editing.MediaOverlayLayer")
  @js.native
  /** Initializes a new instance of the MediaOverlayLayer class. */
  class MediaOverlayLayer ()
    extends typings.winrtUwp.Windows.Media.Editing.MediaOverlayLayer {
    /**
      * Initializes a new instance of the MediaOverlayLayer class.
      * @param compositorDefinition The definition of the custom compositor associated with the media overlay layer.
      */
    def this(compositorDefinition: IVideoCompositorDefinition) = this()
  }
  
  /** Used to specify if media trimming should use a faster or a more precise algorithm during transcoding. */
  @JSGlobal("Windows.Media.Editing.MediaTrimmingPreference")
  @js.native
  object MediaTrimmingPreference extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Editing.MediaTrimmingPreference with Double] = js.native
    
    /* 0 */ val fast: typings.winrtUwp.Windows.Media.Editing.MediaTrimmingPreference.fast with Double = js.native
    
    /* 1 */ val precise: typings.winrtUwp.Windows.Media.Editing.MediaTrimmingPreference.precise with Double = js.native
  }
  
  /** Used to specify the frame precision algorithm when retrieving a thumbnail. */
  @JSGlobal("Windows.Media.Editing.VideoFramePrecision")
  @js.native
  object VideoFramePrecision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Editing.VideoFramePrecision with Double] = js.native
    
    /* 0 */ val nearestFrame: typings.winrtUwp.Windows.Media.Editing.VideoFramePrecision.nearestFrame with Double = js.native
    
    /* 1 */ val nearestKeyFrame: typings.winrtUwp.Windows.Media.Editing.VideoFramePrecision.nearestKeyFrame with Double = js.native
  }
}
