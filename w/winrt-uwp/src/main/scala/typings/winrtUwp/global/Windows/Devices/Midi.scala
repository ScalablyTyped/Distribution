package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Devices.Midi.IMidiOutPort
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This namespace provides classes for using MIDI devices in Windows Runtime apps. */
object Midi {
  
  /** Represents a MIDI message that specifies active sensing. */
  @JSGlobal("Windows.Devices.Midi.MidiActiveSensingMessage")
  @js.native
  /** Creates a new MidiActiveSensingMessage object. */
  class MidiActiveSensingMessage ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiActiveSensingMessage
  
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
  
  /** Represents a MIDI message that specifies a continue message. */
  @JSGlobal("Windows.Devices.Midi.MidiContinueMessage")
  @js.native
  /** Creates a new MidiContinueMessage object. */
  class MidiContinueMessage ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiContinueMessage
  
  /** Represents a MIDI message that specifies a control change. */
  @JSGlobal("Windows.Devices.Midi.MidiControlChangeMessage")
  @js.native
  class MidiControlChangeMessage protected ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiControlChangeMessage {
    /**
      * Creates a new MidiControlChangeMessage object.
      * @param channel The channel from 0-15 that this message applies to.
      * @param controller The controller from 0-127 to receive this message.
      * @param controlValue The value from 0-127 to apply to the controller .
      */
    def this(channel: Double, controller: Double, controlValue: Double) = this()
  }
  
  /** Represents a port used to receive MIDI messages from a MIDI device. */
  @JSGlobal("Windows.Devices.Midi.MidiInPort")
  @js.native
  abstract class MidiInPort ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiInPort
  object MidiInPort {
    
    /**
      * Creates a MidiInPort object for the specified device.
      * @param deviceId The device ID, which can be obtained by enumerating the devices on the system Windows.Devices.Enumeration.DeviceInformation.FindAllAsync .
      * @return The asynchronous operation. Upon completion, IAsyncOperation.GetResults returns a MidiInPort object.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Midi.MidiInPort.fromIdAsync")
    @js.native
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Midi.MidiInPort] = js.native
    
    /**
      * Gets a query string that can be used to enumerate all MidiInPort objects on the system.
      * @return The query string used to enumerate the MidiInPort objects on the system.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Midi.MidiInPort.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
  }
  
  /** Provides data for the MessageReceived event. */
  @JSGlobal("Windows.Devices.Midi.MidiMessageReceivedEventArgs")
  @js.native
  abstract class MidiMessageReceivedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiMessageReceivedEventArgs
  
  /** Provides constants used to map MIDI message types into their corresponding byte codes. */
  @JSGlobal("Windows.Devices.Midi.MidiMessageType")
  @js.native
  object MidiMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Midi.MidiMessageType with Double] = js.native
    
    /* 17 */ val activeSensing: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.activeSensing with Double = js.native
    
    /* 6 */ val channelPressure: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.channelPressure with Double = js.native
    
    /* 15 */ val continue: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.continue with Double = js.native
    
    /* 4 */ val controlChange: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.controlChange with Double = js.native
    
    /* 9 */ val midiTimeCode: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.midiTimeCode with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.none with Double = js.native
    
    /* 1 */ val noteOff: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.noteOff with Double = js.native
    
    /* 2 */ val noteOn: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.noteOn with Double = js.native
    
    /* 7 */ val pitchBendChange: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.pitchBendChange with Double = js.native
    
    /* 3 */ val polyphonicKeyPressure: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.polyphonicKeyPressure with Double = js.native
    
    /* 5 */ val programChange: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.programChange with Double = js.native
    
    /* 10 */ val songPositionPointer: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.songPositionPointer with Double = js.native
    
    /* 11 */ val songSelect: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.songSelect with Double = js.native
    
    /* 14 */ val start: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.start with Double = js.native
    
    /* 16 */ val stop: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.stop with Double = js.native
    
    /* 8 */ val systemExclusive: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.systemExclusive with Double = js.native
    
    /* 18 */ val systemReset: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.systemReset with Double = js.native
    
    /* 13 */ val timingClock: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.timingClock with Double = js.native
    
