package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs

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
  sealed trait activeSensing
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiChannelPressureMessage . */
  @js.native
  sealed trait channelPressure
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiContinueMessage . */
  @js.native
  sealed trait continue
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiControlChangeMessage . */
  @js.native
  sealed trait controlChange
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiTimeCodeMessage . */
  @js.native
  sealed trait midiTimeCode
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** None */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiNoteOffMessage . */
  @js.native
  sealed trait noteOff
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiNoteOnMessage . */
  @js.native
  sealed trait noteOn
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiPitchBendChangeMessage . */
  @js.native
  sealed trait pitchBendChange
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiPolyphonicKeyPressureMessage . */
  @js.native
  sealed trait polyphonicKeyPressure
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiControlChangeMessage . */
  @js.native
  sealed trait programChange
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiSongPositionPointerMessage . */
  @js.native
  sealed trait songPositionPointer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiSongSelectMessage . */
  @js.native
  sealed trait songSelect
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiStartMessage . */
  @js.native
  sealed trait start
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiStopMessage . */
  @js.native
  sealed trait stop
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiSystemExclusiveMessage . */
  @js.native
  sealed trait systemExclusive
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A SystemResetMessage . */
  @js.native
  sealed trait systemReset
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiTimingClockMessage . */
  @js.native
  sealed trait timingClock
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /** A MidiTuneRequestMessage . */
  @js.native
  sealed trait tuneRequest
    extends winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType
  
  /* 17 */ val activeSensing: activeSensing with scala.Double = js.native
  /* 6 */ val channelPressure: channelPressure with scala.Double = js.native
  /* 15 */ val continue: continue with scala.Double = js.native
  /* 4 */ val controlChange: controlChange with scala.Double = js.native
  /* 9 */ val midiTimeCode: midiTimeCode with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val noteOff: noteOff with scala.Double = js.native
  /* 2 */ val noteOn: noteOn with scala.Double = js.native
  /* 7 */ val pitchBendChange: pitchBendChange with scala.Double = js.native
  /* 3 */ val polyphonicKeyPressure: polyphonicKeyPressure with scala.Double = js.native
  /* 5 */ val programChange: programChange with scala.Double = js.native
  /* 10 */ val songPositionPointer: songPositionPointer with scala.Double = js.native
  /* 11 */ val songSelect: songSelect with scala.Double = js.native
  /* 14 */ val start: start with scala.Double = js.native
  /* 16 */ val stop: stop with scala.Double = js.native
  /* 8 */ val systemExclusive: systemExclusive with scala.Double = js.native
  /* 18 */ val systemReset: systemReset with scala.Double = js.native
  /* 13 */ val timingClock: timingClock with scala.Double = js.native
  /* 12 */ val tuneRequest: tuneRequest with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType with scala.Double] = js.native
}

