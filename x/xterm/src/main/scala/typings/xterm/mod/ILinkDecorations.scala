package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of decorations that can be applied to links.
  */
@js.native
trait ILinkDecorations extends js.Object {
  /**
    * Whether the cursor is set to pointer.
    */
  var pointerCursor: Boolean = js.native
  /**
    * Whether the underline is visible
    */
  var underline: Boolean = js.native
}

object ILinkDecorations {
  @scala.inline
  def apply(pointerCursor: Boolean, underline: Boolean): ILinkDecorations = {
    val __obj = js.Dynamic.literal(pointerCursor = pointerCursor.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkDecorations]
  }
  @scala.inline
  implicit class ILinkDecorationsOps[Self <: ILinkDecorations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPointerCursor(value: Boolean): Self = this.set("pointerCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
  }
  
}

