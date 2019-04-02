package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypeDashHelpersMod {
  type ActionBuilderConstructor[T /* <: StringType */, TPayload /* <: js.Any */, TMeta /* <: js.Any */] = (PayloadMetaAC[T, TPayload, TMeta]) | (PayloadAC[T, TPayload]) | EmptyAC[T]
  type ActionBuilderMap[T /* <: StringType */, TCustomAction /* <: js.Any */, TPayloadArg /* <: js.Any */, TMetaArg /* <: js.Any */] = (js.Function2[
    /* payload */ TPayloadArg, 
    /* meta */ TMetaArg, 
    typesafeDashActionsLib.Anon_Type[T] with TCustomAction
  ]) | (js.Function1[/* payload */ TPayloadArg, typesafeDashActionsLib.Anon_Type[T] with TCustomAction]) | (js.Function0[typesafeDashActionsLib.Anon_Type[T] with TCustomAction])
  type ActionCreator[T /* <: StringType */] = js.Function1[/* repeated */ js.Any, typesafeDashActionsLib.Anon_Type[T]]
  type ActionType[ActionCreatorOrMap] = ActionCreatorOrMap | (/* import warning: ImportType.apply Failed type conversion: {[ K in keyof ActionCreatorOrMap ]: object}[keyof ActionCreatorOrMap] */ js.Any) | stdLib.ReturnType[ActionCreatorOrMap]
  type EmptyAC[T /* <: StringType */] = js.Function0[EmptyAction[T]]
  type PayloadAC[T /* <: StringType */, P] = js.Function1[/* payload */ P, PayloadAction[T, P]]
  type PayloadMetaAC[T /* <: StringType */, P, M] = js.Function2[/* payload */ P, /* meta */ M, PayloadMetaAction[T, P, M]]
  type StateType[ReducerOrMap] = (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof ReducerOrMap ]: object}
    */ typesafeDashActionsLib.typesafeDashActionsLibStrings.StateType with js.Any) | stdLib.ReturnType[ReducerOrMap]
  type StringType = java.lang.String
}
