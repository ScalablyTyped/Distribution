package typings.tcomb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tcombMod {
  import org.scalablytyped.runtime.StringDictionary

  type Clause = Constructor[js.Any] | Function1
  type Constructor[T] = Type[T] | js.Function
  type Function1 = js.Function1[/* x */ js.Any, js.Any]
  type LazyMessage = js.Function0[String]
  type Predicate[T] = js.Function1[/* x */ T, Boolean]
  type StructMixin = StructProps | Struct[js.Any] | Interface[js.Any]
  //
  // struct
  //
  type StructProps = StringDictionary[Constructor[js.Any]]
  type TypeGuardPredicate[T] = js.Function1[/* x */ js.Any, /* is T */ Boolean]
  type Update[T] = js.Function2[/* instance */ T, /* spec */ UpdatePatch, T]
  type UpdatePatch = Command | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias tcomb.tcomb.UpdatePatch */ js.Object
  ])
}
