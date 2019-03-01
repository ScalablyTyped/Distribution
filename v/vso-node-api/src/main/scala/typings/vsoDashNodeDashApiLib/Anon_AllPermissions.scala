package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllPermissions extends js.Object {
  var allPermissions: scala.Double
  var delete: scala.Double
  var edit: scala.Double
  var manage: scala.Double
  var none: scala.Double
  var view: scala.Double
}

object Anon_AllPermissions {
  @scala.inline
  def apply(
    allPermissions: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    manage: scala.Double,
    none: scala.Double,
    view: scala.Double
  ): Anon_AllPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allPermissions")(allPermissions)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("edit")(edit)
    __obj.updateDynamic("manage")(manage)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Anon_AllPermissions]
  }
}

