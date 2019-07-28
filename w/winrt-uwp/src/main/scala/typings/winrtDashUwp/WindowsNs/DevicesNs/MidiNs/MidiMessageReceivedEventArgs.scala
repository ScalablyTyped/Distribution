package typings.winrtDashUwp.WindowsNs.DevicesNs.MidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MessageReceived event. */
@JSGlobal("Windows.Devices.Midi.MidiMessageReceivedEventArgs")
@js.native
abstract class MidiMessageReceivedEventArgs () extends js.Object {
  /** The MIDI message. */
  var message: IMidiMessage = js.native
}

