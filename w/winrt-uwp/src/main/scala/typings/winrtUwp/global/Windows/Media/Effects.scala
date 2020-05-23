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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains classes for discovering the audio processing chain on a device. */
@JSGlobal("Windows.Media.Effects")
@js.native
object Effects extends js.Object {
  /** Represent an audio capture effects manager which can be used to discover the audio processing chain on a device for a specific media category and audio processing mode. */
  @js.native
  abstract class AudioCaptureEffectsManager ()
    extends typings.winrtUwp.Windows.Media.Effects.AudioCaptureEffectsManager
  
  /** Represents an audio effect. */
  @js.native
  abstract class AudioEffect ()
    extends typings.winrtUwp.Windows.Media.Effects.AudioEffect {
    /** Gets the type of the audio effect. */
    /* CompleteClass */
    override var audioEffectType: AudioEffectType = js.native
  }
  
  /** Represents an audio effect definition. */
  @js.native
  class AudioEffectDefinition protected ()
    extends typings.winrtUwp.Windows.Media.Effects.AudioEffectDefinition {
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
    override var activatableClassId: String = js.native
    /** The set of properties for configuring an AudioEffectDefinition object. */
    /* CompleteClass */
    override var properties: IPropertySet = js.native
  }
  
  /** Provides functionality for creating audio capture and render effects manager objects. */
  @js.native
  abstract class AudioEffectsManager ()
    extends typings.winrtUwp.Windows.Media.Effects.AudioEffectsManager
  
  /** Represent an audio render effects manager which can be used to discover the audio processing chain on a device for a specific media category and audio processing mode. */
  @js.native
  abstract class AudioRenderEffectsManager ()
    extends typings.winrtUwp.Windows.Media.Effects.AudioRenderEffectsManager
  
  /** Provides context for performing a custom overlay operation within the CompositeFrame method. */
  @js.native
  abstract class CompositeVideoFrameContext ()
    extends typings.winrtUwp.Windows.Media.Effects.CompositeVideoFrameContext {
    /** Gets the background frame for an overlay operation. */
    /* CompleteClass */
    override var backgroundFrame: typings.winrtUwp.Windows.Media.VideoFrame = js.native
    /** Gets the output frame for an overlay operation. */
    /* CompleteClass */
    override var outputFrame: typings.winrtUwp.Windows.Media.VideoFrame = js.native
    /** Gets the list of Direct3D surfaces to be used in an overlay operation. */
    /* CompleteClass */
    override var surfacesToOverlay: IVectorView[IDirect3DSurface] = js.native
    /**
      * Gets a MediaOverlay object for the provided Direct3D surface.
      * @param surfaceToOverlay The Direct3D surface.
      * @return The created MediaOverlay object.
      */
    /* CompleteClass */
    override def getOverlayForSurface(surfaceToOverlay: IDirect3DSurface): MediaOverlay = js.native
  }
  
  /** Provides context for performing a custom audio effect operation within the ProcessFrame method. */
  @js.native
  abstract class ProcessAudioFrameContext ()
    extends typings.winrtUwp.Windows.Media.Effects.ProcessAudioFrameContext {
    /** Gets the input frame for an audio effect operation. */
    /* CompleteClass */
    override var inputFrame: typings.winrtUwp.Windows.Media.AudioFrame = js.native
    /** Gets the output frame for an audio effect operation. */
    /* CompleteClass */
    override var outputFrame: typings.winrtUwp.Windows.Media.AudioFrame = js.native
  }
  
  /** Provides context for performing a custom video effect operation within the ProcessFrame method. */
  @js.native
  abstract class ProcessVideoFrameContext ()
    extends typings.winrtUwp.Windows.Media.Effects.ProcessVideoFrameContext {
    /** Gets the input frame for a video effect operation. */
    /* CompleteClass */
    override var inputFrame: typings.winrtUwp.Windows.Media.VideoFrame = js.native
    /** Gets the output frame for a video effect operation. */
    /* CompleteClass */
    override var outputFrame: typings.winrtUwp.Windows.Media.VideoFrame = js.native
  }
  
  /** Represents the definition of a custom video compositor. */
  @js.native
  class VideoCompositorDefinition protected ()
    extends typings.winrtUwp.Windows.Media.Effects.VideoCompositorDefinition {
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
    override var activatableClassId: String = js.native
    /** Gets the set of properties for configuring the video compositor object. */
    /* CompleteClass */
    override var properties: IPropertySet = js.native
  }
  
  /** Represents a video effect definition. */
  @js.native
  class VideoEffectDefinition protected ()
    extends typings.winrtUwp.Windows.Media.Effects.VideoEffectDefinition {
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
    override var activatableClassId: String = js.native
    /** Gets the set of properties for configuring the VideoEffectDefinition object. */
    /* CompleteClass */
    override var properties: IPropertySet = js.native
  }
  
