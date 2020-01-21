package typings.typesafeActions

import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeTType[TType /* <: TypeConstant */] extends js.Object {
  var `type`: TType
}

object AnonTypeTType {
  @scala.inline
  def apply[TType /* <: TypeConstant */](`type`: TType): AnonTypeTType[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeTType[TType]]
  }
}

