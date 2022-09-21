package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoPoolParametersType extends StObject {
  
  var cost: UintType
  
  var margin_denominator: UintType
  
  var margin_numerator: UintType
  
  var metadata: js.UndefOr[CardanoPoolMetadataType] = js.undefined
  
  var owners: js.Array[CardanoPoolOwner]
  
  var owners_count: Double
  
  var pledge: UintType
  
  var pool_id: String
  
  var relays: js.Array[CardanoPoolRelayParameters]
  
  var relays_count: Double
  
  var reward_account: String
  
  var vrf_key_hash: String
}
object CardanoPoolParametersType {
  
  inline def apply(
    cost: UintType,
    margin_denominator: UintType,
    margin_numerator: UintType,
    owners: js.Array[CardanoPoolOwner],
    owners_count: Double,
    pledge: UintType,
    pool_id: String,
    relays: js.Array[CardanoPoolRelayParameters],
    relays_count: Double,
    reward_account: String,
    vrf_key_hash: String
  ): CardanoPoolParametersType = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], margin_denominator = margin_denominator.asInstanceOf[js.Any], margin_numerator = margin_numerator.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any], owners_count = owners_count.asInstanceOf[js.Any], pledge = pledge.asInstanceOf[js.Any], pool_id = pool_id.asInstanceOf[js.Any], relays = relays.asInstanceOf[js.Any], relays_count = relays_count.asInstanceOf[js.Any], reward_account = reward_account.asInstanceOf[js.Any], vrf_key_hash = vrf_key_hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoPoolParametersType]
  }
  
  extension [Self <: CardanoPoolParametersType](x: Self) {
    
    inline def setCost(value: UintType): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setMargin_denominator(value: UintType): Self = StObject.set(x, "margin_denominator", value.asInstanceOf[js.Any])
    
    inline def setMargin_numerator(value: UintType): Self = StObject.set(x, "margin_numerator", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: CardanoPoolMetadataType): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOwners(value: js.Array[CardanoPoolOwner]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersVarargs(value: CardanoPoolOwner*): Self = StObject.set(x, "owners", js.Array(value*))
    
    inline def setOwners_count(value: Double): Self = StObject.set(x, "owners_count", value.asInstanceOf[js.Any])
    
    inline def setPledge(value: UintType): Self = StObject.set(x, "pledge", value.asInstanceOf[js.Any])
    
    inline def setPool_id(value: String): Self = StObject.set(x, "pool_id", value.asInstanceOf[js.Any])
    
    inline def setRelays(value: js.Array[CardanoPoolRelayParameters]): Self = StObject.set(x, "relays", value.asInstanceOf[js.Any])
    
    inline def setRelaysVarargs(value: CardanoPoolRelayParameters*): Self = StObject.set(x, "relays", js.Array(value*))
    
    inline def setRelays_count(value: Double): Self = StObject.set(x, "relays_count", value.asInstanceOf[js.Any])
    
    inline def setReward_account(value: String): Self = StObject.set(x, "reward_account", value.asInstanceOf[js.Any])
    
    inline def setVrf_key_hash(value: String): Self = StObject.set(x, "vrf_key_hash", value.asInstanceOf[js.Any])
  }
}
