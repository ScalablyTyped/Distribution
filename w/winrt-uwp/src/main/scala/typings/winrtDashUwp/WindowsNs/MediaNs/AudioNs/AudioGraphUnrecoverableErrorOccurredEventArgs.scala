package typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents arguments for an UnrecoverableErrorOccurred event. */
@JSGlobal("Windows.Media.Audio.AudioGraphUnrecoverableErrorOccurredEventArgs")
@js.native
abstract class AudioGraphUnrecoverableErrorOccurredEventArgs () extends js.Object {
  /** Gets the error associated with the event. */
  var error: AudioGraphUnrecoverableError = js.native
}

