package typings
package styletronDashReactLib.styletronDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackInfo extends js.Object {
  var message: java.lang.String
  var stack: js.UndefOr[java.lang.String] = js.undefined
  var stacktrace: js.Any
}

object StackInfo {
  @scala.inline
  def apply(message: java.lang.String, stacktrace: js.Any, stack: java.lang.String = null): StackInfo = {
    val __obj = js.Dynamic.literal(message = message, stacktrace = stacktrace)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[StackInfo]
  }
}

