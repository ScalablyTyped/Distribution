package typings
package yandexDashMapsLib.ymapsNs.multiRouterNs.masstransitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.multiRouter.masstransit.TransferSegmentModel")
@js.native
class TransferSegmentModel ()
  extends yandexDashMapsLib.ymapsNs.IEventEmitter {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var geometry: yandexDashMapsLib.ymapsNs.geometryNs.baseNs.LineString = js.native
  var path: PathModel = js.native
  var properties: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  def destroy(segmentJson: js.Object): scala.Unit = js.native
  def getType(): java.lang.String = js.native
}

