package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TenantInfo extends js.Object {
  var homeTenant: Boolean
  var tenantId: String
  var tenantName: String
}

object TenantInfo {
  @scala.inline
  def apply(homeTenant: Boolean, tenantId: String, tenantName: String): TenantInfo = {
    val __obj = js.Dynamic.literal(homeTenant = homeTenant.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], tenantName = tenantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TenantInfo]
  }
}

