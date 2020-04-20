package typings.winrt.Windows.System.RemoteDesktop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInteractiveSessionStatics extends js.Object {
  var isRemote: Boolean
}

object IInteractiveSessionStatics {
  @scala.inline
  def apply(isRemote: Boolean): IInteractiveSessionStatics = {
    val __obj = js.Dynamic.literal(isRemote = isRemote.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInteractiveSessionStatics]
  }
}

