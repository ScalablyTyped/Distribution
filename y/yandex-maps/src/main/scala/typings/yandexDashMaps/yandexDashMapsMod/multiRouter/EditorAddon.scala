package typings.yandexDashMaps.yandexDashMapsMod.multiRouter

import typings.yandexDashMaps.yandexDashMapsMod.ICustomizable
import typings.yandexDashMaps.yandexDashMapsMod.IEventManager
import typings.yandexDashMaps.yandexDashMapsMod.IOptionManager
import typings.yandexDashMaps.yandexDashMapsMod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.EditorAddon")
@js.native
class EditorAddon () extends ICustomizable {
  /* CompleteClass */
  override var events: IEventManager = js.native
  /* CompleteClass */
  override var options: IOptionManager = js.native
  var state: Manager = js.native
  def isActive(): Boolean = js.native
  def start(state: js.Object): Unit = js.native
  def stop(): Unit = js.native
}

