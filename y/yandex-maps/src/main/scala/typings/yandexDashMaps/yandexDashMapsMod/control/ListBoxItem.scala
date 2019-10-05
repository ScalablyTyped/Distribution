package typings.yandexDashMaps.yandexDashMapsMod.control

import typings.yandexDashMaps.yandexDashMapsMod.IControlParent
import typings.yandexDashMaps.yandexDashMapsMod.IEventManager
import typings.yandexDashMaps.yandexDashMapsMod.IOptionManager
import typings.yandexDashMaps.yandexDashMapsMod.ISelectableControl
import typings.yandexDashMaps.yandexDashMapsMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.ListBoxItem")
@js.native
class ListBoxItem () extends ISelectableControl {
  def this(parameters: IListBoxItemParameters) = this()
  var data: typings.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  var state: typings.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  def getMap(): Map = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

