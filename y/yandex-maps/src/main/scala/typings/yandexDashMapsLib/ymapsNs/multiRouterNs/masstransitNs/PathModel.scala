package typings
package yandexDashMapsLib.ymapsNs.multiRouterNs.masstransitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.multiRouter.masstransit.PathModel")
@js.native
class PathModel ()
  extends yandexDashMapsLib.ymapsNs.IEventEmitter {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var properties: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  var route: RouteModel = js.native
  def destroy(): scala.Unit = js.native
  def getSegments(): js.Array[TransferSegmentModel | TransportSegmentModel | WalkSegmentModel] = js.native
  def getType(): java.lang.String = js.native
  def update(pathJson: js.Object): scala.Unit = js.native
}

