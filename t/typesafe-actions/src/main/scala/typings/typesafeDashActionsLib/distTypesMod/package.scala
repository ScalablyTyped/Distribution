package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type ActionCreator[T /* <: StringOrSymbol */] = js.Function1[/* repeated */ js.Any, typesafeDashActionsLib.Anon_TypeT[T]]
  type ActionCreatorMap[T] = typesafeDashActionsLib.typesafeDashActionsLibStrings.ActionCreatorMap with T
  type ActionType[ActionCreatorOrMap] = (/* import warning: ImportType.apply Failed type conversion: typesafe-actions.typesafe-actions/dist/types.ActionCreatorMap<ActionCreatorOrMap>[keyof ActionCreatorOrMap] */ js.Any) | stdLib.ReturnType[ActionCreatorOrMap]
  type FsaBuilder[T /* <: StringType */, P /* <: Box[_] */, M /* <: Box[_] */] = (PayloadMetaCreator[T, Unbox[P], Unbox[M]]) | (PayloadCreator[T, Unbox[P]]) | NoArgCreator[T]
  type FsaMapBuilder[T /* <: StringType */, R /* <: Box[_] */, P /* <: Box[_] */, M /* <: Box[_] */] = (js.Function2[
    /* payload */ Unbox[P], 
    /* meta */ Unbox[M], 
    typesafeDashActionsLib.Anon_TypeT_1905658326[T] with Unbox[R]
  ]) | (js.Function1[
    /* payload */ Unbox[P], 
    typesafeDashActionsLib.Anon_TypeT_1905658326[T] with Unbox[R]
  ]) | (js.Function0[typesafeDashActionsLib.Anon_TypeT_1905658326[T] with Unbox[R]])
  type NoArgCreator[T /* <: StringType */] = js.Function0[EmptyAction[T]]
  type PayloadCreator[T /* <: StringType */, P] = js.Function1[/* payload */ P, PayloadAction[T, P]]
  type PayloadMetaCreator[T /* <: StringType */, P, M] = js.Function2[/* payload */ P, /* meta */ M, PayloadMetaAction[T, P, M]]
  type StateType[ReducerOrMap] = (typesafeDashActionsLib.typesafeDashActionsLibStrings.StateType with js.Any) | stdLib.ReturnType[ReducerOrMap]
  type StringOrSymbol = StringType | SymbolType
  type StringType = java.lang.String
  type SymbolType = js.Symbol
  type Unbox[T /* <: Box[_] */] = /* import warning: ImportType.apply Failed type conversion: T['v'] */ js.Any
}
