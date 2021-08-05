package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TenantInfo extends StObject {
  
  var homeTenant: Boolean
  
  var tenantId: String
  
  var tenantName: String
}
object TenantInfo {
  
  inline def apply(homeTenant: Boolean, tenantId: String, tenantName: String): TenantInfo = {
    val __obj = js.Dynamic.literal(homeTenant = homeTenant.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], tenantName = tenantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TenantInfo]
  }
  
  extension [Self <: TenantInfo](x: Self) {
    
    inline def setHomeTenant(value: Boolean): Self = StObject.set(x, "homeTenant", value.asInstanceOf[js.Any])
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantName(value: String): Self = StObject.set(x, "tenantName", value.asInstanceOf[js.Any])
  }
}
