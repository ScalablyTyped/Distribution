package typings.typescriptDashEventDashHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFuncMod {
  type Action[TInput] = Func[TInput, Unit]
  type AsyncAction[TInput] = AsyncFunc[TInput, Unit]
  type AsyncFunc[TInput, TOutput] = js.Function1[/* value */ TInput, js.Promise[TOutput]]
  type AsyncPredicate[TInput] = AsyncFunc[TInput, Boolean]
  type Func[TInput, TOutput] = js.Function1[/* value */ TInput, TOutput]
  type Predicate[TInput] = Func[TInput, Boolean]
}
