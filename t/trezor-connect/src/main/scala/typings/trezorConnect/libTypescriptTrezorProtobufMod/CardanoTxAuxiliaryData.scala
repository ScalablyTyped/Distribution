package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxAuxiliaryData extends StObject {
  
  var catalyst_registration_parameters: js.UndefOr[CardanoCatalystRegistrationParametersType] = js.undefined
  
  var hash: js.UndefOr[String] = js.undefined
}
object CardanoTxAuxiliaryData {
  
  inline def apply(): CardanoTxAuxiliaryData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardanoTxAuxiliaryData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoTxAuxiliaryData] (val x: Self) extends AnyVal {
    
    inline def setCatalyst_registration_parameters(value: CardanoCatalystRegistrationParametersType): Self = StObject.set(x, "catalyst_registration_parameters", value.asInstanceOf[js.Any])
    
    inline def setCatalyst_registration_parametersUndefined: Self = StObject.set(x, "catalyst_registration_parameters", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
  }
}
