package typings.tizenAccessory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAAuthenticationToken extends StObject {
  
  val authenticationType: String = js.native
  
  val key: String = js.native
}
object SAAuthenticationToken {
  
  @scala.inline
  def apply(authenticationType: String, key: String): SAAuthenticationToken = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAAuthenticationToken]
  }
  
  @scala.inline
  implicit class SAAuthenticationTokenMutableBuilder[Self <: SAAuthenticationToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationType(value: String): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
