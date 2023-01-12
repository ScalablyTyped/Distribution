package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoPoolOwner extends StObject {
  
  var stakingKeyHash: js.UndefOr[String] = js.undefined
  
  var stakingKeyPath: js.UndefOr[String | js.Array[Double]] = js.undefined
}
object CardanoPoolOwner {
  
  inline def apply(): CardanoPoolOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardanoPoolOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoPoolOwner] (val x: Self) extends AnyVal {
    
    inline def setStakingKeyHash(value: String): Self = StObject.set(x, "stakingKeyHash", value.asInstanceOf[js.Any])
    
    inline def setStakingKeyHashUndefined: Self = StObject.set(x, "stakingKeyHash", js.undefined)
    
    inline def setStakingKeyPath(value: String | js.Array[Double]): Self = StObject.set(x, "stakingKeyPath", value.asInstanceOf[js.Any])
    
    inline def setStakingKeyPathUndefined: Self = StObject.set(x, "stakingKeyPath", js.undefined)
    
    inline def setStakingKeyPathVarargs(value: Double*): Self = StObject.set(x, "stakingKeyPath", js.Array(value*))
  }
}