  /** Represents the definition of a video transform effect. */
  @js.native
  /** Initializes a new instance of the VideoTransformEffectDefinition class. */
  class VideoTransformEffectDefinition ()
    extends typings.winrtUwp.Windows.Media.Effects.VideoTransformEffectDefinition {
    /** Gets the activatable class ID of the video transform effect definition. */
    /* CompleteClass */
    override var activatableClassId: String = js.native
    /** Gets or sets the rectangle within which the video will be cropped, specified in pixels. */
    /* CompleteClass */
    override var cropRectangle: Rect = js.native
    /** Gets or sets the direction in which the video will be mirrored. */
    /* CompleteClass */
    override var mirror: MediaMirroringOptions = js.native
    /** Gets or sets the output size of the video, in pixels. */
    /* CompleteClass */
    override var outputSize: Size = js.native
    /** Gets or sets the color that will be used to fill pixels in the frame that are not filled with video, such as when video is letterboxed. */
    /* CompleteClass */
    override var paddingColor: Color = js.native
    /** Gets or sets the media processing algorithm that is used for the video transform. */
    /* CompleteClass */
    override var processingAlgorithm: MediaVideoProcessingAlgorithm = js.native
    /** Gets the set of properties for configuring the VideoTransformEffectDefinition object. */
    /* CompleteClass */
    override var properties: IPropertySet = js.native
    /** Gets or sets the angle and direction in which the video will be rotated. */
    /* CompleteClass */
    override var rotation: MediaRotation = js.native
  }
  
  /** Defines values for audio effect types. */
  @js.native
  object AudioEffectType extends js.Object {
    /* 1 */ val acousticEchoCancellation: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.acousticEchoCancellation with Double = js.native
    /* 3 */ val automaticGainControl: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.automaticGainControl with Double = js.native
    /* 8 */ val bassBoost: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.bassBoost with Double = js.native
    /* 13 */ val bassManagement: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.bassManagement with Double = js.native
    /* 4 */ val beamForming: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.beamForming with Double = js.native
    /* 5 */ val constantToneRemoval: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.constantToneRemoval with Double = js.native
    /* 17 */ val dynamicRangeCompression: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.dynamicRangeCompression with Double = js.native
    /* 14 */ val environmentalEffects: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.environmentalEffects with Double = js.native
    /* 6 */ val equalizer: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.equalizer with Double = js.native
    /* 7 */ val loudnessEqualizer: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.loudnessEqualizer with Double = js.native
    /* 2 */ val noiseSuppression: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.noiseSuppression with Double = js.native
    /* 0 */ val other: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.other with Double = js.native
    /* 12 */ val roomCorrection: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.roomCorrection with Double = js.native
    /* 16 */ val speakerCompensation: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.speakerCompensation with Double = js.native
    /* 11 */ val speakerFill: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.speakerFill with Double = js.native
    /* 15 */ val speakerProtection: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.speakerProtection with Double = js.native
    /* 10 */ val virtualHeadphones: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.virtualHeadphones with Double = js.native
    /* 9 */ val virtualSurround: typings.winrtUwp.Windows.Media.Effects.AudioEffectType.virtualSurround with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Effects.AudioEffectType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object AudioEffectsManager extends js.Object {
    /**
      * Creates a AudioCaptureEffectsManager object for the specified device for a specific media category.
      * @param deviceId The device id.
      * @param category The media category.
      * @return The new audio capture effects manager.
      */
    def createAudioCaptureEffectsManager(deviceId: String, category: MediaCategory): typings.winrtUwp.Windows.Media.Effects.AudioCaptureEffectsManager = js.native
    /**
      * Creates a AudioCaptureEffectsManager object for the specified device for a specific media category and audio processing mode.
      * @param deviceId The device id.
      * @param category The media category.
      * @param mode The audio processing mode.
      * @return The new audio capture effects manager.
      */
    def createAudioCaptureEffectsManager(deviceId: String, category: MediaCategory, mode: typings.winrtUwp.Windows.Media.AudioProcessing): typings.winrtUwp.Windows.Media.Effects.AudioCaptureEffectsManager = js.native
    /**
      * Creates a AudioRenderEffectsManager object for the specified device for a specific media category and audio processing mode.
      * @param deviceId The device id.
      * @param category The audio render category.
      * @return The new audio render effects manager.
      */
    def createAudioRenderEffectsManager(deviceId: String, category: AudioRenderCategory): typings.winrtUwp.Windows.Media.Effects.AudioRenderEffectsManager = js.native
    /**
      * Creates a AudioRenderEffectsManager object for the specified device for a specific media category.
      * @param deviceId The device id.
      * @param category The audio render category.
      * @param mode The audio precessing mode.
      * @return The new audio render effects manager.
      */
    def createAudioRenderEffectsManager(
      deviceId: String,
      category: AudioRenderCategory,
      mode: typings.winrtUwp.Windows.Media.AudioProcessing
    ): typings.winrtUwp.Windows.Media.Effects.AudioRenderEffectsManager = js.native
  }
  
  /** Specifies the reason why a media effect was closed. */
  @js.native
  object MediaEffectClosedReason extends js.Object {
    /* 0 */ val done: typings.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason.done with Double = js.native
    /* 3 */ val effectCurrentlyUnloaded: typings.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason.effectCurrentlyUnloaded with Double = js.native
    /* 1 */ val unknownError: typings.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason.unknownError with Double = js.native
    /* 2 */ val unsupportedEncodingFormat: typings.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason.unsupportedEncodingFormat with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Effects.MediaEffectClosedReason with Double] = js.native
  }
  
  /** Specifies the types of memory that can be used for a media operation. */
  @js.native
  object MediaMemoryTypes extends js.Object {
    /* 1 */ val cpu: typings.winrtUwp.Windows.Media.Effects.MediaMemoryTypes.cpu with Double = js.native
    /* 0 */ val gpu: typings.winrtUwp.Windows.Media.Effects.MediaMemoryTypes.gpu with Double = js.native
    /* 2 */ val gpuAndCpu: typings.winrtUwp.Windows.Media.Effects.MediaMemoryTypes.gpuAndCpu with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Effects.MediaMemoryTypes with Double] = js.native
  }
  
}

