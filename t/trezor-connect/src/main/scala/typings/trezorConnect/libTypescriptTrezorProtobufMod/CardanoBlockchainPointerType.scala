package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoBlockchainPointerType extends StObject {
  
  var block_index: Double
  
  var certificate_index: Double
  
  var tx_index: Double
}
object CardanoBlockchainPointerType {
  
  inline def apply(block_index: Double, certificate_index: Double, tx_index: Double): CardanoBlockchainPointerType = {
    val __obj = js.Dynamic.literal(block_index = block_index.asInstanceOf[js.Any], certificate_index = certificate_index.asInstanceOf[js.Any], tx_index = tx_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoBlockchainPointerType]
  }
  
  extension [Self <: CardanoBlockchainPointerType](x: Self) {
    
    inline def setBlock_index(value: Double): Self = StObject.set(x, "block_index", value.asInstanceOf[js.Any])
    
    inline def setCertificate_index(value: Double): Self = StObject.set(x, "certificate_index", value.asInstanceOf[js.Any])
    
    inline def setTx_index(value: Double): Self = StObject.set(x, "tx_index", value.asInstanceOf[js.Any])
  }
}
