package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/action", JSImport.Namespace)
@js.native
object distActionMod extends js.Object {
  def action[T /* <: typesafeDashActionsLib.distTypesMod.StringType */](`type`: T): typesafeDashActionsLib.distTypesMod.EmptyAction[T] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, P](`type`: T, payload: P): typesafeDashActionsLib.distTypesMod.PayloadAction[T, P] = js.native
  def action[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, P, M](`type`: T, payload: P, meta: M): typesafeDashActionsLib.distTypesMod.PayloadMetaAction[T, P, M] = js.native
}

