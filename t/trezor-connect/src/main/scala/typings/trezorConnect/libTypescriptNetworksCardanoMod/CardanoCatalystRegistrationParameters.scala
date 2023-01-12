package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoCatalystRegistrationParameters extends StObject {
  
  var nonce: String
  
  var rewardAddressParameters: CardanoAddressParameters
  
  var stakingPath: String | js.Array[Double]
  
  var votingPublicKey: String
}
object CardanoCatalystRegistrationParameters {
  
  inline def apply(
    nonce: String,
    rewardAddressParameters: CardanoAddressParameters,
    stakingPath: String | js.Array[Double],
    votingPublicKey: String
  ): CardanoCatalystRegistrationParameters = {
    val __obj = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any], rewardAddressParameters = rewardAddressParameters.asInstanceOf[js.Any], stakingPath = stakingPath.asInstanceOf[js.Any], votingPublicKey = votingPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoCatalystRegistrationParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoCatalystRegistrationParameters] (val x: Self) extends AnyVal {
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setRewardAddressParameters(value: CardanoAddressParameters): Self = StObject.set(x, "rewardAddressParameters", value.asInstanceOf[js.Any])
    
    inline def setStakingPath(value: String | js.Array[Double]): Self = StObject.set(x, "stakingPath", value.asInstanceOf[js.Any])
    
    inline def setStakingPathVarargs(value: Double*): Self = StObject.set(x, "stakingPath", js.Array(value*))
    
    inline def setVotingPublicKey(value: String): Self = StObject.set(x, "votingPublicKey", value.asInstanceOf[js.Any])
  }
}
