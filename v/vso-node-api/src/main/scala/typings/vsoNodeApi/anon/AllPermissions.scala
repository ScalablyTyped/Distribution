package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllPermissions extends js.Object {
  var allPermissions: scala.Double
  var delete: scala.Double
  var edit: scala.Double
  var manage: scala.Double
  var none: scala.Double
  var view: scala.Double
}

object AllPermissions {
  @scala.inline
  def apply(
    allPermissions: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    manage: scala.Double,
    none: scala.Double,
    view: scala.Double
  ): AllPermissions = {
    val __obj = js.Dynamic.literal(allPermissions = allPermissions.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllPermissions]
  }
}

