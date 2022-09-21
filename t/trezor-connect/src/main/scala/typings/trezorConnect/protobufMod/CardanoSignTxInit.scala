package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoSignTxInit extends StObject {
  
  var certificates_count: Double
  
  var collateral_inputs_count: Double
  
  var derivation_type: CardanoDerivationType
  
  var fee: UintType
  
  var has_auxiliary_data: Boolean
  
  var include_network_id: js.UndefOr[Boolean] = js.undefined
  
  var inputs_count: Double
  
  var minting_asset_groups_count: Double
  
  var network_id: Double
  
  var outputs_count: Double
  
  var protocol_magic: Double
  
  var required_signers_count: Double
  
  var script_data_hash: js.UndefOr[String] = js.undefined
  
  var signing_mode: CardanoTxSigningMode
  
  var ttl: js.UndefOr[UintType] = js.undefined
  
  var validity_interval_start: js.UndefOr[UintType] = js.undefined
  
  var withdrawals_count: Double
  
  var witness_requests_count: Double
}
object CardanoSignTxInit {
  
  inline def apply(
    certificates_count: Double,
    collateral_inputs_count: Double,
    derivation_type: CardanoDerivationType,
    fee: UintType,
    has_auxiliary_data: Boolean,
    inputs_count: Double,
    minting_asset_groups_count: Double,
    network_id: Double,
    outputs_count: Double,
    protocol_magic: Double,
    required_signers_count: Double,
    signing_mode: CardanoTxSigningMode,
    withdrawals_count: Double,
    witness_requests_count: Double
  ): CardanoSignTxInit = {
    val __obj = js.Dynamic.literal(certificates_count = certificates_count.asInstanceOf[js.Any], collateral_inputs_count = collateral_inputs_count.asInstanceOf[js.Any], derivation_type = derivation_type.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], has_auxiliary_data = has_auxiliary_data.asInstanceOf[js.Any], inputs_count = inputs_count.asInstanceOf[js.Any], minting_asset_groups_count = minting_asset_groups_count.asInstanceOf[js.Any], network_id = network_id.asInstanceOf[js.Any], outputs_count = outputs_count.asInstanceOf[js.Any], protocol_magic = protocol_magic.asInstanceOf[js.Any], required_signers_count = required_signers_count.asInstanceOf[js.Any], signing_mode = signing_mode.asInstanceOf[js.Any], withdrawals_count = withdrawals_count.asInstanceOf[js.Any], witness_requests_count = witness_requests_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoSignTxInit]
  }
  
  extension [Self <: CardanoSignTxInit](x: Self) {
    
    inline def setCertificates_count(value: Double): Self = StObject.set(x, "certificates_count", value.asInstanceOf[js.Any])
    
    inline def setCollateral_inputs_count(value: Double): Self = StObject.set(x, "collateral_inputs_count", value.asInstanceOf[js.Any])
    
    inline def setDerivation_type(value: CardanoDerivationType): Self = StObject.set(x, "derivation_type", value.asInstanceOf[js.Any])
    
    inline def setFee(value: UintType): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setHas_auxiliary_data(value: Boolean): Self = StObject.set(x, "has_auxiliary_data", value.asInstanceOf[js.Any])
    
    inline def setInclude_network_id(value: Boolean): Self = StObject.set(x, "include_network_id", value.asInstanceOf[js.Any])
    
    inline def setInclude_network_idUndefined: Self = StObject.set(x, "include_network_id", js.undefined)
    
    inline def setInputs_count(value: Double): Self = StObject.set(x, "inputs_count", value.asInstanceOf[js.Any])
    
    inline def setMinting_asset_groups_count(value: Double): Self = StObject.set(x, "minting_asset_groups_count", value.asInstanceOf[js.Any])
    
    inline def setNetwork_id(value: Double): Self = StObject.set(x, "network_id", value.asInstanceOf[js.Any])
    
    inline def setOutputs_count(value: Double): Self = StObject.set(x, "outputs_count", value.asInstanceOf[js.Any])
    
    inline def setProtocol_magic(value: Double): Self = StObject.set(x, "protocol_magic", value.asInstanceOf[js.Any])
    
    inline def setRequired_signers_count(value: Double): Self = StObject.set(x, "required_signers_count", value.asInstanceOf[js.Any])
    
    inline def setScript_data_hash(value: String): Self = StObject.set(x, "script_data_hash", value.asInstanceOf[js.Any])
    
    inline def setScript_data_hashUndefined: Self = StObject.set(x, "script_data_hash", js.undefined)
    
    inline def setSigning_mode(value: CardanoTxSigningMode): Self = StObject.set(x, "signing_mode", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: UintType): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setValidity_interval_start(value: UintType): Self = StObject.set(x, "validity_interval_start", value.asInstanceOf[js.Any])
    
    inline def setValidity_interval_startUndefined: Self = StObject.set(x, "validity_interval_start", js.undefined)
    
    inline def setWithdrawals_count(value: Double): Self = StObject.set(x, "withdrawals_count", value.asInstanceOf[js.Any])
    
    inline def setWitness_requests_count(value: Double): Self = StObject.set(x, "witness_requests_count", value.asInstanceOf[js.Any])
  }
}
