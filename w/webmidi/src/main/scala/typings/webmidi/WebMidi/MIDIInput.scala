package typings.webmidi.WebMidi

import typings.std.AddEventListenerOptions
import typings.webmidi.webmidiStrings.input
import typings.webmidi.webmidiStrings.midimessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MIDIInput extends MIDIPort {
  
  @JSName("addEventListener")
  def addEventListener_midimessage(`type`: midimessage, listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIMessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_midimessage(
    `type`: midimessage,
    listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIMessageEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_midimessage(
    `type`: midimessage,
    listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIMessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def onmidimessage(e: MIDIMessageEvent): Unit = js.native
  
  @JSName("type")
  var type_MIDIInput: input = js.native
}
