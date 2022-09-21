package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntropyAck extends StObject {
  
  var entropy: String
}
object EntropyAck {
  
  inline def apply(entropy: String): EntropyAck = {
    val __obj = js.Dynamic.literal(entropy = entropy.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntropyAck]
  }
  
  extension [Self <: EntropyAck](x: Self) {
    
    inline def setEntropy(value: String): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
  }
}
