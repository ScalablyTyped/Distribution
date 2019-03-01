package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TenantInfo extends js.Object {
  var homeTenant: scala.Boolean
  var tenantId: java.lang.String
  var tenantName: java.lang.String
}

object TenantInfo {
  @scala.inline
  def apply(homeTenant: scala.Boolean, tenantId: java.lang.String, tenantName: java.lang.String): TenantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("homeTenant")(homeTenant)
    __obj.updateDynamic("tenantId")(tenantId)
    __obj.updateDynamic("tenantName")(tenantName)
    __obj.asInstanceOf[TenantInfo]
  }
}

