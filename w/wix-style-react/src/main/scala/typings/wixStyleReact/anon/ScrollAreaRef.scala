package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollAreaRef
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var disabled: Any
  
  var scrollAreaRef: Any
}
object ScrollAreaRef {
  
  inline def apply(disabled: Any, scrollAreaRef: Any): ScrollAreaRef = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], scrollAreaRef = scrollAreaRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollAreaRef]
  }
  
  extension [Self <: ScrollAreaRef](x: Self) {
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setScrollAreaRef(value: Any): Self = StObject.set(x, "scrollAreaRef", value.asInstanceOf[js.Any])
  }
}
