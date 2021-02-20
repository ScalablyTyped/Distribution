package typings.web3Core.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureObject extends StObject {
  
  var messageHash: String = js.native
  
  var r: String = js.native
  
  var s: String = js.native
  
  var v: String = js.native
}
object SignatureObject {
  
  @scala.inline
  def apply(messageHash: String, r: String, s: String, v: String): SignatureObject = {
    val __obj = js.Dynamic.literal(messageHash = messageHash.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureObject]
  }
  
  @scala.inline
  implicit class SignatureObjectMutableBuilder[Self <: SignatureObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageHash(value: String): Self = StObject.set(x, "messageHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
