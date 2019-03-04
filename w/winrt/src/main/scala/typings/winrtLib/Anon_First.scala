package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_First[K, V] extends js.Object {
  var first: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[K, V]
  var second: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[K, V]
}

object Anon_First {
  @scala.inline
  def apply[K, V](
    first: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[K, V],
    second: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[K, V]
  ): Anon_First[K, V] = {
    val __obj = js.Dynamic.literal(first = first, second = second)
  
    __obj.asInstanceOf[Anon_First[K, V]]
  }
}

