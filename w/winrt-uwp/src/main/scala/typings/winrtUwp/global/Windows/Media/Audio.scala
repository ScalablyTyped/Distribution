package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus
import typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus
import typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus
import typings.winrtUwp.Windows.Media.Audio.AudioGraphUnrecoverableError
import typings.winrtUwp.Windows.Media.Audio.IAudioNode
import typings.winrtUwp.Windows.Media.Audio.QuantumSizeSelectionMode
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import typings.winrtUwp.Windows.Media.Render.AudioRenderCategory
import typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason
import typings.winrtUwp.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for routing, mixing, and processing audio. */
object Audio {
  
  @JSGlobal("Windows.Media.Audio")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an audio device input node. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.AudioDeviceInputNode")
  @js.native
  open class AudioDeviceInputNode ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.AudioDeviceInputNode
  
  /** Defines status values for audio device node creation. */
  @JSGlobal("Windows.Media.Audio.AudioDeviceNodeCreationStatus")
  @js.native
  object AudioDeviceNodeCreationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus & Double] = js.native
    
    /* 4 */ val accessDenied: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.accessDenied & Double = js.native
    
    /* 1 */ val deviceNotAvailable: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.deviceNotAvailable & Double = js.native
    
    /* 2 */ val formatNotSupported: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.formatNotSupported & Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.success & Double = js.native
    
    /* 3 */ val unknownFailure: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.unknownFailure & Double = js.native
  }
  
  /** Represents an audio device output node. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.AudioDeviceOutputNode")
  @js.native
  open class AudioDeviceOutputNode ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.AudioDeviceOutputNode {
    
    /** Closes the audio device output node. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets or sets a value indicating if the audio device output node consumes input. */
    /* CompleteClass */
    var consumeInput: Boolean = js.native
    
    /** Gets information about the audio device. */
    /* CompleteClass */
    var device: DeviceInformation = js.native
    
    /**
      * Disables all effects in the EffectDefinitions list with the specified effect definition.
      * @param definition The effect definition of the effects to disable.
      */
    /* CompleteClass */
    override def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
    
    /** Gets the list of effect definitions for the audio device output node. */
    /* CompleteClass */
    var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
    
    /**
      * Enables all effects in the EffectDefinitions list with the specified effect definition.
      * @param definition The effect definition of the effects to enable.
      */
    /* CompleteClass */
    override def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
    
    /** Gets the encoding properties for the audio device output node. */
    /* CompleteClass */
    var encodingProperties: AudioEncodingProperties = js.native
    
    /** Gets or sets the outgoing gain for the audio device output node. */
    /* CompleteClass */
    var outgoingGain: Double = js.native
    
    /** Resets the audio device output node. */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /** Starts the audio device output node. */
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /** Stops the audio device output node. */
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  /** Represents an audio file input node. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.AudioFileInputNode")
  @js.native
  open class AudioFileInputNode ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.AudioFileInputNode
  
  /** Defines status values for audio file node creation. */
  @JSGlobal("Windows.Media.Audio.AudioFileNodeCreationStatus")
  @js.native
  object AudioFileNodeCreationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus & Double] = js.native
    
    /* 1 */ val fileNotFound: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.fileNotFound & Double = js.native
    
    /* 3 */ val formatNotSupported: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.formatNotSupported & Double = js.native
    
    /* 2 */ val invalidFileType: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.invalidFileType & Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.success & Double = js.native
    
    /* 4 */ val unknownFailure: typings.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus.unknownFailure & Double = js.native
  }
  
  /** Represents an audio file output node. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.AudioFileOutputNode")
  @js.native
  open class AudioFileOutputNode ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.AudioFileOutputNode {
    
    /** Closes the audio file output node. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets or sets a value indicating if the audio file output node consumes input. */
    /* CompleteClass */
    var consumeInput: Boolean = js.native
    
    /**
      * Disables all effects in the EffectDefinitions list with the specified effect definition.
      * @param definition The effect definition of the effects to disable.
      */
    /* CompleteClass */
    override def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
    
    /** Gets the list of effect definitions for the audio file output node. */
    /* CompleteClass */
    var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
    
    /**
      * Enables all effects in the EffectDefinitions list with the specified effect definition.
      * @param definition The effect definition of the effects to enable.
      */
    /* CompleteClass */
    override def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
    
    /** Gets the encoding properties for the audio file output node. */
    /* CompleteClass */
    var encodingProperties: AudioEncodingProperties = js.native
    
    /** Gets the file associated with the audio file output node. */
    /* CompleteClass */
    var file: IStorageFile = js.native
    
    /** Gets the file encoding profile supported by the audio file output node. */
    /* CompleteClass */
    var fileEncodingProfile: MediaEncodingProfile = js.native
    
    /**
      * Finalizes the asynchronous operation of the audio file output node.
      * @return When this operation completes, a TranscodeFailureReason value is returned.
      */
    /* CompleteClass */
    override def finalizeAsync(): IPromiseWithIAsyncOperation[TranscodeFailureReason] = js.native
    
    /** Gets or sets the outgoing gain for the audio file output node. */
    /* CompleteClass */
    var outgoingGain: Double = js.native
    
    /** Resets the audio file output node. */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /** Starts the audio file output node. */
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /** Stops the audio file output node. */
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  /** Represents arguments for an AudioFrameCompleted event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.AudioFrameCompletedEventArgs")
  @js.native
  open class AudioFrameCompletedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.AudioFrameCompletedEventArgs {
    
    /** Gets the audio frame that was just completed by the AudioFrameInputNode . A frame is completed when all of the audio in the frame has been consumed by the audio graph. */
    /* CompleteClass */
    var frame: typings.winrtUwp.Windows.Media.AudioFrame = js.native
  }
  
  /** Represents an audio frame input node. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.AudioFrameInputNode")
  @js.native
  open class AudioFrameInputNode ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.AudioFrameInputNode
  
  /** Represents an audio frame output node. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.AudioFrameOutputNode")
  @js.native
  open class AudioFrameOutputNode ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.AudioFrameOutputNode {
    
    /** Closes the audio frame output node. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets or sets a value indicating if the audio frame output node consumes input. */
    /* CompleteClass */
    var consumeInput: Boolean = js.native
    
    /**
      * Disables all effects in the EffectDefinitions list with the specified effect definition.
      * @param definition The effect definition of the effects to disable.
      */
    /* CompleteClass */
    override def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
    
    /** Gets the list of effect definitions for the audio frame output node. */
    /* CompleteClass */
    var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
    
    /**
      * Enables all effects in the EffectDefinitions list with the specified effect definition.
      * @param definition The effect definition of the effects to enable.
      */
    /* CompleteClass */
    override def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
    
    /** Gets the encoding properties for the audio frame output node. */
    /* CompleteClass */
    var encodingProperties: AudioEncodingProperties = js.native
    
    /**
      * Gets an audio frame containing all of the data accumulated by this node since the previous call to GetFrame. If GetFrame has not yet been called, the audio frame will contain all of the data accumulated since the node was created.
      * @return An AudioFrame object representing the frame.
      */
    /* CompleteClass */
    override def getFrame(): typings.winrtUwp.Windows.Media.AudioFrame = js.native
    
    /** Gets or sets the outgoing gain for the audio frame output node. */
    /* CompleteClass */
    var outgoingGain: Double = js.native
    
    /** Resets the audio frame output node. */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /** Starts the audio frame output node. */
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /** Stops the audio frame output node. */
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  /** Represents an audio graph of connected input, output, and submix nodes that manipulate and route audio. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.AudioGraph")
  @js.native
  open class AudioGraph ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.AudioGraph
  object AudioGraph {
    
    @JSGlobal("Windows.Media.Audio.AudioGraph")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an audio graph with specific settings.
      * @param settings An AudioGraphSettings object representing the source audio file.
      * @return When this operation completes, a CreateAudioGraphResult object is returned.
      */
    /* static member */
    inline def createAsync(settings: typings.winrtUwp.Windows.Media.Audio.AudioGraphSettings): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Audio.CreateAudioGraphResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(settings.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Audio.CreateAudioGraphResult]]
  }
  
  /** Represents a connection within an audio graph. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.AudioGraphConnection")
  @js.native
  open class AudioGraphConnection ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.AudioGraphConnection {
    
    /** Gets the destination node for the connection. */
    /* CompleteClass */
    var destination: IAudioNode = js.native
    
    /** Gets the gain associated with the audio graph connection. */
    /* CompleteClass */
    var gain: Double = js.native
  }
  
  /** Defines status values for audio graph creation. */
  @JSGlobal("Windows.Media.Audio.AudioGraphCreationStatus")
  @js.native
  object AudioGraphCreationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus & Double] = js.native
    
    /* 1 */ val deviceNotAvailable: typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus.deviceNotAvailable & Double = js.native
    
    /* 2 */ val formatNotSupported: typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus.formatNotSupported & Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus.success & Double = js.native
    
    /* 3 */ val unknownFailure: typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus.unknownFailure & Double = js.native
  }
  
  /** Represents initialization settings for an audio graph. Set the properties of this object to your desired values and then call AudioGraph::CreateAsync to create a new audio graph instance with the specified settings. */
  @JSGlobal("Windows.Media.Audio.AudioGraphSettings")
  @js.native
  open class AudioGraphSettings protected ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.AudioGraphSettings {
    /**
      * Initializes a new instance of the AudioGraphSettings class with initial settings values optimized for the specified AudioRenderCategory .
      * @param audioRenderCategory The AudioRenderCategory that determines the initial settings values.
      */
    def this(audioRenderCategory: AudioRenderCategory) = this()
    
    /** Gets or sets a value that indicates the audio render category setting for the audio graph. */
    /* CompleteClass */
    var audioRenderCategory: AudioRenderCategory = js.native
    
    /** Gets or sets a value that indicates the desired audio processing mode setting for the audio graph. */
    /* CompleteClass */
    var desiredRenderDeviceAudioProcessing: typings.winrtUwp.Windows.Media.AudioProcessing = js.native
    
    /** Gets or sets the desired number of samples per quantum defined for the audio graph. */
    /* CompleteClass */
    var desiredSamplesPerQuantum: Double = js.native
    
    /** Gets or sets the audio encoding properties setting for the audio graph. */
    /* CompleteClass */
    var encodingProperties: AudioEncodingProperties = js.native
    
    /** Gets or sets an object that represents the primary render device for the audio graph. */
    /* CompleteClass */
    var primaryRenderDevice: DeviceInformation = js.native
    
    /** Gets or sets the quantum size selection mode for the audio graph. */
    /* CompleteClass */
    var quantumSizeSelectionMode: QuantumSizeSelectionMode = js.native
  }
  
  /** Defines unrecoverable errors for the audio graph. */
  @JSGlobal("Windows.Media.Audio.AudioGraphUnrecoverableError")
  @js.native
  object AudioGraphUnrecoverableError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Audio.AudioGraphUnrecoverableError & Double] = js.native
    
    /* 1 */ val audioDeviceLost: typings.winrtUwp.Windows.Media.Audio.AudioGraphUnrecoverableError.audioDeviceLost & Double = js.native
    
    /* 2 */ val audioSessionDisconnected: typings.winrtUwp.Windows.Media.Audio.AudioGraphUnrecoverableError.audioSessionDisconnected & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Media.Audio.AudioGraphUnrecoverableError.none & Double = js.native
    
    /* 3 */ val unknownFailure: typings.winrtUwp.Windows.Media.Audio.AudioGraphUnrecoverableError.unknownFailure & Double = js.native
  }
  
  /** Represents arguments for an UnrecoverableErrorOccurred event. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.AudioGraphUnrecoverableErrorOccurredEventArgs")
  @js.native
  open class AudioGraphUnrecoverableErrorOccurredEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.AudioGraphUnrecoverableErrorOccurredEventArgs {
    
    /** Gets the error associated with the event. */
    /* CompleteClass */
    var error: AudioGraphUnrecoverableError = js.native
  }
  
  /** Represents an audio submix node that mixes the output of one or more nodes into single output that can be connected to output nodes or other submix nodes. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.AudioSubmixNode")
  @js.native
  open class AudioSubmixNode ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.AudioSubmixNode
  
  /** Represents the result of creating an audio device input node. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.CreateAudioDeviceInputNodeResult")
  @js.native
  open class CreateAudioDeviceInputNodeResult ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.CreateAudioDeviceInputNodeResult {
    
    /** Gets the audio device input node. */
    /* CompleteClass */
    var deviceInputNode: typings.winrtUwp.Windows.Media.Audio.AudioDeviceInputNode = js.native
    
    /** Gets the status of audio device input node creation. */
    /* CompleteClass */
    var status: AudioDeviceNodeCreationStatus = js.native
  }
  
  /** Represents the result of creating an audio device output node. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.CreateAudioDeviceOutputNodeResult")
  @js.native
  open class CreateAudioDeviceOutputNodeResult ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.CreateAudioDeviceOutputNodeResult {
    
    /** Gets the audio device output node. */
    /* CompleteClass */
    var deviceOutputNode: typings.winrtUwp.Windows.Media.Audio.AudioDeviceOutputNode = js.native
    
    /** Gets the status of audio device output node creation. */
    /* CompleteClass */
    var status: AudioDeviceNodeCreationStatus = js.native
  }
  
  /** Represents the result of creating an audio file input node. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.CreateAudioFileInputNodeResult")
  @js.native
  open class CreateAudioFileInputNodeResult ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.CreateAudioFileInputNodeResult {
    
    /** Gets the audio file input node. */
    /* CompleteClass */
    var fileInputNode: typings.winrtUwp.Windows.Media.Audio.AudioFileInputNode = js.native
    
    /** Gets the status of audio file input node creation. */
    /* CompleteClass */
    var status: AudioFileNodeCreationStatus = js.native
  }
  
  /** Represents the result of creating an audio file output node. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.CreateAudioFileOutputNodeResult")
  @js.native
  open class CreateAudioFileOutputNodeResult ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.CreateAudioFileOutputNodeResult {
    
    /** Gets the audio file output node. */
    /* CompleteClass */
    var fileOutputNode: typings.winrtUwp.Windows.Media.Audio.AudioFileOutputNode = js.native
    
    /** Gets the status of audio file output node creation. */
    /* CompleteClass */
    var status: AudioFileNodeCreationStatus = js.native
  }
  
  /** Represents the result of creating an audio graph. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.CreateAudioGraphResult")
  @js.native
  open class CreateAudioGraphResult ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.CreateAudioGraphResult {
    
    /** Gets the audio graph object. */
    /* CompleteClass */
    var graph: typings.winrtUwp.Windows.Media.Audio.AudioGraph = js.native
    
    /** Gets the status of audio graph creation. */
    /* CompleteClass */
    var status: AudioGraphCreationStatus = js.native
  }
  
  /** Represents an echo effect definition supported by the audio graph. */
  @JSGlobal("Windows.Media.Audio.EchoEffectDefinition")
  @js.native
  open class EchoEffectDefinition protected ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.EchoEffectDefinition {
    /**
      * Creates an EchoEffectDefinition object.
      * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
      */
    def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
    
    /** Gets the activatable class ID for the echo effect definition object. */
    /* CompleteClass */
    var activatableClassId: String = js.native
    
    /** Gets or sets the delay supported by the echo effect definition. */
    /* CompleteClass */
    var delay: Double = js.native
    
    /** Gets or sets the feedback included in the echo effect definition. */
    /* CompleteClass */
    var feedback: Double = js.native
    
    /** Gets or sets the properties supported by the echo effect definition. */
    /* CompleteClass */
    var properties: IPropertySet = js.native
    
    /** Gets or sets the wet-dry audio voice mix for the echo effect definition. */
    /* CompleteClass */
    var wetDryMix: Double = js.native
  }
  
  /** Represents an equalizer band for the equalizer effect. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.EqualizerBand")
  @js.native
  open class EqualizerBand ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.EqualizerBand {
    
    /** Gets or sets the bandwidth for the equalizer band. */
    /* CompleteClass */
    var bandwidth: Double = js.native
    
    /** Gets or sets the frequency center for the equalizer band. */
    /* CompleteClass */
    var frequencyCenter: Double = js.native
    
    /** Gets or sets the gain for the equalizer band. */
    /* CompleteClass */
    var gain: Double = js.native
  }
  
  /** Represents an equalizer effect definition supported by the audio graph. */
  @JSGlobal("Windows.Media.Audio.EqualizerEffectDefinition")
  @js.native
  open class EqualizerEffectDefinition protected ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.EqualizerEffectDefinition {
    /**
      * Initializes a new instance of the EqualizerEffectDefinition class.
      * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
      */
    def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
    
    /** Gets the activatable class ID for the equalizer effect definition object. */
    /* CompleteClass */
    var activatableClassId: String = js.native
    
    /** Gets the bands included in the equalizer effect definition. */
    /* CompleteClass */
    var bands: IVectorView[typings.winrtUwp.Windows.Media.Audio.EqualizerBand] = js.native
    
    /** Gets the properties supported by the equalizer effect definition. */
    /* CompleteClass */
    var properties: IPropertySet = js.native
  }
  
  /** Provides data for the AudioFrameInputNode::QuantumStarted event. This event is raised when the audio graph containing the audio frame input node is ready to begin processing a new quantum of data. */
  /* note: abstract class */ @JSGlobal("Windows.Media.Audio.FrameInputNodeQuantumStartedEventArgs")
  @js.native
  open class FrameInputNodeQuantumStartedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.FrameInputNodeQuantumStartedEventArgs {
    
    /** Gets the number of samples that the audio graph requires to fill the quantum with data. */
    /* CompleteClass */
    var requiredSamples: Double = js.native
  }
  
  /** Represents a limiter effect definition supported by the audio graph. */
  @JSGlobal("Windows.Media.Audio.LimiterEffectDefinition")
  @js.native
  open class LimiterEffectDefinition protected ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.LimiterEffectDefinition {
    /**
      * Initializes a new instance of the LimiterEffectDefinition class.
      * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
      */
    def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
    
    /** Gets the activatable class ID for the limiter effect definition object. */
    /* CompleteClass */
    var activatableClassId: String = js.native
    
    /** Gets or sets the loudness included in the limiter effect definition. */
    /* CompleteClass */
    var loudness: Double = js.native
    
    /** Gets the properties supported by the limiter effect definition. */
    /* CompleteClass */
    var properties: IPropertySet = js.native
    
    /** Gets or sets the release included in the limiter effect definition. */
    /* CompleteClass */
    var release: Double = js.native
  }
  
  /** Defines values used for quantum size selection. */
  @JSGlobal("Windows.Media.Audio.QuantumSizeSelectionMode")
  @js.native
  object QuantumSizeSelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Audio.QuantumSizeSelectionMode & Double] = js.native
    
    /* 2 */ val closestToDesired: typings.winrtUwp.Windows.Media.Audio.QuantumSizeSelectionMode.closestToDesired & Double = js.native
    
    /* 1 */ val lowestLatency: typings.winrtUwp.Windows.Media.Audio.QuantumSizeSelectionMode.lowestLatency & Double = js.native
    
    /* 0 */ val systemDefault: typings.winrtUwp.Windows.Media.Audio.QuantumSizeSelectionMode.systemDefault & Double = js.native
  }
  
  /** Represents a reverberation effect definition supported by the audio graph. */
  @JSGlobal("Windows.Media.Audio.ReverbEffectDefinition")
  @js.native
  open class ReverbEffectDefinition protected ()
    extends StObject
       with typings.winrtUwp.Windows.Media.Audio.ReverbEffectDefinition {
    /**
      * Initializes a new instance of the ReverbffectDefinition class.
      * @param audioGraph The AudioGraph with which the effect will be used. Using effects outside of the audio graph it was created with is not supported.
      */
    def this(audioGraph: typings.winrtUwp.Windows.Media.Audio.AudioGraph) = this()
    
    /** Gets the activatable class ID for the reverberation effect definition object. */
    /* CompleteClass */
    var activatableClassId: String = js.native
    
    /** Gets or sets the decay time supported by the reverberation effect definition. */
    /* CompleteClass */
    var decayTime: Double = js.native
    
    /** Gets or sets the density included in the reverberation effect definition. */
    /* CompleteClass */
    var density: Double = js.native
    
    /** Gets or sets a value indicating if the reverberation effect disables late fields. */
    /* CompleteClass */
    var disableLateField: Boolean = js.native
    
    /** Gets or sets the early diffusion value for the reverberation effect definition. */
    /* CompleteClass */
    var earlyDiffusion: Double = js.native
    
    /** Gets or sets the high equalization cutoff included in the reverberation effect definition. */
    /* CompleteClass */
    var highEQCutoff: Double = js.native
    
    /** Gets or sets the high equalization gain included in the reverberation effect definition. */
    /* CompleteClass */
    var highEQGain: Double = js.native
    
    /** Gets or sets the late diffusion included in the reverberation effect definition. */
    /* CompleteClass */
    var lateDiffusion: Double = js.native
    
    /** Gets or sets the low equalization cutoff included in the reverberation effect definition. */
    /* CompleteClass */
    var lowEQCutoff: Double = js.native
    
    /** Gets or sets the low equalization gain included in the reverberation effect definition. */
    /* CompleteClass */
    var lowEQGain: Double = js.native
    
    /** Gets or sets the position left included in the reverberation effect definition. */
    /* CompleteClass */
    var positionLeft: Double = js.native
    
    /** Gets or sets the matrix position left included in the reverberation effect definition. */
    /* CompleteClass */
    var positionMatrixLeft: Double = js.native
    
    /** Gets or sets the matrix position right included in the reverberation effect definition. */
    /* CompleteClass */
    var positionMatrixRight: Double = js.native
    
    /** Gets or sets the position right included in the reverberation effect definition. */
    /* CompleteClass */
    var positionRight: Double = js.native
    
    /** Gets the properties supported by the reverberation effect definition. */
    /* CompleteClass */
    var properties: IPropertySet = js.native
    
    /** Gets or sets the rear delay included in the reverberation effect definition. */
    /* CompleteClass */
    var rearDelay: Double = js.native
    
    /** Gets or sets the reflections delay included in the reverberation effect definition. */
    /* CompleteClass */
    var reflectionsDelay: Double = js.native
    
    /** Gets or sets the reflections gain included in the reverberation effect definition. */
    /* CompleteClass */
    var reflectionsGain: Double = js.native
    
    /** Gets or sets the reverberation delay included in the reverberation effect definition. */
    /* CompleteClass */
    var reverbDelay: Double = js.native
    
    /** Gets or sets the reverberation gain included in the reverberation effect definition. */
    /* CompleteClass */
    var reverbGain: Double = js.native
    
    /** Gets or sets the room filter frequency included in the reverberation effect definition. */
    /* CompleteClass */
    var roomFilterFreq: Double = js.native
    
    /** Gets or sets the room filter high frequency included in the reverberation effect definition. */
    /* CompleteClass */
    var roomFilterHF: Double = js.native
    
    /** Gets or sets the main room filter included in the reverberation effect definition. */
    /* CompleteClass */
    var roomFilterMain: Double = js.native
    
    /** Gets or sets the room size included in the reverberation effect definition. */
    /* CompleteClass */
    var roomSize: Double = js.native
    
    /** Gets or sets the wet-dry audio voice mix for the reverberation effect definition. */
    /* CompleteClass */
    var wetDryMix: Double = js.native
  }
  
  @JSGlobal("Windows.Media.Audio.rame")
  @js.native
  def rame: Any = js.native
  inline def rame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rame")(x.asInstanceOf[js.Any])
  
  /* unmapped type */
  @JSGlobal("Windows.Media.Audio.rocessing")
  @js.native
  def rocessing: Any = js.native
  inline def rocessing_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rocessing")(x.asInstanceOf[js.Any])
  
  /* unmapped type */
  @JSGlobal("Windows.Media.Audio.uffer")
  @js.native
  def uffer: Any = js.native
  
  /* unmapped type */
  @JSGlobal("Windows.Media.Audio.ufferAccessMode")
  @js.native
  def ufferAccessMode: Any = js.native
  inline def ufferAccessMode_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ufferAccessMode")(x.asInstanceOf[js.Any])
  
  inline def uffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uffer")(x.asInstanceOf[js.Any])
}
