package typings.yandexMaps.mod.control

import typings.yandexMaps.mod.IControlParent
import typings.yandexMaps.mod.IOptionManager
import typings.yandexMaps.mod.ISelectableControl
import typings.yandexMaps.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.ListBoxItem")
@js.native
class ListBoxItem () extends ISelectableControl {
  def this(parameters: IListBoxItemParameters) = this()
  
  var data: typings.yandexMaps.mod.data.Manager = js.native
  
  def getMap(): Map_ = js.native
  
  var options: IOptionManager = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
  
  var state: typings.yandexMaps.mod.data.Manager = js.native
}
