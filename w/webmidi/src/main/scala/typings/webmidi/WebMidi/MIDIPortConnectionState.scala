package typings.webmidi.WebMidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webmidi.webmidiStrings.open
  - typings.webmidi.webmidiStrings.closed
  - typings.webmidi.webmidiStrings.pending
*/
trait MIDIPortConnectionState extends js.Object
object MIDIPortConnectionState {
  
  @scala.inline
  def closed: typings.webmidi.webmidiStrings.closed = "closed".asInstanceOf[typings.webmidi.webmidiStrings.closed]
  
  @scala.inline
  def open: typings.webmidi.webmidiStrings.open = "open".asInstanceOf[typings.webmidi.webmidiStrings.open]
  
  @scala.inline
  def pending: typings.webmidi.webmidiStrings.pending = "pending".asInstanceOf[typings.webmidi.webmidiStrings.pending]
}
