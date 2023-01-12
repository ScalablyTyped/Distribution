package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Select extends StObject {
  
  var select: String
  
  var selectAll: String
  
  var unselectAll: String
}
object Select {
  
  inline def apply(select: String, selectAll: String, unselectAll: String): Select = {
    val __obj = js.Dynamic.literal(select = select.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], unselectAll = unselectAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Select]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Select] (val x: Self) extends AnyVal {
    
    inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectAll(value: String): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    inline def setUnselectAll(value: String): Self = StObject.set(x, "unselectAll", value.asInstanceOf[js.Any])
  }
}
