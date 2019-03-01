package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RoleAccess extends js.Object {
  var RoleAccess: Anon_EnumValuesAnonAssigned
  var RoleAssignment: js.Any
}

object Anon_RoleAccess {
  @scala.inline
  def apply(RoleAccess: Anon_EnumValuesAnonAssigned, RoleAssignment: js.Any): Anon_RoleAccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("RoleAccess")(RoleAccess)
    __obj.updateDynamic("RoleAssignment")(RoleAssignment)
    __obj.asInstanceOf[Anon_RoleAccess]
  }
}

