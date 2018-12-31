package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapView[K, V] extends IIterable[IKeyValuePair[K, V]] {
  var size: scala.Double
  def hasKey(key: K): scala.Boolean
  def lookup(key: K): V
  def split(): winrtLib.Anon_SecondFirstIMapViewK[K, V]
}

