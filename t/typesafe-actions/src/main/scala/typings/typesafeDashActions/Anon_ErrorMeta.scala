package typings.typesafeDashActions

import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorMeta[T /* <: TypeConstant */, M, E] extends js.Object {
  var error: E
  var meta: M
  var `type`: T
}

object Anon_ErrorMeta {
  @scala.inline
  def apply[T /* <: TypeConstant */, M, E](error: E, meta: M, `type`: T): Anon_ErrorMeta[T, M, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorMeta[T, M, E]]
  }
}

