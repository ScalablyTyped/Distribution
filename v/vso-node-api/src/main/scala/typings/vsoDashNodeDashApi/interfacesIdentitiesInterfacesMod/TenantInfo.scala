package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

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
    val __obj = js.Dynamic.literal(homeTenant = homeTenant, tenantId = tenantId, tenantName = tenantName)
  
    __obj.asInstanceOf[TenantInfo]
  }
}

