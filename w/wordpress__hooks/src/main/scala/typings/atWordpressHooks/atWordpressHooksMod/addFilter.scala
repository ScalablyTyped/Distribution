package typings.atWordpressHooks.atWordpressHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/hooks", "addFilter")
@js.native
object addFilter extends js.Object {
  def apply[T](
    hookName: String,
    namespace: String,
    callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T]
  ): Unit = js.native
  def apply[T](
    hookName: String,
    namespace: String,
    callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T],
    priority: Double
  ): Unit = js.native
}

