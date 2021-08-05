package typings.wordpressApiFetch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rendered extends StObject {
  
  var rendered: String
}
object Rendered {
  
  inline def apply(rendered: String): Rendered = {
    val __obj = js.Dynamic.literal(rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rendered]
  }
  
  extension [Self <: Rendered](x: Self) {
    
    inline def setRendered(value: String): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
  }
}
