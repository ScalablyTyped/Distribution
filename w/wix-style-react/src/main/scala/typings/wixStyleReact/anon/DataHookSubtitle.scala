package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookSubtitle extends StObject {
  
  var children: Any
  
  var className: Any
  
  var dataHook: Any
  
  var subtitle: Any
  
  var title: Any
}
object DataHookSubtitle {
  
  inline def apply(children: Any, className: Any, dataHook: Any, subtitle: Any, title: Any): DataHookSubtitle = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHookSubtitle]
  }
  
  extension [Self <: DataHookSubtitle](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: Any): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
