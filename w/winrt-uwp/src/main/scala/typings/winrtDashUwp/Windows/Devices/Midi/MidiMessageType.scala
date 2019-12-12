package typings.winrtDashUwp.Windows.Devices.Midi

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.activeSensing
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.channelPressure
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.continue
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.controlChange
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.midiTimeCode
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.none
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.noteOff
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.noteOn
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.pitchBendChange
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.polyphonicKeyPressure
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.programChange
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.songPositionPointer
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.songSelect
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.start
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.stop
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.systemExclusive
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.systemReset
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.timingClock
import typings.winrtDashUwp.Windows.Devices.Midi.MidiMessageType.tuneRequest
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MidiMessageType with Double] = js.native
  /* 17 */ @js.native
  object activeSensing extends TopLevel[activeSensing with Double]
  
  /* 6 */ @js.native
  object channelPressure extends TopLevel[channelPressure with Double]
  
  /* 15 */ @js.native
  object continue extends TopLevel[continue with Double]
  
  /* 4 */ @js.native
  object controlChange extends TopLevel[controlChange with Double]
  
  /* 9 */ @js.native
  object midiTimeCode extends TopLevel[midiTimeCode with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object noteOff extends TopLevel[noteOff with Double]
  
  /* 2 */ @js.native
  object noteOn extends TopLevel[noteOn with Double]
  
  /* 7 */ @js.native
  object pitchBendChange extends TopLevel[pitchBendChange with Double]
  
  /* 3 */ @js.native
  object polyphonicKeyPressure extends TopLevel[polyphonicKeyPressure with Double]
  
  /* 5 */ @js.native
  object programChange extends TopLevel[programChange with Double]
  
  /* 10 */ @js.native
  object songPositionPointer extends TopLevel[songPositionPointer with Double]
  
  /* 11 */ @js.native
  object songSelect extends TopLevel[songSelect with Double]
  
  /* 14 */ @js.native
  object start extends TopLevel[start with Double]
  
  /* 16 */ @js.native
  object stop extends TopLevel[stop with Double]
  
  /* 8 */ @js.native
  object systemExclusive extends TopLevel[systemExclusive with Double]
  
  /* 18 */ @js.native
  object systemReset extends TopLevel[systemReset with Double]
  
  /* 13 */ @js.native
  object timingClock extends TopLevel[timingClock with Double]
  
  /* 12 */ @js.native
  object tuneRequest extends TopLevel[tuneRequest with Double]
  
}

