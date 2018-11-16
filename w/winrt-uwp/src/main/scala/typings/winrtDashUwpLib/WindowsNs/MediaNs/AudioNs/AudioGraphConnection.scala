package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connection within an audio graph. */
@JSGlobal("Windows.Media.Audio.AudioGraphConnection")
@js.native
abstract class AudioGraphConnection () extends js.Object {
  /** Gets the destination node for the connection. */
  var destination: IAudioNode = js.native
  /** Gets the gain associated with the audio graph connection. */
  var gain: scala.Double = js.native
}

