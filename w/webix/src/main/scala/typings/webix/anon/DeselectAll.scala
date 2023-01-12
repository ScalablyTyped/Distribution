package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeselectAll extends StObject {
  
  var deselectAll: String
  
  var deselectOne: String
  
  var selectAll: String
  
  var selectOne: String
}
object DeselectAll {
  
  inline def apply(deselectAll: String, deselectOne: String, selectAll: String, selectOne: String): DeselectAll = {
    val __obj = js.Dynamic.literal(deselectAll = deselectAll.asInstanceOf[js.Any], deselectOne = deselectOne.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectOne = selectOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeselectAll]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeselectAll] (val x: Self) extends AnyVal {
    
    inline def setDeselectAll(value: String): Self = StObject.set(x, "deselectAll", value.asInstanceOf[js.Any])
    
    inline def setDeselectOne(value: String): Self = StObject.set(x, "deselectOne", value.asInstanceOf[js.Any])
    
    inline def setSelectAll(value: String): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    inline def setSelectOne(value: String): Self = StObject.set(x, "selectOne", value.asInstanceOf[js.Any])
  }
}
