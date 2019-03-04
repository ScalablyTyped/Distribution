package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddDelete extends js.Object {
  var add: scala.Double
  var delete: scala.Double
  var edit: scala.Double
  var none: scala.Double
  var rename: scala.Double
}

object Anon_AddDelete {
  @scala.inline
  def apply(
    add: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    none: scala.Double,
    rename: scala.Double
  ): Anon_AddDelete = {
    val __obj = js.Dynamic.literal(add = add, delete = delete, edit = edit, none = none, rename = rename)
  
    __obj.asInstanceOf[Anon_AddDelete]
  }
}

