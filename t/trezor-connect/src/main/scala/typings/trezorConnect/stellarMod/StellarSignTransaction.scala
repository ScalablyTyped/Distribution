package typings.trezorConnect.stellarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarSignTransaction extends StObject {
  
  var networkPassphrase: String
  
  var path: String | js.Array[Double]
  
  var transaction: StellarTransaction
}
object StellarSignTransaction {
  
  inline def apply(networkPassphrase: String, path: String | js.Array[Double], transaction: StellarTransaction): StellarSignTransaction = {
    val __obj = js.Dynamic.literal(networkPassphrase = networkPassphrase.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarSignTransaction]
  }
  
  extension [Self <: StellarSignTransaction](x: Self) {
    
    inline def setNetworkPassphrase(value: String): Self = StObject.set(x, "networkPassphrase", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setTransaction(value: StellarTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
