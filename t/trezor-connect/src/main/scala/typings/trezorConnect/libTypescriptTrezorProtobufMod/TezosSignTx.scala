package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TezosSignTx extends StObject {
  
  var address_n: js.Array[Double]
  
  var ballot: js.UndefOr[TezosBallotOp] = js.undefined
  
  var branch: js.typedarray.Uint8Array
  
  var delegation: js.UndefOr[TezosDelegationOp] = js.undefined
  
  var origination: js.UndefOr[TezosOriginationOp] = js.undefined
  
  var proposal: js.UndefOr[TezosProposalOp] = js.undefined
  
  var reveal: js.UndefOr[TezosRevealOp] = js.undefined
  
  var transaction: js.UndefOr[TezosTransactionOp] = js.undefined
}
object TezosSignTx {
  
  inline def apply(address_n: js.Array[Double], branch: js.typedarray.Uint8Array): TezosSignTx = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TezosSignTx]
  }
  
  extension [Self <: TezosSignTx](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setBallot(value: TezosBallotOp): Self = StObject.set(x, "ballot", value.asInstanceOf[js.Any])
    
    inline def setBallotUndefined: Self = StObject.set(x, "ballot", js.undefined)
    
    inline def setBranch(value: js.typedarray.Uint8Array): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setDelegation(value: TezosDelegationOp): Self = StObject.set(x, "delegation", value.asInstanceOf[js.Any])
    
    inline def setDelegationUndefined: Self = StObject.set(x, "delegation", js.undefined)
    
    inline def setOrigination(value: TezosOriginationOp): Self = StObject.set(x, "origination", value.asInstanceOf[js.Any])
    
    inline def setOriginationUndefined: Self = StObject.set(x, "origination", js.undefined)
    
    inline def setProposal(value: TezosProposalOp): Self = StObject.set(x, "proposal", value.asInstanceOf[js.Any])
    
    inline def setProposalUndefined: Self = StObject.set(x, "proposal", js.undefined)
    
    inline def setReveal(value: TezosRevealOp): Self = StObject.set(x, "reveal", value.asInstanceOf[js.Any])
    
    inline def setRevealUndefined: Self = StObject.set(x, "reveal", js.undefined)
    
    inline def setTransaction(value: TezosTransactionOp): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
