package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icons extends StObject {
  
  var className: Any
  
  var icons: CircularProgressBar
}
object Icons {
  
  inline def apply(className: Any, icons: CircularProgressBar): Icons = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icons]
  }
  
  extension [Self <: Icons](x: Self) {
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setIcons(value: CircularProgressBar): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
  }
}
