package typings
package webmidiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webmidiLibStrings {
  @js.native
  sealed trait closed
    extends webmidiLib.WebMidiNs.MIDIPortConnectionState
  
  @js.native
  sealed trait connected
    extends webmidiLib.WebMidiNs.MIDIPortDeviceState
  
  @js.native
  sealed trait disconnected
    extends webmidiLib.WebMidiNs.MIDIPortDeviceState
  
  @js.native
  sealed trait input
    extends webmidiLib.WebMidiNs.MIDIPortType
  
  @js.native
  sealed trait open
    extends webmidiLib.WebMidiNs.MIDIPortConnectionState
  
  @js.native
  sealed trait output
    extends webmidiLib.WebMidiNs.MIDIPortType
  
  @js.native
  sealed trait pending
    extends webmidiLib.WebMidiNs.MIDIPortConnectionState
  
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

