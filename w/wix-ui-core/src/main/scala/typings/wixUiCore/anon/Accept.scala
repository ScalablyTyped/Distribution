package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accept extends StObject {
  
  var accept: String
  
  var children: String
  
  var `data-hook`: String
}
object Accept {
  
  inline def apply(accept: String, children: String, `data-hook`: String): Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("data-hook")(`data-hook`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
  
  extension [Self <: Accept](x: Self) {
    
    inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
  }
}
