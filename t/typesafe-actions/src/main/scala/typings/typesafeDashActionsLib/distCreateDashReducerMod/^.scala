package typings
package typesafeDashActionsLib.distCreateDashReducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-reducer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createReducer[TState, TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */](initialState: TState): (typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (typesafeDashActionsLib.Anon_HandleAction[TState, TRootAction]) = js.native
  def createReducer[TState, TRootAction /* <: typesafeDashActionsLib.distTypeDashHelpersMod.Action[typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant] */](initialState: TState, initialHandlers: InitialHandler[TState, TRootAction]): (typesafeDashActionsLib.distTypeDashHelpersMod.Reducer[TState, TRootAction]) with (typesafeDashActionsLib.Anon_HandleAction[TState, TRootAction]) = js.native
}

