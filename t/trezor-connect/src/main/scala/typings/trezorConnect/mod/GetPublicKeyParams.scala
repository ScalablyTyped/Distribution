package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublicKeyParams
  extends StObject
     with CommonParams {
  
  var coin: js.UndefOr[String] = js.undefined
  
  var crossChain: js.UndefOr[Boolean] = js.undefined
  
  var path: String
}
object GetPublicKeyParams {
  
  @scala.inline
  def apply(path: String): GetPublicKeyParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicKeyParams]
  }
  
  @scala.inline
  implicit class GetPublicKeyParamsMutableBuilder[Self <: GetPublicKeyParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoinUndefined: Self = StObject.set(x, "coin", js.undefined)
    
    @scala.inline
    def setCrossChain(value: Boolean): Self = StObject.set(x, "crossChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossChainUndefined: Self = StObject.set(x, "crossChain", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
