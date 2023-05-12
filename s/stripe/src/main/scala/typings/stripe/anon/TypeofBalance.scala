package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBalance extends StObject {
  
  val Available: Any
  
  val ConnectReserved: Any
  
  val InstantAvailable: Any
  
  val Issuing: TypeofIssuingAvailable
  
  val Pending: Any
}
object TypeofBalance {
  
  inline def apply(
    Available: Any,
    ConnectReserved: Any,
    InstantAvailable: Any,
    Issuing: TypeofIssuingAvailable,
    Pending: Any
  ): TypeofBalance = {
    val __obj = js.Dynamic.literal(Available = Available.asInstanceOf[js.Any], ConnectReserved = ConnectReserved.asInstanceOf[js.Any], InstantAvailable = InstantAvailable.asInstanceOf[js.Any], Issuing = Issuing.asInstanceOf[js.Any], Pending = Pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBalance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofBalance] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Any): Self = StObject.set(x, "Available", value.asInstanceOf[js.Any])
    
    inline def setConnectReserved(value: Any): Self = StObject.set(x, "ConnectReserved", value.asInstanceOf[js.Any])
    
    inline def setInstantAvailable(value: Any): Self = StObject.set(x, "InstantAvailable", value.asInstanceOf[js.Any])
    
    inline def setIssuing(value: TypeofIssuingAvailable): Self = StObject.set(x, "Issuing", value.asInstanceOf[js.Any])
    
    inline def setPending(value: Any): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
  }
}
