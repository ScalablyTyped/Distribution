package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoAuxiliaryData extends StObject {
  
  var catalystRegistrationParameters: js.UndefOr[CardanoCatalystRegistrationParameters] = js.undefined
  
  var hash: js.UndefOr[String] = js.undefined
}
object CardanoAuxiliaryData {
  
  inline def apply(): CardanoAuxiliaryData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardanoAuxiliaryData]
  }
  
  extension [Self <: CardanoAuxiliaryData](x: Self) {
    
    inline def setCatalystRegistrationParameters(value: CardanoCatalystRegistrationParameters): Self = StObject.set(x, "catalystRegistrationParameters", value.asInstanceOf[js.Any])
    
    inline def setCatalystRegistrationParametersUndefined: Self = StObject.set(x, "catalystRegistrationParameters", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
  }
}
