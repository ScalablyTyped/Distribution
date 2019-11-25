package typings.webmidi.WebMidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webmidi.webmidiStrings.input
  - typings.webmidi.webmidiStrings.output
*/
trait MIDIPortType extends js.Object

object MIDIPortType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def input: typings.webmidi.webmidiStrings.input = this.cast("input")
  @scala.inline
  def output: typings.webmidi.webmidiStrings.output = this.cast("output")
}

