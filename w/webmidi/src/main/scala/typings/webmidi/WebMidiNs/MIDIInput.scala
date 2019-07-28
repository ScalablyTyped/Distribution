package typings.webmidi.WebMidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIInput extends MIDIPort {
  def onmidimessage(e: MIDIMessageEvent): Unit = js.native
}

