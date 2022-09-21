package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoPoolOwnerType extends StObject {
  
  var staking_key_hash: js.UndefOr[String] = js.undefined
  
  var staking_key_path: js.UndefOr[js.Array[Double]] = js.undefined
}
object CardanoPoolOwnerType {
  
  inline def apply(): CardanoPoolOwnerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardanoPoolOwnerType]
  }
  
  extension [Self <: CardanoPoolOwnerType](x: Self) {
    
    inline def setStaking_key_hash(value: String): Self = StObject.set(x, "staking_key_hash", value.asInstanceOf[js.Any])
    
    inline def setStaking_key_hashUndefined: Self = StObject.set(x, "staking_key_hash", js.undefined)
    
    inline def setStaking_key_path(value: js.Array[Double]): Self = StObject.set(x, "staking_key_path", value.asInstanceOf[js.Any])
    
    inline def setStaking_key_pathUndefined: Self = StObject.set(x, "staking_key_path", js.undefined)
    
    inline def setStaking_key_pathVarargs(value: Double*): Self = StObject.set(x, "staking_key_path", js.Array(value*))
  }
}
