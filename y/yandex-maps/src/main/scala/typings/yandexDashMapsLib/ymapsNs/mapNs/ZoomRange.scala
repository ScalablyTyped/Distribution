package typings
package yandexDashMapsLib.ymapsNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.map.ZoomRange")
@js.native
class ZoomRange protected ()
  extends yandexDashMapsLib.ymapsNs.IEventEmitter {
  def this(map: yandexDashMapsLib.ymapsNs.Map, constraints: js.Array[scala.Double]) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  def get(): js.Promise[js.Array[scala.Double]] = js.native
  def get(coords: js.Array[scala.Double]): js.Promise[js.Array[scala.Double]] = js.native
  def getCurrent(): js.Array[scala.Double] = js.native
}

