package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type ActionCreator[T /* <: StringType */] = js.Function1[/* repeated */js.Any, typesafeDashActionsLib.Anon_TypeT_1533696741[T]]
  type ActionCreatorMap[T] = typesafeDashActionsLib.typesafeDashActionsLibStrings.ActionCreatorMap with T
  type ActionType[ActionCreatorOrMap] = (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(typesafe-actions), TsIdentModule(None,List(typesafe-actions, dist, types)), TsIdentSimple(ActionCreatorMap))),List(TsTypeRef(TsQIdent(List(TsIdentSimple(ActionCreatorOrMap))),List()))),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(ActionCreatorOrMap))),List())))) */js.Any) | stdLib.ReturnType[ActionCreatorOrMap]
  type FsaBuilder[T /* <: StringType */, P /* <: B[_] */, M /* <: B[_] */] = (PayloadMetaCreator[T, U[P], U[M]]) | (PayloadCreator[T, U[P]]) | NoArgCreator[T]
  type MapAction[R /* <: typesafeDashActionsLib.Anon_TypeAny */] = R
  type MapBuilder[T /* <: StringType */, R /* <: B[_] */, P /* <: B[_] */, M /* <: B[_] */] = (js.Function2[
    /* payload */ U[P], 
    /* meta */ U[M], 
    MapAction[typesafeDashActionsLib.Anon_TypeT[T] with U[R]]
  ]) | (js.Function1[/* payload */ U[P], MapAction[typesafeDashActionsLib.Anon_TypeT[T] with U[R]]]) | (js.Function0[MapAction[typesafeDashActionsLib.Anon_TypeT[T] with U[R]]])
  type NoArgCreator[T /* <: StringType */] = js.Function0[EmptyAction[T]]
  type PayloadCreator[T /* <: StringType */, P] = js.Function1[/* payload */ P, PayloadAction[T, P]]
  type PayloadMetaAction[T /* <: StringType */, P, M] = (typesafeDashActionsLib.Anon_TypeMeta[T, M, P]) | (typesafeDashActionsLib.Anon_TypePayload[T, P]) | (typesafeDashActionsLib.Anon_TypeMetaT[T, M]) | typesafeDashActionsLib.Anon_TypeT[T]
  type PayloadMetaCreator[T /* <: StringType */, P, M] = js.Function2[/* payload */ P, /* meta */ M, PayloadMetaAction[T, P, M]]
  type StateType[ReducerOrMap] = (typesafeDashActionsLib.typesafeDashActionsLibStrings.StateType with js.Any) | stdLib.ReturnType[ReducerOrMap]
  type StringOrSymbol = StringType | SymbolType
  type StringType = java.lang.String
  type SymbolType = js.Symbol
  type U[T /* <: B[_] */] = /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(v))) */js.Any
  type Unboxed[T] = T
}
