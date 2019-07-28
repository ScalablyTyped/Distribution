package typings.winrt

import typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceMap
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
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
    val __obj = js.Dynamic.literal(first = first, second = second)
  
    __obj.asInstanceOf[Anon_FirstSecondIMapViewResourceMap]
  }
}

