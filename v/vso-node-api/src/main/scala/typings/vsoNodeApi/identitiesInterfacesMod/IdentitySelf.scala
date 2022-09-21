package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitySelf extends StObject {
  
  var accountName: String
  
  var displayName: String
  
  var id: String
  
  var tenants: js.Array[TenantInfo]
}
object IdentitySelf {
  
  inline def apply(accountName: String, displayName: String, id: String, tenants: js.Array[TenantInfo]): IdentitySelf = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tenants = tenants.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitySelf]
  }
  
  extension [Self <: IdentitySelf](x: Self) {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTenants(value: js.Array[TenantInfo]): Self = StObject.set(x, "tenants", value.asInstanceOf[js.Any])
    
    inline def setTenantsVarargs(value: TenantInfo*): Self = StObject.set(x, "tenants", js.Array(value*))
  }
}
