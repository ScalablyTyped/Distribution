package typings.yandexDashMaps.yandexDashMapsMod.control

import typings.yandexDashMaps.yandexDashMapsMod.IControl
import typings.yandexDashMaps.yandexDashMapsMod.IControlParent
import typings.yandexDashMaps.yandexDashMapsMod.IEventManager
import typings.yandexDashMaps.yandexDashMapsMod.IIterator
import typings.yandexDashMaps.yandexDashMapsMod.IOptionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options
- typings.yandexDashMaps.yandexDashMapsMod.ICollection because var conflicts: events. Inlined add, getIterator, remove */ @JSImport("yandex-maps", "control.ListBox")
@js.native
class ListBox () extends IControl {
  def this(parameters: IListBoxParameters) = this()
  var data: typings.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  var state: typings.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  def add(`object`: js.Object): this.type = js.native
  def getIterator(): IIterator = js.native
  def remove(`object`: js.Object): this.type = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

