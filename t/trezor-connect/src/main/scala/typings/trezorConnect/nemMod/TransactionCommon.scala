package typings.trezorConnect.nemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionCommon extends StObject {
  
  var deadline: Double
  
  var fee: Double
  
  var signer: js.UndefOr[String] = js.undefined
  
  var timeStamp: Double
  
  var version: Double
}
object TransactionCommon {
  
  inline def apply(deadline: Double, fee: Double, timeStamp: Double, version: Double): TransactionCommon = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionCommon]
  }
  
  extension [Self <: TransactionCommon](x: Self) {
    
    inline def setDeadline(value: Double): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setSigner(value: String): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
