package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rendered extends StObject {
  
  var rendered: Boolean
  
  var token: js.Any
}
object Rendered {
  
  inline def apply(rendered: Boolean, token: js.Any): Rendered = {
    val __obj = js.Dynamic.literal(rendered = rendered.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rendered]
  }
  
  extension [Self <: Rendered](x: Self) {
    
    inline def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
