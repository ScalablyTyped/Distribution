package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distIsDashActionDashOfMod {
  type AC[T /* <: typesafeDashActionsLib.Anon_TypeString */] = (js.Function1[/* repeated */js.Any, T]) with (typesafeDashActionsLib.distTypesMod.TypeMeta[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(type))) */js.Any
  ])
  type ACs[T1 /* <: typesafeDashActionsLib.Anon_TypeString */, T2 /* <: typesafeDashActionsLib.Anon_TypeString */, T3 /* <: typesafeDashActionsLib.Anon_TypeString */, T4 /* <: typesafeDashActionsLib.Anon_TypeString */, T5 /* <: typesafeDashActionsLib.Anon_TypeString */] = js.Array[AC[T1]] | (js.Tuple2[AC[T1], AC[T2]]) | (js.Tuple3[AC[T1], AC[T2], AC[T3]]) | (js.Tuple4[AC[T1], AC[T2], AC[T3], AC[T4]]) | (js.Tuple5[AC[T1], AC[T2], AC[T3], AC[T4], AC[T5]])
}
