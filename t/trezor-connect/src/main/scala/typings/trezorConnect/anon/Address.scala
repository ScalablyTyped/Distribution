package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var address: String
  
  var isActive: Boolean
  
  var poolId: String | Null
  
  var rewards: String
}
object Address {
  
  inline def apply(address: String, isActive: Boolean, rewards: String): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], rewards = rewards.asInstanceOf[js.Any], poolId = null)
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setPoolId(value: String): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdNull: Self = StObject.set(x, "poolId", null)
    
    inline def setRewards(value: String): Self = StObject.set(x, "rewards", value.asInstanceOf[js.Any])
  }
}
