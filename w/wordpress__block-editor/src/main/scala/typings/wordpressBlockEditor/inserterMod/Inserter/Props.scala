package typings.wordpressBlockEditor.inserterMod.Inserter

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typings.wordpressComponents.popoverMod.Popover.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Pick<@wordpress/components.@wordpress/components.Dropdown.Props, 'position' | 'renderToggle'>> */
@js.native
trait Props extends js.Object {
  var clientId: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var isAppender: js.UndefOr[Boolean] = js.native
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
  var position: js.UndefOr[Position] = js.native
  var renderToggle: js.UndefOr[js.Function1[/* props */ RenderProps, Element]] = js.native
  var rootClientId: js.UndefOr[String] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIsAppender(value: Boolean): Self = this.set("isAppender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAppender: Self = this.set("isAppender", js.undefined)
    @scala.inline
    def setOnToggle(value: /* isOpen */ Boolean => Unit): Self = this.set("onToggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRenderToggle(value: /* props */ RenderProps => Element): Self = this.set("renderToggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderToggle: Self = this.set("renderToggle", js.undefined)
    @scala.inline
    def setRootClientId(value: String): Self = this.set("rootClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootClientId: Self = this.set("rootClientId", js.undefined)
  }
  
}

