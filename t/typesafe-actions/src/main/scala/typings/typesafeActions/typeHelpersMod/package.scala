package typings.typesafeActions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeHelpersMod {
  type ActionBuilderConstructor[TType /* <: typings.typesafeActions.typeHelpersMod.TypeConstant */, TPayload /* <: js.Any */, TMeta /* <: js.Any */] = (typings.typesafeActions.typeHelpersMod.PayloadMetaAC[TType, TPayload, TMeta]) | (typings.typesafeActions.typeHelpersMod.PayloadAC[TType, TPayload]) | typings.typesafeActions.typeHelpersMod.EmptyAC[TType]
  type ActionBuilderMap[TType /* <: typings.typesafeActions.typeHelpersMod.TypeConstant */, TActionProps /* <: js.Any */, TPayloadArg /* <: js.Any */, TMetaArg /* <: js.Any */] = (js.Function2[
    /* payload */ TPayloadArg, 
    /* meta */ TMetaArg, 
    typings.typesafeActions.AnonTypeTType[TType] with TActionProps
  ]) | (js.Function1[
    /* payload */ TPayloadArg, 
    typings.typesafeActions.AnonTypeTType[TType] with TActionProps
  ]) | (js.Function0[typings.typesafeActions.AnonTypeTType[TType] with TActionProps])
  type ActionCreator[TType /* <: typings.typesafeActions.typeHelpersMod.TypeConstant */] = js.Function1[/* repeated */ js.Any, typings.typesafeActions.typeHelpersMod.Action[TType]]
  type ActionType[TActionCreatorOrMap /* <: js.Any */] = js.Any | typings.std.ReturnType[TActionCreatorOrMap]
  type EmptyAC[TType /* <: typings.typesafeActions.typeHelpersMod.TypeConstant */] = js.Function0[typings.typesafeActions.typeHelpersMod.EmptyAction[TType]]
  type PayloadAC[TType /* <: typings.typesafeActions.typeHelpersMod.TypeConstant */, TPayload] = js.Function1[
    /* payload */ TPayload, 
    typings.typesafeActions.typeHelpersMod.PayloadAction[TType, TPayload]
  ]
  type PayloadMetaAC[TType /* <: typings.typesafeActions.typeHelpersMod.TypeConstant */, TPayload, TMeta] = js.Function2[
    /* payload */ TPayload, 
    /* meta */ TMeta, 
    typings.typesafeActions.typeHelpersMod.PayloadMetaAction[TType, TPayload, TMeta]
  ]
  type Reducer[TState, TAction /* <: typings.typesafeActions.typeHelpersMod.Action[typings.typesafeActions.typeHelpersMod.TypeConstant] */] = js.Function2[/* state */ js.UndefOr[TState], /* action */ TAction, TState]
  type StateType[TReducerOrMap /* <: js.Any */] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TReducerOrMap ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/type-helpers.StateType<TReducerOrMap[K]> * / object}
    */ typings.typesafeActions.typesafeActionsStrings.StateType with js.Any) | typings.std.ReturnType[TReducerOrMap]
  type TypeConstant = java.lang.String
}
