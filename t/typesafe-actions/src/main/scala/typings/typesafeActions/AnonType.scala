package typings.typesafeActions

import typings.typesafeActions.createActionMod.PayloadMetaAction
import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType[T /* <: TypeConstant */]
  extends PayloadMetaAction[T, js.Any, js.Any] {
  var `type`: T
}

object AnonType {
  @scala.inline
  def apply[T /* <: TypeConstant */](`type`: T): AnonType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType[T]]
  }
}

