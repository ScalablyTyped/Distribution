package typings.vscodeJsonrpc.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitterOptions extends js.Object {
  var onFirstListenerAdd: js.UndefOr[js.Function] = js.undefined
  var onLastListenerRemove: js.UndefOr[js.Function] = js.undefined
}

object EmitterOptions {
  @scala.inline
  def apply(onFirstListenerAdd: js.Function = null, onLastListenerRemove: js.Function = null): EmitterOptions = {
    val __obj = js.Dynamic.literal()
    if (onFirstListenerAdd != null) __obj.updateDynamic("onFirstListenerAdd")(onFirstListenerAdd.asInstanceOf[js.Any])
    if (onLastListenerRemove != null) __obj.updateDynamic("onLastListenerRemove")(onLastListenerRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOptions]
  }
}

