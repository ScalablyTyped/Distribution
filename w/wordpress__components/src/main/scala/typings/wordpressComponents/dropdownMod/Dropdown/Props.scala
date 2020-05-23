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

trait Props extends js.Object {
  /**
    * `className` of the global container.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * If you want to target the dropdown menu for styling purposes, you
    * need to provide a `contentClassName` because it's not being rendered
    * as a children of the container node.
    */
  var contentClassName: js.UndefOr[String] = js.undefined
  /**
    * Opt-in prop to show popovers fullscreen on mobile.
    */
  var expandOnMobile: js.UndefOr[Boolean] = js.undefined
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
  var focusOnMount: js.UndefOr[firstElement | container | `false`] = js.undefined
  /**
    * Set this to customize the text that is shown in the dropdown's
    * header when it is fullscreen on mobile.
    */
  var headerTitle: js.UndefOr[ReactNode] = js.undefined
  /**
    * The direction in which the popover should open relative to its
    * parent node. Specify y- and x-axis as a space-separated string.
    * @defaultValue "top center"
    */
  var position: js.UndefOr[Position] = js.undefined
  def renderContent(props: RenderProps): Element
  def renderToggle(props: RenderProps): Element
}

object Props {
  @scala.inline
  def apply(
    renderContent: RenderProps => Element,
    renderToggle: RenderProps => Element,
    className: String = null,
    contentClassName: String = null,
    expandOnMobile: js.UndefOr[Boolean] = js.undefined,
    focusOnMount: firstElement | container | `false` = null,
    headerTitle: ReactNode = null,
    position: Position = null
  ): Props = {
    val __obj = js.Dynamic.literal(renderContent = js.Any.fromFunction1(renderContent), renderToggle = js.Any.fromFunction1(renderToggle))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(expandOnMobile)) __obj.updateDynamic("expandOnMobile")(expandOnMobile.get.asInstanceOf[js.Any])
    if (focusOnMount != null) __obj.updateDynamic("focusOnMount")(focusOnMount.asInstanceOf[js.Any])
    if (headerTitle != null) __obj.updateDynamic("headerTitle")(headerTitle.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

