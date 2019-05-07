package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "router")
@js.native
object routerNs extends js.Object {
  @js.native
  class Editor ()
    extends yandexDashMapsLib.yandexDashMapsMod.ICustomizable {
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    /* CompleteClass */
    override var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
    def start(): scala.Unit = js.native
    def start(options: yandexDashMapsLib.Anon_AddViaPoints): scala.Unit = js.native
    def stop(): scala.Unit = js.native
  }
  
  @js.native
  abstract class Route ()
    extends yandexDashMapsLib.yandexDashMapsMod.IGeoObject {
    var editor: Editor = js.native
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def getHumanJamsTime(): java.lang.String = js.native
    def getHumanLength(): java.lang.String = js.native
    def getHumanTime(): java.lang.String = js.native
    def getJamsTime(): scala.Double = js.native
    def getLength(): scala.Double = js.native
    /* CompleteClass */
    override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
    def getPaths(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
    def getTime(): scala.Double = js.native
    def getViaPoints(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
    def getWayPoints(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
  }
  
}

