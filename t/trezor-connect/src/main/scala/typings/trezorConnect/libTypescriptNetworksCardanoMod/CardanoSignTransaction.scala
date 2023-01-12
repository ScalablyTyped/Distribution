package typings.trezorConnect.libTypescriptNetworksCardanoMod

import typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoDerivationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoSignTransaction extends StObject {
  
  var additionalWitnessRequests: js.UndefOr[js.Array[String | js.Array[Double]]] = js.undefined
  
  var auxiliaryData: js.UndefOr[CardanoAuxiliaryData] = js.undefined
  
  var certificates: js.UndefOr[js.Array[CardanoCertificate]] = js.undefined
  
  var collateralInputs: js.UndefOr[js.Array[CardanoCollateralInput]] = js.undefined
  
  var derivationType: js.UndefOr[CardanoDerivationType] = js.undefined
  
  var fee: String
  
  var includeNetworkId: js.UndefOr[Boolean] = js.undefined
  
  var inputs: js.Array[CardanoInput]
  
  var mint: js.UndefOr[CardanoMint] = js.undefined
  
  var networkId: Double
  
  var outputs: js.Array[CardanoOutput]
  
  var protocolMagic: Double
  
  var requiredSigners: js.UndefOr[js.Array[CardanoRequiredSigner]] = js.undefined
  
  var scriptDataHash: js.UndefOr[String] = js.undefined
  
  var signingMode: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxSigningMode
  
  var ttl: js.UndefOr[String] = js.undefined
  
  var validityIntervalStart: js.UndefOr[String] = js.undefined
  
  var withdrawals: js.UndefOr[js.Array[CardanoWithdrawal]] = js.undefined
}
object CardanoSignTransaction {
  
  inline def apply(
    fee: String,
    inputs: js.Array[CardanoInput],
    networkId: Double,
    outputs: js.Array[CardanoOutput],
    protocolMagic: Double,
    signingMode: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxSigningMode
  ): CardanoSignTransaction = {
    val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], networkId = networkId.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], protocolMagic = protocolMagic.asInstanceOf[js.Any], signingMode = signingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoSignTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoSignTransaction] (val x: Self) extends AnyVal {
    
    inline def setAdditionalWitnessRequests(value: js.Array[String | js.Array[Double]]): Self = StObject.set(x, "additionalWitnessRequests", value.asInstanceOf[js.Any])
    
    inline def setAdditionalWitnessRequestsUndefined: Self = StObject.set(x, "additionalWitnessRequests", js.undefined)
    
    inline def setAdditionalWitnessRequestsVarargs(value: (String | js.Array[Double])*): Self = StObject.set(x, "additionalWitnessRequests", js.Array(value*))
    
    inline def setAuxiliaryData(value: CardanoAuxiliaryData): Self = StObject.set(x, "auxiliaryData", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryDataUndefined: Self = StObject.set(x, "auxiliaryData", js.undefined)
    
    inline def setCertificates(value: js.Array[CardanoCertificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: CardanoCertificate*): Self = StObject.set(x, "certificates", js.Array(value*))
    
    inline def setCollateralInputs(value: js.Array[CardanoCollateralInput]): Self = StObject.set(x, "collateralInputs", value.asInstanceOf[js.Any])
    
    inline def setCollateralInputsUndefined: Self = StObject.set(x, "collateralInputs", js.undefined)
    
    inline def setCollateralInputsVarargs(value: CardanoCollateralInput*): Self = StObject.set(x, "collateralInputs", js.Array(value*))
    
    inline def setDerivationType(value: CardanoDerivationType): Self = StObject.set(x, "derivationType", value.asInstanceOf[js.Any])
    
    inline def setDerivationTypeUndefined: Self = StObject.set(x, "derivationType", js.undefined)
    
    inline def setFee(value: String): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setIncludeNetworkId(value: Boolean): Self = StObject.set(x, "includeNetworkId", value.asInstanceOf[js.Any])
    
    inline def setIncludeNetworkIdUndefined: Self = StObject.set(x, "includeNetworkId", js.undefined)
    
    inline def setInputs(value: js.Array[CardanoInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: CardanoInput*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setMint(value: CardanoMint): Self = StObject.set(x, "mint", value.asInstanceOf[js.Any])
    
    inline def setMintUndefined: Self = StObject.set(x, "mint", js.undefined)
    
    inline def setMintVarargs(value: CardanoAssetGroup*): Self = StObject.set(x, "mint", js.Array(value*))
    
    inline def setNetworkId(value: Double): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: js.Array[CardanoOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: CardanoOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setProtocolMagic(value: Double): Self = StObject.set(x, "protocolMagic", value.asInstanceOf[js.Any])
    
    inline def setRequiredSigners(value: js.Array[CardanoRequiredSigner]): Self = StObject.set(x, "requiredSigners", value.asInstanceOf[js.Any])
    
    inline def setRequiredSignersUndefined: Self = StObject.set(x, "requiredSigners", js.undefined)
    
    inline def setRequiredSignersVarargs(value: CardanoRequiredSigner*): Self = StObject.set(x, "requiredSigners", js.Array(value*))
    
    inline def setScriptDataHash(value: String): Self = StObject.set(x, "scriptDataHash", value.asInstanceOf[js.Any])
    
    inline def setScriptDataHashUndefined: Self = StObject.set(x, "scriptDataHash", js.undefined)
    
    inline def setSigningMode(value: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxSigningMode): Self = StObject.set(x, "signingMode", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setValidityIntervalStart(value: String): Self = StObject.set(x, "validityIntervalStart", value.asInstanceOf[js.Any])
    
    inline def setValidityIntervalStartUndefined: Self = StObject.set(x, "validityIntervalStart", js.undefined)
    
    inline def setWithdrawals(value: js.Array[CardanoWithdrawal]): Self = StObject.set(x, "withdrawals", value.asInstanceOf[js.Any])
    
    inline def setWithdrawalsUndefined: Self = StObject.set(x, "withdrawals", js.undefined)
    
    inline def setWithdrawalsVarargs(value: CardanoWithdrawal*): Self = StObject.set(x, "withdrawals", js.Array(value*))
  }
}