    /* 12 */ val tuneRequest: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.tuneRequest with Double = js.native
  }
  
  /** Represents a MIDI messages that specifies a MIDI note to turn off. */
  @JSGlobal("Windows.Devices.Midi.MidiNoteOffMessage")
  @js.native
  class MidiNoteOffMessage protected ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiNoteOffMessage {
    /**
      * Creates a new MidiNoteOffMessage object.
      * @param channel The channel from 0-15 that this message applies to.
      * @param note The note which is specified as a value from 0-127.
      * @param velocity The velocity which is specified as a value from 0-127.
      */
    def this(channel: Double, note: Double, velocity: Double) = this()
  }
  
  /** Represents a MIDI message that specifies a MIDI note to turn on. */
  @JSGlobal("Windows.Devices.Midi.MidiNoteOnMessage")
  @js.native
  class MidiNoteOnMessage protected ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiNoteOnMessage {
    /**
      * Creates a new MidiNoteOnMessage object.
      * @param channel The channel from 0-15 that this message applies to.
      * @param note The note which is specified as a value from 0-127.
      * @param velocity The velocity which is specified as a value from 0-127.
      */
    def this(channel: Double, note: Double, velocity: Double) = this()
  }
  
  /** Represents a port used to send MIDI messages to a MIDI device. */
  @JSGlobal("Windows.Devices.Midi.MidiOutPort")
  @js.native
  abstract class MidiOutPort ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiOutPort
  object MidiOutPort {
    
    /**
      * Creates a MidiOutPort object for the specified device.
      * @param deviceId The device ID, which can be obtained by enumerating the devices on the system Windows.Devices.Enumeration.DeviceInformation.FindAllAsync .
      * @return The asynchronous operation. Upon completion, IAsyncOperation.GetResults returns a MidiOutPort object.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Midi.MidiOutPort.fromIdAsync")
    @js.native
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[IMidiOutPort] = js.native
    
    /**
      * Gets a query string that can be used to enumerate all MidiOutPort objects on the system.
      * @return The query string used to enumerate the MidiOutPort objects on the system.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Midi.MidiOutPort.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
  }
  
  /** Represents a MIDI message that specifies a pitch bend change. */
  @JSGlobal("Windows.Devices.Midi.MidiPitchBendChangeMessage")
  @js.native
  class MidiPitchBendChangeMessage protected ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiPitchBendChangeMessage {
    /**
      * Creates a new MidiPitchBendChangeMessage object.
      * @param channel The channel from 0-15 that this message applies to.
      * @param bend The pitch bend value which is specified as a 14-bit value from 0-16383.
      */
    def this(channel: Double, bend: Double) = this()
  }
  
  /** Represents a MIDI message that specifies the polyphonic key pressure. */
  @JSGlobal("Windows.Devices.Midi.MidiPolyphonicKeyPressureMessage")
  @js.native
  class MidiPolyphonicKeyPressureMessage protected ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiPolyphonicKeyPressureMessage {
    /**
      * Creates a new MidiPolyphonicKeyPressureMessage object.
      * @param channel The channel from 0-15 that this message applies to.
      * @param note The note which is specified as a value from 0-127.
      * @param pressure The polyphonic key pressure which is specified as a value from 0-127.
      */
    def this(channel: Double, note: Double, pressure: Double) = this()
  }
  
  /** Represents a MIDI message that specifies a program change. */
  @JSGlobal("Windows.Devices.Midi.MidiProgramChangeMessage")
  @js.native
  class MidiProgramChangeMessage protected ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiProgramChangeMessage {
    /**
      * Creates a new MidiProgramChangeMessage object.
      * @param channel The channel from 0-15 that this message applies to.
      * @param program The program to change from 0-127.
      */
    def this(channel: Double, program: Double) = this()
  }
  
  /** Represents a MIDI message that specifies a song position pointer. */
  @JSGlobal("Windows.Devices.Midi.MidiSongPositionPointerMessage")
  @js.native
  class MidiSongPositionPointerMessage protected ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiSongPositionPointerMessage {
    /**
      * Creates a new MidiSongPositionPointerMessage object.
      * @param beats The song position pointer encoded in a 14-bit value from 0-16383.
      */
    def this(beats: Double) = this()
  }
  
  /** Represents a MIDI message that specifies the selected song. */
  @JSGlobal("Windows.Devices.Midi.MidiSongSelectMessage")
  @js.native
  class MidiSongSelectMessage protected ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiSongSelectMessage {
    /**
      * Creates a new MidiSongSelectMessage object.
      * @param song The song to select from 0-127.
      */
    def this(song: Double) = this()
  }
  
  /** Represents a MIDI message that specifies a start message. */
  @JSGlobal("Windows.Devices.Midi.MidiStartMessage")
  @js.native
  /** Creates a new MidiStartMessage object. */
  class MidiStartMessage ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiStartMessage
  
  /** Represents a MIDI message that specifies a stop message. */
  @JSGlobal("Windows.Devices.Midi.MidiStopMessage")
  @js.native
  /** Creates a new MidiStopMessage object. */
  class MidiStopMessage ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiStopMessage
  
  /** Represents the Microsoft GS wavetable software synthesizer, included in Windows. This synthesizer provides a Roland GS sound set, which includes and extends the General MIDI sound set. */
  @JSGlobal("Windows.Devices.Midi.MidiSynthesizer")
  @js.native
  abstract class MidiSynthesizer ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiSynthesizer
  object MidiSynthesizer {
    
    /**
      * Creates a new instance of the Microsoft MIDI synthesizer that uses the system's default audio output device.
      * @return An instance of the Windows MIDI synthesizer.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Midi.MidiSynthesizer.createAsync")
    @js.native
    def createAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Midi.MidiSynthesizer] = js.native
    /**
      * Creates a new instance of the Microsoft MIDI synthesizer with a specified audio output device.
      * @param audioDevice The audio output device.
      * @return An instance of the Microsoft MIDI synthesizer.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Midi.MidiSynthesizer.createAsync")
    @js.native
    def createAsync(audioDevice: DeviceInformation): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Midi.MidiSynthesizer] = js.native
    
    /**
      * Determines whether a particular device is an instance of the Microsoft MIDI synthesizer. When all MIDI out ports on the system are enumerated, this method can be used to identify which of them is the Microsoft MIDI synthesizer.
      * @param midiDevice An object that represents the device in question.
      * @return True if the device is the Microsoft MIDI synthesizer; otherwise, false.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Midi.MidiSynthesizer.isSynthesizer")
    @js.native
    def isSynthesizer(midiDevice: DeviceInformation): Boolean = js.native
  }
  
  /** Represents a MIDI message that specifies a system exclusive message. */
  @JSGlobal("Windows.Devices.Midi.MidiSystemExclusiveMessage")
  @js.native
  class MidiSystemExclusiveMessage protected ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiSystemExclusiveMessage {
    /**
      * Creates a new MidiSystemExclusiveMessage object.
      * @param rawData The system exclusive data.
      */
    def this(rawData: IBuffer) = this()
  }
  
  /** Represents a MIDI message that specifies a system reset. */
  @JSGlobal("Windows.Devices.Midi.MidiSystemResetMessage")
  @js.native
  /** Creates a new MidiSystemResetMessage object. */
  class MidiSystemResetMessage ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiSystemResetMessage
  
  /** Represents a MIDI message that specifies a time code. */
  @JSGlobal("Windows.Devices.Midi.MidiTimeCodeMessage")
  @js.native
  class MidiTimeCodeMessage protected ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiTimeCodeMessage {
    /**
      * Creates a new MidiTimeCodeMessage object.
      * @param frameType The frame type from 0-7.
      * @param values The time code from 0-32.
      */
    def this(frameType: Double, values: Double) = this()
  }
  
  /** Represents a MIDI message that specifies a timing clock. */
  @JSGlobal("Windows.Devices.Midi.MidiTimingClockMessage")
  @js.native
  /** Creates a new MidiTimingClockMessage object. */
  class MidiTimingClockMessage ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiTimingClockMessage
  
  /** Represents a MIDI message that specifies a tune request. */
  @JSGlobal("Windows.Devices.Midi.MidiTuneRequestMessage")
  @js.native
  /** Creates a new MidiTuneRequestMessage object. */
  class MidiTuneRequestMessage ()
    extends typings.winrtUwp.Windows.Devices.Midi.MidiTuneRequestMessage
}
