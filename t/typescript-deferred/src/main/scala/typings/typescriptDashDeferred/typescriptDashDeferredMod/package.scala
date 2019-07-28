package typings.typescriptDashDeferred

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typescriptDashDeferredMod {
  type DeferredErrorCB[TP] = js.Function1[/* error */ js.Any, ThenableInterface[TP]]
  type DeferredSuccessCB[T, TP] = js.Function1[/* value */ T, ThenableInterface[TP]]
  type ImmediateErrorCB[TP] = js.Function1[/* err */ js.Any, TP]
  type ImmediateSuccessCB[T, TP] = js.Function1[/* value */ T, TP]
}
