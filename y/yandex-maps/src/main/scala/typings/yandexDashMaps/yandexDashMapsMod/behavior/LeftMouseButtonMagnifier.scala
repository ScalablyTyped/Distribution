package typings.yandexDashMaps.yandexDashMapsMod.behavior

import typings.yandexDashMaps.yandexDashMapsMod.IBehavior
import typings.yandexDashMaps.yandexDashMapsMod.IControlParent
import typings.yandexDashMaps.yandexDashMapsMod.IEventManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "behavior.LeftMouseButtonMagnifier")
@js.native
class LeftMouseButtonMagnifier () extends IBehavior {
  def this(options: ILeftMouseButtonMagnifierOptions) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

