package typings.vsoNodeApi.dashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetTypesResponse extends js.Object {
  
  var _links: js.Any = js.native
  
  var uri: String = js.native
  
  var widgetTypes: js.Array[WidgetMetadata] = js.native
}
object WidgetTypesResponse {
  
  @scala.inline
  def apply(_links: js.Any, uri: String, widgetTypes: js.Array[WidgetMetadata]): WidgetTypesResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], widgetTypes = widgetTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetTypesResponse]
  }
  
  @scala.inline
  implicit class WidgetTypesResponseOps[Self <: WidgetTypesResponse] (val x: Self) extends AnyVal {
    
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetTypesVarargs(value: WidgetMetadata*): Self = this.set("widgetTypes", js.Array(value :_*))
    
    @scala.inline
    def setWidgetTypes(value: js.Array[WidgetMetadata]): Self = this.set("widgetTypes", value.asInstanceOf[js.Any])
  }
}
