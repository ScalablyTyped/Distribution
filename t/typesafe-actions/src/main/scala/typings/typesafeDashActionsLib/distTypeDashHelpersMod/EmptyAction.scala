package typings
package typesafeDashActionsLib.distTypeDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyAction[T /* <: StringType */] extends js.Object {
  var `type`: T
}

object EmptyAction {
  @scala.inline
  def apply[T /* <: StringType */](`type`: T): EmptyAction[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyAction[T]]
  }
}

