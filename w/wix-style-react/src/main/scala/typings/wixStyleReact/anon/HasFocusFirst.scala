package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasFocusFirst extends StObject {
  
  var hasFocusFirst: Boolean
  
  var hasFocusLast: Boolean
}
object HasFocusFirst {
  
  inline def apply(hasFocusFirst: Boolean, hasFocusLast: Boolean): HasFocusFirst = {
    val __obj = js.Dynamic.literal(hasFocusFirst = hasFocusFirst.asInstanceOf[js.Any], hasFocusLast = hasFocusLast.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasFocusFirst]
  }
  
  extension [Self <: HasFocusFirst](x: Self) {
    
    inline def setHasFocusFirst(value: Boolean): Self = StObject.set(x, "hasFocusFirst", value.asInstanceOf[js.Any])
    
    inline def setHasFocusLast(value: Boolean): Self = StObject.set(x, "hasFocusLast", value.asInstanceOf[js.Any])
  }
}
