package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoAssetGroupType extends StObject {
  
  var policy_id: String
  
  var tokens: js.Array[CardanoTokenType]
}
object CardanoAssetGroupType {
  
  inline def apply(policy_id: String, tokens: js.Array[CardanoTokenType]): CardanoAssetGroupType = {
    val __obj = js.Dynamic.literal(policy_id = policy_id.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoAssetGroupType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoAssetGroupType] (val x: Self) extends AnyVal {
    
    inline def setPolicy_id(value: String): Self = StObject.set(x, "policy_id", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[CardanoTokenType]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: CardanoTokenType*): Self = StObject.set(x, "tokens", js.Array(value*))
  }
}
