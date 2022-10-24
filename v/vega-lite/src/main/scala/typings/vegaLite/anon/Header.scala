package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header extends StObject {
  
  var header: Boolean
}
object Header {
  
  inline def apply(header: Boolean): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  extension [Self <: Header](x: Self) {
    
    inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
