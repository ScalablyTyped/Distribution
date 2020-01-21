package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @js.native
trait IBehavior extends IChild[IControlParent] {
  var options: IOptionManager = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def isEnabled(): Boolean = js.native
}

