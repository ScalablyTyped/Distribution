package typings.winrtDashUwp.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 17 */ val activeSensing: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.activeSensing with Double = js.native
  /* 6 */ val channelPressure: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.channelPressure with Double = js.native
  /* 15 */ val continue: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.continue with Double = js.native
  /* 4 */ val controlChange: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.controlChange with Double = js.native
  /* 9 */ val midiTimeCode: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.midiTimeCode with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.none with Double = js.native
  /* 1 */ val noteOff: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.noteOff with Double = js.native
  /* 2 */ val noteOn: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.noteOn with Double = js.native
  /* 7 */ val pitchBendChange: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.pitchBendChange with Double = js.native
  /* 3 */ val polyphonicKeyPressure: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.polyphonicKeyPressure with Double = js.native
  /* 5 */ val programChange: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.programChange with Double = js.native
  /* 10 */ val songPositionPointer: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.songPositionPointer with Double = js.native
  /* 11 */ val songSelect: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.songSelect with Double = js.native
  /* 14 */ val start: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.start with Double = js.native
  /* 16 */ val stop: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.stop with Double = js.native
  /* 8 */ val systemExclusive: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.systemExclusive with Double = js.native
  /* 18 */ val systemReset: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.systemReset with Double = js.native
  /* 13 */ val timingClock: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.timingClock with Double = js.native
  /* 12 */ val tuneRequest: typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.tuneRequest with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MidiMessageType with Double] = js.native
}

