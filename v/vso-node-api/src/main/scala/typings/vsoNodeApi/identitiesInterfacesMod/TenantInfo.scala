package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TenantInfo extends StObject {
  
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
  implicit class TenantInfoMutableBuilder[Self <: TenantInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHomeTenant(value: Boolean): Self = StObject.set(x, "homeTenant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantName(value: String): Self = StObject.set(x, "tenantName", value.asInstanceOf[js.Any])
  }
}
