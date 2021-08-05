package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComposeTransactionParams
  extends StObject
     with CommonParams {
  
  var coin: String
  
  var outputs: js.Array[Output]
  
  var push: js.UndefOr[Boolean] = js.undefined
}
object ComposeTransactionParams {
  
  inline def apply(coin: String, outputs: js.Array[Output]): ComposeTransactionParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeTransactionParams]
  }
  
  extension [Self <: ComposeTransactionParams](x: Self) {
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: js.Array[Output]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
  }
}
