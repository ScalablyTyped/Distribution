package typings.web3Core.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomChainParams extends StObject {
  
  var chainId: Double
  
  var name: js.UndefOr[String] = js.undefined
  
  var networkId: Double
}
object CustomChainParams {
  
  @scala.inline
  def apply(chainId: Double, networkId: Double): CustomChainParams = {
    val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], networkId = networkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomChainParams]
  }
  
  @scala.inline
  implicit class CustomChainParamsMutableBuilder[Self <: CustomChainParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworkId(value: Double): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
  }
}
