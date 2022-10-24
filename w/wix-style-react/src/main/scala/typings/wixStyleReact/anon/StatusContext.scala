package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusContext extends StObject {
  
  var statusContext: Any
}
object StatusContext {
  
  inline def apply(statusContext: Any): StatusContext = {
    val __obj = js.Dynamic.literal(statusContext = statusContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusContext]
  }
  
  extension [Self <: StatusContext](x: Self) {
    
    inline def setStatusContext(value: Any): Self = StObject.set(x, "statusContext", value.asInstanceOf[js.Any])
  }
}
