package typings.vsoNodeApi.interfacesDashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetsVersionedList extends StObject {
  
  var eTag: js.Array[String]
  
  var widgets: js.Array[Widget]
}
object WidgetsVersionedList {
  
  inline def apply(eTag: js.Array[String], widgets: js.Array[Widget]): WidgetsVersionedList = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetsVersionedList]
  }
  
  extension [Self <: WidgetsVersionedList](x: Self) {
    
    inline def setETag(value: js.Array[String]): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setETagVarargs(value: String*): Self = StObject.set(x, "eTag", js.Array(value*))
    
    inline def setWidgets(value: js.Array[Widget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsVarargs(value: Widget*): Self = StObject.set(x, "widgets", js.Array(value*))
  }
}
