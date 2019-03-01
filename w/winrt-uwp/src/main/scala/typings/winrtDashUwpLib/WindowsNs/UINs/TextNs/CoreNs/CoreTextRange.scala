package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a range of text inside a text input control. */
trait CoreTextRange extends js.Object {
  /** The end position of a range in Application Character Position (ACP) terms. */
  var endCaretPosition: scala.Double
  /** The start position of a range in Application Character Position (ACP) terms. */
  var startCaretPosition: scala.Double
}

object CoreTextRange {
  @scala.inline
  def apply(endCaretPosition: scala.Double, startCaretPosition: scala.Double): CoreTextRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endCaretPosition")(endCaretPosition)
    __obj.updateDynamic("startCaretPosition")(startCaretPosition)
    __obj.asInstanceOf[CoreTextRange]
  }
}

