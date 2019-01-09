package typings
package yandexDashMapsLib.ymapsNs.routerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.router.Route")
@js.native
abstract class Route ()
  extends yandexDashMapsLib.ymapsNs.IGeoObject {
  var editor: Editor = js.native
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  def getHumanJamsTime(): java.lang.String = js.native
  def getHumanLength(): java.lang.String = js.native
  def getHumanTime(): java.lang.String = js.native
  def getJamsTime(): scala.Double = js.native
  def getLength(): scala.Double = js.native
  /* CompleteClass */
  override def getMap(): yandexDashMapsLib.ymapsNs.Map = js.native
  def getPaths(): yandexDashMapsLib.ymapsNs.GeoObjectCollection = js.native
  def getTime(): scala.Double = js.native
  def getViaPoints(): yandexDashMapsLib.ymapsNs.GeoObjectCollection = js.native
  def getWayPoints(): yandexDashMapsLib.ymapsNs.GeoObjectCollection = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IControlParent): this.type = js.native
}

