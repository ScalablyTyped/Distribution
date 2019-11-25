package typings.systemjs.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Declare extends js.Object {
  var execute: js.UndefOr[js.Function0[_]] = js.undefined
  var setters: js.UndefOr[js.Array[SetterFn]] = js.undefined
}

object Declare {
  @scala.inline
  def apply(execute: () => _ = null, setters: js.Array[SetterFn] = null): Declare = {
    val __obj = js.Dynamic.literal()
    if (execute != null) __obj.updateDynamic("execute")(js.Any.fromFunction0(execute))
    if (setters != null) __obj.updateDynamic("setters")(setters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declare]
  }
}

