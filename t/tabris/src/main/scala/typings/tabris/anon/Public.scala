package typings.tabris.anon

import typings.tabris.CryptoKey
import typings.tabris.tabrisStrings.ECDH
import typings.tabris.tabrisStrings.`P-256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Public extends StObject {
  
  var name: ECDH
  
  var namedCurve: `P-256`
  
  var public: CryptoKey
}
object Public {
  
  inline def apply(public: CryptoKey): Public = {
    val __obj = js.Dynamic.literal(name = "ECDH", namedCurve = "P-256", public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[Public]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Public] (val x: Self) extends AnyVal {
    
    inline def setName(value: ECDH): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamedCurve(value: `P-256`): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: CryptoKey): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
  }
}
