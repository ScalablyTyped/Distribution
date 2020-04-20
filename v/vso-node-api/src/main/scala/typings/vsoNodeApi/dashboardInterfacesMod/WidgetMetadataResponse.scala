package typings.vsoNodeApi.dashboardInterfacesMod

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
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], widgetMetadata = widgetMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetMetadataResponse]
  }
}

