package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TenantInfo extends js.Object {
  var homeTenant: Boolean = js.native
  var tenantId: String = js.native
  var tenantName: String = js.native
}

object TenantInfo {
  @scala.inline
  def apply(homeTenant: Boolean, tenantId: String, tenantName: String): TenantInfo = {
    val __obj = js.Dynamic.literal(homeTenant = homeTenant.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], tenantName = tenantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TenantInfo]
  }
  @scala.inline
  implicit class TenantInfoOps[Self <: TenantInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHomeTenant(value: Boolean): Self = this.set("homeTenant", value.asInstanceOf[js.Any])
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTenantName(value: String): Self = this.set("tenantName", value.asInstanceOf[js.Any])
  }
  
}

