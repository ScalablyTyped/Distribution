package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetMetadataResponse extends js.Object {
  var uri: java.lang.String
  var widgetMetadata: WidgetMetadata
}

object WidgetMetadataResponse {
  @scala.inline
  def apply(uri: java.lang.String, widgetMetadata: WidgetMetadata): WidgetMetadataResponse = {
    val __obj = js.Dynamic.literal(uri = uri, widgetMetadata = widgetMetadata)
  
    __obj.asInstanceOf[WidgetMetadataResponse]
  }
}

