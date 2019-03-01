package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitySelf extends js.Object {
  var accountName: java.lang.String
  var displayName: java.lang.String
  var id: java.lang.String
  var tenants: js.Array[TenantInfo]
}

object IdentitySelf {
  @scala.inline
  def apply(
    accountName: java.lang.String,
    displayName: java.lang.String,
    id: java.lang.String,
    tenants: js.Array[TenantInfo]
  ): IdentitySelf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accountName")(accountName)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("tenants")(tenants)
    __obj.asInstanceOf[IdentitySelf]
  }
}

