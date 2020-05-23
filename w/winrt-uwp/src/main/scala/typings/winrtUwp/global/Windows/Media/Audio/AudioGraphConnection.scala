package typings.winrtUwp.global.Windows.Media.Audio

import typings.winrtUwp.Windows.Media.Audio.IAudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connection within an audio graph. */
@JSGlobal("Windows.Media.Audio.AudioGraphConnection")
@js.native
abstract class AudioGraphConnection ()
  extends typings.winrtUwp.Windows.Media.Audio.AudioGraphConnection {
  /** Gets the destination node for the connection. */
  /* CompleteClass */
  override var destination: IAudioNode = js.native
  /** Gets the gain associated with the audio graph connection. */
  /* CompleteClass */
  override var gain: Double = js.native
}

