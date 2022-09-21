package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TezosBallotOp extends StObject {
  
  var ballot: TezosBallotType
  
  var period: Double
  
  var proposal: String
  
  var source: String
}
object TezosBallotOp {
  
  inline def apply(ballot: TezosBallotType, period: Double, proposal: String, source: String): TezosBallotOp = {
    val __obj = js.Dynamic.literal(ballot = ballot.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], proposal = proposal.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TezosBallotOp]
  }
  
  extension [Self <: TezosBallotOp](x: Self) {
    
    inline def setBallot(value: TezosBallotType): Self = StObject.set(x, "ballot", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setProposal(value: String): Self = StObject.set(x, "proposal", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
