package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Failure extends StObject {
  
  var code: js.UndefOr[FailureType] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object Failure {
  
  inline def apply(): Failure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Failure]
  }
  
  extension [Self <: Failure](x: Self) {
    
    inline def setCode(value: FailureType): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
