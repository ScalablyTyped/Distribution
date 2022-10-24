package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suffix extends StObject {
  
  var className: Any
  
  var dataHook: Any
  
  var ellipsis: Any
  
  var id: Any
  
  var suffix: Any
  
  var title: Any
  
  var `type`: Any
}
object Suffix {
  
  inline def apply(className: Any, dataHook: Any, ellipsis: Any, id: Any, suffix: Any, title: Any, `type`: Any): Suffix = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], ellipsis = ellipsis.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suffix]
  }
  
  extension [Self <: Suffix](x: Self) {
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setEllipsis(value: Any): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: Any): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
