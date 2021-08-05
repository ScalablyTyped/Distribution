package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsOpenBoolean extends StObject {
  
  var isOpen: Boolean
}
object IsOpenBoolean {
  
  inline def apply(isOpen: Boolean): IsOpenBoolean = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOpenBoolean]
  }
  
  extension [Self <: IsOpenBoolean](x: Self) {
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
  }
}
