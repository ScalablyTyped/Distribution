package typings.webmidi.WebMidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webmidi.webmidiStrings.open
  - typings.webmidi.webmidiStrings.closed
  - typings.webmidi.webmidiStrings.pending
*/
trait MIDIPortConnectionState extends js.Object

object MIDIPortConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.webmidi.webmidiStrings.closed = this.cast("closed")
  @scala.inline
  def open: typings.webmidi.webmidiStrings.open = this.cast("open")
  @scala.inline
  def pending: typings.webmidi.webmidiStrings.pending = this.cast("pending")
}

