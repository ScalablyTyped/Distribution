package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of decorations that can be applied to links.
  */
trait ILinkDecorations extends js.Object {
  /**
    * Whether the cursor is set to pointer.
    */
  var pointerCursor: Boolean
  /**
    * Whether the underline is visible
    */
  var underline: Boolean
}

object ILinkDecorations {
  @scala.inline
  def apply(pointerCursor: Boolean, underline: Boolean): ILinkDecorations = {
    val __obj = js.Dynamic.literal(pointerCursor = pointerCursor.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkDecorations]
  }
}

