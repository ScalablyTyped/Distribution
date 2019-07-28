package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.yandexDashMapsMod.collectionNs.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
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

