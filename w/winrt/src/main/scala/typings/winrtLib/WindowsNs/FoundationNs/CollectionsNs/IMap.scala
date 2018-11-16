package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMap[K, V] extends IIterable[IKeyValuePair[K, V]] {
  var size: scala.Double
  def clear(): scala.Unit
  def getView(): IMapView[K, V]
  def hasKey(key: K): scala.Boolean
  def insert(key: K, value: V): scala.Boolean
  def lookup(key: K): V
  def remove(key: K): scala.Unit
}

