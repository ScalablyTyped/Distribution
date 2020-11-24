package typings.vsoNodeApi.dashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetMetadataResponse extends js.Object {
  
  var uri: String = js.native
  
  var widgetMetadata: WidgetMetadata = js.native
}
object WidgetMetadataResponse {
  
  @scala.inline
  def apply(uri: String, widgetMetadata: WidgetMetadata): WidgetMetadataResponse = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], widgetMetadata = widgetMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetMetadataResponse]
  }
  
  @scala.inline
  implicit class WidgetMetadataResponseOps[Self <: WidgetMetadataResponse] (val x: Self) extends AnyVal {
    
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
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetMetadata(value: WidgetMetadata): Self = this.set("widgetMetadata", value.asInstanceOf[js.Any])
  }
}
