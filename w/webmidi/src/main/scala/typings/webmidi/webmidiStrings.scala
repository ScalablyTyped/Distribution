package typings.webmidi

import typings.webmidi.WebMidi.MIDIPortConnectionState
import typings.webmidi.WebMidi.MIDIPortDeviceState
import typings.webmidi.WebMidi.MIDIPortType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webmidiStrings {
  @js.native
  sealed trait closed extends MIDIPortConnectionState
  
  @js.native
  sealed trait connected extends MIDIPortDeviceState
  
  @js.native
  sealed trait disconnected extends MIDIPortDeviceState
  
  @js.native
  sealed trait input extends MIDIPortType
  
  @js.native
  sealed trait open extends MIDIPortConnectionState
  
  @js.native
  sealed trait output extends MIDIPortType
  
  @js.native
  sealed trait pending extends MIDIPortConnectionState
  
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def output: output = "output".asInstanceOf[output]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
}

