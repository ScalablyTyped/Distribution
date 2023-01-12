package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoWithdrawal extends StObject {
  
  var amount: String
  
  var keyHash: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var scriptHash: js.UndefOr[String] = js.undefined
}
object CardanoWithdrawal {
  
  inline def apply(amount: String): CardanoWithdrawal = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoWithdrawal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoWithdrawal] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setKeyHash(value: String): Self = StObject.set(x, "keyHash", value.asInstanceOf[js.Any])
    
    inline def setKeyHashUndefined: Self = StObject.set(x, "keyHash", js.undefined)
    
    inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setScriptHash(value: String): Self = StObject.set(x, "scriptHash", value.asInstanceOf[js.Any])
    
    inline def setScriptHashUndefined: Self = StObject.set(x, "scriptHash", js.undefined)
  }
}
