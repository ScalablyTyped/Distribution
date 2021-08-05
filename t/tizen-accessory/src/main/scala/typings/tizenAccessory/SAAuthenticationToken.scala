package typings.tizenAccessory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAAuthenticationToken extends StObject {
  
  val authenticationType: String
  
  val key: String
}
object SAAuthenticationToken {
  
  inline def apply(authenticationType: String, key: String): SAAuthenticationToken = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAAuthenticationToken]
  }
  
  extension [Self <: SAAuthenticationToken](x: Self) {
    
    inline def setAuthenticationType(value: String): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
