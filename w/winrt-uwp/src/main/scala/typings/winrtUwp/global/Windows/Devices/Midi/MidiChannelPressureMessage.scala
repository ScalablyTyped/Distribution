package typings.winrtUwp.global.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI message that specifies the channel pressure. */
@JSGlobal("Windows.Devices.Midi.MidiChannelPressureMessage")
@js.native
class MidiChannelPressureMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiChannelPressureMessage {
  /**
    * Creates a new MidiChannelPressureMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param pressure The pressure from 0-127.
    */
  def this(channel: Double, pressure: Double) = this()
}
