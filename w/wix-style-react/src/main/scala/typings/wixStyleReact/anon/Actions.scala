package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: Any
  
  var description: Any
  
  var size: Any
  
  var title: Any
}
object Actions {
  
  inline def apply(actions: Any, description: Any, size: Any, title: Any): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setActions(value: Any): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Any): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
