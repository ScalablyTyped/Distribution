package typings.wordpressEditor.documentOutlineMod.DocumentOutline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var children: js.UndefOr[scala.Nothing] = js.native
  var hasOutlineItemsDisabled: js.UndefOr[Boolean] = js.native
  def onSelect(): Unit = js.native
}

object Props {
  @scala.inline
  def apply(onSelect: () => Unit): Props = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction0(onSelect))
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setOnSelect(value: () => Unit): Self = this.set("onSelect", js.Any.fromFunction0(value))
    @scala.inline
    def setHasOutlineItemsDisabled(value: Boolean): Self = this.set("hasOutlineItemsDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasOutlineItemsDisabled: Self = this.set("hasOutlineItemsDisabled", js.undefined)
  }
  
}

