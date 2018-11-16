package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio submix node that mixes the output of one or more nodes into single output that can be connected to output nodes or other submix nodes. */
@JSGlobal("Windows.Media.Audio.AudioSubmixNode")
@js.native
abstract class AudioSubmixNode () extends js.Object {
  /** Gets or sets a value indicating if the audio submix node consumes input. */
  var consumeInput: scala.Boolean = js.native
  /** Gets the list of effect definitions for the audio submix node. */
  var effectDefinitions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio device submix node. */
  var encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
  /** Gets outgoing connections from the audio submix node to other nodes in the audio graph. */
  var outgoingConnections: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[AudioGraphConnection] = js.native
  /** Gets or sets the outgoing gain for the audio submix node. */
  var outgoingGain: scala.Double = js.native
  /**
                   * Adds an outgoing connection to the audio submix node.
                   * @param destination The destination node for the connection.
                   */
  def addOutgoingConnection(destination: IAudioNode): scala.Unit = js.native
  /**
                   * Adds an outgoing connection with gain to the audio submix node.
                   * @param destination The destination node for the connection.
                   * @param gain A value indicating the gain associated with the connection.
                   */
  def addOutgoingConnection(destination: IAudioNode, gain: scala.Double): scala.Unit = js.native
  /** Closes the audio submix node. */
  def close(): scala.Unit = js.native
  /**
                   * Disables all effects in the EffectDefinitions list with the specified effect definition.
                   * @param definition The effect definition of the effects to disable.
                   */
  def disableEffectsByDefinition(definition: winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition): scala.Unit = js.native
  /**
                   * Enables all effects in the EffectDefinitions list with the specified effect definition.
                   * @param definition The effect definition of the effects to enable.
                   */
  def enableEffectsByDefinition(definition: winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition): scala.Unit = js.native
  /**
                   * Removes an outgoing connection from the audio submix node.
                   * @param destination The destination for the outgoing connection.
                   */
  def removeOutgoingConnection(destination: IAudioNode): scala.Unit = js.native
  /** Resets the audio submix node. */
  def reset(): scala.Unit = js.native
  /** Starts the audio submix node. */
  def start(): scala.Unit = js.native
  /** Stops the audio submix node. */
  def stop(): scala.Unit = js.native
}

