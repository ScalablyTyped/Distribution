package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.NamedResource
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstSecondIMapView extends js.Object {
  /** One half of the original map. */ var first: IMapView[String, NamedResource]
  /** The second half of the original map. */ var second: IMapView[String, NamedResource]
}

object Anon_FirstSecondIMapView {
  @scala.inline
  def apply(first: IMapView[String, NamedResource], second: IMapView[String, NamedResource]): Anon_FirstSecondIMapView = {
    val __obj = js.Dynamic.literal(first = first, second = second)
  
    __obj.asInstanceOf[Anon_FirstSecondIMapView]
  }
}

