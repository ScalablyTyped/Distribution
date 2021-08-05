package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderBoolean extends StObject {
  
  var header: Boolean
}
object HeaderBoolean {
  
  inline def apply(header: Boolean): HeaderBoolean = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderBoolean]
  }
  
  extension [Self <: HeaderBoolean](x: Self) {
    
    inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
