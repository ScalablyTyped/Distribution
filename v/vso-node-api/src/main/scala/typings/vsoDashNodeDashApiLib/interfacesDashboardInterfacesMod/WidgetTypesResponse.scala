package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetTypesResponse extends js.Object {
  var _links: js.Any
  var uri: java.lang.String
  var widgetTypes: js.Array[WidgetMetadata]
}

object WidgetTypesResponse {
  @scala.inline
  def apply(_links: js.Any, uri: java.lang.String, widgetTypes: js.Array[WidgetMetadata]): WidgetTypesResponse = {
    val __obj = js.Dynamic.literal(_links = _links, uri = uri, widgetTypes = widgetTypes)
  
    __obj.asInstanceOf[WidgetTypesResponse]
  }
}

