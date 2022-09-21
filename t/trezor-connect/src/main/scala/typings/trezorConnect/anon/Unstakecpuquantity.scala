package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unstakecpuquantity extends StObject {
  
  var from: String
  
  var receiver: String
  
  var unstake_cpu_quantity: String
  
  var unstake_net_quantity: String
}
object Unstakecpuquantity {
  
  inline def apply(from: String, receiver: String, unstake_cpu_quantity: String, unstake_net_quantity: String): Unstakecpuquantity = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any], unstake_cpu_quantity = unstake_cpu_quantity.asInstanceOf[js.Any], unstake_net_quantity = unstake_net_quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unstakecpuquantity]
  }
  
  extension [Self <: Unstakecpuquantity](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setUnstake_cpu_quantity(value: String): Self = StObject.set(x, "unstake_cpu_quantity", value.asInstanceOf[js.Any])
    
    inline def setUnstake_net_quantity(value: String): Self = StObject.set(x, "unstake_net_quantity", value.asInstanceOf[js.Any])
  }
}
