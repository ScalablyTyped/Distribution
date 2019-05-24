package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypeDashHelpersMod {
  type ActionBuilderConstructor[TType /* <: TypeConstant */, TPayload /* <: js.Any */, TMeta /* <: js.Any */] = (PayloadMetaAC[TType, TPayload, TMeta]) | (PayloadAC[TType, TPayload]) | EmptyAC[TType]
  type ActionBuilderMap[TType /* <: TypeConstant */, TActionProps /* <: js.Any */, TPayloadArg /* <: js.Any */, TMetaArg /* <: js.Any */] = (js.Function2[
    /* payload */ TPayloadArg, 
    /* meta */ TMetaArg, 
    typesafeDashActionsLib.Anon_TypeTType[TType] with TActionProps
  ]) | (js.Function1[
    /* payload */ TPayloadArg, 
    typesafeDashActionsLib.Anon_TypeTType[TType] with TActionProps
  ]) | (js.Function0[typesafeDashActionsLib.Anon_TypeTType[TType] with TActionProps])
  type ActionCreator[TType /* <: TypeConstant */] = js.Function1[/* repeated */ js.Any, Action[TType]]
  type ActionType[TActionCreatorOrMap /* <: js.Any */] = js.Any | stdLib.ReturnType[TActionCreatorOrMap]
  type EmptyAC[TType /* <: TypeConstant */] = js.Function0[EmptyAction[TType]]
  type PayloadAC[TType /* <: TypeConstant */, TPayload] = js.Function1[/* payload */ TPayload, PayloadAction[TType, TPayload]]
  type PayloadMetaAC[TType /* <: TypeConstant */, TPayload, TMeta] = js.Function2[/* payload */ TPayload, /* meta */ TMeta, PayloadMetaAction[TType, TPayload, TMeta]]
  type Reducer[TState, TAction /* <: Action[TypeConstant] */] = js.Function2[/* state */ js.UndefOr[TState], /* action */ TAction, TState]
  type StateType[TReducerOrMap /* <: js.Any */] = (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TReducerOrMap ]: object}
    */ typesafeDashActionsLib.typesafeDashActionsLibStrings.StateType with js.Any) | stdLib.ReturnType[TReducerOrMap]
  type TypeConstant = java.lang.String
}
