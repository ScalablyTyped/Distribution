package typings.winrt

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap
import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstSecondIMapViewResourceMap extends js.Object {
  var first: IMapView[String, ResourceMap]
  var second: IMapView[String, ResourceMap]
}

object Anon_FirstSecondIMapViewResourceMap {
  @scala.inline
  def apply(first: IMapView[String, ResourceMap], second: IMapView[String, ResourceMap]): Anon_FirstSecondIMapViewResourceMap = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FirstSecondIMapViewResourceMap]
  }
}

