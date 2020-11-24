package typings.winrtUwp.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MidiMessageType extends js.Object
/** Provides constants used to map MIDI message types into their corresponding byte codes. */
@JSGlobal("Windows.Devices.Midi.MidiMessageType")
@js.native
object MidiMessageType extends js.Object {
  
  /** A MidiActiveSensingMessage . */
  @js.native
  sealed trait activeSensing extends MidiMessageType
  
  /** A MidiChannelPressureMessage . */
  @js.native
  sealed trait channelPressure extends MidiMessageType
  
  /** A MidiContinueMessage . */
  @js.native
  sealed trait continue extends MidiMessageType
  
  /** A MidiControlChangeMessage . */
  @js.native
  sealed trait controlChange extends MidiMessageType
  
  /** A MidiTimeCodeMessage . */
  @js.native
  sealed trait midiTimeCode extends MidiMessageType
  
  /** None */
  @js.native
  sealed trait none extends MidiMessageType
  
  /** A MidiNoteOffMessage . */
  @js.native
  sealed trait noteOff extends MidiMessageType
  
  /** A MidiNoteOnMessage . */
  @js.native
  sealed trait noteOn extends MidiMessageType
  
  /** A MidiPitchBendChangeMessage . */
  @js.native
  sealed trait pitchBendChange extends MidiMessageType
  
  /** A MidiPolyphonicKeyPressureMessage . */
  @js.native
  sealed trait polyphonicKeyPressure extends MidiMessageType
  
  /** A MidiControlChangeMessage . */
  @js.native
  sealed trait programChange extends MidiMessageType
  
  /** A MidiSongPositionPointerMessage . */
  @js.native
  sealed trait songPositionPointer extends MidiMessageType
  
  /** A MidiSongSelectMessage . */
  @js.native
  sealed trait songSelect extends MidiMessageType
  
  /** A MidiStartMessage . */
  @js.native
  sealed trait start extends MidiMessageType
  
  /** A MidiStopMessage . */
  @js.native
  sealed trait stop extends MidiMessageType
  
  /** A MidiSystemExclusiveMessage . */
  @js.native
  sealed trait systemExclusive extends MidiMessageType
  
  /** A SystemResetMessage . */
  @js.native
  sealed trait systemReset extends MidiMessageType
  
  /** A MidiTimingClockMessage . */
  @js.native
  sealed trait timingClock extends MidiMessageType
  
  /** A MidiTuneRequestMessage . */
  @js.native
  sealed trait tuneRequest extends MidiMessageType
}
