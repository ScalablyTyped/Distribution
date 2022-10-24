package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Previous extends StObject {
  
  var current: Any
  
  var onClick: Any
  
  var previous: Any
  
  var show: Any
}
object Previous {
  
  inline def apply(current: Any, onClick: Any, previous: Any, show: Any): Previous = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Previous]
  }
  
  extension [Self <: Previous](x: Self) {
    
    inline def setCurrent(value: Any): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Any): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: Any): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Any): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
