package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoSignTx extends StObject {
  
  var auxiliary_data: js.UndefOr[CardanoTxAuxiliaryDataType] = js.undefined
  
  var certificates: js.Array[CardanoTxCertificateType]
  
  var fee: UintType
  
  var inputs: js.Array[CardanoTxInputType]
  
  var network_id: Double
  
  var outputs: js.Array[CardanoTxOutputType]
  
  var protocol_magic: Double
  
  var ttl: js.UndefOr[UintType] = js.undefined
  
  var validity_interval_start: js.UndefOr[UintType] = js.undefined
  
  var withdrawals: js.Array[CardanoTxWithdrawalType]
}
object CardanoSignTx {
  
  inline def apply(
    certificates: js.Array[CardanoTxCertificateType],
    fee: UintType,
    inputs: js.Array[CardanoTxInputType],
    network_id: Double,
    outputs: js.Array[CardanoTxOutputType],
    protocol_magic: Double,
    withdrawals: js.Array[CardanoTxWithdrawalType]
  ): CardanoSignTx = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], network_id = network_id.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], protocol_magic = protocol_magic.asInstanceOf[js.Any], withdrawals = withdrawals.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoSignTx]
  }
  
  extension [Self <: CardanoSignTx](x: Self) {
    
    inline def setAuxiliary_data(value: CardanoTxAuxiliaryDataType): Self = StObject.set(x, "auxiliary_data", value.asInstanceOf[js.Any])
    
    inline def setAuxiliary_dataUndefined: Self = StObject.set(x, "auxiliary_data", js.undefined)
    
    inline def setCertificates(value: js.Array[CardanoTxCertificateType]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesVarargs(value: CardanoTxCertificateType*): Self = StObject.set(x, "certificates", js.Array(value*))
    
    inline def setFee(value: UintType): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: js.Array[CardanoTxInputType]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: CardanoTxInputType*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setNetwork_id(value: Double): Self = StObject.set(x, "network_id", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: js.Array[CardanoTxOutputType]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: CardanoTxOutputType*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setProtocol_magic(value: Double): Self = StObject.set(x, "protocol_magic", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: UintType): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setValidity_interval_start(value: UintType): Self = StObject.set(x, "validity_interval_start", value.asInstanceOf[js.Any])
    
    inline def setValidity_interval_startUndefined: Self = StObject.set(x, "validity_interval_start", js.undefined)
    
    inline def setWithdrawals(value: js.Array[CardanoTxWithdrawalType]): Self = StObject.set(x, "withdrawals", value.asInstanceOf[js.Any])
    
    inline def setWithdrawalsVarargs(value: CardanoTxWithdrawalType*): Self = StObject.set(x, "withdrawals", js.Array(value*))
  }
}
