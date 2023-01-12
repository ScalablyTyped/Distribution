package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosAuthorizationWait extends StObject {
  
  var wait_sec: Double
  
  var weight: Double
}
object EosAuthorizationWait {
  
  inline def apply(wait_sec: Double, weight: Double): EosAuthorizationWait = {
    val __obj = js.Dynamic.literal(wait_sec = wait_sec.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosAuthorizationWait]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EosAuthorizationWait] (val x: Self) extends AnyVal {
    
    inline def setWait_sec(value: Double): Self = StObject.set(x, "wait_sec", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
