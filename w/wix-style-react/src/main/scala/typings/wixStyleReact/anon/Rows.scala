package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rows extends StObject {
  
  var children: Any
  
  var className: Any
  
  var dataHook: Any
  
  var rows: Any
  
  var span: Any
  
  var vertical: Any
}
object Rows {
  
  inline def apply(children: Any, className: Any, dataHook: Any, rows: Any, span: Any, vertical: Any): Rows = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rows]
  }
  
  extension [Self <: Rows](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Any): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setSpan(value: Any): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: Any): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
