package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edit extends js.Object {
  var edit: scala.Double
  var manage: scala.Double
  var managePermissions: scala.Double
  var none: scala.Double
}

object Edit {
  @scala.inline
  def apply(edit: scala.Double, manage: scala.Double, managePermissions: scala.Double, none: scala.Double): Edit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], manage = manage.asInstanceOf[js.Any], managePermissions = managePermissions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edit]
  }
}

