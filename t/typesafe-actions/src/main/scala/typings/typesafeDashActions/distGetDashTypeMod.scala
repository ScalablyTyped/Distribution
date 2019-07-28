package typings.typesafeDashActions

import typings.typesafeDashActions.distTypeDashHelpersMod.ActionCreator
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/get-type", JSImport.Namespace)
@js.native
object distGetDashTypeMod extends js.Object {
  def getType[T /* <: TypeConstant */](actionCreator: ActionCreator[T] with TypeMeta[T]): T = js.native
}

