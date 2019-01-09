package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.ymapsNs.ICustomizable because var conflicts: events. Inlined options- yandexDashMapsLib.ymapsNs.ICollection because var conflicts: events. Inlined add, getIterator, remove */ @JSGlobal("ymaps.control.ListBox")
@js.native
class ListBox ()
  extends yandexDashMapsLib.ymapsNs.IControl {
  def this(parameters: IListBoxParameters) = this()
  var data: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  var state: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  def add(`object`: js.Object): this.type = js.native
  def getIterator(): yandexDashMapsLib.ymapsNs.IIterator = js.native
  def remove(`object`: js.Object): this.type = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IControlParent): this.type = js.native
}

