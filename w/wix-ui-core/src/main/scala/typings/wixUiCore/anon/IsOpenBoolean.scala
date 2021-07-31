package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsOpenBoolean extends StObject {
  
  var isOpen: Boolean
}
object IsOpenBoolean {
  
  @scala.inline
  def apply(isOpen: Boolean): IsOpenBoolean = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOpenBoolean]
  }
  
  @scala.inline
  implicit class IsOpenBooleanMutableBuilder[Self <: IsOpenBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
  }
}
