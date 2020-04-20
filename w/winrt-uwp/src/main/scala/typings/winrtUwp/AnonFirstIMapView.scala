package typings.winrtUwp

import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstIMapView extends js.Object {
  /** One half of the original map. */ var first: IMapView[String, ResourceMap]
  /** The second half of the original map. */ var second: IMapView[String, ResourceMap]
}

object AnonFirstIMapView {
  @scala.inline
  def apply(first: IMapView[String, ResourceMap], second: IMapView[String, ResourceMap]): AnonFirstIMapView = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFirstIMapView]
  }
}

