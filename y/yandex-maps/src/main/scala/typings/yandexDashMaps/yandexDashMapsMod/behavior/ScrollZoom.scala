package typings.yandexDashMaps.yandexDashMapsMod.behavior

import typings.yandexDashMaps.yandexDashMapsMod.IBehavior
import typings.yandexDashMaps.yandexDashMapsMod.IControlParent
import typings.yandexDashMaps.yandexDashMapsMod.IEventManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "behavior.ScrollZoom")
@js.native
class ScrollZoom () extends IBehavior {
  def this(options: IScrollZoomOptions) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

