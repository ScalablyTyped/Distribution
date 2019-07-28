package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "collection")
@js.native
object collectionNs extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
  class Item ()
    extends IChildOnMap
       with IParentOnMap {
    def this(options: js.Object) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    var options: IOptionManager = js.native
    /* CompleteClass */
    override def getMap(): Map = js.native
    /* InferMemberOverrides */
    override def getParent(): js.Object | Null = js.native
    def onAddToMap(map: Map): Unit = js.native
    def onRemoveFromMap(oldMap: Map): Unit = js.native
    /* InferMemberOverrides */
    override def setParent(): this.type = js.native
    /* InferMemberOverrides */
    override def setParent(parent: js.Object): this.type = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
}

