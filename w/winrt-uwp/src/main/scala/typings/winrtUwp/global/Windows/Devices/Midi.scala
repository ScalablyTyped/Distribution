package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Devices.Midi.IMidiMessage
import typings.winrtUwp.Windows.Devices.Midi.IMidiOutPort
import typings.winrtUwp.Windows.Devices.Midi.MidiMessageType
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This namespace provides classes for using MIDI devices in Windows Runtime apps. */
object Midi {
  
  /** Represents a MIDI message that specifies active sensing. */
  @JSGlobal("Windows.Devices.Midi.MidiActiveSensingMessage")
  @js.native
  /** Creates a new MidiActiveSensingMessage object. */
  class MidiActiveSensingMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiActiveSensingMessage {
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents a MIDI message that specifies the channel pressure. */
  @JSGlobal("Windows.Devices.Midi.MidiChannelPressureMessage")
  @js.native
  class MidiChannelPressureMessage protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiChannelPressureMessage {
    /**
      * Creates a new MidiChannelPressureMessage object.
      * @param channel The channel from 0-15 that this message applies to.
      * @param pressure The pressure from 0-127.
      */
    def this(channel: Double, pressure: Double) = this()
    
    /** Gets the channel from 0-15 that this message applies to. */
    /* CompleteClass */
    var channel: Double = js.native
    
    /** Gets the pressure from 0-127. */
    /* CompleteClass */
    var pressure: Double = js.native
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents a MIDI message that specifies a continue message. */
  @JSGlobal("Windows.Devices.Midi.MidiContinueMessage")
  @js.native
  /** Creates a new MidiContinueMessage object. */
  class MidiContinueMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiContinueMessage {
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents a MIDI message that specifies a control change. */
  @JSGlobal("Windows.Devices.Midi.MidiControlChangeMessage")
  @js.native
  class MidiControlChangeMessage protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiControlChangeMessage {
    /**
      * Creates a new MidiControlChangeMessage object.
      * @param channel The channel from 0-15 that this message applies to.
      * @param controller The controller from 0-127 to receive this message.
      * @param controlValue The value from 0-127 to apply to the controller .
      */
    def this(channel: Double, controller: Double, controlValue: Double) = this()
    
    /** Gets the channel from 0-15 that this message applies to. */
    /* CompleteClass */
    var channel: Double = js.native
    
    /** Gets the value from 0-127 to apply to the controller . */
    /* CompleteClass */
    var controlValue: Double = js.native
    
    /** Gets controller from 0-127 to receive this message. */
    /* CompleteClass */
    var controller: Double = js.native
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents a port used to receive MIDI messages from a MIDI device. */
  @JSGlobal("Windows.Devices.Midi.MidiInPort")
  @js.native
  abstract class MidiInPort ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiInPort
  object MidiInPort {
    
    @JSGlobal("Windows.Devices.Midi.MidiInPort")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a MidiInPort object for the specified device.
      * @param deviceId The device ID, which can be obtained by enumerating the devices on the system Windows.Devices.Enumeration.DeviceInformation.FindAllAsync .
      * @return The asynchronous operation. Upon completion, IAsyncOperation.GetResults returns a MidiInPort object.
      */
    /* static member */
    @scala.inline
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Midi.MidiInPort] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Midi.MidiInPort]]
    
    /**
      * Gets a query string that can be used to enumerate all MidiInPort objects on the system.
      * @return The query string used to enumerate the MidiInPort objects on the system.
      */
    /* static member */
    @scala.inline
    def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  }
  
  /** Provides data for the MessageReceived event. */
  @JSGlobal("Windows.Devices.Midi.MidiMessageReceivedEventArgs")
  @js.native
  abstract class MidiMessageReceivedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiMessageReceivedEventArgs {
    
    /** The MIDI message. */
    /* CompleteClass */
    var message: IMidiMessage = js.native
  }
  
  /** Provides constants used to map MIDI message types into their corresponding byte codes. */
  @JSGlobal("Windows.Devices.Midi.MidiMessageType")
  @js.native
  object MidiMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Midi.MidiMessageType & Double] = js.native
    
    /* 17 */ val activeSensing: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.activeSensing & Double = js.native
    
    /* 6 */ val channelPressure: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.channelPressure & Double = js.native
    
    /* 15 */ val continue: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.continue & Double = js.native
    
    /* 4 */ val controlChange: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.controlChange & Double = js.native
    
    /* 9 */ val midiTimeCode: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.midiTimeCode & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.none & Double = js.native
    
