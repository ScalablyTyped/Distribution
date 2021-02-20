package typings.webmidi

import typings.webmidi.WebMidi.MIDIPortConnectionState
import typings.webmidi.WebMidi.MIDIPortDeviceState
import typings.webmidi.WebMidi.MIDIPortType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webmidiStrings {
  
  @js.native
  sealed trait closed extends MIDIPortConnectionState
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait connected extends MIDIPortDeviceState
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait disconnected extends MIDIPortDeviceState
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait input extends MIDIPortType
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait midimessage extends StObject
  @scala.inline
  def midimessage: midimessage = "midimessage".asInstanceOf[midimessage]
  
  @js.native
  sealed trait open extends MIDIPortConnectionState
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait output extends MIDIPortType
  @scala.inline
  def output: output = "output".asInstanceOf[output]
  
  @js.native
  sealed trait pending extends MIDIPortConnectionState
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait statechange extends StObject
  @scala.inline
  def statechange: statechange = "statechange".asInstanceOf[statechange]
}
