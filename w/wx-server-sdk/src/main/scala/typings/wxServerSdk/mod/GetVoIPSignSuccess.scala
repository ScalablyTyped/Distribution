package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoIPSignSuccess extends StObject {
  
  var signature: String
}
object GetVoIPSignSuccess {
  
  inline def apply(signature: String): GetVoIPSignSuccess = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoIPSignSuccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoIPSignSuccess] (val x: Self) extends AnyVal {
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
