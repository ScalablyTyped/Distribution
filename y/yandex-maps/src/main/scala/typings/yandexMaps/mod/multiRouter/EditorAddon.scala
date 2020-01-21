package typings.yandexMaps.mod.multiRouter

import typings.yandexMaps.mod.ICustomizable
import typings.yandexMaps.mod.IEventManager
import typings.yandexMaps.mod.IOptionManager
import typings.yandexMaps.mod.data.Manager
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

