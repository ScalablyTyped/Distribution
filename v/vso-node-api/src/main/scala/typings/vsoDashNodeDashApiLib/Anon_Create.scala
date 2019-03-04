package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  var create: scala.Double
  var delete: scala.Double
  var edit: scala.Double
  var managePermissions: scala.Double
  var none: scala.Double
  var read: scala.Double
}

object Anon_Create {
  @scala.inline
  def apply(
    create: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    managePermissions: scala.Double,
    none: scala.Double,
    read: scala.Double
  ): Anon_Create = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, edit = edit, managePermissions = managePermissions, none = none, read = read)
  
    __obj.asInstanceOf[Anon_Create]
  }
}

