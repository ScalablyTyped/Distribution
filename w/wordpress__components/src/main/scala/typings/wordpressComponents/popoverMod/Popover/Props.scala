package typings.wordpressComponents.popoverMod.Popover

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.FocusEvent
import typings.react.mod.ReactNode
import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import typings.wordpressComponents.wordpressComponentsBooleans.`false`
import typings.wordpressComponents.wordpressComponentsStrings.container
import typings.wordpressComponents.wordpressComponentsStrings.firstElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  /**
    * A custom `DOMRect` object at which to position the popover.
    */
  var anchorRect: js.UndefOr[DOMRect | ClientRect] = js.undefined
  /**
    * Should the popover have an animation?
    * @defaultValue true
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
    * The content to be displayed within the popover.
    */
  @JSName("children")
  var children_Props: ReactNode
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
    * Function that should return a `DOMRect` of where to position the
    * popover.
    */
  var getAnchorRect: js.UndefOr[
    js.Function1[
      /* currentAnchorElement */ HTMLSpanElement | Null, 
      js.UndefOr[DOMRect | ClientRect]
    ]
  ] = js.undefined
  /**
    * Set this to customize the text that is shown in popover's header
    * when it is fullscreen on mobile.
    */
  var headerTitle: js.UndefOr[String] = js.undefined
  /**
    * Set this to hide the arrow which visually indicates what the popover
    * is anchored to. Note that the arrow will not display if `position` is
    * set to `"middle center"`.
    */
  var noArrow: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback invoked when the user clicks outside the opened popover,
    * passing the click event. The popover should be closed in response to
    * this interaction.
    *
    * @deprecated  use `onFocusOutside`
    */
  var onClickOutside: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A callback invoked when the popover should be closed.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A callback invoked when the focus leaves the opened popover. This
    * should only be provided in advanced use-cases when a Popover should
    * close under specific circumstances; for example, if the new
    * `document.activeElement` is content of or otherwise controlling
    * Popover visibility.
    *
    * Defaults to `onClose` when not provided.
    */
  var onFocusOutside: js.UndefOr[js.Function1[/* event */ FocusEvent[Element], Unit]] = js.undefined
  /**
    * The direction in which the popover should open relative to its
    * parent node. Specify y- and x-axis as a space-separated string.
    * @defaultValue "top center"
    */
  var position: js.UndefOr[Position] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    anchorRect: DOMRect | ClientRect = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    expandOnMobile: js.UndefOr[Boolean] = js.undefined,
    focusOnMount: firstElement | container | `false` = null,
    getAnchorRect: /* currentAnchorElement */ HTMLSpanElement | Null => js.UndefOr[DOMRect | ClientRect] = null,
    headerTitle: String = null,
    noArrow: js.UndefOr[Boolean] = js.undefined,
    onClickOutside: () => Unit = null,
    onClose: () => Unit = null,
    onFocusOutside: /* event */ FocusEvent[Element] => Unit = null,
    position: Position = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (anchorRect != null) __obj.updateDynamic("anchorRect")(anchorRect.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(expandOnMobile)) __obj.updateDynamic("expandOnMobile")(expandOnMobile.get.asInstanceOf[js.Any])
    if (focusOnMount != null) __obj.updateDynamic("focusOnMount")(focusOnMount.asInstanceOf[js.Any])
    if (getAnchorRect != null) __obj.updateDynamic("getAnchorRect")(js.Any.fromFunction1(getAnchorRect))
    if (headerTitle != null) __obj.updateDynamic("headerTitle")(headerTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(noArrow)) __obj.updateDynamic("noArrow")(noArrow.get.asInstanceOf[js.Any])
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction0(onClickOutside))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onFocusOutside != null) __obj.updateDynamic("onFocusOutside")(js.Any.fromFunction1(onFocusOutside))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

