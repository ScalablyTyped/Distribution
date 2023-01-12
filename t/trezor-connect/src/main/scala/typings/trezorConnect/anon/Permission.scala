package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptTrezorProtobufMod.EosPermissionLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permission extends StObject {
  
  var permission: EosPermissionLevel
  
  var weight: Double
}
object Permission {
  
  inline def apply(permission: EosPermissionLevel, weight: Double): Permission = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Permission] (val x: Self) extends AnyVal {
    
    inline def setPermission(value: EosPermissionLevel): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
