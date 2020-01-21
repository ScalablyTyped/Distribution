package typings.typesafeActions

import typings.std.Exclude
import typings.std.ReturnType
import typings.typesafeActions.typeHelpersMod.Action
import typings.typesafeActions.typeHelpersMod.Reducer
import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandleAction[TState, TRootAction /* <: Action[TypeConstant] */] extends js.Object {
  val handlers: js.Any = js.native
  def handleAction[TType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TRootAction['type'] */ js.Any */, TCreator /* <: js.Function1[/* repeated */ js.Any, TRootAction] */, TNextNotHandledAction /* <: Exclude[TRootAction, Action[TType] with ReturnType[TCreator]] */, TAction /* <: TRootAction */](
    singleOrMultipleCreatorsAndTypes: TCreator | TType,
    reducer: js.Function2[/* state */ TState, /* action */ TAction, TState]
  ): ((Reducer[TState, TRootAction]) with (AnonActionHandleAction[TRootAction, TNextNotHandledAction, TState])) | ((Reducer[TState, TRootAction]) with (AnonAction[TRootAction, TState])) = js.native
  def handleAction[TType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TRootAction['type'] */ js.Any */, TCreator /* <: js.Function1[/* repeated */ js.Any, TRootAction] */, TNextNotHandledAction /* <: Exclude[TRootAction, Action[TType] with ReturnType[TCreator]] */, TAction /* <: TRootAction */](
    singleOrMultipleCreatorsAndTypes: js.Array[TCreator | TType],
    reducer: js.Function2[/* state */ TState, /* action */ TAction, TState]
  ): ((Reducer[TState, TRootAction]) with (AnonActionHandleAction[TRootAction, TNextNotHandledAction, TState])) | ((Reducer[TState, TRootAction]) with (AnonAction[TRootAction, TState])) = js.native
}

