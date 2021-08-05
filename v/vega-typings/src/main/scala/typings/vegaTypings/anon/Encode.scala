package typings.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encode extends StObject {
  
  var encode: String
}
object Encode {
  
  inline def apply(encode: String): Encode = {
    val __obj = js.Dynamic.literal(encode = encode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encode]
  }
  
  extension [Self <: Encode](x: Self) {
    
    inline def setEncode(value: String): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
  }
}
