package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var index: Any
  
  var newTitle: Any
}
object Index {
  
  inline def apply(index: Any, newTitle: Any): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], newTitle = newTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  extension [Self <: Index](x: Self) {
    
    inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setNewTitle(value: Any): Self = StObject.set(x, "newTitle", value.asInstanceOf[js.Any])
  }
}
