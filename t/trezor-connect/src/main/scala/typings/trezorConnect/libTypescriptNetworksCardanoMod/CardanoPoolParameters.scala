package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoPoolParameters extends StObject {
  
  var cost: String
  
  var margin: CardanoPoolMargin
  
  var metadata: CardanoPoolMetadata
  
  var owners: js.Array[CardanoPoolOwner]
  
  var pledge: String
  
  var poolId: String
  
  var relays: js.Array[CardanoPoolRelay]
  
  var rewardAccount: String
  
  var vrfKeyHash: String
}
object CardanoPoolParameters {
  
  inline def apply(
    cost: String,
    margin: CardanoPoolMargin,
    metadata: CardanoPoolMetadata,
    owners: js.Array[CardanoPoolOwner],
    pledge: String,
    poolId: String,
    relays: js.Array[CardanoPoolRelay],
    rewardAccount: String,
    vrfKeyHash: String
  ): CardanoPoolParameters = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any], pledge = pledge.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], relays = relays.asInstanceOf[js.Any], rewardAccount = rewardAccount.asInstanceOf[js.Any], vrfKeyHash = vrfKeyHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoPoolParameters]
  }
  
  extension [Self <: CardanoPoolParameters](x: Self) {
    
    inline def setCost(value: String): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: CardanoPoolMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: CardanoPoolMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setOwners(value: js.Array[CardanoPoolOwner]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersVarargs(value: CardanoPoolOwner*): Self = StObject.set(x, "owners", js.Array(value*))
    
    inline def setPledge(value: String): Self = StObject.set(x, "pledge", value.asInstanceOf[js.Any])
    
    inline def setPoolId(value: String): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
    
    inline def setRelays(value: js.Array[CardanoPoolRelay]): Self = StObject.set(x, "relays", value.asInstanceOf[js.Any])
    
    inline def setRelaysVarargs(value: CardanoPoolRelay*): Self = StObject.set(x, "relays", js.Array(value*))
    
    inline def setRewardAccount(value: String): Self = StObject.set(x, "rewardAccount", value.asInstanceOf[js.Any])
    
    inline def setVrfKeyHash(value: String): Self = StObject.set(x, "vrfKeyHash", value.asInstanceOf[js.Any])
  }
}
