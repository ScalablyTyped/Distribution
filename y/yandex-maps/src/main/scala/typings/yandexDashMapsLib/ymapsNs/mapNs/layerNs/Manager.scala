package typings
package yandexDashMapsLib.ymapsNs.mapNs.layerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(yandexDashMapsLib.ymapsNs.ILayer because Would inherit conflicting mutable fields List(events, options))*/
@JSGlobal("ymaps.map.layer.Manager")
@js.native
class Manager protected ()
  extends yandexDashMapsLib.ymapsNs.IMapObjectCollection {
  def this(map: yandexDashMapsLib.ymapsNs.Map) = this()
  def this(map: yandexDashMapsLib.ymapsNs.Map, options: yandexDashMapsLib.Anon_TrafficJamZIndex) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  /* CompleteClass */
  override def add(`object`: js.Object): this.type = js.native
  /* CompleteClass */
  override def getIterator(): yandexDashMapsLib.ymapsNs.IIterator = js.native
  /* CompleteClass */
  override def getMap(): yandexDashMapsLib.ymapsNs.Map = js.native
  def getParent(): scala.Null | yandexDashMapsLib.ymapsNs.IControlParent = js.native
  /* CompleteClass */
  override def remove(`object`: js.Object): this.type = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IControlParent): this.type = js.native
}

