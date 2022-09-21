package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Graphics.Imaging.ImageStream
import typings.winrtUwp.Windows.Media.Core.MediaStreamSource
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.Effects.IVideoCompositorDefinition
import typings.winrtUwp.Windows.Media.Effects.IVideoEffectDefinition
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason
import typings.winrtUwp.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for editing, previewing, and saving edited media clips. */
object Editing {
  
  @js.native
  sealed trait MediaTrimmingPreference extends StObject
  /** Used to specify if media trimming should use a faster or a more precise algorithm during transcoding. */
  @JSGlobal("Windows.Media.Editing.MediaTrimmingPreference")
  @js.native
  object MediaTrimmingPreference extends StObject {
    
    /** Use the faster trimming algorithm during transcoding. */
    @js.native
    sealed trait fast
      extends StObject
         with MediaTrimmingPreference
    
    /** Use the more precise trimming algorithm during transcoding. */
    @js.native
    sealed trait precise
      extends StObject
         with MediaTrimmingPreference
  }
  
  @js.native
  sealed trait VideoFramePrecision extends StObject
  /** Used to specify the frame precision algorithm when retrieving a thumbnail. */
  @JSGlobal("Windows.Media.Editing.VideoFramePrecision")
  @js.native
  object VideoFramePrecision extends StObject {
    
    /** Use a more precise algorithm to get a thumbnail to the nearest frame. */
    @js.native
    sealed trait nearestFrame
      extends StObject
         with VideoFramePrecision
    
    /** Use a faster but less precise algorithm to get the thumbnail. */
    @js.native
    sealed trait nearestKeyFrame
      extends StObject
         with VideoFramePrecision
  }
  
  /** Represents a single audio track for accompanying a video clip. */
  trait BackgroundAudioTrack extends StObject {
    
    /** Gets the list of audio effect definitions for processing the background audio track. */
    var audioEffectDefinitions: IVector[IAudioEffectDefinition]
    
    /** Specifies how long to wait before starting background audio playback. */
    var delay: Double
    
    /**
      * Gets the AudioEncodingProperties for the background audio track.
      * @return The AudioEncodingProperties for the background audio track.
      */
    def getAudioEncodingProperties(): AudioEncodingProperties
    
    /** Original playback time of the background audio track, without the effects of the TrimTimeFromStart and TrimTimeFromEnd properties. */
    var originalDuration: Double
    
    /** The amount of time to trim from the end of the background audio track. */
    var trimTimeFromEnd: Double
    
    /** The amount of time to trim from the beginning of the background audio track. */
    var trimTimeFromStart: Double
    
    /** Duration of the background audio track with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
    var trimmedDuration: Double
    
    /** An associative collection for storing custom properties associated with the background audio track. */
    var userData: IMap[String, String]
    
    /** Gets or sets the volume of the background audio track. */
    var volume: Double
  }
  object BackgroundAudioTrack {
    
    inline def apply(
      audioEffectDefinitions: IVector[IAudioEffectDefinition],
      delay: Double,
      getAudioEncodingProperties: () => AudioEncodingProperties,
      originalDuration: Double,
      trimTimeFromEnd: Double,
      trimTimeFromStart: Double,
      trimmedDuration: Double,
      userData: IMap[String, String],
      volume: Double
    ): BackgroundAudioTrack = {
      val __obj = js.Dynamic.literal(audioEffectDefinitions = audioEffectDefinitions.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], getAudioEncodingProperties = js.Any.fromFunction0(getAudioEncodingProperties), originalDuration = originalDuration.asInstanceOf[js.Any], trimTimeFromEnd = trimTimeFromEnd.asInstanceOf[js.Any], trimTimeFromStart = trimTimeFromStart.asInstanceOf[js.Any], trimmedDuration = trimmedDuration.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundAudioTrack]
    }
    
    extension [Self <: BackgroundAudioTrack](x: Self) {
      
