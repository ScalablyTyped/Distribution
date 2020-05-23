package typings.wordpressComponents.modalMod.Modal

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.wordpressComponents.anon.Describedby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  var aria: js.UndefOr[Describedby] = js.undefined
  /**
    * `className` that is applied to the `document.body` while the modal is open.
    * @defaultValue "modal-open"
    */
  var bodyOpenClassName: js.UndefOr[String] = js.undefined
  @JSName("children")
  var children_Props: ReactNode
  /**
    * Label for the close button.
    * @defaultValue "Close dialog"
    */
  var closeButtonLabel: js.UndefOr[String] = js.undefined
  /**
    * If this property is true, it will focus the first tabbable element
    * rendered in the modal.
    * @defaultValue true
    */
  var focusOnMount: js.UndefOr[Boolean] = js.undefined
  /**
    * Icon component to render before the title.
    */
  var icon: js.UndefOr[ComponentType[js.Object]] = js.undefined
  /**
    * If this property is set to false, the modal will not display a close
    * icon and cannot be dismissed.
    * @defaultValue true
    * @deprecated Use isDismissible
    */
  var isDismissable: js.UndefOr[Boolean] = js.undefined
  /**
    * If this property is set to false, the modal will not display a close
    * icon and cannot be dismissed.
    * @defaultValue true
    */
  var isDismissible: js.UndefOr[Boolean] = js.undefined
  /**
    * If this property is added, it will an additional class name to the
    * modal overlay div.
    */
  var overlayClassName: js.UndefOr[String] = js.undefined
  /**
    * If this property is added, it will determine whether the modal
    * requests to close when a mouse click occurs outside of the modal
    * content.
    * @defaultValue true
    */
  var shouldCloseOnClickOutside: js.UndefOr[Boolean] = js.undefined
  /**
    * If this property is added, it will determine whether the modal
    * requests to close when the escape key is pressed.
    * @defaultValue true
    */
  var shouldCloseOnEsc: js.UndefOr[Boolean] = js.undefined
  /**
    * This property is used as the modal header's title. It is required
    * for a11y reasons.
    */
  @JSName("title")
  var title_Props: String
  /**
    * This function is called to indicate that the modal should be closed.
    */
  def onRequestClose(): Unit
}

object Props {
  @scala.inline
  def apply(
    onRequestClose: () => Unit,
    title: String,
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    aria: Describedby = null,
    bodyOpenClassName: String = null,
    children: ReactNode = null,
    closeButtonLabel: String = null,
    focusOnMount: js.UndefOr[Boolean] = js.undefined,
    icon: ComponentType[js.Object] = null,
    isDismissable: js.UndefOr[Boolean] = js.undefined,
    isDismissible: js.UndefOr[Boolean] = js.undefined,
    overlayClassName: String = null,
    shouldCloseOnClickOutside: js.UndefOr[Boolean] = js.undefined,
    shouldCloseOnEsc: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(onRequestClose = js.Any.fromFunction0(onRequestClose), title = title.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (aria != null) __obj.updateDynamic("aria")(aria.asInstanceOf[js.Any])
    if (bodyOpenClassName != null) __obj.updateDynamic("bodyOpenClassName")(bodyOpenClassName.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (closeButtonLabel != null) __obj.updateDynamic("closeButtonLabel")(closeButtonLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnMount)) __obj.updateDynamic("focusOnMount")(focusOnMount.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isDismissable)) __obj.updateDynamic("isDismissable")(isDismissable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDismissible)) __obj.updateDynamic("isDismissible")(isDismissible.get.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCloseOnClickOutside)) __obj.updateDynamic("shouldCloseOnClickOutside")(shouldCloseOnClickOutside.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCloseOnEsc)) __obj.updateDynamic("shouldCloseOnEsc")(shouldCloseOnEsc.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

