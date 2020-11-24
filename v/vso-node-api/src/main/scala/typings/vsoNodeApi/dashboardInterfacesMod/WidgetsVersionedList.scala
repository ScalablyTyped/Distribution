package typings.vsoNodeApi.dashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetsVersionedList extends js.Object {
  
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
  implicit class WidgetsVersionedListOps[Self <: WidgetsVersionedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setETagVarargs(value: String*): Self = this.set("eTag", js.Array(value :_*))
    
    @scala.inline
    def setETag(value: js.Array[String]): Self = this.set("eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetsVarargs(value: Widget*): Self = this.set("widgets", js.Array(value :_*))
    
    @scala.inline
    def setWidgets(value: js.Array[Widget]): Self = this.set("widgets", value.asInstanceOf[js.Any])
  }
}
