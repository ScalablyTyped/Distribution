package typings
package webmidiLib.WebMidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIPort
  extends stdLib.EventTarget {
  /**
    * The state of the connection to the device.
    */
  var connection: MIDIPortConnectionState = js.native
  /**
    * A unique ID of the port. This can be used by developers to remember ports the
    * user has chosen for their application.
    */
  var id: java.lang.String = js.native
  /**
    * The manufacturer of the port.
    */
  var manufacturer: js.UndefOr[java.lang.String] = js.native
  /**
    * The system name of the port.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * The state of the device.
    */
  var state: MIDIPortDeviceState = js.native
  /**
    * A descriptor property to distinguish whether the port is an input or an output
    * port.
    */
  var `type`: MIDIPortType = js.native
  /**
    * The version of the port.
    */
  var version: js.UndefOr[java.lang.String] = js.native
  /**
    * Makes the MIDI device corresponding to the MIDIPort
    * explicitly unavailable (subsequently changing the state from "open" to
    * "connected"). Note that successful invocation of this method will result in MIDI
    * messages no longer being delivered to MIDIMessageEvent handlers on a
    * MIDIInputPort (although setting a new handler will cause an implicit open()).
    *
    * When invoked, this method returns a Promise object representing a request for
    * access to the given MIDI port on the user's system. When the port has been
    * closed (and therefore, in exclusive access systems, the port is available to
    * other applications), the vended Promise is resolved. If the port is
    * disconnected, the Promise is rejected.
    */
  def close(): js.Promise[MIDIPort] = js.native
  /**
    * The handler called when an existing port changes its state or connection
    * attributes.
    */
  def onstatechange(e: MIDIConnectionEvent): scala.Unit = js.native
  /**
    * Makes the MIDI device corresponding to the MIDIPort explicitly available. Note
    * that this call is NOT required in order to use the MIDIPort - calling send() on
    * a MIDIOutput or attaching a MIDIMessageEvent handler on a MIDIInputPort will
    * cause an implicit open().
    *
    * When invoked, this method returns a Promise object representing a request for
    * access to the given MIDI port on the user's system.
    */
  def open(): js.Promise[MIDIPort] = js.native
}

