package typings.typesafeDashActions

import typings.std.Exclude
import typings.std.ReturnType
import typings.typesafeDashActions.distTypeDashHelpersMod.Action
import typings.typesafeDashActions.distTypeDashHelpersMod.Reducer
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_HandleAction[TState, TRootAction /* <: Action[TypeConstant] */] extends js.Object {
  val handlers: js.Any = js.native
  def handleAction[TType /* <: /* import warning: ImportType.apply Failed type conversion: TRootAction['type'] */ js.Any */, TCreator /* <: js.Function1[/* repeated */ js.Any, TRootAction] */, TNextNotHandledAction /* <: Exclude[TRootAction, Action[TType] with ReturnType[TCreator]] */, TAction /* <: TRootAction */](
    singleOrMultipleCreatorsAndTypes: TCreator | TType,
    reducer: js.Function2[/* state */ TState, /* action */ TAction, TState]
  ): ((Reducer[TState, TRootAction]) with (Anon_ActionHandleAction[TRootAction, TNextNotHandledAction, TState])) | ((Reducer[TState, TRootAction]) with (Anon_Action[TRootAction, TState])) = js.native
  def handleAction[TType /* <: /* import warning: ImportType.apply Failed type conversion: TRootAction['type'] */ js.Any */, TCreator /* <: js.Function1[/* repeated */ js.Any, TRootAction] */, TNextNotHandledAction /* <: Exclude[TRootAction, Action[TType] with ReturnType[TCreator]] */, TAction /* <: TRootAction */](
    singleOrMultipleCreatorsAndTypes: js.Array[TCreator | TType],
    reducer: js.Function2[/* state */ TState, /* action */ TAction, TState]
  ): ((Reducer[TState, TRootAction]) with (Anon_ActionHandleAction[TRootAction, TNextNotHandledAction, TState])) | ((Reducer[TState, TRootAction]) with (Anon_Action[TRootAction, TState])) = js.native
}

