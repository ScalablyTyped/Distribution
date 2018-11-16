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
  
  val activeSensing: activeSensing with java.lang.String = js.native
  val channelPressure: channelPressure with java.lang.String = js.native
  val continue: continue with java.lang.String = js.native
  val controlChange: controlChange with java.lang.String = js.native
  val midiTimeCode: midiTimeCode with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val noteOff: noteOff with java.lang.String = js.native
  val noteOn: noteOn with java.lang.String = js.native
  val pitchBendChange: pitchBendChange with java.lang.String = js.native
  val polyphonicKeyPressure: polyphonicKeyPressure with java.lang.String = js.native
  val programChange: programChange with java.lang.String = js.native
  val songPositionPointer: songPositionPointer with java.lang.String = js.native
  val songSelect: songSelect with java.lang.String = js.native
  val start: start with java.lang.String = js.native
  val stop: stop with java.lang.String = js.native
  val systemExclusive: systemExclusive with java.lang.String = js.native
  val systemReset: systemReset with java.lang.String = js.native
  val timingClock: timingClock with java.lang.String = js.native
  val tuneRequest: tuneRequest with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiMessageType with java.lang.String] = js.native
}

