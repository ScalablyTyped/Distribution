package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typings.winrtUwp.Windows.Media.Capture.MediaCategory
import typings.winrtUwp.Windows.Media.Editing.MediaOverlay
import typings.winrtUwp.Windows.Media.Effects.AudioEffectType
import typings.winrtUwp.Windows.Media.MediaProperties.MediaMirroringOptions
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRotation
import typings.winrtUwp.Windows.Media.Render.AudioRenderCategory
import typings.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm
import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for discovering the audio processing chain on a device. */
object Effects {
  
  /** Represent an audio capture effects manager which can be used to discover the audio processing chain on a device for a specific media category and audio processing mode. */
  @JSGlobal("Windows.Media.Effects.AudioCaptureEffectsManager")
  @js.native
  abstract class AudioCaptureEffectsManager ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Effects.AudioCaptureEffectsManager
  
  /** Represents an audio effect. */
  @JSGlobal("Windows.Media.Effects.AudioEffect")
  @js.native
  abstract class AudioEffect ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Effects.AudioEffect {
    
    /** Gets the type of the audio effect. */
    /* CompleteClass */
    var audioEffectType: AudioEffectType = js.native
  }
  
  /** Represents an audio effect definition. */
  @JSGlobal("Windows.Media.Effects.AudioEffectDefinition")
  @js.native
  class AudioEffectDefinition protected ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Effects.AudioEffectDefinition {
    /**
      * Creates a new AudioEffectDefinition object with the specified activatable class ID.
      * @param activatableClassId The activatable class ID of the audio effect definition.
      */
    def this(activatableClassId: String) = this()
    /**
      * Creates a new AudioEffectDefinition object with the specified activatable class ID, configuring the object with the specified settings.
      * @param activatableClassId The activatable class ID of the audio effect definition.
      * @param props Configuration properties for the specified audio effect definition.
      */
    def this(activatableClassId: String, props: IPropertySet) = this()
    
    /** The activatable class ID of the audio effect definition. */
    /* CompleteClass */
    var activatableClassId: String = js.native
    
    /** The set of properties for configuring an AudioEffectDefinition object. */
    /* CompleteClass */
    var properties: IPropertySet = js.native
  }
  
