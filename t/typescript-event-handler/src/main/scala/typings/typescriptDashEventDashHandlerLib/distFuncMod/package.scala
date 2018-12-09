package typings
package typescriptDashEventDashHandlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFuncMod {
  type Action[TInput] = Func[TInput, scala.Unit]
  type AsyncAction[TInput] = AsyncFunc[TInput, scala.Unit]
  type AsyncFunc[TInput, TOutput] = js.Function1[/* value */ TInput, js.Promise[TOutput]]
  type AsyncPredicate[TInput] = AsyncFunc[TInput, scala.Boolean]
  type Func[TInput, TOutput] = js.Function1[/* value */ TInput, TOutput]
  type Predicate[TInput] = Func[TInput, scala.Boolean]
}
