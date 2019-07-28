package typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetMetadataResponse extends js.Object {
  var uri: String
  var widgetMetadata: WidgetMetadata
}

object WidgetMetadataResponse {
  @scala.inline
  def apply(uri: String, widgetMetadata: WidgetMetadata): WidgetMetadataResponse = {
    val __obj = js.Dynamic.literal(uri = uri, widgetMetadata = widgetMetadata)
  
    __obj.asInstanceOf[WidgetMetadataResponse]
  }
}

