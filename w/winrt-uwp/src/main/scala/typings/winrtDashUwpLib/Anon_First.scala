package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_First[K, V] extends js.Object {
  /** One half of the original map. */ var first: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[K, V]
  /** The second half of the original map. */ var second: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[K, V]
}

object Anon_First {
  @scala.inline
  def apply[K, V](
    first: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[K, V],
    second: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[K, V]
  ): Anon_First[K, V] = {
    val __obj = js.Dynamic.literal(first = first, second = second)
  
    __obj.asInstanceOf[Anon_First[K, V]]
  }
}

