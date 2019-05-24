package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/action", JSImport.Namespace)
@js.native
object distActionMod extends js.Object {
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */](`type`: T): typesafeDashActionsLib.Anon_Type[T] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P](`type`: T, payload: P): typesafeDashActionsLib.Anon_Payload[T, P] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, M](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M): typesafeDashActionsLib.Anon_Meta[T, M] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: js.UndefOr[scala.Nothing], error: E): typesafeDashActionsLib.Anon_Error[T, E] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P, M](`type`: T, payload: P, meta: M): typesafeDashActionsLib.Anon_MetaPayload[T, P, M] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P, E](`type`: T, payload: P, meta: js.UndefOr[scala.Nothing], error: E): typesafeDashActionsLib.Anon_ErrorPayload[T, P, E] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, M, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M, error: E): typesafeDashActionsLib.Anon_ErrorMeta[T, M, E] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P, M, E](`type`: T, payload: P, meta: M, error: E): typesafeDashActionsLib.Anon_ErrorMetaPayload[T, P, M, E] = js.native
}

