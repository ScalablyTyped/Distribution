package typings.trezorConnect.libTypescriptNetworksEthereumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumSignTransaction extends StObject {
  
  var path: String | js.Array[Double]
  
  var transaction: EthereumTransaction | EthereumTransactionEIP1559
}
object EthereumSignTransaction {
  
  inline def apply(path: String | js.Array[Double], transaction: EthereumTransaction | EthereumTransactionEIP1559): EthereumSignTransaction = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignTransaction]
  }
  
  extension [Self <: EthereumSignTransaction](x: Self) {
    
    inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setTransaction(value: EthereumTransaction | EthereumTransactionEIP1559): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
