package typings.typesafeActions

import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorMeta[T /* <: TypeConstant */, M, E] extends js.Object {
  var error: E
  var meta: M
  var `type`: T
}

object AnonErrorMeta {
  @scala.inline
  def apply[T /* <: TypeConstant */, M, E](error: E, meta: M, `type`: T): AnonErrorMeta[T, M, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorMeta[T, M, E]]
  }
}

