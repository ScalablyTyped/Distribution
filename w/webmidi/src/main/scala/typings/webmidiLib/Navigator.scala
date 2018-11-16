package typings
package webmidiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  /**
     * When invoked, returns a Promise object representing a request for access to MIDI
     * devices on the user's system.
     */
  def requestMIDIAccess(): stdLib.Promise[webmidiLib.WebMidiNs.MIDIAccess] = js.native
  /**
     * When invoked, returns a Promise object representing a request for access to MIDI
     * devices on the user's system.
     */
  def requestMIDIAccess(options: webmidiLib.WebMidiNs.MIDIOptions): stdLib.Promise[webmidiLib.WebMidiNs.MIDIAccess] = js.native
}

