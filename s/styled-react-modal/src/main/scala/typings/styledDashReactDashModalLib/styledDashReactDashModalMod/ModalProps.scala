package typings
package styledDashReactDashModalLib.styledDashReactDashModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var afterClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var allowScroll: js.UndefOr[scala.Boolean] = js.undefined
  var backgroundProps: js.UndefOr[js.Object] = js.undefined
  var beforeClose: js.UndefOr[js.Promise[scala.Unit] | js.Function0[scala.Unit]] = js.undefined
  var beforeOpen: js.UndefOr[js.Promise[scala.Unit] | js.Function0[scala.Unit]] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var isOpen: scala.Boolean
  var onBackgroundClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onEscapeKeydown: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    isOpen: scala.Boolean,
    afterClose: () => scala.Unit = null,
    afterOpen: () => scala.Unit = null,
    allowScroll: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundProps: js.Object = null,
    beforeClose: js.Promise[scala.Unit] | js.Function0[scala.Unit] = null,
    beforeOpen: js.Promise[scala.Unit] | js.Function0[scala.Unit] = null,
    children: reactLib.reactMod.ReactNode = null,
    onBackgroundClick: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onEscapeKeydown: /* event */ stdLib.Event => scala.Unit = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (afterOpen != null) __obj.updateDynamic("afterOpen")(js.Any.fromFunction0(afterOpen))
    if (!js.isUndefined(allowScroll)) __obj.updateDynamic("allowScroll")(allowScroll)
    if (backgroundProps != null) __obj.updateDynamic("backgroundProps")(backgroundProps)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose.asInstanceOf[js.Any])
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onBackgroundClick != null) __obj.updateDynamic("onBackgroundClick")(js.Any.fromFunction1(onBackgroundClick))
    if (onEscapeKeydown != null) __obj.updateDynamic("onEscapeKeydown")(js.Any.fromFunction1(onEscapeKeydown))
    __obj.asInstanceOf[ModalProps]
  }
}

