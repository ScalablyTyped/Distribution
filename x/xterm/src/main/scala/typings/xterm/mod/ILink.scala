package typings.xterm.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A link within the terminal.
  */
trait ILink extends js.Object {
  /**
    * Called when the mouse hovers the link.
    * @param event The mouse event triggering the callback.
    * @param text The text of the link.
    */
  var hover: js.UndefOr[js.Function2[/* event */ MouseEvent, /* text */ String, Unit]] = js.undefined
  /**
    * Called when the mouse leaves the link.
    * @param event The mouse event triggering the callback.
    * @param text The text of the link.
    */
  var leave: js.UndefOr[js.Function2[/* event */ MouseEvent, /* text */ String, Unit]] = js.undefined
  /**
    * The buffer range of the link.
    */
  var range: IBufferRange
  /**
    * The text of the link.
    */
  var text: String
  /**
    * Calls when the link is activated.
    * @param event The mouse event triggering the callback.
    * @param text The text of the link.
    */
  def activate(event: MouseEvent, text: String): Unit
}

object ILink {
  @scala.inline
  def apply(
    activate: (MouseEvent, String) => Unit,
    range: IBufferRange,
    text: String,
    hover: (/* event */ MouseEvent, /* text */ String) => Unit = null,
    leave: (/* event */ MouseEvent, /* text */ String) => Unit = null
  ): ILink = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction2(activate), range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(js.Any.fromFunction2(hover))
    if (leave != null) __obj.updateDynamic("leave")(js.Any.fromFunction2(leave))
    __obj.asInstanceOf[ILink]
  }
}

