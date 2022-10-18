package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonTxInputType extends StObject {
  
  // required: previous transaction index
  var amount: UintType
  
  // used by EXTERNAL, depending on script_pubkey
  var commitment_data: js.UndefOr[String] = js.undefined
  
  // RBF
  var decred_staking_spend: js.UndefOr[DecredStakingSpendType] = js.undefined
  
  var decred_tree: js.UndefOr[Double] = js.undefined
  
  var multisig: js.UndefOr[MultisigRedeemScriptType] = js.undefined
  
  var orig_hash: js.UndefOr[String] = js.undefined
  
  // RBF
  var orig_index: js.UndefOr[Double] = js.undefined
  
  // used by EXTERNAL, depending on script_pubkey
  var ownership_proof: js.UndefOr[String] = js.undefined
  
  var prev_hash: String
  
  // required: previous transaction hash (reversed)
  var prev_index: Double
  
  var script_pubkey: js.UndefOr[String] = js.undefined
  
  // required if script_type=EXTERNAL
  var script_sig: js.UndefOr[String] = js.undefined
  
  // required
  var sequence: js.UndefOr[Double] = js.undefined
  
  // used by EXTERNAL, depending on script_pubkey
  var witness: js.UndefOr[String] = js.undefined
}
object CommonTxInputType {
  
  inline def apply(amount: UintType, prev_hash: String, prev_index: Double): CommonTxInputType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], prev_hash = prev_hash.asInstanceOf[js.Any], prev_index = prev_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonTxInputType]
  }
  
  extension [Self <: CommonTxInputType](x: Self) {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCommitment_data(value: String): Self = StObject.set(x, "commitment_data", value.asInstanceOf[js.Any])
    
    inline def setCommitment_dataUndefined: Self = StObject.set(x, "commitment_data", js.undefined)
    
    inline def setDecred_staking_spend(value: DecredStakingSpendType): Self = StObject.set(x, "decred_staking_spend", value.asInstanceOf[js.Any])
    
    inline def setDecred_staking_spendUndefined: Self = StObject.set(x, "decred_staking_spend", js.undefined)
    
    inline def setDecred_tree(value: Double): Self = StObject.set(x, "decred_tree", value.asInstanceOf[js.Any])
    
    inline def setDecred_treeUndefined: Self = StObject.set(x, "decred_tree", js.undefined)
    
    inline def setMultisig(value: MultisigRedeemScriptType): Self = StObject.set(x, "multisig", value.asInstanceOf[js.Any])
    
    inline def setMultisigUndefined: Self = StObject.set(x, "multisig", js.undefined)
    
    inline def setOrig_hash(value: String): Self = StObject.set(x, "orig_hash", value.asInstanceOf[js.Any])
    
    inline def setOrig_hashUndefined: Self = StObject.set(x, "orig_hash", js.undefined)
    
    inline def setOrig_index(value: Double): Self = StObject.set(x, "orig_index", value.asInstanceOf[js.Any])
    
    inline def setOrig_indexUndefined: Self = StObject.set(x, "orig_index", js.undefined)
    
    inline def setOwnership_proof(value: String): Self = StObject.set(x, "ownership_proof", value.asInstanceOf[js.Any])
    
    inline def setOwnership_proofUndefined: Self = StObject.set(x, "ownership_proof", js.undefined)
    
    inline def setPrev_hash(value: String): Self = StObject.set(x, "prev_hash", value.asInstanceOf[js.Any])
    
    inline def setPrev_index(value: Double): Self = StObject.set(x, "prev_index", value.asInstanceOf[js.Any])
    
    inline def setScript_pubkey(value: String): Self = StObject.set(x, "script_pubkey", value.asInstanceOf[js.Any])
    
    inline def setScript_pubkeyUndefined: Self = StObject.set(x, "script_pubkey", js.undefined)
    
    inline def setScript_sig(value: String): Self = StObject.set(x, "script_sig", value.asInstanceOf[js.Any])
    
    inline def setScript_sigUndefined: Self = StObject.set(x, "script_sig", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setWitness(value: String): Self = StObject.set(x, "witness", value.asInstanceOf[js.Any])
    
    inline def setWitnessUndefined: Self = StObject.set(x, "witness", js.undefined)
  }
}
