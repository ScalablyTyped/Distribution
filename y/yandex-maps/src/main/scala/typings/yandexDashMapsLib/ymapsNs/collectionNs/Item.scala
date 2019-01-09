package typings
package yandexDashMapsLib.ymapsNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.ymapsNs.ICustomizable because var conflicts: events. Inlined options */ @JSGlobal("ymaps.collection.Item")
@js.native
class Item ()
  extends yandexDashMapsLib.ymapsNs.IChildOnMap
     with yandexDashMapsLib.ymapsNs.IParentOnMap {
  def this(options: js.Object) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  /* CompleteClass */
  override def getMap(): yandexDashMapsLib.ymapsNs.Map = js.native
  /* InferMemberOverrides */
  override def getParent(): js.Object | scala.Null = js.native
  def onAddToMap(map: yandexDashMapsLib.ymapsNs.Map): scala.Unit = js.native
  def onRemoveFromMap(oldMap: yandexDashMapsLib.ymapsNs.Map): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setParent(): this.type = js.native
  /* InferMemberOverrides */
  override def setParent(parent: js.Object): this.type = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IControlParent): this.type = js.native
}