  /** Defines values for audio effect types. */
  @JSGlobal("Windows.Media.Effects.AudioEffectType")
  @js.native
  object AudioEffectType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Effects.AudioEffectType & Double] = js.native
    
    /* 1 */ val acousticEchoCancellation: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.acousticEchoCancellation & Double = js.native
    
    /* 3 */ val automaticGainControl: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.automaticGainControl & Double = js.native
    
    /* 8 */ val bassBoost: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.bassBoost & Double = js.native
    
    /* 13 */ val bassManagement: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.bassManagement & Double = js.native
    
    /* 4 */ val beamForming: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.beamForming & Double = js.native
    
    /* 5 */ val constantToneRemoval: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.constantToneRemoval & Double = js.native
    
    /* 17 */ val dynamicRangeCompression: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.dynamicRangeCompression & Double = js.native
    
    /* 14 */ val environmentalEffects: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.environmentalEffects & Double = js.native
    
    /* 6 */ val equalizer: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.equalizer & Double = js.native
    
    /* 7 */ val loudnessEqualizer: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.loudnessEqualizer & Double = js.native
    
    /* 2 */ val noiseSuppression: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.noiseSuppression & Double = js.native
    
    /* 0 */ val other: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.other & Double = js.native
    
    /* 12 */ val roomCorrection: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.roomCorrection & Double = js.native
    
    /* 16 */ val speakerCompensation: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.speakerCompensation & Double = js.native
    
    /* 11 */ val speakerFill: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.speakerFill & Double = js.native
    
    /* 15 */ val speakerProtection: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.speakerProtection & Double = js.native
    
    /* 10 */ val virtualHeadphones: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.virtualHeadphones & Double = js.native
    
    /* 9 */ val virtualSurround: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.virtualSurround & Double = js.native
  }
  
  /** Provides functionality for creating audio capture and render effects manager objects. */
  @JSGlobal("Windows.Media.Effects.AudioEffectsManager")
  @js.native
  abstract class AudioEffectsManager ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Effects.AudioEffectsManager
  object AudioEffectsManager {
    
    @JSGlobal("Windows.Media.Effects.AudioEffectsManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a AudioCaptureEffectsManager object for the specified device for a specific media category.
      * @param deviceId The device id.
      * @param category The media category.
      * @return The new audio capture effects manager.
      */
    /* static member */
    inline def createAudioCaptureEffectsManager(deviceId: String, category: MediaCategory): typings.winrtUwp.Windows.Media.Effects.AudioCaptureEffectsManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createAudioCaptureEffectsManager")(deviceId.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.Effects.AudioCaptureEffectsManager]
    /**
      * Creates a AudioCaptureEffectsManager object for the specified device for a specific media category and audio processing mode.
      * @param deviceId The device id.
      * @param category The media category.
      * @param mode The audio processing mode.
      * @return The new audio capture effects manager.
      */
    /* static member */
    inline def createAudioCaptureEffectsManager(deviceId: String, category: MediaCategory, mode: typings.winrtUwp.Windows.Media.AudioProcessing): typings.winrtUwp.Windows.Media.Effects.AudioCaptureEffectsManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createAudioCaptureEffectsManager")(deviceId.asInstanceOf[js.Any], category.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.Effects.AudioCaptureEffectsManager]
    
    /**
      * Creates a AudioRenderEffectsManager object for the specified device for a specific media category and audio processing mode.
      * @param deviceId The device id.
      * @param category The audio render category.
      * @return The new audio render effects manager.
      */
    /* static member */
    inline def createAudioRenderEffectsManager(deviceId: String, category: AudioRenderCategory): typings.winrtUwp.Windows.Media.Effects.AudioRenderEffectsManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createAudioRenderEffectsManager")(deviceId.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.Effects.AudioRenderEffectsManager]
    /**
      * Creates a AudioRenderEffectsManager object for the specified device for a specific media category.
      * @param deviceId The device id.
      * @param category The audio render category.
      * @param mode The audio precessing mode.
      * @return The new audio render effects manager.
      */
    /* static member */
    inline def createAudioRenderEffectsManager(
      deviceId: String,
      category: AudioRenderCategory,
      mode: typings.winrtUwp.Windows.Media.AudioProcessing
    ): typings.winrtUwp.Windows.Media.Effects.AudioRenderEffectsManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createAudioRenderEffectsManager")(deviceId.asInstanceOf[js.Any], category.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.Effects.AudioRenderEffectsManager]
  }
  
  /** Represent an audio render effects manager which can be used to discover the audio processing chain on a device for a specific media category and audio processing mode. */
  @JSGlobal("Windows.Media.Effects.AudioRenderEffectsManager")
  @js.native
  abstract class AudioRenderEffectsManager ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Effects.AudioRenderEffectsManager
  
  /** Provides context for performing a custom overlay operation within the CompositeFrame method. */
  @JSGlobal("Windows.Media.Effects.CompositeVideoFrameContext")
  @js.native
  abstract class CompositeVideoFrameContext ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Effects.CompositeVideoFrameContext {
    
    /** Gets the background frame for an overlay operation. */
    /* CompleteClass */
    var backgroundFrame: typings.winrtUwp.Windows.Media.VideoFrame = js.native
    
    /**
      * Gets a MediaOverlay object for the provided Direct3D surface.
      * @param surfaceToOverlay The Direct3D surface.
      * @return The created MediaOverlay object.
      */
    /* CompleteClass */
    override def getOverlayForSurface(surfaceToOverlay: IDirect3DSurface): MediaOverlay = js.native
    
    /** Gets the output frame for an overlay operation. */
    /* CompleteClass */
    var outputFrame: typings.winrtUwp.Windows.Media.VideoFrame = js.native
    
    /** Gets the list of Direct3D surfaces to be used in an overlay operation. */
    /* CompleteClass */
    var surfacesToOverlay: IVectorView[IDirect3DSurface] = js.native
  }
  
  /** Specifies the reason why a media effect was closed. */
  @JSGlobal("Windows.Media.Effects.MediaEffectClosedReason")
  @js.native
  object MediaEffectClosedReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason & Double] = js.native
    
    /* 0 */ val done: typings.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason.done & Double = js.native
    
    /* 3 */ val effectCurrentlyUnloaded: typings.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason.effectCurrentlyUnloaded & Double = js.native
    
    /* 1 */ val unknownError: typings.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason.unknownError & Double = js.native
    
    /* 2 */ val unsupportedEncodingFormat: typings.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason.unsupportedEncodingFormat & Double = js.native
  }
  
  /** Specifies the types of memory that can be used for a media operation. */
  @JSGlobal("Windows.Media.Effects.MediaMemoryTypes")
  @js.native
  object MediaMemoryTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Effects.MediaMemoryTypes & Double] = js.native
    
    /* 1 */ val cpu: typings.winrtUwp.Windows.Media.Effects.MediaMemoryTypes.cpu & Double = js.native
    
    /* 0 */ val gpu: typings.winrtUwp.Windows.Media.Effects.MediaMemoryTypes.gpu & Double = js.native
    
    /* 2 */ val gpuAndCpu: typings.winrtUwp.Windows.Media.Effects.MediaMemoryTypes.gpuAndCpu & Double = js.native
  }
  
  /** Provides context for performing a custom audio effect operation within the ProcessFrame method. */
  @JSGlobal("Windows.Media.Effects.ProcessAudioFrameContext")
  @js.native
  abstract class ProcessAudioFrameContext ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Effects.ProcessAudioFrameContext {
    
    /** Gets the input frame for an audio effect operation. */
    /* CompleteClass */
    var inputFrame: typings.winrtUwp.Windows.Media.AudioFrame = js.native
    
    /** Gets the output frame for an audio effect operation. */
    /* CompleteClass */
    var outputFrame: typings.winrtUwp.Windows.Media.AudioFrame = js.native
  }
  
  /** Provides context for performing a custom video effect operation within the ProcessFrame method. */
  @JSGlobal("Windows.Media.Effects.ProcessVideoFrameContext")
  @js.native
  abstract class ProcessVideoFrameContext ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Effects.ProcessVideoFrameContext {
    
    /** Gets the input frame for a video effect operation. */
    /* CompleteClass */
    var inputFrame: typings.winrtUwp.Windows.Media.VideoFrame = js.native
    
    /** Gets the output frame for a video effect operation. */
    /* CompleteClass */
    var outputFrame: typings.winrtUwp.Windows.Media.VideoFrame = js.native
  }
  
  /** Represents the definition of a custom video compositor. */
  @JSGlobal("Windows.Media.Effects.VideoCompositorDefinition")
  @js.native
  class VideoCompositorDefinition protected ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Effects.VideoCompositorDefinition {
    /**
      * Initializes a new instance of the VideoCompositorDefinition class.
      * @param activatableClassId The activatable class ID of the video compositor.
      */
    def this(activatableClassId: String) = this()
    /**
      * Initializes a new instance of the VideoCompositorDefinition class.
      * @param activatableClassId The activatable class ID of the video compositor.
      * @param props The set of properties for configuring the video compositor object.
      */
    def this(activatableClassId: String, props: IPropertySet) = this()
    
    /** Gets the activatable class ID of the video compositor. */
    /* CompleteClass */
    var activatableClassId: String = js.native
    
    /** Gets the set of properties for configuring the video compositor object. */
    /* CompleteClass */
    var properties: IPropertySet = js.native
  }
  
  /** Represents a video effect definition. */
  @JSGlobal("Windows.Media.Effects.VideoEffectDefinition")
  @js.native
  class VideoEffectDefinition protected ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Effects.VideoEffectDefinition {
    /**
      * Creates a new VideoEffectDefinition object with the specified activatable class ID.
      * @param activatableClassId The activatable class ID of the video effect definition.
      */
    def this(activatableClassId: String) = this()
    /**
      * Creates a new VideoEffectDefinition object with the specified activatable class ID, configuring the object with the specified settings.
      * @param activatableClassId The activatable class ID of the video effect definition.
      * @param props Configuration properties for the specified video effect definition.
      */
    def this(activatableClassId: String, props: IPropertySet) = this()
    
    /** Gets the activatable class ID of the video effect definition. */
    /* CompleteClass */
    var activatableClassId: String = js.native
    
    /** Gets the set of properties for configuring the VideoEffectDefinition object. */
    /* CompleteClass */
    var properties: IPropertySet = js.native
  }
  
  /** Represents the definition of a video transform effect. */
  @JSGlobal("Windows.Media.Effects.VideoTransformEffectDefinition")
  @js.native
  /** Initializes a new instance of the VideoTransformEffectDefinition class. */
  class VideoTransformEffectDefinition ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Effects.VideoTransformEffectDefinition {
    
    /** Gets the activatable class ID of the video transform effect definition. */
    /* CompleteClass */
    var activatableClassId: String = js.native
    
    /** Gets or sets the rectangle within which the video will be cropped, specified in pixels. */
    /* CompleteClass */
    var cropRectangle: Rect = js.native
    
    /** Gets or sets the direction in which the video will be mirrored. */
    /* CompleteClass */
    var mirror: MediaMirroringOptions = js.native
    
    /** Gets or sets the output size of the video, in pixels. */
    /* CompleteClass */
    var outputSize: Size = js.native
    
    /** Gets or sets the color that will be used to fill pixels in the frame that are not filled with video, such as when video is letterboxed. */
    /* CompleteClass */
    var paddingColor: Color = js.native
    
    /** Gets or sets the media processing algorithm that is used for the video transform. */
    /* CompleteClass */
    var processingAlgorithm: MediaVideoProcessingAlgorithm = js.native
    
    /** Gets the set of properties for configuring the VideoTransformEffectDefinition object. */
    /* CompleteClass */
    var properties: IPropertySet = js.native
    
    /** Gets or sets the angle and direction in which the video will be rotated. */
    /* CompleteClass */
    var rotation: MediaRotation = js.native
  }
}
