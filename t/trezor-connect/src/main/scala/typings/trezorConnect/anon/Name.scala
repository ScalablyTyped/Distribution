package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: String
  
  var platform: js.Array[String]
  
  var preferred: js.UndefOr[Boolean] = js.undefined
  
  var signature: js.UndefOr[String] = js.undefined
  
  var url: String
}
object Name {
  
  inline def apply(name: String, platform: js.Array[String], url: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: js.Array[String]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformVarargs(value: String*): Self = StObject.set(x, "platform", js.Array(value*))
    
    inline def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
