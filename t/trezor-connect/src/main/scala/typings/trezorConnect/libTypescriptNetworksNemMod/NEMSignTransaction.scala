package typings.trezorConnect.libTypescriptNetworksNemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMSignTransaction extends StObject {
  
  var path: String | js.Array[Double]
  
  var transaction: NEMTransaction
}
object NEMSignTransaction {
  
  inline def apply(path: String | js.Array[Double], transaction: NEMTransaction): NEMSignTransaction = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMSignTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NEMSignTransaction] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setTransaction(value: NEMTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
