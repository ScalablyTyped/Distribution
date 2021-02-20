package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetsVersionedList extends StObject {
  
  var eTag: js.Array[String] = js.native
  
  var widgets: js.Array[Widget] = js.native
}
object WidgetsVersionedList {
  
  @scala.inline
  def apply(eTag: js.Array[String], widgets: js.Array[Widget]): WidgetsVersionedList = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetsVersionedList]
  }
  
  @scala.inline
  implicit class WidgetsVersionedListMutableBuilder[Self <: WidgetsVersionedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: js.Array[String]): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagVarargs(value: String*): Self = StObject.set(x, "eTag", js.Array(value :_*))
    
    @scala.inline
    def setWidgets(value: js.Array[Widget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetsVarargs(value: Widget*): Self = StObject.set(x, "widgets", js.Array(value :_*))
  }
}
