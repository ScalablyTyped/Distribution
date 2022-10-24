package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsOpen extends StObject {
  
  var close: Any
  
  var isOpen: Any
  
  var open: Any
  
  var ref: Any
  
  var toggle: Any
}
object IsOpen {
  
  inline def apply(close: Any, isOpen: Any, open: Any, ref: Any, toggle: Any): IsOpen = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOpen]
  }
  
  extension [Self <: IsOpen](x: Self) {
    
    inline def setClose(value: Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Any): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Any): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setRef(value: Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setToggle(value: Any): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
  }
}
