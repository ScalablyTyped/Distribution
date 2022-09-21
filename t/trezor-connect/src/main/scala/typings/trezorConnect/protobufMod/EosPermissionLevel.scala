package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosPermissionLevel extends StObject {
  
  var actor: String
  
  var permission: String
}
object EosPermissionLevel {
  
  inline def apply(actor: String, permission: String): EosPermissionLevel = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosPermissionLevel]
  }
  
  extension [Self <: EosPermissionLevel](x: Self) {
    
    inline def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
  }
}
