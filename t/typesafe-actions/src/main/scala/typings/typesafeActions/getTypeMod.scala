package typings.typesafeActions

import typings.typesafeActions.typeHelpersMod.ActionCreator
import typings.typesafeActions.typeHelpersMod.TypeConstant
import typings.typesafeActions.typeHelpersMod.TypeMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/get-type", JSImport.Namespace)
@js.native
object getTypeMod extends js.Object {
  def getType[T /* <: TypeConstant */](actionCreator: ActionCreator[T] with TypeMeta[T]): T = js.native
}

