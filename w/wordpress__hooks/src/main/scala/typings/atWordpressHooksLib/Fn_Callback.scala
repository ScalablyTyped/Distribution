package typings
package atWordpressHooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Callback extends js.Object {
  def apply[T](
    hookName: java.lang.String,
    namespace: java.lang.String,
    callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T]
  ): scala.Unit = js.native
  def apply[T](
    hookName: java.lang.String,
    namespace: java.lang.String,
    callback: js.Function2[/* firstArg */ T, /* repeated */ js.Any, T],
    priority: scala.Double
  ): scala.Unit = js.native
}

