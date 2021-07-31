package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetMetadataResponse extends StObject {
  
  var uri: String
  
  var widgetMetadata: WidgetMetadata
}
object WidgetMetadataResponse {
  
  @scala.inline
  def apply(uri: String, widgetMetadata: WidgetMetadata): WidgetMetadataResponse = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], widgetMetadata = widgetMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetMetadataResponse]
  }
  
  @scala.inline
  implicit class WidgetMetadataResponseMutableBuilder[Self <: WidgetMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetMetadata(value: WidgetMetadata): Self = StObject.set(x, "widgetMetadata", value.asInstanceOf[js.Any])
  }
}
