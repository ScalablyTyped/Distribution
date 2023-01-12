package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Receiver extends StObject {
  
  var from: String
  
  var receiver: String
  
  var stake_cpu_quantity: String
  
  var stake_net_quantity: String
  
  var transfer: Boolean
}
object Receiver {
  
  inline def apply(
    from: String,
    receiver: String,
    stake_cpu_quantity: String,
    stake_net_quantity: String,
    transfer: Boolean
  ): Receiver = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any], stake_cpu_quantity = stake_cpu_quantity.asInstanceOf[js.Any], stake_net_quantity = stake_net_quantity.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Receiver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Receiver] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setStake_cpu_quantity(value: String): Self = StObject.set(x, "stake_cpu_quantity", value.asInstanceOf[js.Any])
    
    inline def setStake_net_quantity(value: String): Self = StObject.set(x, "stake_net_quantity", value.asInstanceOf[js.Any])
    
    inline def setTransfer(value: Boolean): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
  }
}
