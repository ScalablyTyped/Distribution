package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tcombLib {
  type Clause = Constructor[js.Any] | Function1
  type Command = js.Any
  type Constructor[T] = js.Any | js.Function
  type Function1 = js.Function1[/* x */ js.Any, js.Any]
  type LazyMessage = js.Function0[java.lang.String]
  type Predicate[T] = js.Function1[/* x */ T, scala.Boolean]
  type StructMixin = StructProps | js.Any
  type TypeGuardPredicate[T] = js.Function1[/* x */ js.Any, /* is T */scala.Boolean]
  type Update[T] = js.Function2[/* instance */ T, /* spec */ UpdatePatch, T]
  type UpdatePatch = Command | ScalablyTyped.runtime.StringDictionary[js.Object]
}
