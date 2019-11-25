package typings.webmidi.WebMidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webmidi.webmidiStrings.disconnected
  - typings.webmidi.webmidiStrings.connected
*/
trait MIDIPortDeviceState extends js.Object

object MIDIPortDeviceState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.webmidi.webmidiStrings.connected = this.cast("connected")
  @scala.inline
  def disconnected: typings.webmidi.webmidiStrings.disconnected = this.cast("disconnected")
}

