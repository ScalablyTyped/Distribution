package typings.typesafeActions.createActionDeprecatedMod

import typings.typesafeActions.AnonType
import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-action-deprecated", "createActionDeprecated")
@js.native
object createActionDeprecated extends js.Object {
  def apply[T /* <: TypeConstant */, AC /* <: js.Function0[AnonType[T]] */](actionType: T): AC = js.native
  def apply[T /* <: TypeConstant */, AC /* <: js.Function1[/* repeated */ js.Any, FSA[T, js.Object, js.Object, Boolean]] */](actionType: T, creatorFunction: AC): AC = js.native
}

