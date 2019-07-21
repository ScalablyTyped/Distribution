package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*Interfaces*/
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.yandexDashMapsMod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze- yandexDashMapsLib.yandexDashMapsMod.IChild because var conflicts: events. Inlined getParent, setParent, setParent */ @js.native
trait IBaloon[T] extends IPopup[T] {
  def autoPan(): js.Promise[T] = js.native
  def freeze(): IFreezable = js.native
  def getParent(): js.Object | scala.Null = js.native
  def isFrozen(): scala.Boolean = js.native
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
  def unfreeze(): IFreezable = js.native
}

