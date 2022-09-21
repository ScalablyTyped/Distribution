package typings.yandexMaps.mod.control

import typings.yandexMaps.mod.IControlParent
import typings.yandexMaps.mod.ICustomizable
import typings.yandexMaps.mod.IEventManager
import typings.yandexMaps.mod.IOptionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.IChild because var conflicts: events. Inlined getParent, setParent, setParent
- typings.yandexMaps.mod.ISelectableControl because var conflicts: events. Inlined deselect, disable, enable, isEnabled, isSelected, select */ @JSImport("yandex-maps", "control.Button")
@js.native
open class Button ()
  extends StObject
     with ICustomizable {
  def this(parameters: String) = this()
  def this(parameters: IButtonParameters) = this()
  
  var data: typings.yandexMaps.mod.data.Manager = js.native
  
  def deselect(): Unit = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  
  def getParent(): Null | IControlParent = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isSelected(): Boolean = js.native
  
  /* CompleteClass */
  var options: IOptionManager = js.native
  
  def select(): Unit = js.native
  
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
  def setParent(parent: IControlParent): this.type = js.native
  
  var state: typings.yandexMaps.mod.data.Manager = js.native
}
