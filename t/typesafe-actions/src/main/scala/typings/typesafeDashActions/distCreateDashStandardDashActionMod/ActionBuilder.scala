package typings.typesafeDashActions.distCreateDashStandardDashActionMod

import typings.typesafeDashActions.distTypeDashHelpersMod.ActionBuilderConstructor
import typings.typesafeDashActions.distTypeDashHelpersMod.ActionBuilderMap
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBuilder[T /* <: TypeConstant */] extends js.Object {
  def apply[P, M](): ActionBuilderConstructor[T, P, M] = js.native
  def map[R, P, M](fn: js.Function2[/* payload */ P, /* meta */ M, R]): ActionBuilderMap[T, R, P, M] = js.native
}

