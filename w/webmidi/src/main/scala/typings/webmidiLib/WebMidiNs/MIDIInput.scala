package typings
package webmidiLib.WebMidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIInput extends MIDIPort {
  def onmidimessage(e: MIDIMessageEvent): scala.Unit = js.native
}

