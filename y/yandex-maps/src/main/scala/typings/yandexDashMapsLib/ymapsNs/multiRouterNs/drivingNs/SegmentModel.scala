package typings
package yandexDashMapsLib.ymapsNs.multiRouterNs.drivingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.multiRouter.driving.SegmentModel")
@js.native
class SegmentModel ()
  extends yandexDashMapsLib.ymapsNs.IEventEmitter {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var geometry: yandexDashMapsLib.ymapsNs.geometryNs.baseNs.LineString = js.native
  var path: PathModel = js.native
  def destroy(): scala.Unit = js.native
  def getType(): java.lang.String = js.native
  def getViaPoints(): js.Array[yandexDashMapsLib.ymapsNs.multiRouterNs.ViaPointModel] = js.native
  def update(segmentJson: js.Object): scala.Unit = js.native
}

