package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxSizing extends StObject {
  
  var boxSizing: Any
}
object BoxSizing {
  
  inline def apply(boxSizing: Any): BoxSizing = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSizing]
  }
  
  extension [Self <: BoxSizing](x: Self) {
    
    inline def setBoxSizing(value: Any): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
  }
}
