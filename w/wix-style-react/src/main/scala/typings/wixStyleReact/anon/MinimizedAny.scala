package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimizedAny extends StObject {
  
  var minimized: Any
}
object MinimizedAny {
  
  inline def apply(minimized: Any): MinimizedAny = {
    val __obj = js.Dynamic.literal(minimized = minimized.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimizedAny]
  }
  
  extension [Self <: MinimizedAny](x: Self) {
    
    inline def setMinimized(value: Any): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
  }
}
