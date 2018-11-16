package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio file input node. */
@JSGlobal("Windows.Media.Audio.AudioFileInputNode")
@js.native
abstract class AudioFileInputNode () extends js.Object {
  /** Gets or sets a value indicating if the audio file input node consumes input. */
  var consumeInput: scala.Boolean = js.native
  /** Gets the duration for the audio input file. */
  var duration: scala.Double = js.native
  /** Gets the list of effect definitions for the audio file input node. */
  var effectDefinitions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio file input node. */
  var encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
  /** Gets or sets the end time for the audio file input node. */
  var endTime: scala.Double = js.native
  /** Gets or sets the loop count of the audio file input node. */
  var loopCount: scala.Double = js.native
  /** Notifies of completion of the file associated with the audio file input node. */
  @JSName("onfilecompleted")
  var onfilecompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioFileInputNode, _] = js.native
  /** Gets the list of outgoing connections from the audio file input node to other nodes in the audio graph. */
  var outgoingConnections: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[AudioGraphConnection] = js.native
  /** Gets or sets the outgoing gain for the audio file input node. */
  var outgoingGain: scala.Double = js.native
  /** Gets or sets the playback speed factor for the audio file input node. */
  var playbackSpeedFactor: scala.Double = js.native
  /** Gets the position of the audio file input node. */
  var position: scala.Double = js.native
  /** Gets the source audio file for the audio file input node. */
  var sourceFile: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile = js.native
  /** Gets or sets the start time for the audio file input node. */
  var startTime: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_filecompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.filecompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioFileInputNode, _]
  ): scala.Unit = js.native
  /**
                   * Adds an outgoing connection to the audio file input node.
                   * @param destination The destination node for the connection.
                   */
  def addOutgoingConnection(destination: IAudioNode): scala.Unit = js.native
  /**
                   * Adds an outgoing connection with gain to the audio file input node.
                   * @param destination The destination node for the connection.
                   * @param gain A value indicating the gain associated with the connection.
                   */
  def addOutgoingConnection(destination: IAudioNode, gain: scala.Double): scala.Unit = js.native
  /** Closes the audio file input node. */
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
  /** Notifies of completion of the file associated with the audio file input node. */
  def onfilecompleted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[AudioFileInputNode]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_filecompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.filecompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AudioFileInputNode, _]
  ): scala.Unit = js.native
  /**
                   * Removes the outgoing connection for the audio file input node.
                   * @param destination The destination for the outgoing connection.
                   */
  def removeOutgoingConnection(destination: IAudioNode): scala.Unit = js.native
  /** Resets the audio file input node. */
  def reset(): scala.Unit = js.native
  /**
                   * Moves the playback position of the node to the specified time within the audio input file.
                   * @param position A value indicating the position to which the node should seek.
                   */
  def seek(position: scala.Double): scala.Unit = js.native
  /** Starts the audio file input node. */
  def start(): scala.Unit = js.native
  /** Stops the audio file input node. */
  def stop(): scala.Unit = js.native
}

