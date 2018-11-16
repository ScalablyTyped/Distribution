package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(yandexDashMapsLib.ymapsNs.ICollection because Would inherit conflicting mutable fields List(events))*/
@JSGlobal("ymaps.Collection")
@js.native
class Collection ()
  extends yandexDashMapsLib.ymapsNs.collectionNs.Item {
  def this(options: js.Object) = this()
  def add(`object`: js.Object): this.type = js.native
  def filter(filterFunction: js.Function1[/* object */ js.Object, scala.Boolean]): js.Array[js.Object] = js.native
  def get(index: scala.Double): js.Object = js.native
  def getAll(): js.Array[js.Object] = js.native
  def getIterator(): IIterator = js.native
  def getLength(): scala.Double = js.native
  def indexOf(childToFind: js.Object): scala.Double = js.native
  def remove(`object`: js.Object): this.type = js.native
  def removeAll(): this.type = js.native
}

