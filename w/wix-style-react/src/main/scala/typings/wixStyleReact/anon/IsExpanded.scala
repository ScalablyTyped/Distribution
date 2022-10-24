package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsExpanded extends StObject {
  
  var isExpanded: Any
}
object IsExpanded {
  
  inline def apply(isExpanded: Any): IsExpanded = {
    val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsExpanded]
  }
  
  extension [Self <: IsExpanded](x: Self) {
    
    inline def setIsExpanded(value: Any): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
  }
}
