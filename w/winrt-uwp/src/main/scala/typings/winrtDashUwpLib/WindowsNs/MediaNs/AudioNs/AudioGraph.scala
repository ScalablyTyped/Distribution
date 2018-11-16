package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio graph of connected input, output, and submix nodes that manipulate and route audio. */
@JSGlobal("Windows.Media.Audio.AudioGraph")
@js.native
abstract class AudioGraph () extends js.Object {
  /** Gets the completed quantum count for the audio graph. */
  var completedQuantumCount: scala.Double = js.native
  /** Gets the encoding properties for the audio graph. */
  var encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
  /** Gets the latency in samples that the audio graph supports. */
  var latencyInSamples: scala.Double = js.native
  /** Notifies that the audio graph has processed the specified quantum. */
  @JSName("onquantumprocessed")
  var onquantumprocessed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioGraph, _] = js.native
  /** Notifies that the audio graph has started processing a new quantum. */
  @JSName("onquantumstarted")
  var onquantumstarted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioGraph, _] = js.native
  /** Notifies of an unrecoverable audio error in audio graph operation. */
  @JSName("onunrecoverableerroroccurred")
  var onunrecoverableerroroccurred_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioGraph, AudioGraphUnrecoverableErrorOccurredEventArgs] = js.native
  /** Gets the primary render device for the audio graph. */
  var primaryRenderDevice: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation = js.native
  /** Gets a value that indicates the audio processing mode for the audio graph. */
  var renderDeviceAudioProcessing: winrtDashUwpLib.WindowsNs.MediaNs.AudioProcessing = js.native
  /** Gets the number of samples per quantum at which the audio graph is currently operating. */
  var samplesPerQuantum: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_quantumprocessed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.quantumprocessed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioGraph, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_quantumstarted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.quantumstarted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioGraph, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unrecoverableerroroccurred(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.unrecoverableerroroccurred,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioGraph, AudioGraphUnrecoverableErrorOccurredEventArgs]
  ): scala.Unit = js.native
  /** Closes the audio graph. */
  def close(): scala.Unit = js.native
  /**
                   * Creates a device input node for the indicated media.
                   * @param category An enumeration value indicating the media category.
                   * @return An asynchronous operation that returns a CreateAudioDeviceInputNodeResult on completion. This object exposes a Status property, that indicates either that the operation was successful or the reason why the operation failed. The DeviceInputNode property provides a reference to the created input node on success.
                   */
  def createDeviceInputNodeAsync(category: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCategory): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[CreateAudioDeviceInputNodeResult] = js.native
  /**
                   * Creates a device input node for the indicated media and audio encoding properties.
                   * @param category An enumeration value indicating the media category.
                   * @param encodingProperties An object representing the audio encoding properties for the device input node.
                   * @return An asynchronous operation that returns a CreateAudioDeviceInputNodeResult on completion. This object exposes a Status property, that indicates either that the operation was successful or the reason why the operation failed. The DeviceInputNode property provides a reference to the created input node on success.
                   */
  def createDeviceInputNodeAsync(
    category: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCategory,
    encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[CreateAudioDeviceInputNodeResult] = js.native
  /**
                   * Creates a device input node for the indicated media, audio encoding properties, and device information.
                   * @param category An enumeration value indicating the media category.
                   * @param encodingProperties An object representing the audio encoding properties for the device input node.
                   * @param device An object representing the device associated with the device input node.
                   * @return An asynchronous operation that returns a CreateAudioDeviceInputNodeResult on completion. This object exposes a Status property, that indicates either that the operation was successful or the reason why the operation failed. The DeviceInputNode property provides a reference to the created input node on success.
                   */
  def createDeviceInputNodeAsync(
    category: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaCategory,
    encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties,
    device: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[CreateAudioDeviceInputNodeResult] = js.native
  /**
                   * Creates a new device output node for the audio graph.
                   * @return An asynchronous operation that returns a CreateAudioDeviceOutputNodeResult on completion. This object exposes a Status property, that indicates either that the operation was successful or the reason why the operation failed. The DeviceOutputNode property provides a reference to the created output node on success.
                   */
  def createDeviceOutputNodeAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[CreateAudioDeviceOutputNodeResult] = js.native
  /**
                   * Creates a file input node for the audio graph.
                   * @param file A IStorageFile object representing the file associated with the file input node.
                   * @return When this operation completes, a CreateAudioFileInputNodeResult object is returned.
                   */
  def createFileInputNodeAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[CreateAudioFileInputNodeResult] = js.native
  /**
                   * Creates a file output node for the indicated file.
                   * @param file A StorageFile object representing the file.
                   * @return When this operation completes, a CreateAudioFileOutputNodeResult object is returned.
                   */
  def createFileOutputNodeAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[CreateAudioFileOutputNodeResult] = js.native
  /**
                   * Creates a file output node for the indicated file and media encoding profile.
                   * @param file A StorageFile object representing the file.
                   * @param fileEncodingProfile An objecting representing the media encoding profile.
                   * @return When this operation completes, a CreateAudioFileOutputNodeResult object is returned.
                   */
  def createFileOutputNodeAsync(
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    fileEncodingProfile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[CreateAudioFileOutputNodeResult] = js.native
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
  def createFrameInputNode(encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties): AudioFrameInputNode = js.native
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
  def createFrameOutputNode(encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties): AudioFrameOutputNode = js.native
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
  def createSubmixNode(encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties): AudioSubmixNode = js.native
  /** Notifies that the audio graph has processed the specified quantum. */
  def onquantumprocessed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[AudioGraph]): scala.Unit = js.native
  /** Notifies that the audio graph has started processing a new quantum. */
  def onquantumstarted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[AudioGraph]): scala.Unit = js.native
  /** Notifies of an unrecoverable audio error in audio graph operation. */
  def onunrecoverableerroroccurred(
    ev: AudioGraphUnrecoverableErrorOccurredEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AudioGraph]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_quantumprocessed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.quantumprocessed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioGraph, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_quantumstarted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.quantumstarted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioGraph, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unrecoverableerroroccurred(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.unrecoverableerroroccurred,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioGraph, AudioGraphUnrecoverableErrorOccurredEventArgs]
  ): scala.Unit = js.native
  /** Resets all nodes in the audio graph. */
  def resetAllNodes(): scala.Unit = js.native
  /** Starts the audio graph. */
  def start(): scala.Unit = js.native
  /** Stops the audio graph. */
  def stop(): scala.Unit = js.native
}

/** Represents an audio graph of connected input, output, and submix nodes that manipulate and route audio. */
@JSGlobal("Windows.Media.Audio.AudioGraph")
@js.native
object AudioGraph extends js.Object {
  /**
                   * Creates an audio graph with specific settings.
                   * @param settings An AudioGraphSettings object representing the source audio file.
                   * @return When this operation completes, a CreateAudioGraphResult object is returned.
                   */
  def createAsync(settings: winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioGraphSettings): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.CreateAudioGraphResult] = js.native
}

