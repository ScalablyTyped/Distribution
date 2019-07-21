package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.yandexDashMapsMod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze */ @js.native
trait IOptionManager extends IChild[IOptionManager] {
  def freeze(): IFreezable = js.native
  def get(key: java.lang.String, defaultValue: js.Object): js.Object = js.native
  def getAll(): js.Object = js.native
  def getName(): java.lang.String = js.native
  def getNative(key: java.lang.String): js.Object = js.native
  def isFrozen(): scala.Boolean = js.native
  def resolve(key: java.lang.String): js.Object = js.native
  def resolve(key: java.lang.String, name: java.lang.String): js.Object = js.native
  def setName(name: java.lang.String): scala.Unit = js.native
  def unfreeze(): IFreezable = js.native
}

