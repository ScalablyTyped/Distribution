package typings.trezorConnect.stellarMod

import typings.trezorConnect.trezorConnectStrings.bumpSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarBumpSequenceOperation
  extends StObject
     with StellarOperation {
  
  // Proto: "source_account"
  var bumpTo: String
  
  // Proto: "StellarBumpSequenceOp"
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: bumpSequence
}
object StellarBumpSequenceOperation {
  
  inline def apply(bumpTo: String): StellarBumpSequenceOperation = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bumpSequence")
    __obj.asInstanceOf[StellarBumpSequenceOperation]
  }
  
  extension [Self <: StellarBumpSequenceOperation](x: Self) {
    
    inline def setBumpTo(value: String): Self = StObject.set(x, "bumpTo", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: bumpSequence): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
