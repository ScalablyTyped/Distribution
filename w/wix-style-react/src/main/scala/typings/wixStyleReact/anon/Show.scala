package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Show extends StObject {
  
  var show: Any
}
object Show {
  
  inline def apply(show: Any): Show = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Show]
  }
  
  extension [Self <: Show](x: Self) {
    
    inline def setShow(value: Any): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
