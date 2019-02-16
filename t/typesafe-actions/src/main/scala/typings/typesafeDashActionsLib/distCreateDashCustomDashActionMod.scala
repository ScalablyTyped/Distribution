package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-custom-action", JSImport.Namespace)
@js.native
object distCreateDashCustomDashActionMod extends js.Object {
  def createCustomAction[T /* <: typesafeDashActionsLib.distTypesMod.StringOrSymbol */, AC /* <: typesafeDashActionsLib.distTypesMod.ActionCreator[T] */](`type`: T): AC = js.native
  def createCustomAction[T /* <: typesafeDashActionsLib.distTypesMod.StringOrSymbol */, AC /* <: typesafeDashActionsLib.distTypesMod.ActionCreator[T] */](`type`: T, actionCreatorHandler: js.Function1[/* type */ T, AC]): AC = js.native
}

