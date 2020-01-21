package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowLock extends js.Object {
  var locked: js.UndefOr[Boolean] = js.undefined
}

object FlowLock {
  @scala.inline
  def apply(locked: js.UndefOr[Boolean] = js.undefined): FlowLock = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLock]
  }
}

