package typings.winrt

import typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.NamedResource
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstSecondIMapView extends js.Object {
  var first: IMapView[String, NamedResource]
  var second: IMapView[String, NamedResource]
}

object Anon_FirstSecondIMapView {
  @scala.inline
  def apply(first: IMapView[String, NamedResource], second: IMapView[String, NamedResource]): Anon_FirstSecondIMapView = {
    val __obj = js.Dynamic.literal(first = first, second = second)
  
    __obj.asInstanceOf[Anon_FirstSecondIMapView]
  }
}

