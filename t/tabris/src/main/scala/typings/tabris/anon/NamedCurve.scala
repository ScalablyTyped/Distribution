package typings.tabris.anon

import typings.tabris.tabrisStrings.ECDH
import typings.tabris.tabrisStrings.`P-256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedCurve extends StObject {
  
  var name: ECDH
  
  var namedCurve: `P-256`
}
object NamedCurve {
  
  inline def apply(): NamedCurve = {
    val __obj = js.Dynamic.literal(name = "ECDH", namedCurve = "P-256")
    __obj.asInstanceOf[NamedCurve]
  }
  
  extension [Self <: NamedCurve](x: Self) {
    
    inline def setName(value: ECDH): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamedCurve(value: `P-256`): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
  }
}
