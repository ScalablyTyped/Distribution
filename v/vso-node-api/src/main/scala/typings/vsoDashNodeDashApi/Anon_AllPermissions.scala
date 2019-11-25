package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllPermissions extends js.Object {
  var allPermissions: Double
  var delete: Double
  var edit: Double
  var manage: Double
  var none: Double
  var view: Double
}

object Anon_AllPermissions {
  @scala.inline
  def apply(allPermissions: Double, delete: Double, edit: Double, manage: Double, none: Double, view: Double): Anon_AllPermissions = {
    val __obj = js.Dynamic.literal(allPermissions = allPermissions.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllPermissions]
  }
}

