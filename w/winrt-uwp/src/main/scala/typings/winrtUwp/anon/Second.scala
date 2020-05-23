package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Second extends js.Object {
  /** The first part of the original map. */ var first: IMapView[String, _]
  /** The second part of the original map. */ var second: IMapView[String, _]
}

object Second {
  @scala.inline
  def apply(first: IMapView[String, _], second: IMapView[String, _]): Second = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Second]
  }
}

