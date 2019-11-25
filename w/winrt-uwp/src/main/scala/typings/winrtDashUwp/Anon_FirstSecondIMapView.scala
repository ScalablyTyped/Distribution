package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.ApplicationModel.Resources.Core.NamedResource
import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
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
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FirstSecondIMapView]
  }
}

