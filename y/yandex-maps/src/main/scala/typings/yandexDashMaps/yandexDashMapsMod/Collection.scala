package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.yandexDashMapsMod.collection.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.ICollection because var conflicts: events. Inlined add, getIterator, remove */ @JSImport("yandex-maps", "Collection")
@js.native
class Collection () extends Item {
  def this(options: js.Object) = this()
  def add(`object`: js.Object): this.type = js.native
  def filter(filterFunction: js.Function1[/* object */ js.Object, Boolean]): js.Array[js.Object] = js.native
  def get(index: Double): js.Object = js.native
  def getAll(): js.Array[js.Object] = js.native
  def getIterator(): IIterator = js.native
  def getLength(): Double = js.native
  def indexOf(childToFind: js.Object): Double = js.native
  def remove(`object`: js.Object): this.type = js.native
  def removeAll(): this.type = js.native
}

@JSImport("yandex-maps", "collection")
@js.native
object collection extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
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

