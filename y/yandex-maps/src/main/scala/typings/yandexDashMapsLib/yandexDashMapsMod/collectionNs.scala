package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "collection")
@js.native
object collectionNs extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - yandexDashMapsLib.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
  class Item ()
    extends yandexDashMapsLib.yandexDashMapsMod.IChildOnMap
       with yandexDashMapsLib.yandexDashMapsMod.IParentOnMap {
    def this(options: js.Object) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
    /* CompleteClass */
    override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
    /* InferMemberOverrides */
    override def getParent(): js.Object | scala.Null = js.native
    def onAddToMap(map: yandexDashMapsLib.yandexDashMapsMod.Map): scala.Unit = js.native
    def onRemoveFromMap(oldMap: yandexDashMapsLib.yandexDashMapsMod.Map): scala.Unit = js.native
    /* InferMemberOverrides */
    override def setParent(): this.type = js.native
    /* InferMemberOverrides */
    override def setParent(parent: js.Object): this.type = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
  }
  
}

