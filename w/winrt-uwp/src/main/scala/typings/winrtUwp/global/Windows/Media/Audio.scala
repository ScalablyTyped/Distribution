package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Media.Render.AudioRenderCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for routing, mixing, and processing audio. */
object Audio {
  
  @JSGlobal("Windows.Media.Audio")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an audio device input node. */
  @JSGlobal("Windows.Media.Audio.AudioDeviceInputNode")
  @js.native
  abstract class AudioDeviceInputNode ()
    extends typings.winrtUwp.Windows.Media.Audio.AudioDeviceInputNode
  
  /** Defines status values for audio device node creation. */
  @JSGlobal("Windows.Media.Audio.AudioDeviceNodeCreationStatus")
  @js.native
  object AudioDeviceNodeCreationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus with Double] = js.native
    
    /* 4 */ val accessDenied: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.accessDenied with Double = js.native
    
    /* 1 */ val deviceNotAvailable: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.deviceNotAvailable with Double = js.native
    
    /* 2 */ val formatNotSupported: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.formatNotSupported with Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.success with Double = js.native
    
    /* 3 */ val unknownFailure: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.unknownFailure with Double = js.native
  }
  
  /** Represents an audio device output node. */
  @JSGlobal("Windows.Media.Audio.AudioDeviceOutputNode")
  @js.native
  abstract class AudioDeviceOutputNode ()
    extends typings.winrtUwp.Windows.Media.Audio.AudioDeviceOutputNode
  
  /** Represents an audio file input node. */
  @JSGlobal("Windows.Media.Audio.AudioFileInputNode")
  @js.native
  abstract class AudioFileInputNode ()
    extends typings.winrtUwp.Windows.Media.Audio.AudioFileInputNode
  
  /** Defines status values for audio file node creation. */
  @JSGlobal("Windows.Media.Audio.AudioFileNodeCreationStatus")
  @js.native
  object AudioFileNodeCreationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus with Double] = js.native
    
    /* 1 */ val fileNotFound: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.fileNotFound with Double = js.native
    
    /* 3 */ val formatNotSupported: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.formatNotSupported with Double = js.native
    
    /* 2 */ val invalidFileType: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.invalidFileType with Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.success with Double = js.native
    
    /* 4 */ val unknownFailure: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.unknownFailure with Double = js.native
  }
  
  /** Represents an audio file output node. */
  @JSGlobal("Windows.Media.Audio.AudioFileOutputNode")
  @js.native
  abstract class AudioFileOutputNode ()
    extends typings.winrtUwp.Windows.Media.Audio.AudioFileOutputNode
  
  /** Represents arguments for an AudioFrameCompleted event. */
  @JSGlobal("Windows.Media.Audio.AudioFrameCompletedEventArgs")
  @js.native
  abstract class AudioFrameCompletedEventArgs ()
    extends typings.winrtUwp.Windows.Media.Audio.AudioFrameCompletedEventArgs
  
  /** Represents an audio frame input node. */
  @JSGlobal("Windows.Media.Audio.AudioFrameInputNode")
  @js.native
  abstract class AudioFrameInputNode ()
    extends typings.winrtUwp.Windows.Media.Audio.AudioFrameInputNode
  
  /** Represents an audio frame output node. */
  @JSGlobal("Windows.Media.Audio.AudioFrameOutputNode")
  @js.native
  abstract class AudioFrameOutputNode ()
    extends typings.winrtUwp.Windows.Media.Audio.AudioFrameOutputNode
  
  /** Represents an audio graph of connected input, output, and submix nodes that manipulate and route audio. */
  @JSGlobal("Windows.Media.Audio.AudioGraph")
  @js.native
  abstract class AudioGraph ()
    extends typings.winrtUwp.Windows.Media.Audio.AudioGraph
  object AudioGraph {
    
    /**
      * Creates an audio graph with specific settings.
      * @param settings An AudioGraphSettings object representing the source audio file.
      * @return When this operation completes, a CreateAudioGraphResult object is returned.
      */
    /* static member */
    @JSGlobal("Windows.Media.Audio.AudioGraph.createAsync")
    @js.native
    def createAsync(settings: typings.winrtUwp.Windows.Media.Audio.AudioGraphSettings): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Audio.CreateAudioGraphResult] = js.native
  }
  
  /** Represents a connection within an audio graph. */
  @JSGlobal("Windows.Media.Audio.AudioGraphConnection")
  @js.native
  abstract class AudioGraphConnection ()
    extends typings.winrtUwp.Windows.Media.Audio.AudioGraphConnection
  
  /** Defines status values for audio graph creation. */
  @JSGlobal("Windows.Media.Audio.AudioGraphCreationStatus")
  @js.native
  object AudioGraphCreationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus with Double] = js.native
    
    /* 1 */ val deviceNotAvailable: typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus.deviceNotAvailable with Double = js.native
    
    /* 2 */ val formatNotSupported: typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus.formatNotSupported with Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus.success with Double = js.native
    
    /* 3 */ val unknownFailure: typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus.unknownFailure with Double = js.native
  }
  
  /** Represents initialization settings for an audio graph. Set the properties of this object to your desired values and then call AudioGraph::CreateAsync to create a new audio graph instance with the specified settings. */
  @JSGlobal("Windows.Media.Audio.AudioGraphSettings")
  @js.native
  class AudioGraphSettings protected ()
    extends typings.winrtUwp.Windows.Media.Audio.AudioGraphSettings {
    /**
      * Initializes a new instance of the AudioGraphSettings class with initial settings values optimized for the specified AudioRenderCategory .
      * @param audioRenderCategory The AudioRenderCategory that determines the initial settings values.
      */
    def this(audioRenderCategory: AudioRenderCategory) = this()
  }
  
  /** Defines unrecoverable errors for the audio graph. */
  @JSGlobal("Windows.Media.Audio.AudioGraphUnrecoverableError")
  @js.native
  object AudioGraphUnrecoverableError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Audio.AudioGraphUnrecoverableError with Double] = js.native
    
    /* 1 */ val audioDeviceLost: typings.winrtUwp.Windows.Media.Audio.AudioGraphUnrecoverableError.audioDeviceLost with Double = js.native
    
    /* 2 */ val audioSessionDisconnected: typings.winrtUwp.Windows.Media.Audio.AudioGraphUnrecoverableError.audioSessionDisconnected with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Media.Audio.AudioGraphUnrecoverableError.none with Double = js.native
    
    /* 3 */ val unknownFailure: typings.winrtUwp.Windows.Media.Audio.AudioGraphUnrecoverableError.unknownFailure with Double = js.native
  }
  
  /** Represents arguments for an UnrecoverableErrorOccurred event. */
  @JSGlobal("Windows.Media.Audio.AudioGraphUnrecoverableErrorOccurredEventArgs")
  @js.native
  abstract class AudioGraphUnrecoverableErrorOccurredEventArgs ()
    extends typings.winrtUwp.Windows.Media.Audio.AudioGraphUnrecoverableErrorOccurredEventArgs
  
  /** Represents an audio submix node that mixes the output of one or more nodes into single output that can be connected to output nodes or other submix nodes. */
  @JSGlobal("Windows.Media.Audio.AudioSubmixNode")
  @js.native
  abstract class AudioSubmixNode ()
    extends typings.winrtUwp.Windows.Media.Audio.AudioSubmixNode
  
  /** Represents the result of creating an audio device input node. */
  @JSGlobal("Windows.Media.Audio.CreateAudioDeviceInputNodeResult")
  @js.native
  abstract class CreateAudioDeviceInputNodeResult ()
    extends typings.winrtUwp.Windows.Media.Audio.CreateAudioDeviceInputNodeResult
  
  /** Represents the result of creating an audio device output node. */
  @JSGlobal("Windows.Media.Audio.CreateAudioDeviceOutputNodeResult")
  @js.native
  abstract class CreateAudioDeviceOutputNodeResult ()
    extends typings.winrtUwp.Windows.Media.Audio.CreateAudioDeviceOutputNodeResult
  
  /** Represents the result of creating an audio file input node. */
  @JSGlobal("Windows.Media.Audio.CreateAudioFileInputNodeResult")
  @js.native
  abstract class CreateAudioFileInputNodeResult ()
    extends typings.winrtUwp.Windows.Media.Audio.CreateAudioFileInputNodeResult
  
  /** Represents the result of creating an audio file output node. */
  @JSGlobal("Windows.Media.Audio.CreateAudioFileOutputNodeResult")
  @js.native
  abstract class CreateAudioFileOutputNodeResult ()
    extends typings.winrtUwp.Windows.Media.Audio.CreateAudioFileOutputNodeResult
  
  /** Represents the result of creating an audio graph. */
  @JSGlobal("Windows.Media.Audio.CreateAudioGraphResult")
  @js.native
  abstract class CreateAudioGraphResult ()
    extends typings.winrtUwp.Windows.Media.Audio.CreateAudioGraphResult
  
  /** Represents an echo effect definition supported by the audio graph. */
  @JSGlobal("Windows.Media.Audio.EchoEffectDefinition")
  @js.native
  class EchoEffectDefinition protected ()
    extends typings.winrtUwp.Windows.Media.Audio.EchoEffectDefinition {
    /**
      * Creates an EchoEffectDefinition object.
      * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
      */
    def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
  }
  
  /** Represents an equalizer band for the equalizer effect. */
  @JSGlobal("Windows.Media.Audio.EqualizerBand")
  @js.native
  abstract class EqualizerBand ()
    extends typings.winrtUwp.Windows.Media.Audio.EqualizerBand
  
  /** Represents an equalizer effect definition supported by the audio graph. */
  @JSGlobal("Windows.Media.Audio.EqualizerEffectDefinition")
  @js.native
  class EqualizerEffectDefinition protected ()
    extends typings.winrtUwp.Windows.Media.Audio.EqualizerEffectDefinition {
    /**
      * Initializes a new instance of the EqualizerEffectDefinition class.
      * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
      */
    def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
  }
  
  /** Provides data for the AudioFrameInputNode::QuantumStarted event. This event is raised when the audio graph containing the audio frame input node is ready to begin processing a new quantum of data. */
  @JSGlobal("Windows.Media.Audio.FrameInputNodeQuantumStartedEventArgs")
  @js.native
  abstract class FrameInputNodeQuantumStartedEventArgs ()
    extends typings.winrtUwp.Windows.Media.Audio.FrameInputNodeQuantumStartedEventArgs
  
  /** Represents a limiter effect definition supported by the audio graph. */
  @JSGlobal("Windows.Media.Audio.LimiterEffectDefinition")
  @js.native
  class LimiterEffectDefinition protected ()
    extends typings.winrtUwp.Windows.Media.Audio.LimiterEffectDefinition {
    /**
      * Initializes a new instance of the LimiterEffectDefinition class.
      * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
      */
    def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
  }
  
  /** Defines values used for quantum size selection. */
  @JSGlobal("Windows.Media.Audio.QuantumSizeSelectionMode")
  @js.native
  object QuantumSizeSelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Audio.QuantumSizeSelectionMode with Double] = js.native
    
    /* 2 */ val closestToDesired: typings.winrtUwp.Windows.Media.Audio.QuantumSizeSelectionMode.closestToDesired with Double = js.native
    
    /* 1 */ val lowestLatency: typings.winrtUwp.Windows.Media.Audio.QuantumSizeSelectionMode.lowestLatency with Double = js.native
    
    /* 0 */ val systemDefault: typings.winrtUwp.Windows.Media.Audio.QuantumSizeSelectionMode.systemDefault with Double = js.native
  }
  
  /** Represents a reverberation effect definition supported by the audio graph. */
  @JSGlobal("Windows.Media.Audio.ReverbEffectDefinition")
  @js.native
  class ReverbEffectDefinition protected ()
    extends typings.winrtUwp.Windows.Media.Audio.ReverbEffectDefinition {
    /**
      * Initializes a new instance of the ReverbffectDefinition class.
      * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
      */
    def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
  }
  
  @JSGlobal("Windows.Media.Audio.rame")
  @js.native
  def rame: js.Any = js.native
  @scala.inline
  def rame_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rame")(x.asInstanceOf[js.Any])
  
  /* unmapped type */
  @JSGlobal("Windows.Media.Audio.rocessing")
  @js.native
  def rocessing: js.Any = js.native
  @scala.inline
  def rocessing_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rocessing")(x.asInstanceOf[js.Any])
  
  /* unmapped type */
  @JSGlobal("Windows.Media.Audio.uffer")
  @js.native
  def uffer: js.Any = js.native
  
  /* unmapped type */
  @JSGlobal("Windows.Media.Audio.ufferAccessMode")
  @js.native
  def ufferAccessMode: js.Any = js.native
  @scala.inline
  def ufferAccessMode_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ufferAccessMode")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def uffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uffer")(x.asInstanceOf[js.Any])
}
