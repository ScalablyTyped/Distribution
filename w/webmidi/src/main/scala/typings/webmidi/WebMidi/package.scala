package typings.webmidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object WebMidi {
  
  /**
    * This is a maplike interface whose value is a MIDIInput instance and key is its
    * ID.
    */
  type MIDIInputMap = typings.std.Map[java.lang.String, typings.webmidi.WebMidi.MIDIInput]
  
  /**
    * This is a maplike interface whose value is a MIDIOutput instance and key is its
    * ID.
    */
  type MIDIOutputMap = typings.std.Map[java.lang.String, typings.webmidi.WebMidi.MIDIOutput]
}
