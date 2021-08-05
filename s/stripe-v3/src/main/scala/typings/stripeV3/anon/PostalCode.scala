package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostalCode extends StObject {
  
  var postalCode: String | Double
}
object PostalCode {
  
  inline def apply(postalCode: String | Double): PostalCode = {
    val __obj = js.Dynamic.literal(postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalCode]
  }
  
  extension [Self <: PostalCode](x: Self) {
    
    inline def setPostalCode(value: String | Double): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
  }
}
