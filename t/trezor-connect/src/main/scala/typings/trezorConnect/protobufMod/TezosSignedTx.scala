package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TezosSignedTx extends StObject {
  
  var operation_hash: String
  
  var sig_op_contents: String
  
  var signature: String
}
object TezosSignedTx {
  
  inline def apply(operation_hash: String, sig_op_contents: String, signature: String): TezosSignedTx = {
    val __obj = js.Dynamic.literal(operation_hash = operation_hash.asInstanceOf[js.Any], sig_op_contents = sig_op_contents.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[TezosSignedTx]
  }
  
  extension [Self <: TezosSignedTx](x: Self) {
    
    inline def setOperation_hash(value: String): Self = StObject.set(x, "operation_hash", value.asInstanceOf[js.Any])
    
    inline def setSig_op_contents(value: String): Self = StObject.set(x, "sig_op_contents", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
