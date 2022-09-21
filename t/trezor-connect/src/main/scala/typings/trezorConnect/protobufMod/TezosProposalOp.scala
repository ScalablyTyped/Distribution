package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TezosProposalOp extends StObject {
  
  var period: Double
  
  var proposals: js.Array[String]
  
  var source: String
}
object TezosProposalOp {
  
  inline def apply(period: Double, proposals: js.Array[String], source: String): TezosProposalOp = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], proposals = proposals.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TezosProposalOp]
  }
  
  extension [Self <: TezosProposalOp](x: Self) {
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setProposals(value: js.Array[String]): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    inline def setProposalsVarargs(value: String*): Self = StObject.set(x, "proposals", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
