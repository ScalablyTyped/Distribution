package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Escape extends StObject {
  
  var escape: Boolean
}
object Escape {
  
  inline def apply(escape: Boolean): Escape = {
    val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Escape]
  }
  
  extension [Self <: Escape](x: Self) {
    
    inline def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
  }
}
