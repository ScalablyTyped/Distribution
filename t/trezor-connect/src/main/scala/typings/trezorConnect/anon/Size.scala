package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptBackendTransactionsMod.VinVout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var size: Double
  
  var totalInput: String
  
  var totalOutput: String
  
  var vin: js.Array[VinVout]
  
  var vout: js.Array[VinVout]
}
object Size {
  
  inline def apply(
    size: Double,
    totalInput: String,
    totalOutput: String,
    vin: js.Array[VinVout],
    vout: js.Array[VinVout]
  ): Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], totalInput = totalInput.asInstanceOf[js.Any], totalOutput = totalOutput.asInstanceOf[js.Any], vin = vin.asInstanceOf[js.Any], vout = vout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTotalInput(value: String): Self = StObject.set(x, "totalInput", value.asInstanceOf[js.Any])
    
    inline def setTotalOutput(value: String): Self = StObject.set(x, "totalOutput", value.asInstanceOf[js.Any])
    
    inline def setVin(value: js.Array[VinVout]): Self = StObject.set(x, "vin", value.asInstanceOf[js.Any])
    
    inline def setVinVarargs(value: VinVout*): Self = StObject.set(x, "vin", js.Array(value*))
    
    inline def setVout(value: js.Array[VinVout]): Self = StObject.set(x, "vout", value.asInstanceOf[js.Any])
    
    inline def setVoutVarargs(value: VinVout*): Self = StObject.set(x, "vout", js.Array(value*))
  }
}
