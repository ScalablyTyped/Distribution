package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountInfoParams
  extends StObject
     with CommonParams {
  
  // if both these fields are missing, the user will select an account
  var coin: String
  
  var path: js.UndefOr[js.Array[Double]] = js.undefined
  
  // NOTE:
  var xpub: js.UndefOr[String] = js.undefined
}
object GetAccountInfoParams {
  
  inline def apply(coin: String): GetAccountInfoParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountInfoParams]
  }
  
  extension [Self <: GetAccountInfoParams](x: Self) {
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setXpub(value: String): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
    
    inline def setXpubUndefined: Self = StObject.set(x, "xpub", js.undefined)
  }
}
