package typings.winrt.anon

import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Second extends js.Object {
  var first: IMapView[String, _]
  var second: IMapView[String, _]
}

object Second {
  @scala.inline
  def apply(first: IMapView[String, _], second: IMapView[String, _]): Second = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Second]
  }
}

