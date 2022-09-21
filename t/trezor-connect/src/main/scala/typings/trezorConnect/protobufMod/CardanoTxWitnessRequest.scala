package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxWitnessRequest extends StObject {
  
  var path: js.Array[Double]
}
object CardanoTxWitnessRequest {
  
  inline def apply(path: js.Array[Double]): CardanoTxWitnessRequest = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoTxWitnessRequest]
  }
  
  extension [Self <: CardanoTxWitnessRequest](x: Self) {
    
    inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
