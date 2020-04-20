package typings.winrt

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap
import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstIMapView extends js.Object {
  var first: IMapView[String, ResourceMap]
  var second: IMapView[String, ResourceMap]
}

object AnonFirstIMapView {
  @scala.inline
  def apply(first: IMapView[String, ResourceMap], second: IMapView[String, ResourceMap]): AnonFirstIMapView = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFirstIMapView]
  }
}

