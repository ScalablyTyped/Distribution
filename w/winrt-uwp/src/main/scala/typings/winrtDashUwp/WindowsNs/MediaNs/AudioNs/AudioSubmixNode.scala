package typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition
import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio submix node that mixes the output of one or more nodes into single output that can be connected to output nodes or other submix nodes. */
@JSGlobal("Windows.Media.Audio.AudioSubmixNode")
@js.native
abstract class AudioSubmixNode () extends js.Object {
  /** Gets or sets a value indicating if the audio submix node consumes input. */
  var consumeInput: Boolean = js.native
  /** Gets the list of effect definitions for the audio submix node. */
  var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio device submix node. */
  var encodingProperties: AudioEncodingProperties = js.native
  /** Gets outgoing connections from the audio submix node to other nodes in the audio graph. */
  var outgoingConnections: IVectorView[AudioGraphConnection] = js.native
  /** Gets or sets the outgoing gain for the audio submix node. */
  var outgoingGain: Double = js.native
  /**
    * Adds an outgoing connection to the audio submix node.
    * @param destination The destination node for the connection.
    */
  def addOutgoingConnection(destination: IAudioNode): Unit = js.native
  /**
    * Adds an outgoing connection with gain to the audio submix node.
    * @param destination The destination node for the connection.
    * @param gain A value indicating the gain associated with the connection.
    */
  def addOutgoingConnection(destination: IAudioNode, gain: Double): Unit = js.native
  /** Closes the audio submix node. */
  def close(): Unit = js.native
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /**
    * Removes an outgoing connection from the audio submix node.
    * @param destination The destination for the outgoing connection.
    */
  def removeOutgoingConnection(destination: IAudioNode): Unit = js.native
  /** Resets the audio submix node. */
  def reset(): Unit = js.native
  /** Starts the audio submix node. */
  def start(): Unit = js.native
  /** Stops the audio submix node. */
  def stop(): Unit = js.native
}

