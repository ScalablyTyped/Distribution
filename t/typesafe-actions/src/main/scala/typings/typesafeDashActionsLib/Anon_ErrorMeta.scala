package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorMeta[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, M, E] extends js.Object {
  var error: E
  var meta: M
  var `type`: T
}

object Anon_ErrorMeta {
  @scala.inline
  def apply[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, M, E](error: E, meta: M, `type`: T): Anon_ErrorMeta[T, M, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorMeta[T, M, E]]
  }
}

