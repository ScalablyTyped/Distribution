package typings.wordpressEditor.documentOutlineMod.DocumentOutline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var hasOutlineItemsDisabled: js.UndefOr[Boolean] = js.undefined
  def onSelect(): Unit
}

object Props {
  @scala.inline
  def apply(onSelect: () => Unit, hasOutlineItemsDisabled: js.UndefOr[Boolean] = js.undefined): Props = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction0(onSelect))
    if (!js.isUndefined(hasOutlineItemsDisabled)) __obj.updateDynamic("hasOutlineItemsDisabled")(hasOutlineItemsDisabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

