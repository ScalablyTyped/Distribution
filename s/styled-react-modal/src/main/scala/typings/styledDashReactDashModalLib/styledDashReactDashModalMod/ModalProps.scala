package typings
package styledDashReactDashModalLib.styledDashReactDashModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var afterClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var allowScroll: js.UndefOr[scala.Boolean] = js.undefined
  var beforeClose: js.UndefOr[js.Promise[scala.Unit] | js.Function0[scala.Unit]] = js.undefined
  var beforeOpen: js.UndefOr[js.Promise[scala.Unit] | js.Function0[scala.Unit]] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var isOpen: scala.Boolean
  var onBackgroundClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onEscapeKeydown: js.UndefOr[js.Function1[/* event */ reactLib.Event, scala.Unit]] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    isOpen: scala.Boolean,
    afterClose: js.Function0[scala.Unit] = null,
    afterOpen: js.Function0[scala.Unit] = null,
    allowScroll: js.UndefOr[scala.Boolean] = js.undefined,
    beforeClose: js.Promise[scala.Unit] | js.Function0[scala.Unit] = null,
    beforeOpen: js.Promise[scala.Unit] | js.Function0[scala.Unit] = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    onBackgroundClick: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ] = null,
    onEscapeKeydown: js.Function1[/* event */ reactLib.Event, scala.Unit] = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isOpen")(isOpen)
    if (afterClose != null) __obj.updateDynamic("afterClose")(afterClose)
    if (afterOpen != null) __obj.updateDynamic("afterOpen")(afterOpen)
    if (!js.isUndefined(allowScroll)) __obj.updateDynamic("allowScroll")(allowScroll)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose.asInstanceOf[js.Any])
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onBackgroundClick != null) __obj.updateDynamic("onBackgroundClick")(onBackgroundClick)
    if (onEscapeKeydown != null) __obj.updateDynamic("onEscapeKeydown")(onEscapeKeydown)
    __obj.asInstanceOf[ModalProps]
  }
}

