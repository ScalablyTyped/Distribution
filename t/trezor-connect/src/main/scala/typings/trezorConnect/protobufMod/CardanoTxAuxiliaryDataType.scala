package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxAuxiliaryDataType extends StObject {
  
  var blob: js.UndefOr[String] = js.undefined
  
  var catalyst_registration_parameters: js.UndefOr[CardanoCatalystRegistrationParametersType] = js.undefined
}
object CardanoTxAuxiliaryDataType {
  
  inline def apply(): CardanoTxAuxiliaryDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardanoTxAuxiliaryDataType]
  }
  
  extension [Self <: CardanoTxAuxiliaryDataType](x: Self) {
    
    inline def setBlob(value: String): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    inline def setCatalyst_registration_parameters(value: CardanoCatalystRegistrationParametersType): Self = StObject.set(x, "catalyst_registration_parameters", value.asInstanceOf[js.Any])
    
    inline def setCatalyst_registration_parametersUndefined: Self = StObject.set(x, "catalyst_registration_parameters", js.undefined)
  }
}
