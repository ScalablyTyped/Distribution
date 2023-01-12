package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payer extends StObject {
  
  var payer: String
  
  var quant: String
  
  var receiver: String
}
object Payer {
  
  inline def apply(payer: String, quant: String, receiver: String): Payer = {
    val __obj = js.Dynamic.literal(payer = payer.asInstanceOf[js.Any], quant = quant.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Payer] (val x: Self) extends AnyVal {
    
    inline def setPayer(value: String): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    inline def setQuant(value: String): Self = StObject.set(x, "quant", value.asInstanceOf[js.Any])
    
    inline def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
  }
}
