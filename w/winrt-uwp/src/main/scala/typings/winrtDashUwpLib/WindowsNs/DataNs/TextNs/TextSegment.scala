package typings
package winrtDashUwpLib.WindowsNs.DataNs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies a sub-string of a source text string. Your app can use this structure to obtain the segment of your provided text that is identified by AlternateWordForm , SelectableWordSegment , WordSegment , or SemanticTextQuery . */
trait TextSegment extends js.Object {
  /** The number of characters in the associated text segment. */
  var length: scala.Double
  /** The zero-based index of the start of the associated text segment. */
  var startPosition: scala.Double
}

object TextSegment {
  @scala.inline
  def apply(length: scala.Double, startPosition: scala.Double): TextSegment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("startPosition")(startPosition)
    __obj.asInstanceOf[TextSegment]
  }
}

