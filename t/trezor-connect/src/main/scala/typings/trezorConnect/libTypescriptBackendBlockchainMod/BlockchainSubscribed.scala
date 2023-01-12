package typings.trezorConnect.libTypescriptBackendBlockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainSubscribed extends StObject {
  
  var subscribed: Boolean
}
object BlockchainSubscribed {
  
  inline def apply(subscribed: Boolean): BlockchainSubscribed = {
    val __obj = js.Dynamic.literal(subscribed = subscribed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainSubscribed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockchainSubscribed] (val x: Self) extends AnyVal {
    
    inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
  }
}
