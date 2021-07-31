package typings.webmidi

import typings.webmidi.WebMidi.MIDIAccess
import typings.webmidi.WebMidi.MIDIOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
  /**
    * When invoked, returns a Promise object representing a request for access to MIDI
    * devices on the user's system.
    */
  def requestMIDIAccess(): js.Promise[MIDIAccess] = js.native
  def requestMIDIAccess(options: MIDIOptions): js.Promise[MIDIAccess] = js.native
}
