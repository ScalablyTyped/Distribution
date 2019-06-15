package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_HandleAction[TState, TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */] extends js.Object {
  val handlers: js.Any = js.native
  def handleAction[TType /* <: /* import warning: ImportType.apply Failed type conversion: TRootAction['type'] */ js.Any */, TCreator /* <: js.Function1[/* repeated */ js.Any, TRootAction] */, TNextNotHandledAction /* <: stdLib.Exclude[
    TRootAction, 
    typesafeDashActionsLib.distTypeDashHelpersMod.Action[TType] with stdLib.ReturnType[TCreator]
  ] */, TAction /* <: TRootAction */](
    singleOrMultipleCreatorsAndTypes: TCreator | TType,
    reducer: js.Function2[/* state */ TState, /* action */ TAction, TState]
  ): ((typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (Anon_ActionHandleAction[TRootAction, TNextNotHandledAction, TState])) | ((typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (Anon_Action[TRootAction, TState])) = js.native
  def handleAction[TType /* <: /* import warning: ImportType.apply Failed type conversion: TRootAction['type'] */ js.Any */, TCreator /* <: js.Function1[/* repeated */ js.Any, TRootAction] */, TNextNotHandledAction /* <: stdLib.Exclude[
    TRootAction, 
    typesafeDashActionsLib.distTypeDashHelpersMod.Action[TType] with stdLib.ReturnType[TCreator]
  ] */, TAction /* <: TRootAction */](
    singleOrMultipleCreatorsAndTypes: js.Array[TCreator | TType],
    reducer: js.Function2[/* state */ TState, /* action */ TAction, TState]
  ): ((typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (Anon_ActionHandleAction[TRootAction, TNextNotHandledAction, TState])) | ((typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (Anon_Action[TRootAction, TState])) = js.native
}

