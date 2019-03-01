package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */]
  extends typesafeDashActionsLib.distCreateDashActionMod.PayloadMetaAction[T, js.Any, js.Any] {
  var `type`: T
}

object Anon_Type {
  @scala.inline
  def apply[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */](`type`: T): Anon_Type[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Type[T]]
  }
}

