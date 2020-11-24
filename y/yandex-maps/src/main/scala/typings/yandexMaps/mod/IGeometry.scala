package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @js.native
trait IGeometry extends IBaseGeometry {
  
  def getMap(): Map_ | Null = js.native
  
  def getPixelGeometry(): IPixelGeometry = js.native
  def getPixelGeometry(options: js.Object): IPixelGeometry = js.native
  
  var options: IOptionManager = js.native
  
  def setMap(map: Map_): Unit = js.native
}
