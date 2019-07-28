package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Edit extends js.Object {
  var edit: Double
  var manage: Double
  var managePermissions: Double
  var none: Double
}

object Anon_Edit {
  @scala.inline
  def apply(edit: Double, manage: Double, managePermissions: Double, none: Double): Anon_Edit = {
    val __obj = js.Dynamic.literal(edit = edit, manage = manage, managePermissions = managePermissions, none = none)
  
    __obj.asInstanceOf[Anon_Edit]
  }
}

