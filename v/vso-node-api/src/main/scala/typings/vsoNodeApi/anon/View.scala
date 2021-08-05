package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  var delete: scala.Double
  
  var edit: scala.Double
  
  var none: scala.Double
  
  var view: scala.Double
}
object View {
  
  inline def apply(delete: scala.Double, edit: scala.Double, none: scala.Double, view: scala.Double): View = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  extension [Self <: View](x: Self) {
    
    inline def setDelete(value: scala.Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setEdit(value: scala.Double): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setView(value: scala.Double): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
