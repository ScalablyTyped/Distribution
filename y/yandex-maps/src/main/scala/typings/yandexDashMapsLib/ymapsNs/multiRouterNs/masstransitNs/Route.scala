package typings
package yandexDashMapsLib.ymapsNs.multiRouterNs.masstransitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.multiRouter.masstransit.Route")
@js.native
class Route ()
  extends yandexDashMapsLib.ymapsNs.IGeoObject {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var model: RouteModel = js.native
  @JSName("properties")
  var properties_Route: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  /* CompleteClass */
  override def getMap(): yandexDashMapsLib.ymapsNs.Map = js.native
  def getPaths(): yandexDashMapsLib.ymapsNs.GeoObjectCollection = js.native
}

