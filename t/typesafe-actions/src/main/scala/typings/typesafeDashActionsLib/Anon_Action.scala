package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Action[TState, TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */] extends js.Object {
  var handlers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Function2[/* state */ TState, /* action */ _, TState]]] = js.native
  def handleAction[TType /* <: /* import warning: ImportType.apply Failed type conversion: TRootAction['type'] */ js.Any */, THandledTypeAction /* <: TRootAction */, TCreator /* <: js.Function1[/* repeated */ js.Any, TRootAction] */, THandledCreatorAction /* <: TRootAction */, THandledAction /* <: THandledTypeAction */](
    singleOrMultipleCreatorsAndTypes: TCreator | TType,
    reducer: js.Function2[/* state */ TState, /* action */ THandledAction, TState]
  ): ((typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (Anon_ActionHandleAction[TRootAction, THandledCreatorAction, THandledTypeAction, TRootAction, TState])) | ((typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (Anon_ActionHandlers[TRootAction, TState])) = js.native
  def handleAction[TType /* <: /* import warning: ImportType.apply Failed type conversion: TRootAction['type'] */ js.Any */, THandledTypeAction /* <: TRootAction */, TCreator /* <: js.Function1[/* repeated */ js.Any, TRootAction] */, THandledCreatorAction /* <: TRootAction */, THandledAction /* <: THandledTypeAction */](
    singleOrMultipleCreatorsAndTypes: js.Array[TCreator | TType],
    reducer: js.Function2[/* state */ TState, /* action */ THandledAction, TState]
  ): ((typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (Anon_ActionHandleAction[TRootAction, THandledCreatorAction, THandledTypeAction, TRootAction, TState])) | ((typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (Anon_ActionHandlers[TRootAction, TState])) = js.native
}

