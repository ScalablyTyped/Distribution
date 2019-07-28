package typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.MediaNs.AudioProcessing
import typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.MediaCategory
import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties
import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile
import typings.winrtDashUwp.WindowsNs.StorageNs.IStorageFile
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.quantumprocessed
import typings.winrtDashUwp.winrtDashUwpStrings.quantumstarted
import typings.winrtDashUwp.winrtDashUwpStrings.unrecoverableerroroccurred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio graph of connected input, output, and submix nodes that manipulate and route audio. */
@JSGlobal("Windows.Media.Audio.AudioGraph")
@js.native
abstract class AudioGraph () extends js.Object {
  /** Gets the completed quantum count for the audio graph. */
  var completedQuantumCount: Double = js.native
  /** Gets the encoding properties for the audio graph. */
  var encodingProperties: AudioEncodingProperties = js.native
  /** Gets the latency in samples that the audio graph supports. */
  var latencyInSamples: Double = js.native
  /** Notifies that the audio graph has processed the specified quantum. */
  @JSName("onquantumprocessed")
  var onquantumprocessed_Original: TypedEventHandler[AudioGraph, _] = js.native
  /** Notifies that the audio graph has started processing a new quantum. */
  @JSName("onquantumstarted")
  var onquantumstarted_Original: TypedEventHandler[AudioGraph, _] = js.native
  /** Notifies of an unrecoverable audio error in audio graph operation. */
  @JSName("onunrecoverableerroroccurred")
  var onunrecoverableerroroccurred_Original: TypedEventHandler[AudioGraph, AudioGraphUnrecoverableErrorOccurredEventArgs] = js.native
  /** Gets the primary render device for the audio graph. */
  var primaryRenderDevice: DeviceInformation = js.native
  /** Gets a value that indicates the audio processing mode for the audio graph. */
  var renderDeviceAudioProcessing: AudioProcessing = js.native
  /** Gets the number of samples per quantum at which the audio graph is currently operating. */
  var samplesPerQuantum: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_quantumprocessed(`type`: quantumprocessed, listener: TypedEventHandler[AudioGraph, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_quantumstarted(`type`: quantumstarted, listener: TypedEventHandler[AudioGraph, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unrecoverableerroroccurred(
    `type`: unrecoverableerroroccurred,
    listener: TypedEventHandler[AudioGraph, AudioGraphUnrecoverableErrorOccurredEventArgs]
  ): Unit = js.native
  /** Closes the audio graph. */
  def close(): Unit = js.native
  /**
    * Creates a device input node for the indicated media.
    * @param category An enumeration value indicating the media category.
    * @return An asynchronous operation that returns a CreateAudioDeviceInputNodeResult on completion. This object exposes a Status property, that indicates either that the operation was successful or the reason why the operation failed. The DeviceInputNode property provides a reference to the created input node on success.
    */
  def createDeviceInputNodeAsync(category: MediaCategory): IPromiseWithIAsyncOperation[CreateAudioDeviceInputNodeResult] = js.native
  /**
    * Creates a device input node for the indicated media and audio encoding properties.
    * @param category An enumeration value indicating the media category.
    * @param encodingProperties An object representing the audio encoding properties for the device input node.
    * @return An asynchronous operation that returns a CreateAudioDeviceInputNodeResult on completion. This object exposes a Status property, that indicates either that the operation was successful or the reason why the operation failed. The DeviceInputNode property provides a reference to the created input node on success.
    */
  def createDeviceInputNodeAsync(category: MediaCategory, encodingProperties: AudioEncodingProperties): IPromiseWithIAsyncOperation[CreateAudioDeviceInputNodeResult] = js.native
  /**
    * Creates a device input node for the indicated media, audio encoding properties, and device information.
    * @param category An enumeration value indicating the media category.
    * @param encodingProperties An object representing the audio encoding properties for the device input node.
    * @param device An object representing the device associated with the device input node.
    * @return An asynchronous operation that returns a CreateAudioDeviceInputNodeResult on completion. This object exposes a Status property, that indicates either that the operation was successful or the reason why the operation failed. The DeviceInputNode property provides a reference to the created input node on success.
    */
  def createDeviceInputNodeAsync(category: MediaCategory, encodingProperties: AudioEncodingProperties, device: DeviceInformation): IPromiseWithIAsyncOperation[CreateAudioDeviceInputNodeResult] = js.native
  /**
    * Creates a new device output node for the audio graph.
    * @return An asynchronous operation that returns a CreateAudioDeviceOutputNodeResult on completion. This object exposes a Status property, that indicates either that the operation was successful or the reason why the operation failed. The DeviceOutputNode property provides a reference to the created output node on success.
    */
  def createDeviceOutputNodeAsync(): IPromiseWithIAsyncOperation[CreateAudioDeviceOutputNodeResult] = js.native
  /**
    * Creates a file input node for the audio graph.
    * @param file A IStorageFile object representing the file associated with the file input node.
    * @return When this operation completes, a CreateAudioFileInputNodeResult object is returned.
    */
  def createFileInputNodeAsync(file: IStorageFile): IPromiseWithIAsyncOperation[CreateAudioFileInputNodeResult] = js.native
  /**
    * Creates a file output node for the indicated file.
    * @param file A StorageFile object representing the file.
    * @return When this operation completes, a CreateAudioFileOutputNodeResult object is returned.
    */
  def createFileOutputNodeAsync(file: IStorageFile): IPromiseWithIAsyncOperation[CreateAudioFileOutputNodeResult] = js.native
  /**
    * Creates a file output node for the indicated file and media encoding profile.
    * @param file A StorageFile object representing the file.
    * @param fileEncodingProfile An objecting representing the media encoding profile.
    * @return When this operation completes, a CreateAudioFileOutputNodeResult object is returned.
    */
  def createFileOutputNodeAsync(file: IStorageFile, fileEncodingProfile: MediaEncodingProfile): IPromiseWithIAsyncOperation[CreateAudioFileOutputNodeResult] = js.native
  /**
    * Creates a simple audio frame input node for the audio graph.
    * @return An audio frame input node.
    */
  def createFrameInputNode(): AudioFrameInputNode = js.native
  /**
    * Creates an audio frame input node from encoding properties.
    * @param encodingProperties An object representing encoding properties.
    * @return An audio frame input node.
    */
  def createFrameInputNode(encodingProperties: AudioEncodingProperties): AudioFrameInputNode = js.native
  /**
    * Creates a simple frame output node for the audio graph.
    * @return An audio frame output node.
    */
  def createFrameOutputNode(): AudioFrameOutputNode = js.native
  /**
    * Creates a frame output node from encoding properties.
    * @param encodingProperties An object representing audio encoding properties.
    * @return An audio frame output node.
    */
  def createFrameOutputNode(encodingProperties: AudioEncodingProperties): AudioFrameOutputNode = js.native
  /**
    * Creates an audio graph submix node that mixes the output of one or more nodes into single output that can be connected to output nodes or other submix nodes.
    * @return An audio submix node.
    */
  def createSubmixNode(): AudioSubmixNode = js.native
  /**
    * Creates an audio graph submix node that mixes the output of one or more nodes into single output that can be connected to output nodes or other submix nodes.
    * @param encodingProperties An object representing audio encoding properties.
    * @return An audio submix node.
    */
  def createSubmixNode(encodingProperties: AudioEncodingProperties): AudioSubmixNode = js.native
  /** Notifies that the audio graph has processed the specified quantum. */
  def onquantumprocessed(ev: js.Any with WinRTEvent[AudioGraph]): Unit = js.native
  /** Notifies that the audio graph has started processing a new quantum. */
  def onquantumstarted(ev: js.Any with WinRTEvent[AudioGraph]): Unit = js.native
  /** Notifies of an unrecoverable audio error in audio graph operation. */
  def onunrecoverableerroroccurred(ev: AudioGraphUnrecoverableErrorOccurredEventArgs with WinRTEvent[AudioGraph]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_quantumprocessed(`type`: quantumprocessed, listener: TypedEventHandler[AudioGraph, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_quantumstarted(`type`: quantumstarted, listener: TypedEventHandler[AudioGraph, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unrecoverableerroroccurred(
    `type`: unrecoverableerroroccurred,
    listener: TypedEventHandler[AudioGraph, AudioGraphUnrecoverableErrorOccurredEventArgs]
  ): Unit = js.native
  /** Resets all nodes in the audio graph. */
  def resetAllNodes(): Unit = js.native
  /** Starts the audio graph. */
  def start(): Unit = js.native
  /** Stops the audio graph. */
  def stop(): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Media.Audio.AudioGraph")
@js.native
object AudioGraph extends js.Object {
  /**
    * Creates an audio graph with specific settings.
    * @param settings An AudioGraphSettings object representing the source audio file.
    * @return When this operation completes, a CreateAudioGraphResult object is returned.
    */
  def createAsync(settings: AudioGraphSettings): IPromiseWithIAsyncOperation[CreateAudioGraphResult] = js.native
}