      inline def setAudioEffectDefinitions(value: IVector[IAudioEffectDefinition]): Self = StObject.set(x, "audioEffectDefinitions", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setGetAudioEncodingProperties(value: () => AudioEncodingProperties): Self = StObject.set(x, "getAudioEncodingProperties", js.Any.fromFunction0(value))
      
      inline def setOriginalDuration(value: Double): Self = StObject.set(x, "originalDuration", value.asInstanceOf[js.Any])
      
      inline def setTrimTimeFromEnd(value: Double): Self = StObject.set(x, "trimTimeFromEnd", value.asInstanceOf[js.Any])
      
      inline def setTrimTimeFromStart(value: Double): Self = StObject.set(x, "trimTimeFromStart", value.asInstanceOf[js.Any])
      
      inline def setTrimmedDuration(value: Double): Self = StObject.set(x, "trimmedDuration", value.asInstanceOf[js.Any])
      
      inline def setUserData(value: IMap[String, String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents an audio track embedded in the media clip. */
  trait EmbeddedAudioTrack extends StObject {
    
    /**
      * Gets the AudioEncodingProperties for the embedded audio track.
      * @return The AudioEncodingProperties for the embedded audio track.
      */
    def getAudioEncodingProperties(): AudioEncodingProperties
  }
  object EmbeddedAudioTrack {
    
    inline def apply(getAudioEncodingProperties: () => AudioEncodingProperties): EmbeddedAudioTrack = {
      val __obj = js.Dynamic.literal(getAudioEncodingProperties = js.Any.fromFunction0(getAudioEncodingProperties))
      __obj.asInstanceOf[EmbeddedAudioTrack]
    }
    
    extension [Self <: EmbeddedAudioTrack](x: Self) {
      
      inline def setGetAudioEncodingProperties(value: () => AudioEncodingProperties): Self = StObject.set(x, "getAudioEncodingProperties", js.Any.fromFunction0(value))
    }
  }
  
  /** Represents a single media object. */
  trait MediaClip extends StObject {
    
    /** Gets the list of audio effect definitions for processing the media clip. */
    var audioEffectDefinitions: IVector[IAudioEffectDefinition]
    
    /** The list of embedded audio tracks in this media clip. */
    var embeddedAudioTracks: IVectorView[EmbeddedAudioTrack]
    
    /** The time when the media clip stops playing within a MediaComposition . */
    var endTimeInComposition: Double
    
    /**
      * Gets the VideoEncodingProperties for the media clip.
      * @return The VideoEncodingProperties for the media clip.
      */
    def getVideoEncodingProperties(): VideoEncodingProperties
    
    /** Original playback time of the media clip, without the effects of TrimTimeFromStart and TrimTimeFromEnd properties. */
    var originalDuration: Double
    
    /** The index of the audio track within the media clip that is used for playback. */
    var selectedEmbeddedAudioTrackIndex: Double
    
    /** The time when the media clip starts playing within a MediaComposition . */
    var startTimeInComposition: Double
    
    /** The amount of time to trim from the end of the media clip. */
    var trimTimeFromEnd: Double
    
    /** The amount of time to trim from the beginning of the media clip. */
    var trimTimeFromStart: Double
    
    /** Duration of the media clip with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
    var trimmedDuration: Double
    
    /** An associative collection for storing custom properties associated with the media clip. */
    var userData: IMap[String, String]
    
    /** Gets the list of video effect definitions for processing the media clip. */
    var videoEffectDefinitions: IVector[IVideoEffectDefinition]
    
    /** Gets or sets the volume of the media clip. */
    var volume: Double
  }
  object MediaClip {
    
    inline def apply(
      audioEffectDefinitions: IVector[IAudioEffectDefinition],
      embeddedAudioTracks: IVectorView[EmbeddedAudioTrack],
      endTimeInComposition: Double,
      getVideoEncodingProperties: () => VideoEncodingProperties,
      originalDuration: Double,
      selectedEmbeddedAudioTrackIndex: Double,
      startTimeInComposition: Double,
      trimTimeFromEnd: Double,
      trimTimeFromStart: Double,
      trimmedDuration: Double,
      userData: IMap[String, String],
      videoEffectDefinitions: IVector[IVideoEffectDefinition],
      volume: Double
    ): MediaClip = {
      val __obj = js.Dynamic.literal(audioEffectDefinitions = audioEffectDefinitions.asInstanceOf[js.Any], embeddedAudioTracks = embeddedAudioTracks.asInstanceOf[js.Any], endTimeInComposition = endTimeInComposition.asInstanceOf[js.Any], getVideoEncodingProperties = js.Any.fromFunction0(getVideoEncodingProperties), originalDuration = originalDuration.asInstanceOf[js.Any], selectedEmbeddedAudioTrackIndex = selectedEmbeddedAudioTrackIndex.asInstanceOf[js.Any], startTimeInComposition = startTimeInComposition.asInstanceOf[js.Any], trimTimeFromEnd = trimTimeFromEnd.asInstanceOf[js.Any], trimTimeFromStart = trimTimeFromStart.asInstanceOf[js.Any], trimmedDuration = trimmedDuration.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], videoEffectDefinitions = videoEffectDefinitions.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaClip]
    }
    
    extension [Self <: MediaClip](x: Self) {
      
      inline def setAudioEffectDefinitions(value: IVector[IAudioEffectDefinition]): Self = StObject.set(x, "audioEffectDefinitions", value.asInstanceOf[js.Any])
      
      inline def setEmbeddedAudioTracks(value: IVectorView[EmbeddedAudioTrack]): Self = StObject.set(x, "embeddedAudioTracks", value.asInstanceOf[js.Any])
      
      inline def setEndTimeInComposition(value: Double): Self = StObject.set(x, "endTimeInComposition", value.asInstanceOf[js.Any])
      
      inline def setGetVideoEncodingProperties(value: () => VideoEncodingProperties): Self = StObject.set(x, "getVideoEncodingProperties", js.Any.fromFunction0(value))
      
      inline def setOriginalDuration(value: Double): Self = StObject.set(x, "originalDuration", value.asInstanceOf[js.Any])
      
      inline def setSelectedEmbeddedAudioTrackIndex(value: Double): Self = StObject.set(x, "selectedEmbeddedAudioTrackIndex", value.asInstanceOf[js.Any])
      
      inline def setStartTimeInComposition(value: Double): Self = StObject.set(x, "startTimeInComposition", value.asInstanceOf[js.Any])
      
      inline def setTrimTimeFromEnd(value: Double): Self = StObject.set(x, "trimTimeFromEnd", value.asInstanceOf[js.Any])
      
      inline def setTrimTimeFromStart(value: Double): Self = StObject.set(x, "trimTimeFromStart", value.asInstanceOf[js.Any])
      
      inline def setTrimmedDuration(value: Double): Self = StObject.set(x, "trimmedDuration", value.asInstanceOf[js.Any])
      
      inline def setUserData(value: IMap[String, String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setVideoEffectDefinitions(value: IVector[IVideoEffectDefinition]): Self = StObject.set(x, "videoEffectDefinitions", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a collection of media clips and background audio tracks. */
  @js.native
  trait MediaComposition extends StObject {
    
    /** A collection of background audio tracks for playback in the media composition. */
    var backgroundAudioTracks: IVector[BackgroundAudioTrack] = js.native
    
    /** A collection of media clips for playback in the media composition. */
    var clips: IVector[MediaClip] = js.native
    
    /**
      * Create a new default media encoding profile which can be modified if necessary.
      * @return The newly created MediaEncodingProfile .
      */
    def createDefaultEncodingProfile(): MediaEncodingProfile = js.native
    
    /** The total playback time of the media composition. */
    var duration: Double = js.native
    
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
    ): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
    
    /** Gets the list of overlay layers for the media composition. */
    var overlayLayers: IVector[MediaOverlayLayer] = js.native
    
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
    
    /** An associative collection for storing custom properties associated with the media composition. */
    var userData: IMap[String, String] = js.native
  }
  
  /** Represents an overlay that can be used in a media composition. */
  trait MediaOverlay extends StObject {
    
    /** Gets or sets a value indicating whether audio is enabled for the MediaOverlay . */
    var audioEnabled: Boolean
    
    /** Gets the media clip to be used for the overlay. */
    var clip: MediaClip
    
    /** Gets or sets the time span from the start of the clip after which the media overlay should be rendered. */
    var delay: Double
    
    /** Gets the opacity of the overlay. */
    var opacity: Double
    
    /** Gets the position of the overlay. */
    var position: Rect
  }
  object MediaOverlay {
    
    inline def apply(audioEnabled: Boolean, clip: MediaClip, delay: Double, opacity: Double, position: Rect): MediaOverlay = {
      val __obj = js.Dynamic.literal(audioEnabled = audioEnabled.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaOverlay]
    }
    
    extension [Self <: MediaOverlay](x: Self) {
      
      inline def setAudioEnabled(value: Boolean): Self = StObject.set(x, "audioEnabled", value.asInstanceOf[js.Any])
      
      inline def setClip(value: MediaClip): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Rect): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a layer of a media overlay. */
  trait MediaOverlayLayer extends StObject {
    
    /** Gets the definition of the custom compositor associated with the media overlay layer, if there is one. */
    var customCompositorDefinition: IVideoCompositorDefinition
    
    /** Gets the list of overlays for this media overlay layer. */
    var overlays: IVector[MediaOverlay]
  }
  object MediaOverlayLayer {
    
    inline def apply(customCompositorDefinition: IVideoCompositorDefinition, overlays: IVector[MediaOverlay]): MediaOverlayLayer = {
      val __obj = js.Dynamic.literal(customCompositorDefinition = customCompositorDefinition.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaOverlayLayer]
    }
    
    extension [Self <: MediaOverlayLayer](x: Self) {
      
      inline def setCustomCompositorDefinition(value: IVideoCompositorDefinition): Self = StObject.set(x, "customCompositorDefinition", value.asInstanceOf[js.Any])
      
      inline def setOverlays(value: IVector[MediaOverlay]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    }
  }
}
