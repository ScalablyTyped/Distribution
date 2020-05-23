package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the bounding boxes—in screen coordinates—of a range of text, and of a text input control. */
trait CoreTextLayoutBounds extends js.Object {
  /** Gets or sets the bounding box in screen coordinates of a text input control. */
  var controlBounds: Rect
  /** Gets or sets the bounding box in screen coordinates of a range of text. */
  var textBounds: Rect
}

object CoreTextLayoutBounds {
  @scala.inline
  def apply(controlBounds: Rect, textBounds: Rect): CoreTextLayoutBounds = {
    val __obj = js.Dynamic.literal(controlBounds = controlBounds.asInstanceOf[js.Any], textBounds = textBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextLayoutBounds]
  }
}

