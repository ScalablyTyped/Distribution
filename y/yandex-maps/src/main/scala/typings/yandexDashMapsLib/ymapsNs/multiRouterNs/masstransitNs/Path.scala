package typings
package yandexDashMapsLib.ymapsNs.multiRouterNs.masstransitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.multiRouter.masstransit.Path")
@js.native
class Path ()
  extends yandexDashMapsLib.ymapsNs.IGeoObject {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var model: PathModel = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  @JSName("properties")
  var properties_Path: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  /* CompleteClass */
  override def getMap(): yandexDashMapsLib.ymapsNs.Map = js.native
  def getSegmentMarkers(): yandexDashMapsLib.ymapsNs.GeoObjectCollection = js.native
  def getSegments(): yandexDashMapsLib.ymapsNs.GeoObjectCollection = js.native
}

