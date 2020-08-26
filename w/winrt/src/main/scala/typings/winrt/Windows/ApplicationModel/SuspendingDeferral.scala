package typings.winrt.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspendingDeferral extends ISuspendingDeferral

object SuspendingDeferral {
  @scala.inline
  def apply(complete: () => Unit): SuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SuspendingDeferral]
  }
}

