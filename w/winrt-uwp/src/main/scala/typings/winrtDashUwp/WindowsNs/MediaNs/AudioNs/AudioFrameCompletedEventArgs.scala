package typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs

import typings.winrtDashUwp.WindowsNs.MediaNs.AudioFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents arguments for an AudioFrameCompleted event. */
@JSGlobal("Windows.Media.Audio.AudioFrameCompletedEventArgs")
@js.native
abstract class AudioFrameCompletedEventArgs () extends js.Object {
  /** Gets the audio frame that was just completed by the AudioFrameInputNode . A frame is completed when all of the audio in the frame has been consumed by the audio graph. */
  var frame: AudioFrame = js.native
}

