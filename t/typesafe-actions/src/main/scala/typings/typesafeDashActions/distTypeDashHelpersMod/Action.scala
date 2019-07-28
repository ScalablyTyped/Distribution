package typings.typesafeDashActions.distTypeDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[TType /* <: TypeConstant */] extends js.Object {
  var `type`: TType
}

object Action {
  @scala.inline
  def apply[TType /* <: TypeConstant */](`type`: TType): Action[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[TType]]
  }
}

