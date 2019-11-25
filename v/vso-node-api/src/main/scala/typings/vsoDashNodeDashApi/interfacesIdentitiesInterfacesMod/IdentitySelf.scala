package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitySelf extends js.Object {
  var accountName: String
  var displayName: String
  var id: String
  var tenants: js.Array[TenantInfo]
}

object IdentitySelf {
  @scala.inline
  def apply(accountName: String, displayName: String, id: String, tenants: js.Array[TenantInfo]): IdentitySelf = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tenants = tenants.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdentitySelf]
  }
}

