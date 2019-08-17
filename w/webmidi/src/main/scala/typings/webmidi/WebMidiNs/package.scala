package typings.webmidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebMidiNs {
  import typings.std.Map

  /**
    * This is a maplike interface whose value is a MIDIInput instance and key is its
    * ID.
    */
  type MIDIInputMap = Map[String, MIDIInput]
  /**
    * This is a maplike interface whose value is a MIDIOutput instance and key is its
    * ID.
    */
  type MIDIOutputMap = Map[String, MIDIOutput]
}
