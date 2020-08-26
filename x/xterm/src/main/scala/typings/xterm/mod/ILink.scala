package typings.xterm.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A link within the terminal.
  */
@js.native
trait ILink extends js.Object {
  /**
    * What link decorations to show when hovering the link, this property is tracked and changes
    * made after the link is provided will trigger changes. If not set, all decroations will be
    * enabled.
    */
  var decorations: js.UndefOr[ILinkDecorations] = js.native
  /**
    * Called when the mouse hovers the link. To use this to create a DOM-based hover tooltip,
    * create the hover element within `Terminal.element` and add the `xterm-hover` class to it,
    * that will cause mouse events to not fall through and activate other links.
    * @param event The mouse event triggering the callback.
    * @param text The text of the link.
    */
  var hover: js.UndefOr[js.Function2[/* event */ MouseEvent, /* text */ String, Unit]] = js.native
  /**
    * Called when the mouse leaves the link.
    * @param event The mouse event triggering the callback.
    * @param text The text of the link.
    */
  var leave: js.UndefOr[js.Function2[/* event */ MouseEvent, /* text */ String, Unit]] = js.native
  /**
    * The buffer range of the link.
    */
  var range: IBufferRange = js.native
  /**
    * The text of the link.
    */
  var text: String = js.native
  /**
    * Calls when the link is activated.
    * @param event The mouse event triggering the callback.
    * @param text The text of the link.
    */
  def activate(event: MouseEvent, text: String): Unit = js.native
}

object ILink {
  @scala.inline
  def apply(activate: (MouseEvent, String) => Unit, range: IBufferRange, text: String): ILink = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction2(activate), range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILink]
  }
  @scala.inline
  implicit class ILinkOps[Self <: ILink] (val x: Self) extends AnyVal {
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
    def setActivate(value: (MouseEvent, String) => Unit): Self = this.set("activate", js.Any.fromFunction2(value))
    @scala.inline
    def setRange(value: IBufferRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecorations(value: ILinkDecorations): Self = this.set("decorations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecorations: Self = this.set("decorations", js.undefined)
    @scala.inline
    def setHover(value: (/* event */ MouseEvent, /* text */ String) => Unit): Self = this.set("hover", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setLeave(value: (/* event */ MouseEvent, /* text */ String) => Unit): Self = this.set("leave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
  }
  
}

