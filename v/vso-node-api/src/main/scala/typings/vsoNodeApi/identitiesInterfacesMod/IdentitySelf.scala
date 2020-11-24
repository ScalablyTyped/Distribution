package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitySelf extends js.Object {
  
  var accountName: String = js.native
  
  var displayName: String = js.native
  
  var id: String = js.native
  
  var tenants: js.Array[TenantInfo] = js.native
}
object IdentitySelf {
  
  @scala.inline
  def apply(accountName: String, displayName: String, id: String, tenants: js.Array[TenantInfo]): IdentitySelf = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tenants = tenants.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitySelf]
  }
  
  @scala.inline
  implicit class IdentitySelfOps[Self <: IdentitySelf] (val x: Self) extends AnyVal {
    
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
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantsVarargs(value: TenantInfo*): Self = this.set("tenants", js.Array(value :_*))
    
    @scala.inline
    def setTenants(value: js.Array[TenantInfo]): Self = this.set("tenants", value.asInstanceOf[js.Any])
  }
}
