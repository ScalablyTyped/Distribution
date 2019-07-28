package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceMap
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstSecondIMapViewResourceMap extends js.Object {
  /** One half of the original map. */ var first: IMapView[String, ResourceMap]
  /** The second half of the original map. */ var second: IMapView[String, ResourceMap]
}

object Anon_FirstSecondIMapViewResourceMap {
  @scala.inline
  def apply(first: IMapView[String, ResourceMap], second: IMapView[String, ResourceMap]): Anon_FirstSecondIMapViewResourceMap = {
    val __obj = js.Dynamic.literal(first = first, second = second)
  
    __obj.asInstanceOf[Anon_FirstSecondIMapViewResourceMap]
  }
}

