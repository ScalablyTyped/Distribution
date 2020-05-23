package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connection within an audio graph. */
trait AudioGraphConnection extends js.Object {
  /** Gets the destination node for the connection. */
  var destination: IAudioNode
  /** Gets the gain associated with the audio graph connection. */
  var gain: Double
}

object AudioGraphConnection {
  @scala.inline
  def apply(destination: IAudioNode, gain: Double): AudioGraphConnection = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], gain = gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioGraphConnection]
  }
}

