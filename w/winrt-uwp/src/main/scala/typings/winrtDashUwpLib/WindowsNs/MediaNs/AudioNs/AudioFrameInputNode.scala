package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio frame input node. */
@JSGlobal("Windows.Media.Audio.AudioFrameInputNode")
@js.native
abstract class AudioFrameInputNode () extends js.Object {
  /** Gets or sets a value indicating if the audio frame input node consumes input. */
  var consumeInput: scala.Boolean = js.native
  /** Gets the list of effect definitions for the audio frame input node. */
  var effectDefinitions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio frame input node. */
  var encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
  /** Notifies of a completed audio frame that has been submitted to the graph with a call to AddFrame . */
  @JSName("onaudioframecompleted")
  var onaudioframecompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioFrameInputNode, AudioFrameCompletedEventArgs] = js.native
  /** Raised when the audio graph is ready to begin processing a new quantum of data. */
  @JSName("onquantumstarted")
  var onquantumstarted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioFrameInputNode, FrameInputNodeQuantumStartedEventArgs] = js.native
  /** Gets the list of outgoing connections from the audio frame input node to other nodes in the audio graph. */
  var outgoingConnections: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[AudioGraphConnection] = js.native
  /** Gets or sets the outgoing gain for the audio frame input node. */
  var outgoingGain: scala.Double = js.native
  /** Gets or sets the playback speed factor for the audio frame input node. */
  var playbackSpeedFactor: scala.Double = js.native
  /** Gets the queued sample count for the audio frame input node. */
  var queuedSampleCount: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioframecompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.audioframecompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioFrameInputNode, AudioFrameCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_quantumstarted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.quantumstarted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioFrameInputNode, FrameInputNodeQuantumStartedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Adds an audio frame to the audio frame input node.
                   * @param frame An AudioFrame object representing the frame.
                   */
  def addFrame(frame: winrtDashUwpLib.WindowsNs.MediaNs.AudioFrame): scala.Unit = js.native
  /**
                   * Adds an outgoing connection to the audio frame input node.
                   * @param destination The destination node for the connection.
                   */
  def addOutgoingConnection(destination: IAudioNode): scala.Unit = js.native
  /**
                   * Adds an outgoing connection with gain to the audio frame input node.
                   * @param destination The destination node for the connection.
                   * @param gain A value indicating the gain associated with the connection.
                   */
  def addOutgoingConnection(destination: IAudioNode, gain: scala.Double): scala.Unit = js.native
  /** Closes the audio frame input node. */
  def close(): scala.Unit = js.native
  /**
                   * Disables all effects in the EffectDefinitions list with the specified effect definition.
                   * @param definition The effect definition of the effects to disable.
                   */
  def disableEffectsByDefinition(definition: winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition): scala.Unit = js.native
  /** Removes queued frames from the audio frame input node. */
  def discardQueuedFrames(): scala.Unit = js.native
  /**
                   * Enables all effects in the EffectDefinitions list with the specified effect definition.
                   * @param definition The effect definition of the effects to enable.
                   */
  def enableEffectsByDefinition(definition: winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition): scala.Unit = js.native
  /** Notifies of a completed audio frame that has been submitted to the graph with a call to AddFrame . */
  def onaudioframecompleted(ev: AudioFrameCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AudioFrameInputNode]): scala.Unit = js.native
  /** Raised when the audio graph is ready to begin processing a new quantum of data. */
  def onquantumstarted(
    ev: FrameInputNodeQuantumStartedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AudioFrameInputNode]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioframecompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.audioframecompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioFrameInputNode, AudioFrameCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_quantumstarted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.quantumstarted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioFrameInputNode, FrameInputNodeQuantumStartedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Removes an outgoing connection from the audio frame input node.
                   * @param destination The destination for the outgoing connection.
                   */
  def removeOutgoingConnection(destination: IAudioNode): scala.Unit = js.native
  /** Resets the audio frame input node. */
  def reset(): scala.Unit = js.native
  /** Starts the audio frame input node. */
  def start(): scala.Unit = js.native
  /** Stops the audio frame input node. */
  def stop(): scala.Unit = js.native
}

