package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoAssetGroup extends StObject {
  
  var policyId: String
  
  var tokenAmounts: js.Array[CardanoToken]
}
object CardanoAssetGroup {
  
  inline def apply(policyId: String, tokenAmounts: js.Array[CardanoToken]): CardanoAssetGroup = {
    val __obj = js.Dynamic.literal(policyId = policyId.asInstanceOf[js.Any], tokenAmounts = tokenAmounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoAssetGroup]
  }
  
  extension [Self <: CardanoAssetGroup](x: Self) {
    
    inline def setPolicyId(value: String): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
    
    inline def setTokenAmounts(value: js.Array[CardanoToken]): Self = StObject.set(x, "tokenAmounts", value.asInstanceOf[js.Any])
    
    inline def setTokenAmountsVarargs(value: CardanoToken*): Self = StObject.set(x, "tokenAmounts", js.Array(value*))
  }
}
