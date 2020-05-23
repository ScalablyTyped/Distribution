package typings.winrt.anon

import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecondIMapView extends js.Object {
  var first: IMapView[String, String]
  var second: IMapView[String, String]
}

object SecondIMapView {
  @scala.inline
  def apply(first: IMapView[String, String], second: IMapView[String, String]): SecondIMapView = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecondIMapView]
  }
}

