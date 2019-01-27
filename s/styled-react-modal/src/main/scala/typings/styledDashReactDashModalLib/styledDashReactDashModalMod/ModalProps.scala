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

