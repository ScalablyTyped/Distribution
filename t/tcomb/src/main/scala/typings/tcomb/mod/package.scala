package typings.tcomb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Clause = typings.tcomb.mod.Constructor[js.Any] | typings.tcomb.mod.Function1
  type Constructor[T] = typings.tcomb.mod.Type[T] | js.Function
  type Function1 = js.Function1[/* x */ js.Any, js.Any]
  type LazyMessage = js.Function0[java.lang.String]
  type Predicate[T] = js.Function1[/* x */ T, scala.Boolean]
  type StructMixin = typings.tcomb.mod.StructProps | typings.tcomb.mod.Struct_[js.Any] | typings.tcomb.mod.Interface_[js.Any]
  //
  // struct
  //
  type StructProps = org.scalablytyped.runtime.StringDictionary[typings.tcomb.mod.Constructor[js.Any]]
  type TypeGuardPredicate[T] = js.Function1[/* x */ js.Any, /* is T */ scala.Boolean]
  type UpdatePatch = typings.tcomb.mod.Command | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tcomb.tcomb.UpdatePatch */ js.Object
  ])
  type Update_[T] = js.Function2[/* instance */ T, /* spec */ typings.tcomb.mod.UpdatePatch, T]
}
