package typings
package webmidiLib.WebMidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIOutput extends MIDIPort {
  /**
    * Clears any pending send data that has not yet been sent from the MIDIOutput 's
    * queue. The implementation will need to ensure the MIDI stream is left in a good
    * state, so if the output port is in the middle of a sysex message, a sysex
    * termination byte (0xf7) should be sent.
    */
  def clear(): scala.Unit = js.native
  /**
    * Enqueues the message to be sent to the corresponding MIDI port.
    * @param data The data to be enqueued, with each sequence entry representing a single byte of data.
    * @param timestamp The time at which to begin sending the data to the port. If timestamp is set
    * to zero (or another time in the past), the data is to be sent as soon as
    * possible.
    */
  def send(data: js.Array[scala.Double]): scala.Unit = js.native
  def send(data: js.Array[scala.Double], timestamp: scala.Double): scala.Unit = js.native
  def send(data: stdLib.Uint8Array): scala.Unit = js.native
  def send(data: stdLib.Uint8Array, timestamp: scala.Double): scala.Unit = js.native
}

