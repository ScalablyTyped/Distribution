package typings
package yandexDashMapsLib.ymapsNs.multiRouterNs.masstransitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.multiRouter.masstransit.StopModel")
@js.native
class StopModel ()
  extends yandexDashMapsLib.ymapsNs.IEventEmitter {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var geometry: yandexDashMapsLib.ymapsNs.geometryNs.baseNs.Point = js.native
  var properties: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  var segment: TransportSegmentModel = js.native
  def update(stopJson: js.Object): scala.Unit = js.native
}

