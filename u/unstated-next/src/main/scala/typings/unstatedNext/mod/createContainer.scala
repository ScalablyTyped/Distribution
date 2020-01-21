package typings.unstatedNext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unstated-next", "createContainer")
@js.native
object createContainer extends js.Object {
  def apply[Value, State](useHook: js.Function1[/* initialState */ js.UndefOr[State], Value]): Container[Value, State] = js.native
}

