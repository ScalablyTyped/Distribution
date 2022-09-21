package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.filecompleted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an audio file input node. */
@js.native
trait AudioFileInputNode extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_filecompleted(`type`: filecompleted, listener: TypedEventHandler[AudioFileInputNode, Any]): Unit = js.native
  
  /**
    * Adds an outgoing connection to the audio file input node.
    * @param destination The destination node for the connection.
    */
  def addOutgoingConnection(destination: IAudioNode): Unit = js.native
  /**
    * Adds an outgoing connection with gain to the audio file input node.
    * @param destination The destination node for the connection.
    * @param gain A value indicating the gain associated with the connection.
    */
  def addOutgoingConnection(destination: IAudioNode, gain: Double): Unit = js.native
  
  /** Closes the audio file input node. */
  def close(): Unit = js.native
  
  /** Gets or sets a value indicating if the audio file input node consumes input. */
  var consumeInput: Boolean = js.native
  
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  
  /** Gets the duration for the audio input file. */
  var duration: Double = js.native
  
  /** Gets the list of effect definitions for the audio file input node. */
  var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
  
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  
  /** Gets the encoding properties for the audio file input node. */
  var encodingProperties: AudioEncodingProperties = js.native
  
  /** Gets or sets the end time for the audio file input node. */
  var endTime: Double = js.native
  
  /** Gets or sets the loop count of the audio file input node. */
  var loopCount: Double = js.native
  
  /** Notifies of completion of the file associated with the audio file input node. */
  def onfilecompleted(ev: Any & WinRTEvent[AudioFileInputNode]): Unit = js.native
  /** Notifies of completion of the file associated with the audio file input node. */
  @JSName("onfilecompleted")
  var onfilecompleted_Original: TypedEventHandler[AudioFileInputNode, Any] = js.native
  
  /** Gets the list of outgoing connections from the audio file input node to other nodes in the audio graph. */
  var outgoingConnections: IVectorView[AudioGraphConnection] = js.native
  
  /** Gets or sets the outgoing gain for the audio file input node. */
  var outgoingGain: Double = js.native
  
  /** Gets or sets the playback speed factor for the audio file input node. */
  var playbackSpeedFactor: Double = js.native
  
  /** Gets the position of the audio file input node. */
  var position: Double = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_filecompleted(`type`: filecompleted, listener: TypedEventHandler[AudioFileInputNode, Any]): Unit = js.native
  
  /**
    * Removes the outgoing connection for the audio file input node.
    * @param destination The destination for the outgoing connection.
    */
  def removeOutgoingConnection(destination: IAudioNode): Unit = js.native
  
  /** Resets the audio file input node. */
  def reset(): Unit = js.native
  
  /**
    * Moves the playback position of the node to the specified time within the audio input file.
    * @param position A value indicating the position to which the node should seek.
    */
  def seek(position: Double): Unit = js.native
  
  /** Gets the source audio file for the audio file input node. */
  var sourceFile: StorageFile = js.native
  
  /** Starts the audio file input node. */
  def start(): Unit = js.native
  
  /** Gets or sets the start time for the audio file input node. */
  var startTime: Double = js.native
  
  /** Stops the audio file input node. */
  def stop(): Unit = js.native
}
