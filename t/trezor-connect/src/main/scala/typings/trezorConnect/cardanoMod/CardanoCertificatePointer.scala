package typings.trezorConnect.cardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoCertificatePointer extends StObject {
  
  var blockIndex: Double
  
  var certificateIndex: Double
  
  var txIndex: Double
}
object CardanoCertificatePointer {
  
  inline def apply(blockIndex: Double, certificateIndex: Double, txIndex: Double): CardanoCertificatePointer = {
    val __obj = js.Dynamic.literal(blockIndex = blockIndex.asInstanceOf[js.Any], certificateIndex = certificateIndex.asInstanceOf[js.Any], txIndex = txIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoCertificatePointer]
  }
  
  extension [Self <: CardanoCertificatePointer](x: Self) {
    
    inline def setBlockIndex(value: Double): Self = StObject.set(x, "blockIndex", value.asInstanceOf[js.Any])
    
    inline def setCertificateIndex(value: Double): Self = StObject.set(x, "certificateIndex", value.asInstanceOf[js.Any])
    
    inline def setTxIndex(value: Double): Self = StObject.set(x, "txIndex", value.asInstanceOf[js.Any])
  }
}
