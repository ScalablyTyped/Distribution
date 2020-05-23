package typings.wordpressEditor.errorBoundaryMod.ErrorBoundary

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  def onError(): Unit
}

object Props {
  @scala.inline
  def apply(onError: () => Unit, children: ReactNode = null): Props = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction0(onError))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

