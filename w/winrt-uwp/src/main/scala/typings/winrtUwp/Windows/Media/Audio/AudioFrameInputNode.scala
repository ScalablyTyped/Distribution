package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Media.AudioFrame
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.audioframecompleted
import typings.winrtUwp.winrtUwpStrings.quantumstarted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an audio frame input node. */
@js.native
trait AudioFrameInputNode extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioframecompleted(
    `type`: audioframecompleted,
    listener: TypedEventHandler[AudioFrameInputNode, AudioFrameCompletedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_quantumstarted(
    `type`: quantumstarted,
    listener: TypedEventHandler[AudioFrameInputNode, FrameInputNodeQuantumStartedEventArgs]
  ): Unit = js.native
  
  /**
    * Adds an audio frame to the audio frame input node.
    * @param frame An AudioFrame object representing the frame.
    */
  def addFrame(frame: AudioFrame): Unit = js.native
  
  /**
    * Adds an outgoing connection to the audio frame input node.
    * @param destination The destination node for the connection.
    */
  def addOutgoingConnection(destination: IAudioNode): Unit = js.native
  /**
    * Adds an outgoing connection with gain to the audio frame input node.
    * @param destination The destination node for the connection.
    * @param gain A value indicating the gain associated with the connection.
    */
  def addOutgoingConnection(destination: IAudioNode, gain: Double): Unit = js.native
  
  /** Closes the audio frame input node. */
  def close(): Unit = js.native
  
  /** Gets or sets a value indicating if the audio frame input node consumes input. */
  var consumeInput: Boolean = js.native
  
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  
  /** Removes queued frames from the audio frame input node. */
  def discardQueuedFrames(): Unit = js.native
  
  /** Gets the list of effect definitions for the audio frame input node. */
  var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
  
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  
  /** Gets the encoding properties for the audio frame input node. */
  var encodingProperties: AudioEncodingProperties = js.native
  
  /** Notifies of a completed audio frame that has been submitted to the graph with a call to AddFrame . */
  def onaudioframecompleted(ev: AudioFrameCompletedEventArgs with WinRTEvent[AudioFrameInputNode]): Unit = js.native
  /** Notifies of a completed audio frame that has been submitted to the graph with a call to AddFrame . */
  @JSName("onaudioframecompleted")
  var onaudioframecompleted_Original: TypedEventHandler[AudioFrameInputNode, AudioFrameCompletedEventArgs] = js.native
  
  /** Raised when the audio graph is ready to begin processing a new quantum of data. */
  def onquantumstarted(ev: FrameInputNodeQuantumStartedEventArgs with WinRTEvent[AudioFrameInputNode]): Unit = js.native
  /** Raised when the audio graph is ready to begin processing a new quantum of data. */
  @JSName("onquantumstarted")
  var onquantumstarted_Original: TypedEventHandler[AudioFrameInputNode, FrameInputNodeQuantumStartedEventArgs] = js.native
  
  /** Gets the list of outgoing connections from the audio frame input node to other nodes in the audio graph. */
  var outgoingConnections: IVectorView[AudioGraphConnection] = js.native
  
  /** Gets or sets the outgoing gain for the audio frame input node. */
  var outgoingGain: Double = js.native
  
  /** Gets or sets the playback speed factor for the audio frame input node. */
  var playbackSpeedFactor: Double = js.native
  
  /** Gets the queued sample count for the audio frame input node. */
  var queuedSampleCount: Double = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioframecompleted(
    `type`: audioframecompleted,
    listener: TypedEventHandler[AudioFrameInputNode, AudioFrameCompletedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_quantumstarted(
    `type`: quantumstarted,
    listener: TypedEventHandler[AudioFrameInputNode, FrameInputNodeQuantumStartedEventArgs]
  ): Unit = js.native
  
  /**
    * Removes an outgoing connection from the audio frame input node.
    * @param destination The destination for the outgoing connection.
    */
  def removeOutgoingConnection(destination: IAudioNode): Unit = js.native
  
  /** Resets the audio frame input node. */
  def reset(): Unit = js.native
  
  /** Starts the audio frame input node. */
  def start(): Unit = js.native
  
  /** Stops the audio frame input node. */
  def stop(): Unit = js.native
}
