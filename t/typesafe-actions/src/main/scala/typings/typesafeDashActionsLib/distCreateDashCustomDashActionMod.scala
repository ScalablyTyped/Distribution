package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-custom-action", JSImport.Namespace)
@js.native
object distCreateDashCustomDashActionMod extends js.Object {
  def createCustomAction[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, AC /* <: typesafeDashActionsLib.distTypeDashHelpersMod.ActionCreator[T] */](`type`: T): AC = js.native
  def createCustomAction[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, AC /* <: typesafeDashActionsLib.distTypeDashHelpersMod.ActionCreator[T] */](`type`: T, createHandler: js.Function1[/* type */ T, AC]): AC = js.native
}

