package typings
package tcombLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tcombMod {
  type Clause = Constructor[js.Any] | Function1
  type Constructor[T] = Type[T] | js.Function
  type Function1 = js.Function1[/* x */ js.Any, js.Any]
  type LazyMessage = js.Function0[java.lang.String]
  type Predicate[T] = js.Function1[/* x */ T, scala.Boolean]
  type StructMixin = StructProps | Struct[js.Any] | Interface[js.Any]
  //
  // struct
  //
  type StructProps = org.scalablytyped.runtime.StringDictionary[Constructor[js.Any]]
  type TypeGuardPredicate[T] = js.Function1[/* x */ js.Any, /* is T */ scala.Boolean]
  type Update[T] = js.Function2[/* instance */ T, /* spec */ UpdatePatch, T]
  type UpdatePatch = Command | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias tcomb.tcomb.UpdatePatch */ js.Object
  ])
}
