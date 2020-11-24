package typings.yandexMaps.mod.control

import typings.yandexMaps.mod.IControlParent
import typings.yandexMaps.mod.IOptionManager
import typings.yandexMaps.mod.ISelectableControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.Button")
@js.native
class Button () extends ISelectableControl {
  def this(parameters: String) = this()
  def this(parameters: IButtonParameters) = this()
  
  var data: typings.yandexMaps.mod.data.Manager = js.native
  
  var options: IOptionManager = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
  
  var state: typings.yandexMaps.mod.data.Manager = js.native
}
