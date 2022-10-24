package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  var id: Any
  
  var tag: Any
  
  var theme: Any
  
  var value: Any
}
object Tag {
  
  inline def apply(id: Any, tag: Any, theme: Any, value: Any): Tag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
