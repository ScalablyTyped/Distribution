package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, E] extends js.Object {
  var error: E
  var `type`: T
}

object Anon_Error {
  @scala.inline
  def apply[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, E](error: E, `type`: T): Anon_Error[T, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Error[T, E]]
  }
}

