package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAddressParams
  extends StObject
     with CommonParams {
  
  var address: js.UndefOr[String] = js.undefined
  
  var coin: js.UndefOr[String] = js.undefined
  
  var crossChain: js.UndefOr[Boolean] = js.undefined
  
  var path: String | js.Array[Double]
  
  var showOnTrezor: js.UndefOr[Boolean] = js.undefined
}
object GetAddressParams {
  
  @scala.inline
  def apply(path: String | js.Array[Double]): GetAddressParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAddressParams]
  }
  
  @scala.inline
  implicit class GetAddressParamsMutableBuilder[Self <: GetAddressParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoinUndefined: Self = StObject.set(x, "coin", js.undefined)
    
    @scala.inline
    def setCrossChain(value: Boolean): Self = StObject.set(x, "crossChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossChainUndefined: Self = StObject.set(x, "crossChain", js.undefined)
    
    @scala.inline
    def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setShowOnTrezor(value: Boolean): Self = StObject.set(x, "showOnTrezor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnTrezorUndefined: Self = StObject.set(x, "showOnTrezor", js.undefined)
  }
}
