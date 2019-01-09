package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.ymapsNs.ICustomizable because var conflicts: events. Inlined options */ @js.native
trait IBehavior extends IChild[IControlParent] {
  var options: IOptionManager = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def isEnabled(): scala.Boolean = js.native
}

