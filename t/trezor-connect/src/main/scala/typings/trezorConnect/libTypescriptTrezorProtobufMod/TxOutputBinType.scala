package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxOutputBinType extends StObject {
  
  var amount: UintType
  
  var decred_script_version: js.UndefOr[Double] = js.undefined
  
  var script_pubkey: String
}
object TxOutputBinType {
  
  inline def apply(amount: UintType, script_pubkey: String): TxOutputBinType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], script_pubkey = script_pubkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxOutputBinType]
  }
  
  extension [Self <: TxOutputBinType](x: Self) {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDecred_script_version(value: Double): Self = StObject.set(x, "decred_script_version", value.asInstanceOf[js.Any])
    
    inline def setDecred_script_versionUndefined: Self = StObject.set(x, "decred_script_version", js.undefined)
    
    inline def setScript_pubkey(value: String): Self = StObject.set(x, "script_pubkey", value.asInstanceOf[js.Any])
  }
}
