package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collapsed extends StObject {
  
  var collapsed: Any
  
  var inputValue: Any
}
object Collapsed {
  
  inline def apply(collapsed: Any, inputValue: Any): Collapsed = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collapsed]
  }
  
  extension [Self <: Collapsed](x: Self) {
    
    inline def setCollapsed(value: Any): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setInputValue(value: Any): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
  }
}
