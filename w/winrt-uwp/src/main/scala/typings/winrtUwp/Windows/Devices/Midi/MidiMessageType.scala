package typings.winrtUwp.Windows.Devices.Midi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MidiMessageType extends StObject
/** Provides constants used to map MIDI message types into their corresponding byte codes. */
@JSGlobal("Windows.Devices.Midi.MidiMessageType")
@js.native
object MidiMessageType extends StObject {
  
  /** A MidiActiveSensingMessage . */
  @js.native
  sealed trait activeSensing
    extends StObject
       with MidiMessageType
  
  /** A MidiChannelPressureMessage . */
  @js.native
  sealed trait channelPressure
    extends StObject
       with MidiMessageType
  
  /** A MidiContinueMessage . */
  @js.native
  sealed trait continue
    extends StObject
       with MidiMessageType
  
  /** A MidiControlChangeMessage . */
  @js.native
  sealed trait controlChange
    extends StObject
       with MidiMessageType
  
  /** A MidiTimeCodeMessage . */
  @js.native
  sealed trait midiTimeCode
    extends StObject
       with MidiMessageType
  
  /** None */
  @js.native
  sealed trait none
    extends StObject
       with MidiMessageType
  
  /** A MidiNoteOffMessage . */
  @js.native
  sealed trait noteOff
    extends StObject
       with MidiMessageType
  
  /** A MidiNoteOnMessage . */
  @js.native
  sealed trait noteOn
    extends StObject
       with MidiMessageType
  
  /** A MidiPitchBendChangeMessage . */
  @js.native
  sealed trait pitchBendChange
    extends StObject
       with MidiMessageType
  
  /** A MidiPolyphonicKeyPressureMessage . */
  @js.native
  sealed trait polyphonicKeyPressure
    extends StObject
       with MidiMessageType
  
  /** A MidiControlChangeMessage . */
  @js.native
  sealed trait programChange
    extends StObject
       with MidiMessageType
  
  /** A MidiSongPositionPointerMessage . */
  @js.native
  sealed trait songPositionPointer
    extends StObject
       with MidiMessageType
  
  /** A MidiSongSelectMessage . */
  @js.native
  sealed trait songSelect
    extends StObject
       with MidiMessageType
  
  /** A MidiStartMessage . */
  @js.native
  sealed trait start
    extends StObject
       with MidiMessageType
  
  /** A MidiStopMessage . */
  @js.native
  sealed trait stop
    extends StObject
       with MidiMessageType
  
  /** A MidiSystemExclusiveMessage . */
  @js.native
  sealed trait systemExclusive
    extends StObject
       with MidiMessageType
  
  /** A SystemResetMessage . */
  @js.native
  sealed trait systemReset
    extends StObject
       with MidiMessageType
  
  /** A MidiTimingClockMessage . */
  @js.native
  sealed trait timingClock
    extends StObject
       with MidiMessageType
  
  /** A MidiTuneRequestMessage . */
  @js.native
  sealed trait tuneRequest
    extends StObject
       with MidiMessageType
}
