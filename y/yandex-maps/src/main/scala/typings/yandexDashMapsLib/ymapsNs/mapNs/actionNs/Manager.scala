package typings
package yandexDashMapsLib.ymapsNs.mapNs.actionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.map.action.Manager")
@js.native
class Manager protected ()
  extends yandexDashMapsLib.ymapsNs.IEventEmitter {
  def this(map: yandexDashMapsLib.ymapsNs.Map) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  def breakTick(): scala.Unit = js.native
  def execute(action: yandexDashMapsLib.ymapsNs.IMapAction): scala.Unit = js.native
  def getCurrentState(): js.Object = js.native
  def getMap(): yandexDashMapsLib.ymapsNs.Map = js.native
  def setCorrection(userFunction: js.Function0[scala.Unit]): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

