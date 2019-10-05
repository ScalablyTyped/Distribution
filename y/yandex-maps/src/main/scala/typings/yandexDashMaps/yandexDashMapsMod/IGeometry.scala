package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
trait IGeometry extends IBaseGeometry {
  var options: IOptionManager = js.native
  def getMap(): Map | Null = js.native
  def getPixelGeometry(): IPixelGeometry = js.native
  def getPixelGeometry(options: js.Object): IPixelGeometry = js.native
  def setMap(map: Map): Unit = js.native
}

