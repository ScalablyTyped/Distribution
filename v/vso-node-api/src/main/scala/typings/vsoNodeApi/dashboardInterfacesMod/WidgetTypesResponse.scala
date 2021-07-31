package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetTypesResponse extends StObject {
  
  var _links: js.Any
  
  var uri: String
  
  var widgetTypes: js.Array[WidgetMetadata]
}
object WidgetTypesResponse {
  
  @scala.inline
  def apply(_links: js.Any, uri: String, widgetTypes: js.Array[WidgetMetadata]): WidgetTypesResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], widgetTypes = widgetTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetTypesResponse]
  }
  
  @scala.inline
  implicit class WidgetTypesResponseMutableBuilder[Self <: WidgetTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetTypes(value: js.Array[WidgetMetadata]): Self = StObject.set(x, "widgetTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetTypesVarargs(value: WidgetMetadata*): Self = StObject.set(x, "widgetTypes", js.Array(value :_*))
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
