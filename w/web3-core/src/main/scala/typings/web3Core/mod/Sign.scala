package typings.web3Core.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sign extends SignedTransaction {
  
  var message: String = js.native
  
  var signature: String = js.native
}
object Sign {
  
  @scala.inline
  def apply(message: String, r: String, s: String, signature: String, v: String): Sign = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sign]
  }
  
  @scala.inline
  implicit class SignMutableBuilder[Self <: Sign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
