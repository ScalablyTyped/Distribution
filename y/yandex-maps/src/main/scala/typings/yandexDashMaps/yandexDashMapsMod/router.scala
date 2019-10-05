package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.Anon_AddViaPoints
import typings.yandexDashMaps.yandexDashMapsMod.router.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "router")
@js.native
object router extends js.Object {
  @js.native
  class Editor () extends ICustomizable {
    /* CompleteClass */
    override var events: IEventManager = js.native
    /* CompleteClass */
    override var options: IOptionManager = js.native
    def start(): Unit = js.native
    def start(options: Anon_AddViaPoints): Unit = js.native
    def stop(): Unit = js.native
  }
  
  @js.native
  abstract class Route () extends IGeoObject {
    var editor: Editor = js.native
    /* CompleteClass */
    override var events: IEventManager = js.native
    def getHumanJamsTime(): String = js.native
    def getHumanLength(): String = js.native
    def getHumanTime(): String = js.native
    def getJamsTime(): Double = js.native
    def getLength(): Double = js.native
    /* CompleteClass */
    override def getMap(): Map = js.native
    def getPaths(): GeoObjectCollection = js.native
    def getTime(): Double = js.native
    def getViaPoints(): GeoObjectCollection = js.native
    def getWayPoints(): GeoObjectCollection = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
}

