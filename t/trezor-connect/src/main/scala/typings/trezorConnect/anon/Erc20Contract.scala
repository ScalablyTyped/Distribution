package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptAccountMod.TokenInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Erc20Contract extends StObject {
  
  var erc20Contract: js.UndefOr[TokenInfo] = js.undefined
  
  // ETH
  var nonce: js.UndefOr[String] = js.undefined
  
  var reserve: js.UndefOr[String] = js.undefined
  
  // XRP
  var sequence: js.UndefOr[Double] = js.undefined
  
  // ADA
  var staking: Address
}
object Erc20Contract {
  
  inline def apply(staking: Address): Erc20Contract = {
    val __obj = js.Dynamic.literal(staking = staking.asInstanceOf[js.Any])
    __obj.asInstanceOf[Erc20Contract]
  }
  
  extension [Self <: Erc20Contract](x: Self) {
    
    inline def setErc20Contract(value: TokenInfo): Self = StObject.set(x, "erc20Contract", value.asInstanceOf[js.Any])
    
    inline def setErc20ContractUndefined: Self = StObject.set(x, "erc20Contract", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setReserve(value: String): Self = StObject.set(x, "reserve", value.asInstanceOf[js.Any])
    
    inline def setReserveUndefined: Self = StObject.set(x, "reserve", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setStaking(value: Address): Self = StObject.set(x, "staking", value.asInstanceOf[js.Any])
  }
}
