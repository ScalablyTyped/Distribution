package typings.stylefire.customStyleHandlersMod

import typings.stylefire.typesMod.ResolvedState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomStyleHandler extends js.Object {
  var get: js.UndefOr[String] = js.undefined
  def set(output: ResolvedState, value: js.Any): Unit
}

object CustomStyleHandler {
  @scala.inline
  def apply(set: (ResolvedState, js.Any) => Unit, get: String = null): CustomStyleHandler = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomStyleHandler]
  }
}

