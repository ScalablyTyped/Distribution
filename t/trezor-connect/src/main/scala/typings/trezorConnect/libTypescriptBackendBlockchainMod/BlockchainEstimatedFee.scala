package typings.trezorConnect.libTypescriptBackendBlockchainMod

import typings.trezorConnect.libTypescriptAccountMod.FeeLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainEstimatedFee extends StObject {
  
  var blockTime: Double
  
  var dustLimit: js.UndefOr[Double] = js.undefined
  
  var levels: js.Array[FeeLevel]
  
  var maxFee: Double
  
  var minFee: Double
}
object BlockchainEstimatedFee {
  
  inline def apply(blockTime: Double, levels: js.Array[FeeLevel], maxFee: Double, minFee: Double): BlockchainEstimatedFee = {
    val __obj = js.Dynamic.literal(blockTime = blockTime.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], maxFee = maxFee.asInstanceOf[js.Any], minFee = minFee.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainEstimatedFee]
  }
  
  extension [Self <: BlockchainEstimatedFee](x: Self) {
    
    inline def setBlockTime(value: Double): Self = StObject.set(x, "blockTime", value.asInstanceOf[js.Any])
    
    inline def setDustLimit(value: Double): Self = StObject.set(x, "dustLimit", value.asInstanceOf[js.Any])
    
    inline def setDustLimitUndefined: Self = StObject.set(x, "dustLimit", js.undefined)
    
    inline def setLevels(value: js.Array[FeeLevel]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: FeeLevel*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setMaxFee(value: Double): Self = StObject.set(x, "maxFee", value.asInstanceOf[js.Any])
    
    inline def setMinFee(value: Double): Self = StObject.set(x, "minFee", value.asInstanceOf[js.Any])
  }
}
