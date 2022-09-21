package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoCatalystRegistrationParametersType extends StObject {
  
  var nonce: UintType
  
  var reward_address_parameters: CardanoAddressParametersType
  
  var staking_path: js.Array[Double]
  
  var voting_public_key: String
}
object CardanoCatalystRegistrationParametersType {
  
  inline def apply(
    nonce: UintType,
    reward_address_parameters: CardanoAddressParametersType,
    staking_path: js.Array[Double],
    voting_public_key: String
  ): CardanoCatalystRegistrationParametersType = {
    val __obj = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any], reward_address_parameters = reward_address_parameters.asInstanceOf[js.Any], staking_path = staking_path.asInstanceOf[js.Any], voting_public_key = voting_public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoCatalystRegistrationParametersType]
  }
  
  extension [Self <: CardanoCatalystRegistrationParametersType](x: Self) {
    
    inline def setNonce(value: UintType): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setReward_address_parameters(value: CardanoAddressParametersType): Self = StObject.set(x, "reward_address_parameters", value.asInstanceOf[js.Any])
    
    inline def setStaking_path(value: js.Array[Double]): Self = StObject.set(x, "staking_path", value.asInstanceOf[js.Any])
    
    inline def setStaking_pathVarargs(value: Double*): Self = StObject.set(x, "staking_path", js.Array(value*))
    
    inline def setVoting_public_key(value: String): Self = StObject.set(x, "voting_public_key", value.asInstanceOf[js.Any])
  }
}
