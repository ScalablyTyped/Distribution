package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoIPSignSuccess extends StObject {
  
  var signature: String
}
object GetVoIPSignSuccess {
  
  @scala.inline
  def apply(signature: String): GetVoIPSignSuccess = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoIPSignSuccess]
  }
  
  @scala.inline
  implicit class GetVoIPSignSuccessMutableBuilder[Self <: GetVoIPSignSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
