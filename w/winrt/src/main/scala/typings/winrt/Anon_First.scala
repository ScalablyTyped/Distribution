package typings.winrt

import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_First[K, V] extends js.Object {
  var first: IMapView[K, V]
  var second: IMapView[K, V]
}

object Anon_First {
  @scala.inline
  def apply[K, V](first: IMapView[K, V], second: IMapView[K, V]): Anon_First[K, V] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_First[K, V]]
  }
}

