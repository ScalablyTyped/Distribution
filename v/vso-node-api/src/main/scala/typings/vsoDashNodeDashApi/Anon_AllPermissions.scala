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
    val __obj = js.Dynamic.literal(allPermissions = allPermissions, delete = delete, edit = edit, manage = manage, none = none, view = view)
  
    __obj.asInstanceOf[Anon_AllPermissions]
  }
}