    /* 1 */ val noteOff: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.noteOff & Double = js.native
    
    /* 2 */ val noteOn: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.noteOn & Double = js.native
    
    /* 7 */ val pitchBendChange: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.pitchBendChange & Double = js.native
    
    /* 3 */ val polyphonicKeyPressure: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.polyphonicKeyPressure & Double = js.native
    
    /* 5 */ val programChange: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.programChange & Double = js.native
    
    /* 10 */ val songPositionPointer: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.songPositionPointer & Double = js.native
    
    /* 11 */ val songSelect: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.songSelect & Double = js.native
    
    /* 14 */ val start: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.start & Double = js.native
    
    /* 16 */ val stop: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.stop & Double = js.native
    
    /* 8 */ val systemExclusive: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.systemExclusive & Double = js.native
    
    /* 18 */ val systemReset: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.systemReset & Double = js.native
    
    /* 13 */ val timingClock: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.timingClock & Double = js.native
    
    /* 12 */ val tuneRequest: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType.tuneRequest & Double = js.native
  }
  
  /** Represents a MIDI messages that specifies a MIDI note to turn off. */
  @JSGlobal("Windows.Devices.Midi.MidiNoteOffMessage")
  @js.native
  class MidiNoteOffMessage protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiNoteOffMessage {
    /**
      * Creates a new MidiNoteOffMessage object.
      * @param channel The channel from 0-15 that this message applies to.
      * @param note The note which is specified as a value from 0-127.
      * @param velocity The velocity which is specified as a value from 0-127.
      */
    def this(channel: Double, note: Double, velocity: Double) = this()
    
    /** Gets the channel from 0-15 that this message applies to. */
    /* CompleteClass */
    var channel: Double = js.native
    
    /** Gets the note to turn off which is specified as a value from 0-127. */
    /* CompleteClass */
    var note: Double = js.native
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
    
    /** Gets the value of the velocity from 0-127. */
    /* CompleteClass */
    var velocity: Double = js.native
  }
  
  /** Represents a MIDI message that specifies a MIDI note to turn on. */
  @JSGlobal("Windows.Devices.Midi.MidiNoteOnMessage")
  @js.native
  class MidiNoteOnMessage protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiNoteOnMessage {
    /**
      * Creates a new MidiNoteOnMessage object.
      * @param channel The channel from 0-15 that this message applies to.
      * @param note The note which is specified as a value from 0-127.
      * @param velocity The velocity which is specified as a value from 0-127.
      */
    def this(channel: Double, note: Double, velocity: Double) = this()
    
    /** Gets the channel from 0-15 that this message applies to. */
    /* CompleteClass */
    var channel: Double = js.native
    
    /** Gets the note to turn on which is specified as a value from 0-127. */
    /* CompleteClass */
    var note: Double = js.native
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
    
    /** Gets the value of the velocity from 0-127. */
    /* CompleteClass */
    var velocity: Double = js.native
  }
  
  /** Represents a port used to send MIDI messages to a MIDI device. */
  @JSGlobal("Windows.Devices.Midi.MidiOutPort")
  @js.native
  abstract class MidiOutPort ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiOutPort {
    
    /** Closes the MidiOutPort . */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets the id of the device that was used to initialize the MidiOutPort . */
    /* CompleteClass */
    var deviceId: String = js.native
    
    /**
      * Send the specified data buffer to the device associated with this MidiOutPort .
      * @param midiData The data to send to the device.
      */
    /* CompleteClass */
    override def sendBuffer(midiData: IBuffer): Unit = js.native
    
    /**
      * Send the data in the specified MIDI message to the device associated with this MidiOutPort .
      * @param midiMessage The MIDI message to send to the device.
      */
    /* CompleteClass */
    override def sendMessage(midiMessage: IMidiMessage): Unit = js.native
  }
  object MidiOutPort {
    
    @JSGlobal("Windows.Devices.Midi.MidiOutPort")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a MidiOutPort object for the specified device.
      * @param deviceId The device ID, which can be obtained by enumerating the devices on the system Windows.Devices.Enumeration.DeviceInformation.FindAllAsync .
      * @return The asynchronous operation. Upon completion, IAsyncOperation.GetResults returns a MidiOutPort object.
      */
    /* static member */
    @scala.inline
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[IMidiOutPort] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IMidiOutPort]]
    
    /**
      * Gets a query string that can be used to enumerate all MidiOutPort objects on the system.
      * @return The query string used to enumerate the MidiOutPort objects on the system.
      */
    /* static member */
    @scala.inline
    def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  }
  
  /** Represents a MIDI message that specifies a pitch bend change. */
  @JSGlobal("Windows.Devices.Midi.MidiPitchBendChangeMessage")
  @js.native
  class MidiPitchBendChangeMessage protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiPitchBendChangeMessage {
    /**
      * Creates a new MidiPitchBendChangeMessage object.
      * @param channel The channel from 0-15 that this message applies to.
      * @param bend The pitch bend value which is specified as a 14-bit value from 0-16383.
      */
    def this(channel: Double, bend: Double) = this()
    
    /** Gets the pitch bend value which is specified as a 14-bit value from 0-16383. */
    /* CompleteClass */
    var bend: Double = js.native
    
    /** Gets the channel from 0-15 that this message applies to. */
    /* CompleteClass */
    var channel: Double = js.native
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents a MIDI message that specifies the polyphonic key pressure. */
  @JSGlobal("Windows.Devices.Midi.MidiPolyphonicKeyPressureMessage")
  @js.native
  class MidiPolyphonicKeyPressureMessage protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiPolyphonicKeyPressureMessage {
    /**
      * Creates a new MidiPolyphonicKeyPressureMessage object.
      * @param channel The channel from 0-15 that this message applies to.
      * @param note The note which is specified as a value from 0-127.
      * @param pressure The polyphonic key pressure which is specified as a value from 0-127.
      */
    def this(channel: Double, note: Double, pressure: Double) = this()
    
    /** Gets the channel from 0-15 that this message applies to. */
    /* CompleteClass */
    var channel: Double = js.native
    
    /** Gets the note which is specified as a value from 0-127. */
    /* CompleteClass */
    var note: Double = js.native
    
    /** Gets the polyphonic key pressure which is specified as a value from 0-127. */
    /* CompleteClass */
    var pressure: Double = js.native
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents a MIDI message that specifies a program change. */
  @JSGlobal("Windows.Devices.Midi.MidiProgramChangeMessage")
  @js.native
  class MidiProgramChangeMessage protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiProgramChangeMessage {
    /**
      * Creates a new MidiProgramChangeMessage object.
      * @param channel The channel from 0-15 that this message applies to.
      * @param program The program to change from 0-127.
      */
    def this(channel: Double, program: Double) = this()
    
    /** Gets the channel from 0-15 that this message applies to. */
    /* CompleteClass */
    var channel: Double = js.native
    
    /** Gets the program to change from 0-127. */
    /* CompleteClass */
    var program: Double = js.native
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents a MIDI message that specifies a song position pointer. */
  @JSGlobal("Windows.Devices.Midi.MidiSongPositionPointerMessage")
  @js.native
  class MidiSongPositionPointerMessage protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiSongPositionPointerMessage {
    /**
      * Creates a new MidiSongPositionPointerMessage object.
      * @param beats The song position pointer encoded in a 14-bit value from 0-16383.
      */
    def this(beats: Double) = this()
    
    /** Gets the song position pointer encoded in a 14-bit value from 0-16383. */
    /* CompleteClass */
    var beats: Double = js.native
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents a MIDI message that specifies the selected song. */
  @JSGlobal("Windows.Devices.Midi.MidiSongSelectMessage")
  @js.native
  class MidiSongSelectMessage protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiSongSelectMessage {
    /**
      * Creates a new MidiSongSelectMessage object.
      * @param song The song to select from 0-127.
      */
    def this(song: Double) = this()
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the song to select from 0-127. */
    /* CompleteClass */
    var song: Double = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents a MIDI message that specifies a start message. */
  @JSGlobal("Windows.Devices.Midi.MidiStartMessage")
  @js.native
  /** Creates a new MidiStartMessage object. */
  class MidiStartMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiStartMessage {
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents a MIDI message that specifies a stop message. */
  @JSGlobal("Windows.Devices.Midi.MidiStopMessage")
  @js.native
  /** Creates a new MidiStopMessage object. */
  class MidiStopMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiStopMessage {
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents the Microsoft GS wavetable software synthesizer, included in Windows. This synthesizer provides a Roland GS sound set, which includes and extends the General MIDI sound set. */
  @JSGlobal("Windows.Devices.Midi.MidiSynthesizer")
  @js.native
  abstract class MidiSynthesizer ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiSynthesizer {
    
    /** Gets the audio output device being used by this instance of the Microsoft MIDI synthesizer. */
    /* CompleteClass */
    var audioDevice: DeviceInformation = js.native
    
    /** Closes this instance of the Microsoft MIDI synthesizer. It is a best practice for the caller to use this method to clear resources used by the MIDI object. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets the device ID of the Microsoft MIDI synthesizer. Note that all instances of the synthesizer have the same ID. */
    /* CompleteClass */
    var deviceId: String = js.native
    
    /**
      * Sends an array of bytes through the synthesizer's out port . This enables you to send your data as a byte array instead of as a defined MIDI message.
      * @param midiData The array of bytes to send.
      */
    /* CompleteClass */
    override def sendBuffer(midiData: IBuffer): Unit = js.native
    
    /**
      * Sends a MIDI message through the Microsoft MIDI synthesizer's out port .
      * @param midiMessage The MIDI message to send.
      */
    /* CompleteClass */
    override def sendMessage(midiMessage: IMidiMessage): Unit = js.native
    
    /** Gets or sets the output volume of this instance of the Microsoft MIDI synthesizer. */
    /* CompleteClass */
    var volume: Double = js.native
  }
  object MidiSynthesizer {
    
    @JSGlobal("Windows.Devices.Midi.MidiSynthesizer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new instance of the Microsoft MIDI synthesizer that uses the system's default audio output device.
      * @return An instance of the Windows MIDI synthesizer.
      */
    /* static member */
    @scala.inline
    def createAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Midi.MidiSynthesizer] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Midi.MidiSynthesizer]]
    /**
      * Creates a new instance of the Microsoft MIDI synthesizer with a specified audio output device.
      * @param audioDevice The audio output device.
      * @return An instance of the Microsoft MIDI synthesizer.
      */
    /* static member */
    @scala.inline
    def createAsync(audioDevice: DeviceInformation): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Midi.MidiSynthesizer] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(audioDevice.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Midi.MidiSynthesizer]]
    
    /**
      * Determines whether a particular device is an instance of the Microsoft MIDI synthesizer. When all MIDI out ports on the system are enumerated, this method can be used to identify which of them is the Microsoft MIDI synthesizer.
      * @param midiDevice An object that represents the device in question.
      * @return True if the device is the Microsoft MIDI synthesizer; otherwise, false.
      */
    /* static member */
    @scala.inline
    def isSynthesizer(midiDevice: DeviceInformation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSynthesizer")(midiDevice.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /** Represents a MIDI message that specifies a system exclusive message. */
  @JSGlobal("Windows.Devices.Midi.MidiSystemExclusiveMessage")
  @js.native
  class MidiSystemExclusiveMessage protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiSystemExclusiveMessage {
    /**
      * Creates a new MidiSystemExclusiveMessage object.
      * @param rawData The system exclusive data.
      */
    def this(rawData: IBuffer) = this()
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents a MIDI message that specifies a system reset. */
  @JSGlobal("Windows.Devices.Midi.MidiSystemResetMessage")
  @js.native
  /** Creates a new MidiSystemResetMessage object. */
  class MidiSystemResetMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiSystemResetMessage {
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents a MIDI message that specifies a time code. */
  @JSGlobal("Windows.Devices.Midi.MidiTimeCodeMessage")
  @js.native
  class MidiTimeCodeMessage protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiTimeCodeMessage {
    /**
      * Creates a new MidiTimeCodeMessage object.
      * @param frameType The frame type from 0-7.
      * @param values The time code from 0-32.
      */
    def this(frameType: Double, values: Double) = this()
    
    /** Gets the value of the frame type from 0-7. */
    /* CompleteClass */
    var frameType: Double = js.native
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
    
    /** Gets the time code value from 0-32. */
    /* CompleteClass */
    var values: Double = js.native
  }
  
  /** Represents a MIDI message that specifies a timing clock. */
  @JSGlobal("Windows.Devices.Midi.MidiTimingClockMessage")
  @js.native
  /** Creates a new MidiTimingClockMessage object. */
  class MidiTimingClockMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiTimingClockMessage {
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
  
  /** Represents a MIDI message that specifies a tune request. */
  @JSGlobal("Windows.Devices.Midi.MidiTuneRequestMessage")
  @js.native
  /** Creates a new MidiTuneRequestMessage object. */
  class MidiTuneRequestMessage ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Midi.MidiTuneRequestMessage {
    
    /** Gets the array of bytes associated with the MIDI message, including status byte. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /** Gets the type of this MIDI message. */
    /* CompleteClass */
    var `type`: MidiMessageType = js.native
  }
}
