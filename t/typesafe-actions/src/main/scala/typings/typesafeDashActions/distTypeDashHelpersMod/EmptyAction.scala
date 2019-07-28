package typings.typesafeDashActions.distTypeDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyAction[TType /* <: TypeConstant */] extends js.Object {
  var `type`: TType
}

object EmptyAction {
  @scala.inline
  def apply[TType /* <: TypeConstant */](`type`: TType): EmptyAction[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyAction[TType]]
  }
}

