package typings
package yandexDashMapsLib.ymapsNs.multiRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.multiRouter.EditorAddon")
@js.native
class EditorAddon ()
  extends yandexDashMapsLib.ymapsNs.ICustomizable {
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  /* CompleteClass */
  override var options: yandexDashMapsLib.ymapsNs.IOptionManager = js.native
  var state: yandexDashMapsLib.ymapsNs.dataNs.Manager = js.native
  def isActive(): scala.Boolean = js.native
  def start(state: js.Object): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

