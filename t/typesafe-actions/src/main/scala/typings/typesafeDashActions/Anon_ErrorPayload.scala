package typings.typesafeDashActions

import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorPayload[T /* <: TypeConstant */, P, E] extends js.Object {
  var error: E
  var payload: P
  var `type`: T
}

object Anon_ErrorPayload {
  @scala.inline
  def apply[T /* <: TypeConstant */, P, E](error: E, payload: P, `type`: T): Anon_ErrorPayload[T, P, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorPayload[T, P, E]]
  }
}

