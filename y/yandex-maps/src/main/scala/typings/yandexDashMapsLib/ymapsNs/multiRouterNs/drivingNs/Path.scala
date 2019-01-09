package typings
package yandexDashMapsLib.ymapsNs.multiRouterNs.drivingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.multiRouter.driving.Path")
@js.native
class Path ()
  extends yandexDashMapsLib.ymapsNs.IGeoObject {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var model: PathModel = js.native
  @JSName("properties")
  var properties_Path: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  /* CompleteClass */
  override def getMap(): yandexDashMapsLib.ymapsNs.Map = js.native
  def getSegments(): yandexDashMapsLib.ymapsNs.GeoObjectCollection = js.native
}

