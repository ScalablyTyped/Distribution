package typings.winrt

import typings.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstSecond extends js.Object {
  var first: IMapView[String, NamedResource]
  var second: IMapView[String, NamedResource]
}

object AnonFirstSecond {
  @scala.inline
  def apply(first: IMapView[String, NamedResource], second: IMapView[String, NamedResource]): AnonFirstSecond = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFirstSecond]
  }
}

