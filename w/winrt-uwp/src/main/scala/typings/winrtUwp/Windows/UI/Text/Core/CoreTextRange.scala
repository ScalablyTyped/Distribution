package typings.winrtUwp.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a range of text inside a text input control. */
trait CoreTextRange extends js.Object {
  /** The end position of a range in Application Character Position (ACP) terms. */
  var endCaretPosition: Double
  /** The start position of a range in Application Character Position (ACP) terms. */
  var startCaretPosition: Double
}

object CoreTextRange {
  @scala.inline
  def apply(endCaretPosition: Double, startCaretPosition: Double): CoreTextRange = {
    val __obj = js.Dynamic.literal(endCaretPosition = endCaretPosition.asInstanceOf[js.Any], startCaretPosition = startCaretPosition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CoreTextRange]
  }
}

