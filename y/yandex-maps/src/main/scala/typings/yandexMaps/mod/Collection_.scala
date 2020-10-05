package typings.yandexMaps.mod

import typings.yandexMaps.mod.collection.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICollection because var conflicts: events. Inlined add, getIterator, remove */ @JSImport("yandex-maps", "Collection")
@js.native
class Collection_ () extends Item {
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

