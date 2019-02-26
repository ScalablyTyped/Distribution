package typings
package typesafeDashActionsLib.distCreateDashStandardDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBuilder[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */] extends js.Object {
  def apply[P, M](): typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderConstructor[T, P, M] = js.native
  def map[R, P, M](fn: js.Function2[/* payload */ P, /* meta */ M, R]): typesafeDashActionsLib.distTypeDashHelpersMod.ActionBuilderMap[T, R, P, M] = js.native
}

