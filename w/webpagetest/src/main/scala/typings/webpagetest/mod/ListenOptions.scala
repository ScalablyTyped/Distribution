package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenOptions extends StObject {
  
  /** public x509 certificate file path to use for SSL */
  var cert: js.UndefOr[String] = js.undefined
  
  /** private key file path to use for SSL */
  var key: js.UndefOr[String] = js.undefined
}
object ListenOptions {
  
  inline def apply(): ListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListenOptions] (val x: Self) extends AnyVal {
    
    inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
