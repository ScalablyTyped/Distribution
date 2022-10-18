package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoAssetGroup extends StObject {
  
  var policy_id: String
  
  var tokens_count: Double
}
object CardanoAssetGroup {
  
  inline def apply(policy_id: String, tokens_count: Double): CardanoAssetGroup = {
    val __obj = js.Dynamic.literal(policy_id = policy_id.asInstanceOf[js.Any], tokens_count = tokens_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoAssetGroup]
  }
  
  extension [Self <: CardanoAssetGroup](x: Self) {
    
    inline def setPolicy_id(value: String): Self = StObject.set(x, "policy_id", value.asInstanceOf[js.Any])
    
    inline def setTokens_count(value: Double): Self = StObject.set(x, "tokens_count", value.asInstanceOf[js.Any])
  }
}
