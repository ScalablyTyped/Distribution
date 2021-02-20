package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccountInfoParams extends CommonParams {
  
  // if both these fields are missing, the user will select an account
  var coin: String = js.native
  
  var path: js.UndefOr[js.Array[Double]] = js.native
  
  // NOTE:
  var xpub: js.UndefOr[String] = js.native
}
object GetAccountInfoParams {
  
  @scala.inline
  def apply(coin: String): GetAccountInfoParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountInfoParams]
  }
  
  @scala.inline
  implicit class GetAccountInfoParamsMutableBuilder[Self <: GetAccountInfoParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setXpub(value: String): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpubUndefined: Self = StObject.set(x, "xpub", js.undefined)
  }
}
