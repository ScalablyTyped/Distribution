package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnershipId extends StObject {
  
  var ownership_id: String
}
object OwnershipId {
  
  inline def apply(ownership_id: String): OwnershipId = {
    val __obj = js.Dynamic.literal(ownership_id = ownership_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnershipId]
  }
  
  extension [Self <: OwnershipId](x: Self) {
    
    inline def setOwnership_id(value: String): Self = StObject.set(x, "ownership_id", value.asInstanceOf[js.Any])
  }
}
