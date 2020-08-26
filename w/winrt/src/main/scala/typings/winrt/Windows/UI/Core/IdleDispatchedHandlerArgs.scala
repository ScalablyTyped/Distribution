package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdleDispatchedHandlerArgs extends IIdleDispatchedHandlerArgs

object IdleDispatchedHandlerArgs {
  @scala.inline
  def apply(isDispatcherIdle: Boolean): IdleDispatchedHandlerArgs = {
    val __obj = js.Dynamic.literal(isDispatcherIdle = isDispatcherIdle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleDispatchedHandlerArgs]
  }
}

