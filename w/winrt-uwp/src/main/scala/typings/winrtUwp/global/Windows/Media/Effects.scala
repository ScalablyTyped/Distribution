package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Media.Capture.MediaCategory
import typings.winrtUwp.Windows.Media.Render.AudioRenderCategory
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
    extends typings.winrtUwp.Windows.Media.Effects.AudioEffect
  
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
    extends typings.winrtUwp.Windows.Media.Effects.CompositeVideoFrameContext
  
  /** Provides context for performing a custom audio effect operation within the ProcessFrame method. */
  @js.native
  abstract class ProcessAudioFrameContext ()
    extends typings.winrtUwp.Windows.Media.Effects.ProcessAudioFrameContext
  
  /** Provides context for performing a custom video effect operation within the ProcessFrame method. */
  @js.native
  abstract class ProcessVideoFrameContext ()
    extends typings.winrtUwp.Windows.Media.Effects.ProcessVideoFrameContext
  
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
  }
  
  /** Represents the definition of a video transform effect. */
  @js.native
  /** Initializes a new instance of the VideoTransformEffectDefinition class. */
  class VideoTransformEffectDefinition ()
    extends typings.winrtUwp.Windows.Media.Effects.VideoTransformEffectDefinition
  
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

