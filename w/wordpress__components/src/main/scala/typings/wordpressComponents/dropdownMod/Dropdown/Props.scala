package typings.wordpressComponents.dropdownMod.Dropdown

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.popoverMod.Popover.Position
import typings.wordpressComponents.wordpressComponentsBooleans.`false`
import typings.wordpressComponents.wordpressComponentsStrings.container
import typings.wordpressComponents.wordpressComponentsStrings.firstElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * `className` of the global container.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * If you want to target the dropdown menu for styling purposes, you
    * need to provide a `contentClassName` because it's not being rendered
    * as a children of the container node.
    */
  var contentClassName: js.UndefOr[String] = js.native
  /**
    * Opt-in prop to show popovers fullscreen on mobile.
    */
  var expandOnMobile: js.UndefOr[Boolean] = js.native
  /**
    * By default, the first tabblable element in the popover will receive
    * focus when it mounts. This is the same as setting focusOnMount to
    * `"firstElement"`. If you want to focus the container instead, you can
    * set focusOnMount to `"container"`.
    *
    * Set this prop to `false` to disable focus changing entirely. This
    * should only be set when an appropriately accessible substitute
    * behavior exists.
    *
    * @defaultValue "firstElement"
    */
  var focusOnMount: js.UndefOr[firstElement | container | `false`] = js.native
  /**
    * Set this to customize the text that is shown in the dropdown's
    * header when it is fullscreen on mobile.
    */
  var headerTitle: js.UndefOr[ReactNode] = js.native
  /**
    * The direction in which the popover should open relative to its
    * parent node. Specify y- and x-axis as a space-separated string.
    * @defaultValue "top center"
    */
  var position: js.UndefOr[Position] = js.native
  def renderContent(props: RenderProps): Element = js.native
  def renderToggle(props: RenderProps): Element = js.native
}

object Props {
  @scala.inline
  def apply(renderContent: RenderProps => Element, renderToggle: RenderProps => Element): Props = {
    val __obj = js.Dynamic.literal(renderContent = js.Any.fromFunction1(renderContent), renderToggle = js.Any.fromFunction1(renderToggle))
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
    def setRenderContent(value: RenderProps => Element): Self = this.set("renderContent", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderToggle(value: RenderProps => Element): Self = this.set("renderToggle", js.Any.fromFunction1(value))
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    @scala.inline
    def setExpandOnMobile(value: Boolean): Self = this.set("expandOnMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandOnMobile: Self = this.set("expandOnMobile", js.undefined)
    @scala.inline
    def setFocusOnMount(value: firstElement | container | `false`): Self = this.set("focusOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusOnMount: Self = this.set("focusOnMount", js.undefined)
    @scala.inline
    def setHeaderTitle(value: ReactNode): Self = this.set("headerTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTitle: Self = this.set("headerTitle", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

