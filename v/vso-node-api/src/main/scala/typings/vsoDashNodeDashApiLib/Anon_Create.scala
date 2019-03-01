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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("edit")(edit)
    __obj.updateDynamic("managePermissions")(managePermissions)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[Anon_Create]
  }
}

