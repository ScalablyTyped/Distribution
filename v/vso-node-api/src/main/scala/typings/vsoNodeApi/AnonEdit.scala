package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEdit extends js.Object {
  var edit: Double
  var manage: Double
  var managePermissions: Double
  var none: Double
}

object AnonEdit {
  @scala.inline
  def apply(edit: Double, manage: Double, managePermissions: Double, none: Double): AnonEdit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], managePermissions = managePermissions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEdit]
  }
}

